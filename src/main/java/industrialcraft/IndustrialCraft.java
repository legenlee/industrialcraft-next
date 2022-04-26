package industrialcraft;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import industrialcraft.client.BlockRenderHandler;
import industrialcraft.client.ScreenRenderHandler;
import industrialcraft.common.registries.BlockEntityTypeRegistries;
import industrialcraft.common.registries.BlockItemRegistries;
import industrialcraft.common.registries.BlockRegistries;
import industrialcraft.common.registries.ContainerRegistries;
import industrialcraft.common.registries.EntityRegistries;
import industrialcraft.common.registries.FeatureRegistries;
import industrialcraft.common.registries.ItemRegistries;
import industrialcraft.common.registries.SoundEventRegistries;

@Mod(IndustrialCraft.MOD_ID)
public class IndustrialCraft {
    public static final String MOD_ID = "icnext";
    public static final Logger LOGGER = LogManager.getLogger();

    public IndustrialCraft() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);

        SoundEventRegistries.setup(bus);
        BlockRegistries.setup(bus);
        BlockItemRegistries.setup(bus);
        ItemRegistries.setup(bus);
        EntityRegistries.setup(bus);
        BlockEntityTypeRegistries.setup(bus);
        ContainerRegistries.setup(bus);
        FeatureRegistries.setup(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        WoodType.register(BlockRegistries.RUBBER);

        event.enqueueWork(() -> {
            BlockRegistries.setupPots();
            BlockRegistries.setupFlammables();
            BlockRegistries.setupStrippables();
        });
    }

    @OnlyIn(Dist.CLIENT)
    private void clientSetup(final FMLClientSetupEvent event) {
        BlockRenderHandler.setup();

        event.enqueueWork(() -> {
            ScreenRenderHandler.setup();
        });
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
