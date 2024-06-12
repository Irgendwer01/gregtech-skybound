import gregtech.api.unification.material.event.MaterialEvent
import gregtech.api.unification.material.Material
import net.minecraft.util.ResourceLocation
import static gregtech.api.unification.material.info.MaterialFlags.*

event_manager.listen { MaterialEvent event ->
  new Material.Builder(32000, resource('gse', 'fluix_quartz'))
            .gem()
            .color(0x674FAF).iconSet('CERTUS')
            .flags('generate_plate', 'disable_decomposition', 'no_smelting', 'crystallizable', 'generate_bolt_screw', 'generate_foil')
            .components(material('certus_quartz') * 1, material('nether_quartz') * 1, material('redstone') * 1)
            .build()
  material('certus_quartz').addFlags('generate_bolt_screw')
}