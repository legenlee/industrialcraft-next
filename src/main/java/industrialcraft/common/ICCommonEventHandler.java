package industrialcraft.common;

import industrialcraft.IndustrialCraft;
import industrialcraft.common.registry.ICBlocks;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = IndustrialCraft.MOD_ID)
public class ICCommonEventHandler {
    @SubscribeEvent
    public void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ICBlocks.RUBBER_SAPLING.get().getRegistryName(),
                    () -> ICBlocks.RUBBER_SAPLING.get());
        });
    }
}
