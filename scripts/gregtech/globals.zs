#priority 999

import mods.gregtech.recipe.RecipeMap;

global alloy_smelter     as RecipeMap = RecipeMap.getByName("alloy_smelter");
global assembler         as RecipeMap = RecipeMap.getByName("assembler");
global assembly_line     as RecipeMap = RecipeMap.getByName("assembly_line");
global attractor         as RecipeMap = RecipeMap.getByName("attractor");
global autoclave         as RecipeMap = RecipeMap.getByName("autoclave");
global bender        	 as RecipeMap = RecipeMap.getByName("bender");
global blast_furnace     as RecipeMap = RecipeMap.getByName("blast_furnace");
global brewer            as RecipeMap = RecipeMap.getByName("brewer");
global canner            as RecipeMap = RecipeMap.getByName("canner");
global centrifuge        as RecipeMap = RecipeMap.getByName("centrifuge");
global chemical_bath     as RecipeMap = RecipeMap.getByName("chemical_bath");
global chemreactor       as RecipeMap = RecipeMap.getByName("chemical_reactor");
global circuit_assembler as RecipeMap = RecipeMap.getByName("circuit_assembler");
global compressor        as RecipeMap = RecipeMap.getByName("compressor");
global cutter            as RecipeMap = RecipeMap.getByName("cutter");
global distillery        as RecipeMap = RecipeMap.getByName("distillery");
global electric_sieve    as RecipeMap = RecipeMap.getByName("electric_sieve");
global electrolyzer      as RecipeMap = RecipeMap.getByName("electrolyzer");
global engraver          as RecipeMap = RecipeMap.getByName("laser_engraver");
global extractor         as RecipeMap = RecipeMap.getByName("extractor");
global extruder          as RecipeMap = RecipeMap.getByName("extruder");
global fermenter         as RecipeMap = RecipeMap.getByName("fermenter");
global forming_press     as RecipeMap = RecipeMap.getByName("forming_press");
global freezer           as RecipeMap = RecipeMap.getByName("vacuum_freezer");
global fusion_reactor    as RecipeMap = RecipeMap.getByName("fusion_reactor");
global forge_hammer      as RecipeMap = RecipeMap.getByName("forge_hammer");
global implosion         as RecipeMap = RecipeMap.getByName("implosion_compressor");
global lathe             as RecipeMap = RecipeMap.getByName("lathe");
global macerator         as RecipeMap = RecipeMap.getByName("macerator");
global mixer             as RecipeMap = RecipeMap.getByName("mixer");
global packager          as RecipeMap = RecipeMap.getByName("packer");
global polarizer         as RecipeMap = RecipeMap.getByName("polarizer");
global pyro              as RecipeMap = RecipeMap.getByName("pyro");
global reactor           as RecipeMap = RecipeMap.getByName("chemical_reactor");
global sifter            as RecipeMap = RecipeMap.getByName("sifter");
global solidifier        as RecipeMap = RecipeMap.getByName("fluid_solidifier");
global tower             as RecipeMap = RecipeMap.getByName("distillation_tower");
global unpackager        as RecipeMap = RecipeMap.getByName("unpacker");
global wiremill          as RecipeMap = RecipeMap.getByName("wiremill");
global rockbreaker       as RecipeMap = RecipeMap.getByName("rock_breaker");


// Tools.
<ore:gtceWrenches>.addItems([
	<gregtech:wrench>.withEmptyTag(), 
	<gregtech:wrench_lv>.withEmptyTag(), 
	<gregtech:wrench_hv>.withEmptyTag(), 
	<gregtech:wrench_iv>.withEmptyTag()]);

<ore:gtceScrewdrivers>.addItems([
	<gregtech:screwdriver>.withEmptyTag(), 
	<gregtech:screwdriver_lv>.withEmptyTag()]);

<ore:gtceHardHammers>.addItems([
	<gregtech:hammer>.withEmptyTag()]);

<ore:gtceSaws>.addItems([
	<gregtech:saw>.withEmptyTag(),
	<gregtech:buzzsaw>.withEmptyTag()]);

<ore:gtceFiles>.addItems([
	<gregtech:file>.withEmptyTag()]);

<ore:gtceWireCutters>.addItems([
	<gregtech:wire_cutter>.withEmptyTag()]);

<ore:gtceSoftHammers>.addItems([
	<gregtech:mallet>.withEmptyTag()]);

<ore:gtceMortars>.addItems([
	<gregtech:mortar>.withEmptyTag()]);


//oredicts for metatiles
//mufflerHatch
oreDict.mufflerHatch.add(<metaitem:muffler_hatch.lv>);
oreDict.mufflerHatch.add(<metaitem:muffler_hatch.mv>);
oreDict.mufflerHatch.add(<metaitem:muffler_hatch.hv>);
oreDict.mufflerHatch.add(<metaitem:muffler_hatch.ev>);
oreDict.mufflerHatch.add(<metaitem:muffler_hatch.iv>);
oreDict.mufflerHatch.add(<metaitem:muffler_hatch.luv>);
oreDict.mufflerHatch.add(<metaitem:muffler_hatch.zpm>);
oreDict.mufflerHatch.add(<metaitem:muffler_hatch.uv>);

//input hatch
oreDict.inputHatch.add(<metaitem:fluid_hatch.import.ulv>);
oreDict.inputHatch.add(<metaitem:fluid_hatch.import.lv>);
oreDict.inputHatch.add(<metaitem:fluid_hatch.import.mv>);
oreDict.inputHatch.add(<metaitem:fluid_hatch.import.hv>);
oreDict.inputHatch.add(<metaitem:fluid_hatch.import.ev>);
oreDict.inputHatch.add(<metaitem:fluid_hatch.import.iv>);
oreDict.inputHatch.add(<metaitem:fluid_hatch.import.luv>);
oreDict.inputHatch.add(<metaitem:fluid_hatch.import.zpm>);
oreDict.inputHatch.add(<metaitem:fluid_hatch.import.uv>);

//output hatch
oreDict.outputHatch.add(<metaitem:fluid_hatch.export.ulv>);
oreDict.outputHatch.add(<metaitem:fluid_hatch.export.lv>);
oreDict.outputHatch.add(<metaitem:fluid_hatch.export.mv>);
oreDict.outputHatch.add(<metaitem:fluid_hatch.export.hv>);
oreDict.outputHatch.add(<metaitem:fluid_hatch.export.ev>);
oreDict.outputHatch.add(<metaitem:fluid_hatch.export.iv>);
oreDict.outputHatch.add(<metaitem:fluid_hatch.export.luv>);
oreDict.outputHatch.add(<metaitem:fluid_hatch.export.zpm>);
oreDict.outputHatch.add(<metaitem:fluid_hatch.export.uv>);

//input bus
oreDict.inputBus.add(<metaitem:item_bus.import.ulv>);
oreDict.inputBus.add(<metaitem:item_bus.import.lv>);
oreDict.inputBus.add(<metaitem:item_bus.import.mv>);
oreDict.inputBus.add(<metaitem:item_bus.import.hv>);
oreDict.inputBus.add(<metaitem:item_bus.import.ev>);
oreDict.inputBus.add(<metaitem:item_bus.import.iv>);
oreDict.inputBus.add(<metaitem:item_bus.import.luv>);
oreDict.inputBus.add(<metaitem:item_bus.import.zpm>);
oreDict.inputBus.add(<metaitem:item_bus.import.uv>);

//output bus
oreDict.outputBus.add(<metaitem:item_bus.export.ulv>);
oreDict.outputBus.add(<metaitem:item_bus.export.lv>);
oreDict.outputBus.add(<metaitem:item_bus.export.mv>);
oreDict.outputBus.add(<metaitem:item_bus.export.hv>);
oreDict.outputBus.add(<metaitem:item_bus.export.ev>);
oreDict.outputBus.add(<metaitem:item_bus.export.iv>);
oreDict.outputBus.add(<metaitem:item_bus.export.luv>);
oreDict.outputBus.add(<metaitem:item_bus.export.zpm>);
oreDict.outputBus.add(<metaitem:item_bus.export.uv>);

//input energy hatch
oreDict.energyInputHatch.add(<metaitem:energy_hatch.input.ulv>);
oreDict.energyInputHatch.add(<metaitem:energy_hatch.input.lv>);
oreDict.energyInputHatch.add(<metaitem:energy_hatch.input.mv>);
oreDict.energyInputHatch.add(<metaitem:energy_hatch.input.hv>);
oreDict.energyInputHatch.add(<metaitem:energy_hatch.input.ev>);
oreDict.energyInputHatch.add(<metaitem:energy_hatch.input.iv>);
oreDict.energyInputHatch.add(<metaitem:energy_hatch.input.luv>);
oreDict.energyInputHatch.add(<metaitem:energy_hatch.input.zpm>);
oreDict.energyInputHatch.add(<metaitem:energy_hatch.input.uv>);

//output energy hatch
oreDict.energyOutputHatch.add(<metaitem:energy_hatch.output.ulv>);
oreDict.energyOutputHatch.add(<metaitem:energy_hatch.output.lv>);
oreDict.energyOutputHatch.add(<metaitem:energy_hatch.output.mv>);
oreDict.energyOutputHatch.add(<metaitem:energy_hatch.output.hv>);
oreDict.energyOutputHatch.add(<metaitem:energy_hatch.output.ev>);
oreDict.energyOutputHatch.add(<metaitem:energy_hatch.output.iv>);
oreDict.energyOutputHatch.add(<metaitem:energy_hatch.output.luv>);
oreDict.energyOutputHatch.add(<metaitem:energy_hatch.output.zpm>);
oreDict.energyOutputHatch.add(<metaitem:energy_hatch.output.uv>);

//maintenance hatch
oreDict.maintenanceHatch.add(<metaitem:maintenance_hatch>);
oreDict.maintenanceHatch.add(<metaitem:maintenance_hatch_configurable>);
oreDict.maintenanceHatch.add(<metaitem:maintenance_hatch_full_auto>);

