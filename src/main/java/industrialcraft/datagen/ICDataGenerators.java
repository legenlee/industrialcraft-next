package industrialcraft.datagen;

import industrialcraft.IndustrialCraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = IndustrialCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ICDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        final DataGenerator generator = event.getGenerator();
        final ExistingFileHelper helper = event.getExistingFileHelper();
        final BlockTagsProvider blockTags = new ICBlockTagsProvider(generator, helper);

        generator.addProvider(blockTags);
        generator.addProvider(new ICItemTagsProvider(generator, blockTags, helper));
    }
}
