package industrialcraft;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import industrialcraft.common.registries.ICRegistries;
import industrialcraft.common.enums.ICWoodType;
import industrialcraft.common.registries.ICBlocks;

@Mod(IndustrialCraft.MOD_ID)
public class IndustrialCraft {
    public static final String MOD_ID = "icnext";
    public static final Logger LOGGER = LogManager.getLogger();

    public IndustrialCraft() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ICRegistries.init(bus);

        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ICBlocks.RUBBER_SAPLING.get().getRegistryName(),
                    () -> ICBlocks.RUBBER_SAPLING.get());

            // WoodType.register(ICWoodType.RUBBER);
        });

    }

    private void clientSetup(final FMLClientSetupEvent event) {
        // BlockEntityRenderers.register(ICBlocks.RUBBER_SIGN.get(), SignRenderer::new);

        // event.enqueueWork(() -> {
        // Sheets.addWoodType(ICWoodType.RUBBER);
        // });
    }
}
