mods.jei.ingredient.yeet(item('integrateddynamics:coal_generator'))
mods.jei.ingredient.yeet(item('integrateddynamics:energy_battery'))
mods.jei.ingredient.yeet(item('integrateddynamics:mechanical_squeezer'))
mods.jei.ingredient.yeet(item('integrateddynamics:mechanical_drying_basin'))
mods.jei.ingredient.yeet(item('integrateddynamics:squeezer'))
mods.jei.ingredient.yeet(item('integrateddynamics:drying_basin'))

crafting.removeByOutput(item('integrateddynamics:logic_director'))
crafting.removeByOutput(item('integrateddynamics:cable'))
crafting.removeByOutput(item('integrateddynamics:part_static_light_panel_item'))
crafting.removeByOutput(item('integrateddynamics:part_display_panel_item'))
crafting.removeByOutput(item('integratedtunnels:part_interface_item_item'))
crafting.removeByOutput(item('integratedtunnels:part_interface_fluid_item'))
crafting.removeByOutput(item('integratedcrafting:part_interface_crafting_item'))
crafting.removeByOutput(item('integratedterminals:part_terminal_storage_item'))
crafting.removeByOutput(item('integratedterminals:part_terminal_crafting_job_item'))

crafting.addShapeless('id_storage_terminal', item('integratedterminals:part_terminal_storage_item'), [item('integrateddynamics:part_display_panel_item'), item('minecraft:crafting_table')])
crafting.addShapeless('id_crafting_terminal', item('integratedterminals:part_terminal_crafting_job_item'), [item('integrateddynamics:part_display_panel_item'), item('integratedcrafting:part_interface_crafting_item')])

crafting.addShapeless('light_to_display_panel', item('integrateddynamics:part_display_panel_item'), [item('integrateddynamics:part_static_light_panel_item')])
crafting.addShapeless('display_to_light_panel', item('integrateddynamics:part_static_light_panel_item'), [item('integrateddynamics:part_display_panel_item')])

crafting.addShaped('id_facade', item('integrateddynamics:facade')*16,
[[null , metaitem('rubber_drop'), null],
 [metaitem('rubber_drop'), item('integrateddynamics:crystalized_menril_block'), metaitem('rubber_drop')],
 [null, metaitem('rubber_drop'), null]])

crafting.addShaped('id_crafting_interface', item('integratedcrafting:part_interface_crafting_item'),
[[metaitem('plateTitanium'), item('integrateddynamics:variable_transformer'), metaitem('plateTitanium')],
 [ore('circuitEv'), item('minecraft:crafting_table'), ore('circuitEv')],
 [metaitem('plateTitanium'), item('integrateddynamics:variable_transformer', 1), metaitem('plateTitanium')]])

crafting.addShaped('id_item_interface', item('integratedtunnels:part_interface_item_item')*2,
[[null, null, null],
 [item('integrateddynamics:crystalized_menril_chunk'), metaitem('ulv_covers:conveyor.module.ulv'), item('integrateddynamics:crystalized_menril_chunk')],
 [item('integrateddynamics:crystalized_menril_chunk'), item('integrateddynamics:crystalized_menril_chunk'), item('integrateddynamics:crystalized_menril_chunk')]])

crafting.addShaped('id_fluid_interface', item('integratedtunnels:part_interface_fluid_item')*2,
[[null, null, null],
 [item('integrateddynamics:crystalized_menril_chunk'), metaitem('ulv_covers:electric.pump.ulv'), item('integrateddynamics:crystalized_menril_chunk')],
 [item('integrateddynamics:crystalized_menril_chunk'), item('integrateddynamics:crystalized_menril_chunk'), item('integrateddynamics:crystalized_menril_chunk')]])

crafting.addShaped('id_light_panel', item('integrateddynamics:part_static_light_panel_item'),
[[metaitem('plateSteel'), item('integrateddynamics:variable'), metaitem('plateSteel')],
 [item('integrateddynamics:variable_transformer'), item('minecraft:glass_pane'), item('integrateddynamics:variable_transformer', 1)],
 [metaitem('plateSteel'), metaitem('circuit.vacuum_tube'), metaitem('plateSteel')]])

crafting.addShaped('id_cable', item('integrateddynamics:cable')*6,
[[item('integrateddynamics:crystalized_menril_chunk'), item('integrateddynamics:crystalized_menril_chunk'), item('integrateddynamics:crystalized_menril_chunk')],
 [metaitem('wireGtSingleRedAlloy'), metaitem('wireGtSingleRedAlloy'), metaitem('wireGtSingleRedAlloy')],
 [item('integrateddynamics:crystalized_menril_chunk'), item('integrateddynamics:crystalized_menril_chunk'), item('integrateddynamics:crystalized_menril_chunk')]])

mods.integrateddynamics.mechanical_squeezer.removeAll()
mods.integrateddynamics.mechanical_drying_basin.removeAll()
mods.integrateddynamics.squeezer.removeAll()
mods.integrateddynamics.drying_basin.removeAll()

mods.gregtech.extractor.recipeBuilder()
	.inputs(item('integrateddynamics:menril_log'))
        .outputs(item('integrateddynamics:crystalized_menril_chunk')*3)
        .EUt(8)
        .duration(50)
        .buildAndRegister()

mods.gregtech.extractor.recipeBuilder()
	.inputs(item('minecraft:chorus_fruit_popped'))
        .outputs(item('integrateddynamics:crystalized_chorus_chunk')*3)
        .EUt(32)
        .duration(50)
        .buildAndRegister()

mods.gregtech.alloy_smelter.recipeBuilder()
	.inputs(ore('blockGlass'), item('integrateddynamics:crystalized_menril_chunk')*4)
        .outputs(item('integratedterminals:menril_glass'))
        .EUt(8)
        .duration(150)
        .buildAndRegister()
mods.gregtech.alloy_smelter.recipeBuilder()
	.inputs(ore('blockGlass'), item('integrateddynamics:crystalized_chorus_chunk')*4)
        .outputs(item('integratedterminals:chorus_glass'))
        .EUt(8)
        .duration(150)
        .buildAndRegister()

mods.gregtech.alloy_smelter.recipeBuilder()
	.inputs(item('integrateddynamics:variable'), item('integrateddynamics:crystalized_chorus_chunk')*6)
        .outputs(item('integrateddynamics:logic_director'))
        .EUt(128)
        .duration(200)
        .buildAndRegister()