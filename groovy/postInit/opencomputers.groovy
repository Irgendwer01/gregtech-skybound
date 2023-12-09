mods.jei.yeet(item('opencomputers:material', 7))
mods.jei.yeet(item('opencomputers:material', 8))
mods.jei.yeet(item('opencomputers:material', 9))
mods.jei.yeet(item('opencomputers:material', 4))
mods.jei.yeet(item('opencomputers:material', 6))
mods.jei.yeet(item('opencomputers:material', 2))
furnace.removeByInput(item('opencomputers:material', 2))

ore('oc:materialTransistor').add(metaitem('component.transistor'))
ore('oc:materialCircuitBoardPrinted').add(metaitem('circuit_board.basic'))

for (circuitLv : oreDict.getItems('circuitLv')) {
  ore('oc:circuitChip1').add(circuitLv)
}

for (circuitMv : oreDict.getItems('circuitMv')) {
  ore('oc:circuitChip2').add(circuitMv)
}

for (circuitHv : oreDict.getItems('circuitHv')) {
  ore('oc:circuitChip3').add(circuitHv)
}