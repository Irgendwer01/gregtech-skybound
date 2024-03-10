crafting.removeByOutput(item('standalone:ender_crystal'))
crafting.removeByOutput(item('standalone:travel_anchor'))
crafting.removeByOutput(item('standalone:travel_staff'))

mods.gregtech.alloy_smelter.recipeBuilder()
    .inputs(item('minecraft:ender_pearl')*4)
    .inputs(item('minecraft:diamond'))
    .outputs(item('standalone:ender_crystal'))
    .EUt(30)
    .duration(200)
    .buildAndRegister()

crafting.addShaped('travel_anchor', item('standalone:travel_anchor'), [
  [metaitem('plateStainlessSteel'), metaitem('plateStainlessSteel'), metaitem('plateStainlessSteel')],
  [item('standalone:ender_crystal'), ore('elevator_rotating'), item('standalone:ender_crystal')],
  [metaitem('plateStainlessSteel'), metaitem('plateStainlessSteel'), metaitem('plateStainlessSteel')]])

crafting.addShaped('travel_staff', item('standalone:travel_staff'), [
  [null, null, item('standalone:ender_crystal')],
  [null, metaitem('stickStainlessSteel'), null],
  [metaitem('stickStainlessSteel'), null, null]])
