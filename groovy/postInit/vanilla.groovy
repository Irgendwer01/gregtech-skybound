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
  .inputs(metaitem('dustSmallUraniumTriplatinum')*4, metaitem('dustSmallUranium235')*2, metaitem('dustSmallTungstenCarbide')*2, metaitem('dustSmallEnderEye')*4)
  .fluidInputs(liquid('rocket_fuel')*1500)
  .outputs(metaitem('dustNetherStar')*2)
  .EUt(510)
  .duration(3000)
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


