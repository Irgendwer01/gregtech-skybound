import gregtech.common.ConfigHolder
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent

mods.jei.ingredient.yeet(item('personalworlds:personal_portal'))

crafting.removeByOutput(item('minecraft:ender_eye'))
crafting.removeByOutput(item('minecraft:crafting_table'))

ore('dirt').add(item('minecraft:dirt', 1))
ore('dyeGreen').add(metaitem('dustMalachite'))
ore('dye').add(metaitem('dustMalachite'))
ore('dyeRed').add(metaitem('dustRuby'))
ore('dye').add(metaitem('dustRuby'))
ore('dyeBlack').add(metaitem('dustCoal'))
ore('dye').add(metaitem('dustCoal'))


mods.gregtech.fluid_solidifier.recipeBuilder()
  .fluidInputs(liquid('glue')*100)
  .notConsumable(metaitem('shape.mold.ball'))
  .outputs(item('minecraft:slime_ball'))
  .EUt(30)
  .duration(80)
  .buildAndRegister()

mods.gregtech.centrifuge.removeByInput(30, [item('minecraft:dirt')], null)
mods.gregtech.centrifuge.recipeBuilder()
  .inputs(ore('dirt'))
  .chancedOutput(metaitem('plant_ball')*1, 3000, 1200)
  .chancedOutput(item('minecraft:sand')*1, 5000, 1200)
  .chancedOutput(metaitem('dustTinyClay')*1, 5000, 900)
  .chancedOutput(item('minecraft:bone')*1, 5000, 1200)
  .EUt(30)
  .duration(80)
  .buildAndRegister()

mods.gregtech.mixer.recipeBuilder()
  .inputs(metaitem('dustUraniumTriplatinum')*2, metaitem('dustUranium235'), metaitem('dustTungstenCarbide'), metaitem('dustEnderEye')*2)
  .fluidInputs(liquid('rocket_fuel')*3000)
  .outputs(metaitem('dustNetherStar')*4)
  .EUt(510)
  .duration(1200)
  .buildAndRegister()

mods.gregtech.mixer.recipeBuilder()
  .inputs(item('minecraft:redstone'), metaitem('dustGold'))
  .outputs(item('minecraft:glowstone_dust')*2)
  .EUt(30)
  .duration(100)
  .buildAndRegister()

crafting.addShapeless('gravel_to_flint', item('minecraft:flint'), [item('minecraft:gravel'), item('minecraft:gravel'), item('minecraft:gravel')])

//Overwrite hard GT recipes to make it playable when enabled
crafting.addShaped('crafting_table', item('minecraft:crafting_table'), [
 [ore('plankWood'), ore('plankWood')],
 [ore('plankWood'), ore('plankWood')]])

crafting.addShaped('slab_oak', item('minecraft:wooden_slab')*6, [[item('minecraft:planks'), item('minecraft:planks'), item('minecraft:planks')]])

crafting.addShapeless('yellow_dye', item('minecraft:dye', 11)*2, [ore('dyeGreen'), ore('dyeRed')])
 
if (ConfigHolder.recipes.nerfWoodCrafting) {
crafting.addShaped('logs_to_chests', item('minecraft:chest')*2, [
 [ore('logWood'), ore('logWood'), ore('logWood')],
 [ore('logWood'), null, ore('logWood')],
 [ore('logWood'), ore('logWood'), ore('logWood')]])
crafting.addShaped('logs_to_sticks', item('minecraft:stick')*4, [
 [ore('logWood')],
 [ore('logWood')]])
} else {
crafting.addShaped('logs_to_chests', item('minecraft:chest')*4, [
 [ore('logWood'), ore('logWood'), ore('logWood')],
 [ore('logWood'), null, ore('logWood')],
 [ore('logWood'), ore('logWood'), ore('logWood')]])
crafting.addShaped('logs_to_sticks', item('minecraft:stick')*16, [
 [ore('logWood')],
 [ore('logWood')]])
}

block('minecraft:end_portal_frame').setHarvestLevel("pickaxe", 2)
block('minecraft:end_portal_frame').setHardness(2F)

crafting.addShaped('end_portal_frame', item('minecraft:end_portal_frame'), [
 [item('minecraft:coal_block'), metaitem('quantumeye'), item('minecraft:coal_block')],
 [item('minecraft:obsidian'), item('minecraft:obsidian'), item('minecraft:obsidian')],
 [item('minecraft:end_stone'), item('minecraft:end_stone'), item('minecraft:end_stone')]])
