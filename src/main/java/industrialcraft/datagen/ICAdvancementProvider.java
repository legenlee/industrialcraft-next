package industrialcraft.datagen;

import java.util.function.Consumer;

import industrialcraft.IndustrialCraft;
import industrialcraft.registry.ICBlocks;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ICAdvancementProvider extends AdvancementProvider {
    public ICAdvancementProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, helper);
    }

    @Override
    protected void registerAdvancements(Consumer<Advancement> consumer, ExistingFileHelper helper) {
        Advancement root = Advancement.Builder.advancement().display(ICBlocks.RUBBER_LOG.get(),
                new TranslatableComponent("advancements.icnext.root.title"),
                new TranslatableComponent("advancements.icnext.root.description"),
                IndustrialCraft.mcPrefix("textures/gui/advancements/backgrounds/stone.png"),
                FrameType.TASK, false, false, false)
                .addCriterion("rubber_log", InventoryChangeTrigger.TriggerInstance.hasItems(ICBlocks.RUBBER_LOG.get()))
                .save(consumer, "icnext/root");

        Advancement rtfm = Advancement.Builder.advancement().parent(root).display(ICBlocks.RUBBER_LOG.get(),
                new TranslatableComponent("advancements.icnext.rtfm.title"),
                new TranslatableComponent("advancements.icnext.rtfm.description"),
                (ResourceLocation) null,
                FrameType.TASK, true, true, false)
                .addCriterion("rubber_log", InventoryChangeTrigger.TriggerInstance.hasItems(ICBlocks.RUBBER_LOG.get()))
                .save(consumer, "icnext/rtfm");
    }
}
