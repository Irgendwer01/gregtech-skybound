import gregtech.common.ConfigHolder

mods.gregtech.rock_breaker.removeByInput(960, [item('gregtech:stone_smooth', 1)], null)
mods.gregtech.rock_breaker.removeByInput(960, [item('gregtech:stone_smooth')], null)
mods.gregtech.rock_breaker.removeByInput(240, [item('chisel:basalt')], null)
mods.gregtech.rock_breaker.removeByInput(240, [item('chisel:marble')], null)
mods.gregtech.rock_breaker.removeByInput(60, [item('minecraft:stone', 3)], null)
mods.gregtech.rock_breaker.removeByInput(60, [item('minecraft:stone', 5)], null)
mods.gregtech.rock_breaker.removeByInput(60, [item('minecraft:stone', 1)], null)
mods.gregtech.centrifuge.removeByInput(80, [item('minecraft:soul_sand')], null)

mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneBasalt'))
  .outputs(item('gregtech:stone_smooth', 3))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneMarble'))
  .outputs(item('gregtech:stone_smooth', 2))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneGraniteBlack'))
  .outputs(item('gregtech:stone_smooth'))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneGraniteRed'))
  .outputs(item('gregtech:stone_smooth', 1))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneDiorite'))
  .outputs(item('minecraft:stone', 3))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneAndesite'))
  .outputs(item('minecraft:stone', 5))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneGranite'))
  .outputs(item('minecraft:stone', 1))
  .EUt(7)
  .duration(16)
  .buildAndRegister()

//ULV Covers
crafting.addShaped('ulv_conveyor', item('ulv_covers:ulv_cover_meta_item'), [
 [item('gregtech:meta_item_1', 438), item('gregtech:wire_single', 55), null],
 [item('ulv_covers:ulv_cover_meta_item', 2), item('gregtech:meta_item_1', 438), null],
 [null, null, null]])

crafting.addShaped('ulv_pump', item('ulv_covers:ulv_cover_meta_item', 1), [
 [item('gregtech:fluid_pipe_normal', 25), item('gregtech:meta_rotor', 260), null],
 [item('ulv_covers:ulv_cover_meta_item', 2), item('gregtech:meta_item_1', 438), null],
 [null, null, null]])

//Buff Soul Sand Oil output
mods.gregtech.centrifuge.recipeBuilder()
  .inputs(item('minecraft:soul_sand'))
  .fluidOutputs(fluid('oil')*1500)
  .chancedOutput(item('minecraft:nether_wart'), 150, 0)
  .EUt(30)
  .duration(450)
  .buildAndRegister()

//ULV Input hatch and bus
if (!ConfigHolder.recipes.hardMiscRecipes) {
crafting.addShapeless('ulv_input_bus', metaitem('item_bus.import.ulv'), [metaitem('hull.ulv'), item('minecraft:chest')])
crafting.addShapeless('ulv_input_hatch', metaitem('fluid_hatch.import.ulv'), [metaitem('hull.ulv'), item('minecraft:glass')])
}