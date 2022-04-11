package industrialcraft;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import industrialcraft.core.client.ICBlockRenderHandler;
import industrialcraft.core.registry.ICBlockItems;
import industrialcraft.core.registry.ICBlocks;
import industrialcraft.core.registry.ICEntities;
import industrialcraft.core.registry.ICFeatures;
import industrialcraft.core.registry.ICItems;
import industrialcraft.core.registry.ICSoundEvents;

@Mod(IndustrialCraft.MOD_ID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IndustrialCraft {
    public static final String MOD_ID = "icnext";
    public static final Logger LOGGER = LogManager.getLogger();

    public IndustrialCraft() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ICSoundEvents.setup(bus);
        ICBlocks.setup(bus);
        ICBlockItems.setup(bus);
        ICItems.setup(bus);
        ICEntities.setup(bus);
        ICFeatures.setup(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void commonSetup(final FMLCommonSetupEvent event) {
        WoodType.register(ICBlocks.RUBBER);

        event.enqueueWork(() -> {
            ICBlocks.setupPots();
            ICBlocks.setupFlammables();
            ICBlocks.setupStrippables();
        });
    }

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        ICBlockRenderHandler.setup();
    }

    public static ResourceLocation modPrefix(String name) {
        return new ResourceLocation(IndustrialCraft.MOD_ID, name);
    }

    public static ResourceLocation forgePrefix(String name) {
        return new ResourceLocation("forge", name);
    }

    public static ResourceLocation mcPrefix(String name) {
        return new ResourceLocation("minecraft", name);
    }
}
