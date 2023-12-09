crafting.removeByOutput(item('movingelevators:elevator_block'))
crafting.removeByOutput(item('movingelevators:display_block'))
crafting.removeByOutput(item('movingelevators:button_block'))

crafting.addShaped('elevator_controller', item('movingelevators:elevator_block'), [
 [metaitem('plateSteel'), metaitem('plateSteel'), metaitem('plateSteel')],
 [ore('circuitMv'), metaitem('hull.mv'), ore('circuitMv')],
 [metaitem('plateSteel'), metaitem('electric.piston.mv'), metaitem('plateSteel')]])

crafting.addShaped('elevator_display', item('movingelevators:display_block'), [
 [metaitem('plateSteel'), metaitem('cover.screen'), metaitem('plateSteel')],
 [ore('circuitMv'), metaitem('hull.mv'), ore('circuitMv')],
 [metaitem('plateSteel'), metaitem('plateSteel'), metaitem('plateSteel')]])


crafting.addShaped('remote_panel', item('movingelevators:button_block'), [
 [metaitem('plateSteel'), metaitem('wireless'), metaitem('plateSteel')],
 [ore('circuitMv'), metaitem('hull.mv'), ore('circuitMv')],
 [metaitem('plateSteel'), metaitem('plateSteel'), metaitem('plateSteel')]])
