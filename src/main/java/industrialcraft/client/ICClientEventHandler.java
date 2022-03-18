package industrialcraft.client;

import industrialcraft.IndustrialCraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD, modid = IndustrialCraft.MOD_ID)
public class ICClientEventHandler {
    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        ICBlockRenderHandler.setup();
    }
}
