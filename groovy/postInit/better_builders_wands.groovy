crafting.removeByOutput(item('betterbuilderswands:wandiron'));
crafting.removeByOutput(item('betterbuilderswands:wanddiamond'));
crafting.removeByOutput(item('betterbuilderswands:wandunbreakable', 12));


crafting.addShaped('iron_wand', item('betterbuilderswands:wandiron'), [
 [null, null, metaitem('plateIron')],
 [null, item('minecraft:stick'), null],
 [item('minecraft:stick'), null, null]]);

crafting.addShaped('wrought_iron_wand', item('betterbuilderswands:wanddiamond'), [
 [null, null, metaitem('plateWroughtIron')],
 [null, item('minecraft:stick'), null],
 [item('minecraft:stick'), null, null]]);

crafting.addShaped('vanadium_steel_wand', item('betterbuilderswands:wandunbreakable', 12), [
 [null, null, metaitem('plateVanadiumSteel')],
 [null, item('minecraft:stick'), null],
 [item('minecraft:stick'), null, null]]);
