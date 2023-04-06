// hide gold-dust; iron dust; silicon; Flour; nether quartz dust; certus quartz dust; ender dust
val aematerial = <appliedenergistics2:material>.definition;
val matstoremove = [
    5,  // Gold Dust.
    49, // Iron Dust.
    51, // Silicon.
    4,  // Flour.
    3,  // Nether Quartz Dust.
    2,  // Certus Quartz Dust.
    46  // Ender Dust.
] as int[];

for i in matstoremove {
    mods.jei.JEI.hide(aematerial.makeStack(i));
}

// Add Charged certus recipe.
mods.jei.JEI.removeAndHide(<appliedenergistics2:charger>);
polarizer.recipeBuilder()
    .inputs(<gregtech:meta_gem:214>)
    .outputs(<appliedenergistics2:material:1>)
    .duration(100)
    .EUt(8)
    .buildAndRegister();

// Fluix crystal.
chemreactor.recipeBuilder()
    .inputs(<appliedenergistics2:material:1>)
    .inputs(<ore:gemNetherQuartz>)
    .fluidInputs(<liquid:redstone>*72)
    .outputs(<appliedenergistics2:material:7>*2)
    .duration(20)
    .EUt(60)
    .buildAndRegister();

mixer.recipeBuilder()
    .inputs(<appliedenergistics2:material:1>)
    .inputs(<ore:gemNetherQuartz>)
    .inputs(<ore:dustRedstone>)
    .fluidInputs(<liquid:water>*250)
    .outputs(<appliedenergistics2:material:7>*2)
    .duration(80)
    .EUt(30)
    .buildAndRegister();


// Add Fluix dust recipe.
macerator.recipeBuilder()
    .inputs(<appliedenergistics2:material:7>)
    .outputs(<appliedenergistics2:material:8>)
    .duration(100)
    .EUt(16)
    .buildAndRegister();


//Add Blank pattern recipe
recipes.remove(<appliedenergistics2:material:52>);
recipes.addShaped("Blank pattern", <appliedenergistics2:material:52>,
 [[<gregtech:meta_plate:1012>,<gregtech:meta_plate:1012>,<gregtech:meta_plate:1012>],
  [<gregtech:meta_plate:1012>,<ore:circuitHv>,<gregtech:meta_plate:1012>],
  [<gregtech:meta_plate:1012>,null,<gregtech:meta_plate:1012>]]);


// Annihilation Core.
recipes.remove(<appliedenergistics2:material:44>);
assembler.recipeBuilder()
    .inputs(<ore:gemQuartz>)
    .inputs(<ore:dustFluix>)
    .inputs(<appliedenergistics2:material:22>)
    .outputs(<appliedenergistics2:material:44>)
    .duration(20)
    .EUt(60)
    .buildAndRegister();

// Formation Core.
recipes.remove(<appliedenergistics2:material:43>);
assembler.recipeBuilder()
    .inputs(<ore:crystalCertusQuartz>)
    .inputs(<ore:dustFluix>)
    .inputs(<appliedenergistics2:material:22>)
    .outputs(<appliedenergistics2:material:43>)
    .duration(20)
    .EUt(60)
    .buildAndRegister();

// Fluix pearl.
recipes.remove(<appliedenergistics2:material:9>);
autoclave.recipeBuilder()
    .inputs(<ore:dustEnderPearl>)
    .inputs(<ore:dustFluix>*8)
    .fluidInputs(<liquid:bismuth>*72)
    .outputs(<appliedenergistics2:material:9>)
    .duration(500)
    .EUt(120)
    .buildAndRegister();

