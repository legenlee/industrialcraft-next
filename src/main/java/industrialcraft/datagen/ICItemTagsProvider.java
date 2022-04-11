package industrialcraft.datagen;

import industrialcraft.IndustrialCraft;
import industrialcraft.registry.ICBlockItems;
import industrialcraft.registry.ICItems;
import industrialcraft.tag.ICBlockTags;
import industrialcraft.tag.ICItemTags;
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
        copy(ICBlockTags.ORES_TIN, ICItemTags.ORES_TIN);
        copy(ICBlockTags.ORES_LEAD, ICItemTags.ORES_LEAD);
        copy(ICBlockTags.ORES_ALUMINUM, ICItemTags.ORES_ALUMINUM);

        copy(ICBlockTags.STORAGE_BLOCKS_RAW_TIN, ICItemTags.STORAGE_BLOCKS_RAW_TIN);
        copy(ICBlockTags.STORAGE_BLOCKS_RAW_LEAD, ICItemTags.STORAGE_BLOCKS_RAW_LEAD);
        copy(ICBlockTags.STORAGE_BLOCKS_RAW_ALUMINUM, ICItemTags.STORAGE_BLOCKS_RAW_ALUMINUM);

        copy(ICBlockTags.STORAGE_BLOCKS_TIN, ICItemTags.STORAGE_BLOCKS_TIN);
        copy(ICBlockTags.STORAGE_BLOCKS_LEAD, ICItemTags.STORAGE_BLOCKS_LEAD);
        copy(ICBlockTags.STORAGE_BLOCKS_ALUMINUM, ICItemTags.STORAGE_BLOCKS_ALUMINUM);
        copy(ICBlockTags.STORAGE_BLOCKS_BRONZE, ICItemTags.STORAGE_BLOCKS_BRONZE);
        copy(ICBlockTags.STORAGE_BLOCKS_STEEL, ICItemTags.STORAGE_BLOCKS_STEEL);

        tag(ICItemTags.RAW_MATERIALS_TIN).add(ICItems.RAW_TIN.get());
        tag(ICItemTags.RAW_MATERIALS_LEAD).add(ICItems.RAW_LEAD.get());
        tag(ICItemTags.RAW_MATERIALS_ALUMINUM).add(ICItems.RAW_BAUXITE.get());

        tag(ICItemTags.INGOTS_TIN).add(ICItems.TIN_INGOT.get());
        tag(ICItemTags.INGOTS_LEAD).add(ICItems.LEAD_INGOT.get());
        tag(ICItemTags.INGOTS_ALUMINUM).add(ICItems.ALUMINIUM_INGOT.get());
        tag(ICItemTags.INGOTS_BRONZE).add(ICItems.BRONZE_INGOT.get());
        tag(ICItemTags.INGOTS_STEEL).add(ICItems.STEEL_INGOT.get());

        tag(ICItemTags.NUGGETS_TIN).add(ICItems.TIN_NUGGET.get());
        tag(ICItemTags.NUGGETS_LEAD).add(ICItems.LEAD_NUGGET.get());
        tag(ICItemTags.NUGGETS_ALUMINUM).add(ICItems.ALUMINIUM_NUGGET.get());
        tag(ICItemTags.NUGGETS_BRONZE).add(ICItems.BRONZE_NUGGET.get());
        tag(ICItemTags.NUGGETS_STEEL).add(ICItems.STEEL_NUGGET.get());

        tag(ICItemTags.DUSTS_TIN).add(ICItems.TIN_DUST.get());
        tag(ICItemTags.DUSTS_LEAD).add(ICItems.LEAD_DUST.get());
        tag(ICItemTags.DUSTS_ALUMINUM).add(ICItems.ALUMINIUM_DUST.get());
        tag(ICItemTags.DUSTS_BRONZE).add(ICItems.BRONZE_DUST.get());
        tag(ICItemTags.DUSTS_STEEL).add(ICItems.STEEL_DUST.get());

        copy(ICBlockTags.RUBBER_LOGS, ICItemTags.RUBBER_LOGS);

        tag(ICItemTags.RUBBER).add(ICItems.RUBBER.get());

        // Vanilla
        tag(ItemTags.LOGS).addTag(ICItemTags.RUBBER_LOGS);
        tag(ItemTags.LOGS_THAT_BURN).addTag(ICItemTags.RUBBER_LOGS);
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
                ICItemTags.RAW_MATERIALS_TIN,
                ICItemTags.RAW_MATERIALS_LEAD,
                ICItemTags.RAW_MATERIALS_ALUMINUM);

        tag(Tags.Items.INGOTS).addTags(
                ICItemTags.INGOTS_TIN,
                ICItemTags.INGOTS_LEAD,
                ICItemTags.INGOTS_ALUMINUM,
                ICItemTags.INGOTS_BRONZE,
                ICItemTags.INGOTS_STEEL);

        tag(Tags.Items.NUGGETS).addTags(
                ICItemTags.NUGGETS_TIN,
                ICItemTags.NUGGETS_LEAD,
                ICItemTags.NUGGETS_ALUMINUM,
                ICItemTags.NUGGETS_BRONZE,
                ICItemTags.NUGGETS_STEEL);

        tag(Tags.Items.DUSTS).addTags(
                ICItemTags.DUSTS_TIN,
                ICItemTags.DUSTS_LEAD,
                ICItemTags.DUSTS_ALUMINUM,
                ICItemTags.DUSTS_BRONZE,
                ICItemTags.DUSTS_STEEL);

    }

    @Override
    public String getName() {
        return "[IndustrialCraft-NEXT] Item tags";
    }
}
