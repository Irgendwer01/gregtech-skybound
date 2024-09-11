package classes

import gregtech.api.GTValues
import gregtech.api.capability.impl.SteamMultiWorkable
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.multiblock.RecipeMapSteamMultiblockController
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.api.recipes.RecipeMaps
import gregtech.client.particle.VanillaParticleEffects
import gregtech.client.renderer.ICubeRenderer
import gregtech.client.renderer.texture.Textures
import gregtech.client.utils.TooltipHelper
import gregtech.common.ConfigHolder
import gregtech.common.blocks.BlockBoilerCasing
import gregtech.common.blocks.BlockMetalCasing
import gregtech.common.blocks.MetaBlocks

import net.minecraft.block.state.IBlockState
import net.minecraft.client.resources.I18n
import net.minecraft.item.ItemStack
import net.minecraft.util.EnumParticleTypes
import net.minecraft.util.ResourceLocation
import net.minecraft.world.World
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly

import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable

import java.util.List

public class MetaTileEntitySteamLargeHammer extends RecipeMapSteamMultiblockController {

    private static final int MAX_PARALLELS = 8;

    public MetaTileEntitySteamLargeHammer(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, RecipeMaps.FORGE_HAMMER_RECIPES, CONVERSION_RATE);
        this.recipeMapWorkable = new SteamMultiWorkable(this, CONVERSION_RATE);
        this.recipeMapWorkable.setParallelLimit(MAX_PARALLELS);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntitySteamLargeHammer(metaTileEntityId);
    }

    @NotNull
    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("#CCC#", "     ", "     ", "     ", "     ", "     ", "     ")
                .aisle("CCCCC", "#CCC#", "#####", "#####", "#####", "##C##", "     ")
                .aisle("CCCCC", "CC#CC", "C###C", "C#X#C", "C#X#C", "CCXCC", "##X##")
                .aisle("CCCCC", "#CSC#", "#####", "#####", "#####", "##C##", "     ")
                .aisle("#CCC#", "     ", "     ", "     ", "     ", "     ", "     ")
                .where('S' as char, selfPredicate())
                .where('X' as char, states(getPipeState()).setMinGlobalLimited(4))
                .where('C' as char, states(getCasingState()).setMinGlobalLimited(38)
                        .or(autoAbilities(true, false, true, true, false)))
                .where('#' as char, air())
                .build();
    }

    public IBlockState getPipeState() {
        return ConfigHolder.machines.steelSteamMultiblocks ?
                MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE) :
                MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.BRONZE_PIPE);
    }

    public IBlockState getCasingState() {
        return ConfigHolder.machines.steelSteamMultiblocks ?
                MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID) :
                MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.BRONZE_BRICKS);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        if (ConfigHolder.machines.steelSteamMultiblocks) {
            return Textures.SOLID_STEEL_CASING;

        } else {
            return Textures.BRONZE_PLATED_BRICKS;
        }
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.FORGE_HAMMER_OVERLAY;
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public int getItemOutputLimit() {
        return 1;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, @NotNull List<String> tooltip,
                               boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        tooltip.add(I18n.format("gregtech.multiblock.steam_.duration_modifier"));
        tooltip.add(I18n.format("gregtech.universal.tooltip.parallel", MAX_PARALLELS));
        tooltip.add(I18n.format("gregtech.multiblock.require_steam_parts"));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void randomDisplayTick() {
        if (isActive()) {
            VanillaParticleEffects.defaultFrontEffect(this, EnumParticleTypes.SMOKE_LARGE, EnumParticleTypes.FLAME);
            if (GTValues.RNG.nextBoolean()) {
                VanillaParticleEffects.defaultFrontEffect(this, 0.5F, EnumParticleTypes.SMOKE_NORMAL);
            }
        }
    }
}