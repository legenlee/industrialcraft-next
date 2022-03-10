package industrialcraft;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import industrialcraft.common.ICRegistries;

@Mod(IndustrialCraft.MOD_ID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IndustrialCraft {
    public static final String MOD_ID = "icnext";
    public static final Logger LOGGER = LogManager.getLogger();

    public IndustrialCraft() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ICRegistries.init(bus);

        MinecraftForge.EVENT_BUS.register(this);
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
