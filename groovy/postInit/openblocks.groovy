mods.jei.yeet(item('openblocks:item_dropper'))
mods.jei.yeet(item('openblocks:block_placer'))
mods.jei.yeet(item('openblocks:village_highlighter'))
mods.jei.yeet(item('openblocks:tank'))
crafting.removeByOutput(item('openblocks:block_breaker'))

mods.chisel.carving.addGroup('elevator')
mods.chisel.carving.addGroup('elevator_rotating')

ore('elevator').add(item('openblocks:elevator'))
ore('elevator').add(item('openblocks:elevator', 1))
ore('elevator').add(item('openblocks:elevator', 2))
ore('elevator').add(item('openblocks:elevator', 3))
ore('elevator').add(item('openblocks:elevator', 4))
ore('elevator').add(item('openblocks:elevator', 5))
ore('elevator').add(item('openblocks:elevator', 6))
ore('elevator').add(item('openblocks:elevator', 7))
ore('elevator').add(item('openblocks:elevator', 8))
ore('elevator').add(item('openblocks:elevator', 9))
ore('elevator').add(item('openblocks:elevator', 10))
ore('elevator').add(item('openblocks:elevator', 11))
ore('elevator').add(item('openblocks:elevator', 12))
ore('elevator').add(item('openblocks:elevator', 13))
ore('elevator').add(item('openblocks:elevator', 14))
ore('elevator').add(item('openblocks:elevator', 15))

ore('elevator_rotating').add(item('openblocks:elevator_rotating'))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 1))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 2))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 3))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 4))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 5))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 6))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 7))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 8))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 9))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 10))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 11))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 12))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 13))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 14))
ore('elevator_rotating').add(item('openblocks:elevator_rotating', 15))

ArrayList<ItemStack> t = new ArrayList()
t.add(item('minecraft:dye', 15))
t.add(item('minecraft:dye', 14))
t.add(item('minecraft:dye', 13))
t.add(item('minecraft:dye', 12))
t.add(item('minecraft:dye', 11))
t.add(item('minecraft:dye', 10))
t.add(item('minecraft:dye', 9))
t.add(item('minecraft:dye', 8))
t.add(item('minecraft:dye', 7))
t.add(item('minecraft:dye', 6))
t.add(item('minecraft:dye', 5))
t.add(item('minecraft:dye', 4))
t.add(item('minecraft:dye', 3))
t.add(item('minecraft:dye', 2))
t.add(item('minecraft:dye', 1))
t.add(item('minecraft:dye'))

for (def elevator : ore('elevator')) {
	crafting.removeByOutput(elevator)
	mods.chisel.carving.addVariation('elevator', elevator)
}

for (def elevator_rotating : ore('elevator_rotating')) {
	crafting.removeByOutput(elevator_rotating)
	mods.chisel.carving.addVariation('elevator_rotating', elevator_rotating)
}


crafting.addShaped('block_breaker', item('openblocks:block_breaker'), [
 [metaitem('plateWroughtIron'), metaitem('plateWroughtIron'), metaitem('screwWroughtIron')],
 [metaitem('toolHeadBuzzSawWroughtIron'), item('gregtech:machine_casing'), item('minecraft:redstone_block')],
 [metaitem('plateWroughtIron'), metaitem('plateWroughtIron'), metaitem('screwWroughtIron')]])
 
crafting.addShaped('openblocks_elevator', item('openblocks:elevator'), [
 [metaitem('plateSteel'), metaitem('plateSteel'), metaitem('plateSteel')],
 [metaitem('springSteel'), metaitem('gearSmallSteel'), metaitem('springSteel')],
 [metaitem('plateSteel'), metaitem('plateSteel'), metaitem('plateSteel')]])
 
for (int i = 0 ; i < t.size ; i++) {
	crafting.addShapeless(ore('elevator')[i], [t.get(i), ore('elevator')])
	crafting.addShapeless(ore('elevator_rotating')[i], [t.get(i), ore('elevator_rotating')])
	crafting.addShapeless(ore('elevator_rotating')[i], [metaitem('electric.piston.lv'), ore('elevator')[i]])
}