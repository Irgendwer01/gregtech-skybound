// Add Block Breaker recipe.
recipes.remove(<openblocks:block_breaker>);
recipes.addShaped("Block Breaker", <openblocks:block_breaker>,
 [[<ore:plateWroughtIron>,   <ore:plateIron>,            <ore:plateIron>],
  [<ore:toolHeadBuzzSawIron>, <minecraft:redstone_block>, <ore:plateIron>],
  [<ore:plateWroughtIron>,   <ore:plateIron>,            <ore:plateIron>]]);

// Remove tank.
mods.jei.JEI.removeAndHide(<openblocks:tank>);

// Add Block placer recipe.
recipes.remove(<openblocks:block_placer>);
recipes.addShaped("block_placer", <openblocks:block_placer>,
 [[<ore:plateWroughtIron>, <ore:plateIron>,            <ore:plateIron>],
  [<minecraft:piston>,     <minecraft:redstone_block>, <ore:plateIron>],
  [<ore:plateWroughtIron>, <ore:plateIron>,            <ore:plateIron>]]);

// Add item dropper recipe.
recipes.remove(<openblocks:item_dropper>);
recipes.addShaped("item_dropper", <openblocks:item_dropper>,
 [[<ore:plateWroughtIron>, <ore:plateIron>,            <ore:plateIron>],
  [<minecraft:hopper>,     <minecraft:redstone_block>, <ore:plateIron>],
  [<ore:plateWroughtIron>, <ore:plateIron>,            <ore:plateIron>]]);

// Remove XP-bottler and add recipe to canner.
mods.jei.JEI.removeAndHide(<openblocks:xp_bottler>);
canner.recipeBuilder()
    .inputs(<minecraft:glass_bottle>)
    .fluidInputs(<liquid:xpjuice>*160)       // Value blindly inherited from openblocks.
    .outputs(<minecraft:experience_bottle>)
    .EUt(16)
    .duration(20)
    .buildAndRegister();

// Golden egg.
recipes.remove(<openblocks:golden_egg>);
chemreactor.recipeBuilder()
    .inputs(<ore:egg>)
    .inputs(<ore:dustGold>*8)
    .outputs(<openblocks:golden_egg>)
    .EUt(1)
    .duration(720000)
    .buildAndRegister();

// Add auto anvil recipe.
recipes.remove(<openblocks:auto_anvil>);
recipes.addShaped("auto_anvil", <openblocks:auto_anvil>,
    [[<metaitem:robot.arm.lv>, <metaitem:electric.pump.lv>, <metaitem:robot.arm.lv>],
    [<ore:plateSteel>,         <minecraft:anvil>,           <ore:plateSteel>],
    [<ore:plateSteel>,         <ore:circuitLv>,          <ore:plateSteel>]]);

// Add auto enchanter recipe.
recipes.remove(<openblocks:auto_enchantment_table>);
recipes.addShaped("auto_enchantment_table", <openblocks:auto_enchantment_table>,
    [[<metaitem:robot.arm.lv>, <metaitem:electric.pump.lv>,  <metaitem:robot.arm.lv>],
    [<ore:plateSteel>,         <minecraft:enchanting_table>, <ore:plateSteel>],
    [<ore:plateSteel>,         <ore:circuitLv>,           <ore:plateSteel>]]);


// Add fan recipe.
recipes.remove(<openblocks:fan>);
recipes.addShaped("fan", <openblocks:fan>,
 [[<ore:rotorIron>],
  [<metaitem:electric.motor.lv>],
  [<ore:plateIron>]]);

//Add building guide recipe.
recipes.remove(<openblocks:guide>);
recipes.addShaped("guide", <openblocks:guide>,
 [[<ore:blockGlass>, <ore:blockGlass>,      <ore:blockGlass>],
  [<ore:blockGlass>, <metaitem:emitter.lv>, <ore:blockGlass>],
  [<ore:blockGlass>, <ore:blockGlass>,      <ore:blockGlass>]]);

// Add enhanced building guide recipe.
recipes.remove(<openblocks:builder_guide>);
recipes.addShaped("builder_guide", <openblocks:builder_guide>,
 [[<ore:blockGlass>, <ore:lensGlass>,       <ore:blockGlass>],
  [<ore:blockGlass>, <metaitem:emitter.lv>, <ore:blockGlass>],
  [<ore:blockGlass>, <ore:circuitLv>,    <ore:blockGlass>]]);


// Donation station.
recipes.remove(<openblocks:donation_station>);
chemreactor.recipeBuilder()
    .inputs(<ore:chest>)
    .inputs(<minecraft:porkchop>*8)
    .outputs(<openblocks:donation_station>)
    .EUt(16)
    .duration(512)
    .buildAndRegister();

// Add glider wing recipe.
recipes.remove(<openblocks:generic:0>);
assembler.recipeBuilder()
    .inputs(<ore:platePlastic>*6)
    .inputs(<ore:stickLongSteel>*2)
    .outputs(<openblocks:generic:0>)
    .EUt(16)
    .duration(512)
    .buildAndRegister();

// Add glider recipe.
recipes.remove(<openblocks:hang_glider>);
assembler.recipeBuilder()
    .inputs(<openblocks:generic:0>*2)
    .fluidInputs(<liquid:glue>*200)
    .outputs(<openblocks:hang_glider>)
    .EUt(16)
    .duration(512)
    .buildAndRegister();

