mods.jei.ingredient.yeet(item('opencomputers:material', 7))
mods.jei.ingredient.yeet(item('opencomputers:material', 8))
mods.jei.ingredient.yeet(item('opencomputers:material', 9))
mods.jei.ingredient.yeet(item('opencomputers:material', 4))
mods.jei.ingredient.yeet(item('opencomputers:material', 6))
mods.jei.ingredient.yeet(item('opencomputers:material', 2))
furnace.removeByInput(item('opencomputers:material', 2))

ore('oc:materialTransistor').add(metaitem('component.transistor'))
ore('oc:materialCircuitBoardPrinted').add(metaitem('circuit_board.basic'))
ore('oc:materialCircuitBoardPrinted').add(metaitem('circuit_board.good'))
ore('oc:materialCircuitBoardPrinted').add(metaitem('circuit_board.plastic'))


for (circuitLv : oreDict.getItems('circuitLv')) {
  ore('oc:circuitChip1').add(circuitLv)
}

for (circuitMv : oreDict.getItems('circuitMv')) {
  ore('oc:circuitChip2').add(circuitMv)
}

for (circuitHv : oreDict.getItems('circuitHv')) {
  ore('oc:circuitChip3').add(circuitHv)
}