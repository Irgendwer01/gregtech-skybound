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

crafting.addShapeless('light_to_display_panel', item('integrateddynamics:part_display_panel_item'), [item('integrateddynamics:part_static_light_panel_item'), ore('craftingToolScrewdriver')])
crafting.addShapeless('display_to_light_panel', item('integrateddynamics:part_static_light_panel_item'), [item('integrateddynamics:part_display_panel_item'), ore('craftingToolScrewdriver')])

crafting.addShaped('id_facade', item('integrateddynamics:facade')*16,
[[null , metaitem('rubber_drop'), null],
 [metaitem('rubber_drop'), item('integrateddynamics:crystalized_menril_block'), metaitem('rubber_drop')],
 [null, metaitem('rubber_drop'), null]])

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
	.inputs(item('integrateddynamics:variable'), item('integrateddynamics:crystalized_chorus_chunk')*6)
        .outputs(item('integrateddynamics:logic_director'))
        .EUt(128)
        .duration(200)
        .buildAndRegister()