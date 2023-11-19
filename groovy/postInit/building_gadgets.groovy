crafting.removeByOutput(item('buildinggadgets:buildingtool'))
crafting.removeByOutput(item('buildinggadgets:exchangertool'))
crafting.removeByOutput(item('buildinggadgets:copypastetool'))
crafting.removeByOutput(item('buildinggadgets:destructiontool'))
crafting.removeByOutput(item('buildinggadgets:constructionblockpowder'))

mods.gregtech.mixer.recipeBuilder()
  .inputs(item('minecraft:clay_ball')*2, item('minecraft:sand')*2)
  .fluidInputs(liquid('water')*1000)
  .outputs(item('buildinggadgets:constructionpaste')*4)
  .EUt(30)
  .duration(60)
  .buildAndRegister()

crafting.addShaped('building_gadget', item('buildinggadgets:buildingtool'), [
  [metaitem('robot.arm.mv'), metaitem('electric.motor.mv'), metaitem('robot.arm.mv')],
  [metaitem('plateWroughtIron'), ore('circuitMv'), metaitem('plateWroughtIron')],
  [metaitem('screwSteel'), metaitem('battery.re.mv.lithium'), metaitem('screwSteel')]])

crafting.addShapeless('destruction_gadget', item('buildinggadgets:destructiontool'), [item('buildinggadgets:buildingtool'), metaitem('cover.item.voiding.advanced')])

crafting.addShapeless('copypaste_gadget', item('buildinggadgets:copypastetool'), [item('buildinggadgets:buildingtool'), item('opencomputers:storage', 2)])

crafting.addShapeless('exchanging_gadget', item('buildinggadgets:exchangertool'), [item('buildinggadgets:buildingtool')])