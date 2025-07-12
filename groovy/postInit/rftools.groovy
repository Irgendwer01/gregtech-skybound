crafting.removeByOutput(item('rftools:machine_frame'))
crafting.removeByOutput(item('rftools:storage_module'))
crafting.removeByOutput(item('rftools:storage_module', 1))
crafting.removeByOutput(item('rftools:storage_module', 2))
crafting.removeByOutput(item('rftools:storage_module_tablet'))
crafting.removeByOutput(item('rftools:modular_storage'))
crafting.removeByOutput(item('rftools:storage_scanner'))
crafting.removeByOutput(item('rftools:remote_storage'))
crafting.removeByOutput(item('rftools:builder'))
mods.jei.ingredient.yeet(item('rftools:coalgenerator'))
mods.jei.ingredient.yeet(item('rftools:powercell_simple'))
mods.jei.ingredient.yeet(item('rftools:powercell'))
mods.jei.ingredient.yeet(item('rftools:powercell_advanced'))
mods.jei.ingredient.yeet(item('rftools:powercell_creative'))
mods.jei.ingredient.yeet(item('rftools:shape_card', 2))
mods.jei.ingredient.yeet(item('rftools:shape_card', 3))
mods.jei.ingredient.yeet(item('rftools:shape_card', 4))
mods.jei.ingredient.yeet(item('rftools:shape_card', 5))
mods.jei.ingredient.yeet(item('rftools:shape_card', 6))
mods.jei.ingredient.yeet(item('rftools:shape_card', 7))
mods.jei.ingredient.yeet(item('rftools:shape_card', 8))
mods.jei.ingredient.yeet(item('rftools:shape_card', 9))
mods.jei.ingredient.yeet(item('rftools:shape_card', 10))
mods.jei.ingredient.yeet(item('rftools:spawner'))
mods.jei.ingredient.yeet(item('rftools:machine_infuser'))
mods.jei.ingredient.yeet(item('rftools:matter_beamer'))
mods.jei.ingredient.yeet(item('rftools:charged_porter'))
mods.jei.ingredient.yeet(item('rftools:advanced_charged_porter'))
mods.jei.ingredient.yeet(item('rftools:powercell_card'))
mods.jei.ingredient.yeet(item('rftools:booster'))
mods.jei.ingredient.yeet(item('rftools:endergenic'))
mods.jei.ingredient.yeet(item('rftools:pearl_injector'))

// Machine Casing
mods.gregtech.assembler.recipeBuilder()
	.inputs(item('gregtech:machine_casing', 1))
        .inputs(metaitem('plateBlackSteel')*8)
        .outputs(item('rftools:machine_frame'))
        .EUt(30)
        .duration(60)
        .buildAndRegister()

// Storage Modules
crafting.addShaped('storage_module_1', item('rftools:storage_module'), [
  [metaitem('screwWroughtIron'), metaitem('plateWroughtIron'), metaitem('screwWroughtIron')],
  [metaitem('plateWroughtIron'), metaitem('crate.bronze'), metaitem('plateWroughtIron')],
  [metaitem('plateWroughtIron'), metaitem('crate.bronze'), metaitem('plateWroughtIron')]])

crafting.addShaped('storage_module_2', item('rftools:storage_module', 1), [
  [metaitem('screwWroughtIron'), metaitem('plateWroughtIron'), metaitem('screwWroughtIron')],
  [metaitem('plateWroughtIron'), metaitem('crate.steel'), metaitem('plateWroughtIron')],
  [metaitem('plateWroughtIron'), item('rftools:storage_module'), metaitem('plateWroughtIron')]])

crafting.addShaped('storage_module_3', item('rftools:storage_module', 2), [
  [metaitem('screwWroughtIron'), metaitem('plateWroughtIron'), metaitem('screwWroughtIron')],
  [metaitem('plateWroughtIron'), metaitem('crate.aluminium'), metaitem('plateWroughtIron')],
  [metaitem('plateWroughtIron'),  item('rftools:storage_module', 1), metaitem('plateWroughtIron')]])

// Storage Tablet
crafting.addShaped('storage_tablet', item('rftools:storage_module_tablet'), [
  [metaitem('sensor.lv'), metaitem('robot.arm.lv'), metaitem('sensor.lv')],
  [metaitem('circuit.electronic'), item('minecraft:glass_pane'), metaitem('circuit.electronic')],
  [metaitem('plateSteel'),  metaitem('battery.re.lv.sodium'), metaitem('plateSteel')]])

// Modular Storage
crafting.addShaped('modular_storage', item('rftools:modular_storage'), [
  [metaitem('ulv_covers:conveyor.module.ulv'), metaitem('plateSteel'), metaitem('ulv_covers:conveyor.module.ulv')],
  [metaitem('circuit.vacuum_tube'), metaitem('hull.ulv'), metaitem('circuit.vacuum_tube')],
  [metaitem('plateSteel'),  metaitem('cableGtSingleLead'), metaitem('plateSteel')]])

// Storage Scanner
crafting.addShaped('storage_scanner', item('rftools:storage_scanner'), [
  [metaitem('ulv_covers:robot.arm.ulv'), metaitem('plateSteel'), metaitem('ulv_covers:robot.arm.ulv')],
  [metaitem('circuit.vacuum_tube'), metaitem('hull.ulv'), metaitem('circuit.vacuum_tube')],
  [metaitem('plateSteel'),  metaitem('cableGtSingleLead'), metaitem('plateSteel')]])

// Remote Storage
crafting.addShaped('remote_storage', item('rftools:remote_storage'), [
  [ore('circuitLv'), ore('circuitLv'), ore('circuitLv')],
  [item('rftools:modular_storage'), item('rftools:machine_frame'), item('rftools:modular_storage')],
  [item('rftools:modular_storage'),  metaitem('cableGtSingleTin'), item('rftools:modular_storage')]])

// Builder
crafting.addShaped('builder', item('rftools:builder'), [
  [metaitem('robot.arm.hv'), metaitem('emitter.hv'), metaitem('robot.arm.hv')],
  [metaitem('circuit.advanced_integrated'), metaitem('hull.hv'), metaitem('circuit.advanced_integrated')],
  [metaitem('plateBlackSteel'),  metaitem('field.generator.hv'), metaitem('plateBlackSteel')]])