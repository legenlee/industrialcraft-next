package industrialcraft.common;

import industrialcraft.IndustrialCraft;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = IndustrialCraft.MOD_ID)
public class ICCommonEventHandler {
    @SubscribeEvent
    public static void commonSetup(final FMLCommonSetupEvent event) {
        WoodType.register(ICBlocks.RUBBER);

        event.enqueueWork(() -> {
            ICBlocks.setupPots();
            ICBlocks.setupFlammables();
            ICBlocks.setupStrippables();
        });
    }
}