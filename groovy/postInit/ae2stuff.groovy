//Wireless Connector
mods.gregtech.assembler.recipeBuilder()
  .inputs(metaitem('plateTitanium')*4, metaitem('field.generator.iv'), ore('circuitZpm')*2, item('appliedenergistics2:material', 24)*4, metaitem('wireless'))
  .outputs(item('ae2stuff:wireless')*2)
  .EUt(510)
  .duration(800)
  .buildAndRegister()

//Network Visualisation Tool
crafting.addShapeless(item('ae2stuff:visualiser'), [ore('circuitLuv'), item('appliedenergistics2:network_tool')])