crafting.removeByOutput(item('storagedrawers:compdrawers'))
crafting.removeByOutput(item('storagedrawers:controller'))
crafting.removeByOutput(item('storagedrawers:controllerslave'))
crafting.removeByOutput(item('storagedrawers:upgrade_storage'))
crafting.removeByOutput(item('storagedrawers:upgrade_storage', 1))
crafting.removeByOutput(item('storagedrawers:upgrade_storage', 2))
crafting.removeByOutput(item('storagedrawers:upgrade_storage', 3))
crafting.removeByOutput(item('storagedrawers:upgrade_storage', 4))

crafting.addShaped('compacting_drawer', item('storagedrawers:compdrawers'), [
  [metaitem('plateSteel'), ore('drawerBasic'),metaitem('plateSteel')],
  [metaitem('electric.piston.mv'), item('gregtech:machine_casing', 2), metaitem('electric.piston.mv')],
  [metaitem('plateSteel'), metaitem('plateSteel'), metaitem('plateSteel')]])
  
crafting.addShaped('drawer_controller', item('storagedrawers:controller'), [
  [metaitem('conveyor.module.lv'), metaitem('plateSteel'), metaitem('conveyor.module.lv')],
  [metaitem('plateSteel'), item('gregtech:machine_casing', 1), metaitem('plateSteel')],
  [metaitem('plateSteel'), ore('circuitLv'), metaitem('plateSteel')]])
  
crafting.addShaped('controller_slave', item('storagedrawers:controllerslave'), [
  [metaitem('ulv_covers:robot.arm.ulv'), metaitem('plateWroughtIron'), metaitem('ulv_covers:robot.arm.ulv')],
  [metaitem('plateWroughtIron'), item('gregtech:machine_casing', 0), metaitem('plateWroughtIron')],
  [metaitem('plateWroughtIron'), ore('circuitUlv'), metaitem('plateWroughtIron')]])
  
crafting.addShaped('drawer_upgrade_bronze', item('storagedrawers:upgrade_storage'), [
  [metaitem('screwBronze'), metaitem('plateBronze'), metaitem('screwBronze')],
  [metaitem('plateBronze'), item('storagedrawers:upgrade_template'), metaitem('plateBronze')],
  [metaitem('screwBronze'), metaitem('plateBronze'), metaitem('screwBronze')]])

crafting.addShaped('drawer_upgrade_steel', item('storagedrawers:upgrade_storage', 1), [
  [metaitem('screwSteel'), metaitem('plateSteel'), metaitem('screwSteel')],
  [metaitem('plateSteel'), item('storagedrawers:upgrade_storage'), metaitem('plateSteel')],
  [metaitem('screwSteel'), metaitem('plateSteel'), metaitem('screwSteel')]])

crafting.addShaped('drawer_upgrade_aluminium', item('storagedrawers:upgrade_storage', 2), [
  [metaitem('screwAluminium'), metaitem('plateAluminium'), metaitem('screwAluminium')],
  [metaitem('plateAluminium'), item('storagedrawers:upgrade_storage', 1), metaitem('plateAluminium')],
  [metaitem('screwAluminium'), metaitem('plateAluminium'), metaitem('screwAluminium')]])

crafting.addShaped('drawer_upgrade_stainless', item('storagedrawers:upgrade_storage', 3), [
  [metaitem('screwStainlessSteel'), metaitem('plateStainlessSteel'), metaitem('screwStainlessSteel')],
  [metaitem('plateStainlessSteel'), item('storagedrawers:upgrade_storage', 2), metaitem('plateStainlessSteel')],
  [metaitem('screwStainlessSteel'), metaitem('plateStainlessSteel'), metaitem('screwStainlessSteel')]])

crafting.addShaped('drawer_upgrade_titanium', item('storagedrawers:upgrade_storage', 4), [
  [metaitem('screwTitanium'), metaitem('plateTitanium'), metaitem('screwTitanium')],
  [metaitem('plateTitanium'), item('storagedrawers:upgrade_storage', 3), metaitem('plateTitanium')],
  [metaitem('screwTitanium'), metaitem('plateTitanium'), metaitem('screwTitanium')]])
