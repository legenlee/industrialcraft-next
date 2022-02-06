package industrialcraft.data;

import industrialcraft.IndustrialCraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = IndustrialCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        final DataGenerator GENERATOR = event.getGenerator();
        final ExistingFileHelper HELPER = event.getExistingFileHelper();

        final BlockTagsProvider BLOCK_TAGS = new BlockTagGenerator(GENERATOR, HELPER);

        GENERATOR.addProvider(BLOCK_TAGS);
        GENERATOR.addProvider(new ItemTagGenerator(GENERATOR, BLOCK_TAGS, HELPER));
    }
}
