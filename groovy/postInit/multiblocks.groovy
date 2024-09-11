import gregtech.common.metatileentities.MetaTileEntities

import classes.MetaTileEntityGreenhouse
import classes.MetaTileEntitySteamLargeHammer


if (!isReloading()) {
MetaTileEntities.registerMetaTileEntity(32000, new MetaTileEntityGreenhouse(new ResourceLocation("multiblocktweaker", "greenhouse")))
MetaTileEntities.registerMetaTileEntity(32001, new MetaTileEntitySteamLargeHammer(new ResourceLocation("multiblocktweaker", "large_steam_hammer")))
}

crafting.addShaped('green_house', metaitem('multiblocktweaker:greenhouse'), [
 [metaitem('robot.arm.mv'), metaitem('electric.motor.mv'), metaitem('robot.arm.mv')],
 [ore('circuitMv'), metaitem('hull.mv'), ore('circuitMv')],
 [metaitem('cableGtSingleCopper'), ore('circuitMv'), metaitem('cableGtSingleCopper')]])

crafting.addShaped('large_steam_hammer', metaitem('multiblocktweaker:large_steam_hammer'), [
 [item('gregtech:metal_casing'), metaitem('gearPotin'), item('gregtech:metal_casing')],
 [item('gregtech:boiler_casing'), metaitem('steam_hammer_bronze'), item('gregtech:boiler_casing')],
 [item('gregtech:metal_casing'), metaitem('gearPotin'), item('gregtech:metal_casing')]])


