mods.jei.ingredient.yeet(item('openblocks:item_dropper'))
mods.jei.ingredient.yeet(item('openblocks:block_placer'))
mods.jei.ingredient.yeet(item('openblocks:village_highlighter'))
mods.jei.ingredient.yeet(item('openblocks:tank'))
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

def dyes = [
  item('minecraft:dye', 15),
  item('minecraft:dye', 14),
  item('minecraft:dye', 13),
  item('minecraft:dye', 12),
  item('minecraft:dye', 11),
  item('minecraft:dye', 10),
  item('minecraft:dye', 9),
  item('minecraft:dye', 8),
  item('minecraft:dye', 7),
  item('minecraft:dye', 6),
  item('minecraft:dye', 5),
  item('minecraft:dye', 4),
  item('minecraft:dye', 3),
  item('minecraft:dye', 2),
  item('minecraft:dye', 1),
  item('minecraft:dye')
]

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
 
for (int i = 0 ; i < 15; i++) {
	crafting.addShapeless(ore('elevator')[i], [dyes[i], ore('elevator')])
	crafting.addShapeless(ore('elevator_rotating')[i], [dyes[i], ore('elevator_rotating')])
	crafting.addShapeless(ore('elevator_rotating')[i], [metaitem('electric.piston.lv'), ore('elevator')[i]])
}