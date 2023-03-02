// Wireless transmitter.
recipes.remove(<appliedenergistics2:material:41>);
assembler.recipeBuilder()
    .inputs(<ore:pearlFluix>)
    .inputs(<metaitem:emitter.hv>)
    .inputs(<ore:plateStainlessSteel>*3)
    .fluidInputs(<liquid:plastic>*144)
    .outputs(<appliedenergistics2:material:41>)
    .duration(20)
    .EUt(500)
    .buildAndRegister();

// Wireless terminal.
recipes.remove(<appliedenergistics2:wireless_terminal>);
assembler.recipeBuilder()
    .inputs(<appliedenergistics2:material:41>)
    .inputs(<appliedenergistics2:part:380>)
    .inputs(<ore:plateStainlessSteel>*4)
    .inputs(<metaitem:energy_crystal>)
    .fluidInputs(<liquid:plastic>*144)
    .outputs(<appliedenergistics2:wireless_terminal>)
    .duration(20)
    .EUt(500)
    .buildAndRegister();
	
// Wireless Crafting Terminal
recipes.remove(<appliedenergistics2:wireless_crafting_terminal>);
assembler.recipeBuilder()
    .inputs(<appliedenergistics2:material:41>)
    .inputs(<appliedenergistics2:part:360>)
    .inputs(<ore:plateStainlessSteel>*4)
    .inputs(<metaitem:energy_crystal>)
    .fluidInputs(<liquid:plastic>*144)
    .outputs(<appliedenergistics2:wireless_crafting_terminal>)
    .duration(20)
    .EUt(500)
    .buildAndRegister();
	
// Wireless Fluid Terminal
recipes.remove(<appliedenergistics2:wireless_fluid_terminal>);
assembler.recipeBuilder()
    .inputs(<appliedenergistics2:material:41>)
    .inputs(<appliedenergistics2:part:520>)
    .inputs(<ore:plateStainlessSteel>*4)
    .inputs(<metaitem:energy_crystal>)
    .fluidInputs(<liquid:plastic>*144)
    .outputs(<appliedenergistics2:wireless_fluid_terminal>)
    .duration(20)
    .EUt(500)
    .buildAndRegister();
	
// Wireless Pattern Terminal
recipes.remove(<appliedenergistics2:wireless_pattern_terminal>);
assembler.recipeBuilder()
    .inputs(<appliedenergistics2:material:41>)
    .inputs(<appliedenergistics2:part:340>)
    .inputs(<ore:plateStainlessSteel>*4)
    .inputs(<metaitem:energy_crystal>)
    .fluidInputs(<liquid:plastic>*144)
    .outputs(<appliedenergistics2:wireless_pattern_terminal>)
    .duration(20)
    .EUt(500)
    .buildAndRegister();
	
// Wireless booster                                                                                       [
recipes.remove(<appliedenergistics2:material:42>);
assembler.recipeBuilder()
    .inputs(<metaitem:emitter.hv>)
    .inputs(<ore:dustFluix>)
    .inputs(<ore:plateStainlessSteel>*3)
    .inputs(<ore:dustEnderPearl>)
    .fluidInputs(<liquid:plastic>*72)
    .outputs(<appliedenergistics2:material:42>*2)
    .duration(20)
    .EUt(500)
    .buildAndRegister();

//Quantum Link Card
recipes.addShapeless(<appliedenergistics2:material:59>, [<appliedenergistics2:material:28>, <appliedenergistics2:material:48>]);

//Magnet Card
recipes.addShapeless(<appliedenergistics2:material:60>, [<appliedenergistics2:material:28>, <ore:stickNeodymiumMagnetic>, <ore:stickNeodymiumMagnetic>]);

//advanced card
recipes.remove(<appliedenergistics2:material:28>);
assembler.recipeBuilder()
    .inputs(<ore:plateStainlessSteel>*4)
    .inputs(<appliedenergistics2:material:23>)
    .inputs(<ore:wireFineRedAlloy>*8)
    .inputs(<appliedenergistics2:material:24>*2)
    .fluidInputs(<liquid:plastic>*144)
    .outputs(<appliedenergistics2:material:28>)
    .duration(30)
    .EUt(120)
    .buildAndRegister();

//basic card
recipes.remove(<appliedenergistics2:material:25>);
assembler.recipeBuilder()
    .inputs(<ore:plateStainlessSteel>*4)
    .inputs(<appliedenergistics2:material:23>)
    .inputs(<ore:wireFineCopper>*4)
    .inputs(<ore:wireGtSingleGold>*2)
    .fluidInputs(<liquid:plastic>*72)
    .outputs(<appliedenergistics2:material:25>)
    .duration(15)
    .EUt(120)
    .buildAndRegister();


// Cable Anchor. Same cost as GT covers if making facades.
bender.recipeBuilder()
    .inputs(<ore:boltIron>*2)
    .circuit(1)
    .outputs(<appliedenergistics2:part:120>)
    .duration(56)
    .EUt(16)
    .buildAndRegister();
