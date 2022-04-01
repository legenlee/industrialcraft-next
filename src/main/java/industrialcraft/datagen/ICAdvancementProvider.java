package industrialcraft.datagen;

import java.util.List;
import java.util.function.Consumer;

import com.google.common.collect.ImmutableList;

import industrialcraft.datagen.advancement.ICAdvancements;
import net.minecraft.advancements.Advancement;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ICAdvancementProvider extends AdvancementProvider {
    private final List<Consumer<Consumer<Advancement>>> tabs = ImmutableList.of(new ICAdvancements());

    public ICAdvancementProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, helper);
    }

    @Override
    protected void registerAdvancements(Consumer<Advancement> consumer, ExistingFileHelper helper) {
        for (Consumer<Consumer<Advancement>> aConsumer : this.tabs) {
            aConsumer.accept(consumer);
        }
    }
}
