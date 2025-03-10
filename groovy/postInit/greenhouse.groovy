def logs = [
 item('minecraft:log'),
 item('minecraft:log', 1),
 item('minecraft:log', 2),
 item('minecraft:log', 3),
 item('minecraft:log2'),
 item('minecraft:log2', 1),
 item('gregtech:rubber_log')
]

def saplings = [
 item('minecraft:sapling'),
 item('minecraft:sapling', 1),
 item('minecraft:sapling', 2),
 item('minecraft:sapling', 3),
 item('minecraft:sapling', 4),
 item('minecraft:sapling', 5),
 item('gregtech:rubber_sapling')
]

for (int i = 0; i < logs.size; i++) {
  recipemap('greenhouse').recipeBuilder()
    .circuitMeta(2)
    .notConsumable(saplings[i])
    .fluidInputs(liquid('water')*1000)
    .outputs(logs[i]*64)
    .outputs(saplings[i]*4)
    .EUt(120)
    .duration(100)
    .buildAndRegister()

  recipemap('greenhouse').recipeBuilder()
    .circuitMeta(1)
    .notConsumable(saplings[i])
    .inputs(metaitem('fertilizer')*8)
    .fluidInputs(liquid('water')*1000)
    .outputs(logs[i]*64)
    .outputs(logs[i]*64) 
    .outputs(saplings[i]*8)
    .EUt(120)
    .duration(60)
    .buildAndRegister()
}

def plants = [
    'minecraft:pumpkin_seeds' : item('minecraft:pumpkin') * 6,
    'minecraft:beetroot_seeds' : item('minecraft:beetroot') * 16,
    'minecraft:wheat_seeds' : item('minecraft:wheat') * 16,
    'minecraft:melon_seeds' : item('minecraft:melon_block') * 6,
    'minecraft:carrot' : item('minecraft:carrot') * 12,
    'minecraft:potato' : item('minecraft:potato') * 12,
    'minecraft:reeds' : item('minecraft:reeds') * 12,
    'minecraft:cactus' : item('minecraft:cactus') * 12,
    'minecraft:brown_mushroom' : item('minecraft:brown_mushroom') * 12,
    'minecraft:red_mushroom' : item('minecraft:red_mushroom') * 12,
    'minecraft:nether_wart' : item('minecraft:nether_wart') * 12
]
for (entry : plants) {
  recipemap('greenhouse').recipeBuilder()
    .circuitMeta(2)
    .notConsumable(item(entry.getKey()))
    .fluidInputs(liquid('water')*1000)
    .outputs(entry.getValue())
    .EUt(120)
    .duration(100)
    .buildAndRegister()

  def output = entry.getValue().copy()
  output.setCount(output.getCount()*2)
  recipemap('greenhouse').recipeBuilder()
    .circuitMeta(1)
    .notConsumable(item(entry.getKey()))
    .inputs(metaitem('fertilizer')*8)
    .fluidInputs(liquid('water')*1000)
    .outputs(output)
    .EUt(120)
    .duration(60)
    .buildAndRegister()
}

  recipemap('greenhouse').recipeBuilder()
    .notConsumable(item('exnihilocreatio:item_material', 3))
    .fluidInputs(liquid('witchwater')*1000)
    .outputs(item('exnihilocreatio:item_material', 3)*5)
    .EUt(120)
    .duration(100)
    .buildAndRegister()