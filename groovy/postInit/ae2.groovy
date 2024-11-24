mods.jei.ingredient.yeet(item('appliedenergistics2:fluix_block'))
mods.jei.ingredient.yeet(item('appliedenergistics2:fluix_stairs'))
mods.jei.ingredient.yeet(item('appliedenergistics2:fluix_slab'))
mods.jei.ingredient.yeet(item('appliedenergistics2:material', 7))
mods.jei.ingredient.yeet(item('appliedenergistics2:material', 8))
mods.jei.ingredient.yeet(item('appliedenergistics2:material', 5))
mods.jei.ingredient.yeet(item('appliedenergistics2:spatial_storage_cell_2_cubed'))
mods.jei.ingredient.yeet(item('appliedenergistics2:spatial_storage_cell_16_cubed'))
mods.jei.ingredient.yeet(item('appliedenergistics2:spatial_storage_cell_128_cubed'))
mods.jei.ingredient.yeet(item('appliedenergistics2:material', 32))
mods.jei.ingredient.yeet(item('appliedenergistics2:material', 33))
mods.jei.ingredient.yeet(item('appliedenergistics2:material', 34))
mods.jei.ingredient.yeet(item('appliedenergistics2:spatial_pylon'))
mods.jei.ingredient.yeet(item('appliedenergistics2:spatial_io_port'))
mods.jei.ingredient.yeet(item('appliedenergistics2:charger'))
furnace.removeByInput(item('appliedenergistics2:material', 2))
furnace.removeByInput(item('appliedenergistics2:material', 3))
crafting.removeByOutput(item('appliedenergistics2:energy_acceptor'))
crafting.removeByOutput(item('appliedenergistics2:part', 140))
crafting.removeByOutput(item('appliedenergistics2:part', 16))
crafting.removeByOutput(item('appliedenergistics2:part', 36))
crafting.removeByOutput(item('appliedenergistics2:part', 516))
crafting.removeByOutput(item('appliedenergistics2:chest'))
crafting.removeByOutput(item('appliedenergistics2:drive'))
crafting.removeByOutput(item('appliedenergistics2:portable_cell'))
crafting.removeByOutput(item('appliedenergistics2:energy_cell'))
crafting.removeByOutput(item('appliedenergistics2:part', 180))
crafting.removeByOutput(item('appliedenergistics2:storage_cell_1k'))
crafting.removeByOutput(item('appliedenergistics2:storage_cell_4k'))
crafting.removeByOutput(item('appliedenergistics2:storage_cell_16k'))
crafting.removeByOutput(item('appliedenergistics2:storage_cell_64k'))
crafting.removeByOutput(item('appliedenergistics2:fluid_storage_cell_1k'))
crafting.removeByOutput(item('appliedenergistics2:fluid_storage_cell_4k'))
crafting.removeByOutput(item('appliedenergistics2:fluid_storage_cell_16k'))
crafting.removeByOutput(item('appliedenergistics2:fluid_storage_cell_64k'))
crafting.removeByOutput(item('appliedenergistics2:material', 35))
crafting.removeByOutput(item('appliedenergistics2:material', 36))
crafting.removeByOutput(item('appliedenergistics2:material', 37))
crafting.removeByOutput(item('appliedenergistics2:material', 38))
crafting.removeByOutput(item('appliedenergistics2:material', 54))
crafting.removeByOutput(item('appliedenergistics2:material', 55))
crafting.removeByOutput(item('appliedenergistics2:material', 56))
crafting.removeByOutput(item('appliedenergistics2:material', 57))
crafting.removeByOutput(item('appliedenergistics2:view_cell'))
crafting.removeByOutput(item('appliedenergistics2:crafting_unit'))
crafting.removeByOutput(item('appliedenergistics2:crafting_accelerator'))
crafting.removeByOutput(item('appliedenergistics2:crafting_storage_1k'))
crafting.removeByOutput(item('appliedenergistics2:crafting_storage_4k'))
crafting.removeByOutput(item('appliedenergistics2:crafting_storage_16k'))
crafting.removeByOutput(item('appliedenergistics2:crafting_storage_64k'))
crafting.removeByOutput(item('appliedenergistics2:crafting_monitor'))
crafting.removeByOutput(item('appliedenergistics2:quartz_glass'))
crafting.removeByOutput(item('appliedenergistics2:quartz_vibrant_glass'))
crafting.removeByOutput(item('appliedenergistics2:quantum_link'))
crafting.removeByOutput(item('appliedenergistics2:quantum_ring'))
crafting.removeByOutput(item('appliedenergistics2:molecular_assembler'))
crafting.removeByOutput(item('appliedenergistics2:interface'))
crafting.removeByOutput(item('appliedenergistics2:fluid_interface'))
crafting.removeByOutput(item('appliedenergistics2:condenser'))
crafting.removeByOutput(item('appliedenergistics2:dense_energy_cell'))
crafting.removeByOutput(item('appliedenergistics2:wireless_terminal'))
crafting.removeByOutput(item('appliedenergistics2:wireless_crafting_terminal'))
crafting.removeByOutput(item('appliedenergistics2:wireless_fluid_terminal'))
crafting.removeByOutput(item('appliedenergistics2:wireless_pattern_terminal'))
crafting.removeByOutput(item('ae2fc:wireless_fluid_pattern_terminal'))
crafting.removeByOutput(item('appliedenergistics2:material', 25))
crafting.removeByOutput(item('appliedenergistics2:material', 28))
crafting.removeByOutput(item('appliedenergistics2:material', 52))
crafting.removeByOutput(item('appliedenergistics2:part', 120))
crafting.removeByOutput(item('appliedenergistics2:part', 460))

//P2P Tunnel
mods.gregtech.assembler.recipeBuilder()
  .inputs(ore('circuitZpm')*2, metaitem('emitter.luv')*4, item('appliedenergistics2:material', 22)*8, item('appliedenergistics2:material', 24)*8, item('ae2fc:part_dual_interface'))
  .outputs(item('appliedenergistics2:part', 460)*2)
  .EUt(2048)
  .duration(600)
  .buildAndRegister()

//Add own Fluix to AE2 fluix oreDicts
ore('crystalFluix').add(metaitem('gemFluixQuartz'))
ore('dustFluix').add(metaitem('dustFluixQuartz'))

//Fluix Foil
mods.gregtech.extruder.recipeBuilder()
  .notConsumable(metaitem('shape.extruder.foil'))
  .inputs(metaitem('dustFluixQuartz'))
  .outputs(metaitem('foilFluixQuartz')*4)
  .EUt(24)
  .duration(5)
  .buildAndRegister()

//Quantum Ring
mods.gregtech.assembler.recipeBuilder()
  .inputs(item('appliedenergistics2:quartz_glass')*2, ore('circuitIv')*8, item('appliedenergistics2:material', 22)*4, item('appliedenergistics2:material', 24)*4, item('appliedenergistics2:material', 47), item('appliedenergistics2:dense_energy_cell'), metaitem('wireless'))
  .outputs(item('appliedenergistics2:quantum_link'))
  .EUt(510)
  .duration(800)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(item('appliedenergistics2:material', 22)*2, item('appliedenergistics2:material', 24)*2, ore('circuitIv')*4, metaitem('plateBlackSteel')*6)
  .outputs(item('appliedenergistics2:quantum_ring')*2)
  .EUt(510)
  .duration(300)
  .buildAndRegister()

//Quartz Glass
mods.gregtech.alloy_smelter.recipeBuilder()
  .inputs(item('minecraft:glass'), metaitem('dustCertusQuartz')*2)
  .outputs(item('appliedenergistics2:quartz_glass'))
  .EUt(30)
  .duration(100)
  .buildAndRegister()
  
mods.gregtech.alloy_smelter.recipeBuilder()
  .inputs(item('appliedenergistics2:quartz_glass'), item('minecraft:glowstone_dust')*2)
  .outputs(item('appliedenergistics2:quartz_vibrant_glass'))
  .EUt(30)
  .duration(100)
  .buildAndRegister()

//Illuminated Panel
mods.gregtech.assembler.recipeBuilder()
  .inputs(metaitem('cover.screen'), metaitem('foilFluixQuartz')*2, item('appliedenergistics2:material', 24), item('appliedenergistics2:material', 22))
  .outputs(item('appliedenergistics2:part', 180))
  .EUt(30)
  .duration(100)
  .buildAndRegister()

//portable cell
crafting.addShaped('portable_cell', item('appliedenergistics2:portable_cell').withNbt(["internalCurrentPower": 20000.0D, "internalMaxPower": 20000.0D]), [
  [metaitem('boltRedAlloy'), ore('paneGlass'), metaitem('boltRedAlloy')],
  [metaitem('circuit.vacuum_tube'), metaitem('crate.bronze'), metaitem('circuit.vacuum_tube')],
  [metaitem('screwWroughtIron'), ore('craftingToolScrewdriver'), metaitem('screwWroughtIron')]])

// Matter condenser.
crafting.addShaped("condenser", item('appliedenergistics2:condenser'),
 [[ore('circuitHv'),ore('cableGtSingleGold'),ore('circuitHv')],
  [metaitem('electric.piston.ev'), metaitem('hull.hv'), metaitem('electric.piston.ev')],
  [metaitem('electric.motor.ev'), ore('cableGtSingleGold'), metaitem('electric.motor.ev')]]);

//Skystone
mods.gregtech.mixer.recipeBuilder()
  .inputs(ore('dustRedstone')*2, ore('dustCertusQuartz'), ore('dustNetherQuartz'))
  .outputs(metaitem('dustFluixQuartz')*4)
  .EUt(30)
  .duration(60)
  .buildAndRegister()

//Presses
mods.gregtech.laser_engraver.recipeBuilder()
  .inputs(metaitem('blockCertusQuartz'))
  .notConsumable(metaitem('lensGlass'))
  .outputs(item('appliedenergistics2:material', 13))
  .EUt(30)
  .duration(800)
  .buildAndRegister()

mods.gregtech.laser_engraver.recipeBuilder()
  .inputs(item('minecraft:diamond_block'))
  .notConsumable(metaitem('lensGlass'))
  .outputs(item('appliedenergistics2:material', 14))
  .EUt(30)
  .duration(800)
  .buildAndRegister()

mods.gregtech.laser_engraver.recipeBuilder()
  .inputs(metaitem('blockSilicon'))
  .notConsumable(metaitem('lensGlass'))
  .outputs(item('appliedenergistics2:material', 19))
  .EUt(30)
  .duration(800)
  .buildAndRegister()

mods.gregtech.laser_engraver.recipeBuilder()
  .inputs(item('minecraft:gold_block'))
  .notConsumable(metaitem('lensGlass'))
  .outputs(item('appliedenergistics2:material', 15))
  .EUt(30)
  .duration(800)
  .buildAndRegister()

//Circuits
mods.gregtech.forming_press.recipeBuilder()
  .notConsumable(item('appliedenergistics2:material', 13))
  .inputs(metaitem('plateCertusQuartz'))
  .outputs(item('appliedenergistics2:material', 16))
  .EUt(30)
  .duration(100)
  .buildAndRegister()

mods.gregtech.forming_press.recipeBuilder()
  .notConsumable(item('appliedenergistics2:material', 14))
  .inputs(metaitem('plateDiamond'))
  .outputs(item('appliedenergistics2:material', 17))
  .EUt(30)
  .duration(100)
  .buildAndRegister()

mods.gregtech.forming_press.recipeBuilder()
  .notConsumable(item('appliedenergistics2:material', 15))
  .inputs(metaitem('plateGold'))
  .outputs(item('appliedenergistics2:material', 18))
  .EUt(30)
  .duration(100)
  .buildAndRegister()

mods.gregtech.forming_press.recipeBuilder()
  .notConsumable(item('appliedenergistics2:material', 19))
  .inputs(metaitem('plateSilicon'))
  .outputs(item('appliedenergistics2:material', 20))
  .EUt(30)
  .duration(100)
  .buildAndRegister()

//Processors
mods.gregtech.circuit_assembler.recipeBuilder()
  .inputs(item('appliedenergistics2:material', 17), item('appliedenergistics2:material', 20), ore('circuitLv'))
  .fluidInputs(fluid('redstone')*144)
  .outputs(item('appliedenergistics2:material', 24))
  .EUt(30)
  .duration(100)
  .buildAndRegister()

mods.gregtech.circuit_assembler.recipeBuilder()
  .inputs(item('appliedenergistics2:material', 16), item('appliedenergistics2:material', 20), ore('circuitLv'))
  .fluidInputs(fluid('redstone')*144)
  .outputs(item('appliedenergistics2:material', 23))
  .EUt(30)
  .duration(100)
  .buildAndRegister()

mods.gregtech.circuit_assembler.recipeBuilder()
  .inputs(item('appliedenergistics2:material', 18), item('appliedenergistics2:material', 20), ore('circuitLv'))
  .fluidInputs(fluid('redstone')*144)
  .outputs(item('appliedenergistics2:material', 22))
  .EUt(30)
  .duration(100)
  .buildAndRegister()

mods.gregtech.mixer.recipeBuilder()
  .inputs(metaitem('dustBasalt'), item('minecraft:glowstone_dust'))
  .outputs(item('appliedenergistics2:material', 45)*2)
  .EUt(30)
  .duration(60)
  .buildAndRegister()

//Energy Acceptor
mods.gregtech.assembler.recipeBuilder()
  .inputs(metaitem('plateFluixQuartz')*2, metaitem('plateStainlessSteel')*2, metaitem('energy_hatch.input.mv'), item('appliedenergistics2:material', 24)*4)
  .outputs(item('appliedenergistics2:energy_acceptor'))
  .EUt(120)
  .duration(400)
  .buildAndRegister()

//Cable
mods.gregtech.lathe.recipeBuilder()
  .inputs(metaitem('stickCertusQuartz'))
  .outputs(item('appliedenergistics2:part', 140)*2)
  .EUt(30)
  .duration(60)
  .buildAndRegister()

mods.gregtech.alloy_smelter.recipeBuilder()
  .inputs(item('appliedenergistics2:part', 140), metaitem('dustFluixQuartz'))
  .outputs(item('appliedenergistics2:part', 16))
  .EUt(30)
  .duration(100)
  .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
  .inputs(item('appliedenergistics2:part', 16)*4)
  .fluidInputs(liquid('plastic')*144)
  .outputs(item('appliedenergistics2:part', 36))
  .EUt(120)
  .duration(100)
  .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
  .inputs(item('appliedenergistics2:part', 36)*4)
  .fluidInputs(liquid('plastic')*144)
  .outputs(item('appliedenergistics2:part', 516))
  .EUt(120)
  .duration(100)
  .buildAndRegister()

//ME Chest
mods.gregtech.assembler.recipeBuilder()
  .inputs(item('appliedenergistics2:part', 380), item('appliedenergistics2:part', 16)*2, item('appliedenergistics2:material', 24)*2, item('appliedenergistics2:material', 22)*2, metaitem('plateSteel')*4)
  .outputs(item('appliedenergistics2:chest'))
  .EUt(30)
  .duration(100)
  .buildAndRegister()

//ME Drive
mods.gregtech.assembler.recipeBuilder()
  .inputs(item('appliedenergistics2:chest'), item('appliedenergistics2:material', 24)*2, metaitem('buffer.lv'))
  .outputs(item('appliedenergistics2:drive'))
  .EUt(30)
  .duration(100)
  .buildAndRegister()

//Energy Cell
mods.gregtech.assembler.recipeBuilder()
  .inputs(metaitem('hull.mv'), metaitem('battery.re.mv.lithium')*2, item('appliedenergistics2:material', 22)*2, item('appliedenergistics2:material', 24)*4)
  .outputs(item('appliedenergistics2:energy_cell'))
  .EUt(30)
  .duration(300)
  .buildAndRegister()

//Storage canning
mods.gregtech.canner.recipeBuilder()
  .inputs(item('appliedenergistics2:material', 35), item('appliedenergistics2:material', 39))
  .outputs(item('appliedenergistics2:storage_cell_1k'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()
  
mods.gregtech.canner.recipeBuilder()
  .inputs(item('appliedenergistics2:material', 36), item('appliedenergistics2:material', 39))
  .outputs(item('appliedenergistics2:storage_cell_4k'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()
  
mods.gregtech.canner.recipeBuilder()
  .inputs(item('appliedenergistics2:material', 37), item('appliedenergistics2:material', 39))
  .outputs(item('appliedenergistics2:storage_cell_16k'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()
  
mods.gregtech.canner.recipeBuilder()
  .inputs(item('appliedenergistics2:material', 38), item('appliedenergistics2:material', 39))
  .outputs(item('appliedenergistics2:storage_cell_64k'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()
  
 mods.gregtech.canner.recipeBuilder()
  .inputs(item('appliedenergistics2:material', 54), item('appliedenergistics2:material', 39))
  .outputs(item('appliedenergistics2:fluid_storage_cell_1k'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()
  
mods.gregtech.canner.recipeBuilder()
  .inputs(item('appliedenergistics2:material', 55), item('appliedenergistics2:material', 39))
  .outputs(item('appliedenergistics2:fluid_storage_cell_4k'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()
  
mods.gregtech.canner.recipeBuilder()
  .inputs(item('appliedenergistics2:material', 56), item('appliedenergistics2:material', 39))
  .outputs(item('appliedenergistics2:fluid_storage_cell_16k'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()
  
mods.gregtech.canner.recipeBuilder()
  .inputs(item('appliedenergistics2:material', 57), item('appliedenergistics2:material', 39))
  .outputs(item('appliedenergistics2:fluid_storage_cell_64k'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()
  
mods.gregtech.canner.recipeBuilder()
  .inputs(metaitem('gemCertusQuartz'), item('appliedenergistics2:material', 39))
  .outputs(item('appliedenergistics2:view_cell'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()
  
mods.gregtech.canner.recipeBuilder()
  .inputs(item('appliedenergistics2:crafting_unit'), item('appliedenergistics2:material', 24))
  .outputs(item('appliedenergistics2:crafting_accelerator'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()
  
mods.gregtech.canner.recipeBuilder()
  .inputs(item('appliedenergistics2:crafting_unit'), item('appliedenergistics2:material', 35))
  .outputs(item('appliedenergistics2:crafting_storage_1k'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()

mods.gregtech.canner.recipeBuilder()
  .inputs(item('appliedenergistics2:crafting_unit'), item('appliedenergistics2:material', 36))
  .outputs(item('appliedenergistics2:crafting_storage_4k'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()
  
 mods.gregtech.canner.recipeBuilder()
  .inputs(item('appliedenergistics2:crafting_unit'), item('appliedenergistics2:material', 37))
  .outputs(item('appliedenergistics2:crafting_storage_16k'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()
  
mods.gregtech.canner.recipeBuilder()
  .inputs(item('appliedenergistics2:crafting_unit'), item('appliedenergistics2:material', 38))
  .outputs(item('appliedenergistics2:crafting_storage_64k'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()

mods.gregtech.canner.recipeBuilder()
  .inputs(item('appliedenergistics2:crafting_unit'), item('appliedenergistics2:part', 400))
  .outputs(item('appliedenergistics2:crafting_monitor'))
  .EUt(30)
  .duration(50)
  .buildAndRegister()
 
//Storage Components
mods.gregtech.assembler.recipeBuilder()
  .inputs(ore('circuitLv')*4, metaitem('crate.aluminium'), item('appliedenergistics2:material', 24)*2, item('appliedenergistics2:material', 23)*2)
  .fluidInputs(liquid('plastic')*576)
  .outputs(item('appliedenergistics2:material', 35))
  .EUt(30)
  .duration(150)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(ore('circuitMv')*4, item('appliedenergistics2:material', 35)*3, item('appliedenergistics2:material', 24)*2, item('appliedenergistics2:material', 23)*2)
  .outputs(item('appliedenergistics2:material', 36))
  .EUt(120)
  .duration(150)
  .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
  .inputs(ore('circuitHv')*4, item('appliedenergistics2:material', 36)*3, item('appliedenergistics2:material', 24)*2, item('appliedenergistics2:material', 23)*2)
  .outputs(item('appliedenergistics2:material', 37))
  .EUt(510)
  .duration(150)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(ore('circuitEv')*4, item('appliedenergistics2:material', 37)*3, item('appliedenergistics2:material', 24)*2, item('appliedenergistics2:material', 23)*2)
  .outputs(item('appliedenergistics2:material', 38))
  .EUt(2040)
  .duration(150)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(ore('circuitLv')*4, metaitem('drum.aluminium'), item('appliedenergistics2:material', 24)*2, item('appliedenergistics2:material', 23)*2)
  .fluidInputs(liquid('plastic')*576)
  .outputs(item('appliedenergistics2:material', 54))
  .EUt(30)
  .duration(150)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(ore('circuitMv')*4, item('appliedenergistics2:material', 54)*3, item('appliedenergistics2:material', 24)*2, item('appliedenergistics2:material', 23)*2)
  .outputs(item('appliedenergistics2:material', 55))
  .EUt(120)
  .duration(150)
  .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
  .inputs(ore('circuitHv')*4, item('appliedenergistics2:material', 55)*3, item('appliedenergistics2:material', 24)*2, item('appliedenergistics2:material', 23)*2)
  .outputs(item('appliedenergistics2:material', 56))
  .EUt(510)
  .duration(150)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(ore('circuitEv')*4, item('appliedenergistics2:material', 56)*3, item('appliedenergistics2:material', 24)*2, item('appliedenergistics2:material', 23)*2)
  .outputs(item('appliedenergistics2:material', 57))
  .EUt(2040)
  .duration(150)
  .buildAndRegister()
  
//Quantum Link Card
crafting.addShapeless('quantum_link_card', item('appliedenergistics2:material', 59), [item('appliedenergistics2:material', 28), item('appliedenergistics2:material', 47)])

//Magnet Card
crafting.addShapeless('magnet_card', item('appliedenergistics2:material', 60), [item('appliedenergistics2:material', 28), metaitem('stickIronMagnetic'), metaitem('stickIronMagnetic')])

//Autocrafting
mods.gregtech.assembler.recipeBuilder()
  .inputs(ore('circuitMv')*2, metaitem('plateTitanium')*4, item('appliedenergistics2:material', 23), item('appliedenergistics2:material', 22), item('appliedenergistics2:material', 24))
  .outputs(item('appliedenergistics2:crafting_unit'))
  .EUt(510)
  .duration(150)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(ore('circuitMv')*2, metaitem('plateTitanium')*4, item('minecraft:crafting_table'), item('appliedenergistics2:material', 22)*2, item('appliedenergistics2:material', 24)*2)
  .outputs(item('appliedenergistics2:molecular_assembler'))
  .EUt(510)
  .duration(100)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(metaitem('plateTitanium')*4, item('appliedenergistics2:material', 22)*2, item('appliedenergistics2:material', 24)*2, metaitem('robot.arm.lv')*2)
  .outputs(item('appliedenergistics2:interface'))
  .EUt(510)
  .duration(100)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(metaitem('plateTitanium')*4, item('appliedenergistics2:material', 22)*2, item('appliedenergistics2:material', 24)*2, metaitem('robot.arm.mv')*2)
  .outputs(item('appliedenergistics2:interface')*2)
  .EUt(510)
  .duration(200)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(metaitem('plateTitanium')*4, item('appliedenergistics2:material', 22)*2, item('appliedenergistics2:material', 24)*2, metaitem('robot.arm.hv')*2)
  .outputs(item('appliedenergistics2:interface')*4)
  .EUt(510)
  .duration(400)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(metaitem('plateTitanium')*4, item('appliedenergistics2:material', 22)*2, item('appliedenergistics2:material', 24)*2, metaitem('robot.arm.ev')*2)
  .outputs(item('appliedenergistics2:interface')*8)
  .EUt(510)
  .duration(800)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(metaitem('plateTitanium')*4, item('appliedenergistics2:material', 22)*2, item('appliedenergistics2:material', 24)*2, metaitem('electric.pump.lv')*2)
  .outputs(item('appliedenergistics2:fluid_interface'))
  .EUt(510)
  .duration(100)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(metaitem('plateTitanium')*4, item('appliedenergistics2:material', 22)*2, item('appliedenergistics2:material', 24)*2, metaitem('electric.pump.mv')*2)
  .outputs(item('appliedenergistics2:fluid_interface')*2)
  .EUt(510)
  .duration(200)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(metaitem('plateTitanium')*4, item('appliedenergistics2:material', 22)*2, item('appliedenergistics2:material', 24)*2, metaitem('electric.pump.hv')*2)
  .outputs(item('appliedenergistics2:fluid_interface')*4)
  .EUt(510)
  .duration(400)
  .buildAndRegister()
  
mods.gregtech.assembler.recipeBuilder()
  .inputs(metaitem('plateTitanium')*4, item('appliedenergistics2:material', 22)*2, item('appliedenergistics2:material', 24)*2, metaitem('electric.pump.ev')*2)
  .outputs(item('appliedenergistics2:fluid_interface')*8)
  .EUt(510)
  .duration(800)
  .buildAndRegister()

//charged certus quartz
mods.gregtech.polarizer.recipeBuilder()
  .inputs(metaitem('gemCertusQuartz'))
  .outputs(item('appliedenergistics2:material', 1))
  .EUt(30)
  .duration(100)
  .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
  .inputs(item('appliedenergistics2:energy_cell')*8)
  .outputs(item('appliedenergistics2:dense_energy_cell'))
  .EUt(510)
  .duration(200)
  .buildAndRegister()

//Wireless Terminals
crafting.addShaped('wireless_terminal', item('appliedenergistics2:wireless_terminal'), [
  [ore('circuitEv'), metaitem('wireless'), ore('circuitEv')],
  [item('appliedenergistics2:material', 24), item('appliedenergistics2:part', 380), item('appliedenergistics2:material', 22)],
  [metaitem('plateFluixQuartz'), item('appliedenergistics2:dense_energy_cell'), metaitem('plateFluixQuartz')]])

crafting.addShaped('wireless_pattern_terminal', item('appliedenergistics2:wireless_pattern_terminal'), [
  [ore('circuitEv'), metaitem('wireless'), ore('circuitEv')],
  [item('appliedenergistics2:material', 24), item('appliedenergistics2:part', 340), item('appliedenergistics2:material', 22)],
  [metaitem('plateFluixQuartz'), item('appliedenergistics2:dense_energy_cell'), metaitem('plateFluixQuartz')]])

crafting.addShaped('wireless_crafting_terminal', item('appliedenergistics2:wireless_crafting_terminal'), [
  [ore('circuitEv'), metaitem('wireless'), ore('circuitEv')],
  [item('appliedenergistics2:material', 24), item('appliedenergistics2:part', 360), item('appliedenergistics2:material', 22)],
  [metaitem('plateFluixQuartz'), item('appliedenergistics2:dense_energy_cell'), metaitem('plateFluixQuartz')]])

crafting.addShaped('wireless_fluid_terminal', item('appliedenergistics2:wireless_fluid_terminal'), [
  [ore('circuitEv'), metaitem('wireless'), ore('circuitEv')],
  [item('appliedenergistics2:material', 24), item('appliedenergistics2:part', 520), item('appliedenergistics2:material', 22)],
  [metaitem('plateFluixQuartz'), item('appliedenergistics2:dense_energy_cell'), metaitem('plateFluixQuartz')]])

crafting.addShaped('wireless_fluid_pattern_terminal', item('ae2fc:wireless_fluid_pattern_terminal'), [
  [ore('circuitEv'), metaitem('wireless'), ore('circuitEv')],
  [item('appliedenergistics2:material', 24), item('ae2fc:part_fluid_pattern_terminal'), item('appliedenergistics2:material', 22)],
  [metaitem('plateFluixQuartz'), item('appliedenergistics2:dense_energy_cell'), metaitem('plateFluixQuartz')]])

//Basic and Advanced Card
mods.gregtech.assembler.recipeBuilder()
  .inputs(metaitem('plateRedstone')*2, metaitem('wireFineGold')*4)
  .fluidInputs(fluid('plastic')*288)
  .outputs(item('appliedenergistics2:material', 25))
  .EUt(120)
  .duration(80)
  .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
  .inputs(metaitem('plateRedstone')*2, metaitem('wireFineAluminium')*4)
  .fluidInputs(fluid('plastic')*288)
  .outputs(item('appliedenergistics2:material', 28))
  .EUt(120)
  .duration(80)
  .buildAndRegister()

//Blank Pattern
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 3)
        .inputs(ore('platePlastic') * 2)
        .inputs(ore('wireFineRedAlloy') * 4)
        .inputs(ore('circuitMv'))
        .outputs(item('appliedenergistics2:material', 52))
        .duration(200).EUt(120).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 3)
        .inputs(ore('platePolyvinylChloride') * 2)
        .inputs(ore('wireFineRedAlloy') * 4)
        .inputs(ore('circuitMv'))
        .outputs(item('appliedenergistics2:material', 52) * 4)
        .duration(200).EUt(120).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 3)
        .inputs(ore('platePolytetrafluoroethylene') * 2)
        .inputs(ore('wireFineRedAlloy') * 4)
        .inputs(ore('circuitMv'))
        .outputs(item('appliedenergistics2:material', 52) * 16)
        .duration(200).EUt(480).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 3)
        .inputs(ore('platePolybenzimidazole') * 2)
        .inputs(ore('wireFineRedAlloy') * 4)
        .inputs(ore('circuitMv'))
        .outputs(item('appliedenergistics2:material', 52) * 64)
        .duration(200).EUt(480).buildAndRegister()

//Cable anchor
recipemap('lathe').recipeBuilder()
        .inputs(metaitem('stickIron'))
        .outputs(item('appliedenergistics2:part', 120) * 2)
        .duration(200).EUt(32).buildAndRegister()
