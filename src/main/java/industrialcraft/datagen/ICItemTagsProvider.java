package industrialcraft.datagen;

import industrialcraft.IndustrialCraft;
import industrialcraft.core.registry.ICBlockItems;
import industrialcraft.core.registry.ICItems;
import industrialcraft.core.ICTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ICItemTagsProvider extends ItemTagsProvider {

    public ICItemTagsProvider(DataGenerator generator, BlockTagsProvider provider, ExistingFileHelper helper) {
        super(generator, provider, IndustrialCraft.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        // ICNext
        copy(ICTags.Blocks.ORES_TIN, ICTags.Items.ORES_TIN);
        copy(ICTags.Blocks.ORES_LEAD, ICTags.Items.ORES_LEAD);
        copy(ICTags.Blocks.ORES_ALUMINUM, ICTags.Items.ORES_ALUMINUM);

        copy(ICTags.Blocks.STORAGE_BLOCKS_RAW_TIN, ICTags.Items.STORAGE_BLOCKS_RAW_TIN);
        copy(ICTags.Blocks.STORAGE_BLOCKS_RAW_LEAD, ICTags.Items.STORAGE_BLOCKS_RAW_LEAD);
        copy(ICTags.Blocks.STORAGE_BLOCKS_RAW_ALUMINUM, ICTags.Items.STORAGE_BLOCKS_RAW_ALUMINUM);

        copy(ICTags.Blocks.STORAGE_BLOCKS_TIN, ICTags.Items.STORAGE_BLOCKS_TIN);
        copy(ICTags.Blocks.STORAGE_BLOCKS_LEAD, ICTags.Items.STORAGE_BLOCKS_LEAD);
        copy(ICTags.Blocks.STORAGE_BLOCKS_ALUMINUM, ICTags.Items.STORAGE_BLOCKS_ALUMINUM);
        copy(ICTags.Blocks.STORAGE_BLOCKS_BRONZE, ICTags.Items.STORAGE_BLOCKS_BRONZE);
        copy(ICTags.Blocks.STORAGE_BLOCKS_STEEL, ICTags.Items.STORAGE_BLOCKS_STEEL);

        tag(ICTags.Items.RAW_MATERIALS_TIN).add(ICItems.RAW_TIN.get());
        tag(ICTags.Items.RAW_MATERIALS_LEAD).add(ICItems.RAW_LEAD.get());
        tag(ICTags.Items.RAW_MATERIALS_ALUMINUM).add(ICItems.RAW_BAUXITE.get());

        tag(ICTags.Items.INGOTS_TIN).add(ICItems.TIN_INGOT.get());
        tag(ICTags.Items.INGOTS_LEAD).add(ICItems.LEAD_INGOT.get());
        tag(ICTags.Items.INGOTS_ALUMINUM).add(ICItems.ALUMINUM_INGOT.get());
        tag(ICTags.Items.INGOTS_BRONZE).add(ICItems.BRONZE_INGOT.get());
        tag(ICTags.Items.INGOTS_STEEL).add(ICItems.STEEL_INGOT.get());

        tag(ICTags.Items.NUGGETS_TIN).add(ICItems.TIN_NUGGET.get());
        tag(ICTags.Items.NUGGETS_LEAD).add(ICItems.LEAD_NUGGET.get());
        tag(ICTags.Items.NUGGETS_ALUMINUM).add(ICItems.ALUMINUM_NUGGET.get());
        tag(ICTags.Items.NUGGETS_BRONZE).add(ICItems.BRONZE_NUGGET.get());
        tag(ICTags.Items.NUGGETS_STEEL).add(ICItems.STEEL_NUGGET.get());

        tag(ICTags.Items.DUSTS_TIN).add(ICItems.TIN_DUST.get());
        tag(ICTags.Items.DUSTS_LEAD).add(ICItems.LEAD_DUST.get());
        tag(ICTags.Items.DUSTS_ALUMINUM).add(ICItems.ALUMINUM_DUST.get());
        tag(ICTags.Items.DUSTS_BRONZE).add(ICItems.BRONZE_DUST.get());
        tag(ICTags.Items.DUSTS_STEEL).add(ICItems.STEEL_DUST.get());

        copy(ICTags.Blocks.RUBBER_LOGS, ICTags.Items.RUBBER_LOGS);

        tag(ICTags.Items.RUBBER).add(ICItems.RUBBER.get());

        // Vanilla
        tag(ItemTags.LOGS).addTag(ICTags.Items.RUBBER_LOGS);
        tag(ItemTags.LOGS_THAT_BURN).addTag(ICTags.Items.RUBBER_LOGS);
        tag(ItemTags.SAPLINGS).add(ICBlockItems.RUBBER_SAPLING.get());
        tag(ItemTags.LEAVES).add(ICBlockItems.RUBBER_LEAVES.get());
        tag(ItemTags.PLANKS).add(ICBlockItems.RUBBER_PLANKS.get());
        tag(ItemTags.STAIRS).add(ICBlockItems.RUBBER_STAIRS.get());
        tag(ItemTags.SLABS).add(ICBlockItems.RUBBER_SLAB.get());
        tag(ItemTags.FENCES).add(ICBlockItems.RUBBER_FENCE.get());
        tag(ItemTags.BUTTONS).add(ICBlockItems.RUBBER_BUTTON.get());
        tag(ItemTags.WOODEN_STAIRS).add(ICBlockItems.RUBBER_STAIRS.get());
        tag(ItemTags.WOODEN_SLABS).add(ICBlockItems.RUBBER_SLAB.get());
        tag(ItemTags.WOODEN_FENCES).add(ICBlockItems.RUBBER_FENCE_GATE.get());
        tag(ItemTags.WOODEN_BUTTONS).add(ICBlockItems.RUBBER_BUTTON.get());
        tag(ItemTags.WOODEN_PRESSURE_PLATES).add(ICBlockItems.RUBBER_PRESSURE_PLATE.get());

        // Forge
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(BlockTags.FENCE_GATES, Tags.Items.FENCE_GATES);
        copy(Tags.Blocks.FENCE_GATES_WOODEN, Tags.Items.FENCE_GATES_WOODEN);

        tag(Tags.Items.RAW_MATERIALS).addTags(
                ICTags.Items.RAW_MATERIALS_TIN,
                ICTags.Items.RAW_MATERIALS_LEAD,
                ICTags.Items.RAW_MATERIALS_ALUMINUM);

        tag(Tags.Items.INGOTS).addTags(
                ICTags.Items.INGOTS_TIN,
                ICTags.Items.INGOTS_LEAD,
                ICTags.Items.INGOTS_ALUMINUM,
                ICTags.Items.INGOTS_BRONZE,
                ICTags.Items.INGOTS_STEEL);

        tag(Tags.Items.NUGGETS).addTags(
                ICTags.Items.NUGGETS_TIN,
                ICTags.Items.NUGGETS_LEAD,
                ICTags.Items.NUGGETS_ALUMINUM,
                ICTags.Items.NUGGETS_BRONZE,
                ICTags.Items.NUGGETS_STEEL);

        tag(Tags.Items.DUSTS).addTags(
                ICTags.Items.DUSTS_TIN,
                ICTags.Items.DUSTS_LEAD,
                ICTags.Items.DUSTS_ALUMINUM,
                ICTags.Items.DUSTS_BRONZE,
                ICTags.Items.DUSTS_STEEL);

    }

    @Override
    public String getName() {
        return "[IndustrialCraft-NEXT] Item tags";
    }
}
