package industrialcraft.datagen;

import industrialcraft.IndustrialCraft;
import industrialcraft.registry.ICBlockItems;
import industrialcraft.registry.ICItems;
import industrialcraft.tags.ICBlockTags;
import industrialcraft.tags.ICItemTags;
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
        copy(ICBlockTags.ORES_BAUXITE, ICItemTags.ORES_BAUXITE);

        copy(ICBlockTags.STORAGE_BLOCKS_RAW_TIN, ICItemTags.STORAGE_BLOCKS_RAW_TIN);
        copy(ICBlockTags.STORAGE_BLOCKS_RAW_LEAD, ICItemTags.STORAGE_BLOCKS_RAW_LEAD);
        copy(ICBlockTags.STORAGE_BLOCKS_RAW_BAUXITE, ICItemTags.STORAGE_BLOCKS_RAW_BAUXITE);

        copy(ICBlockTags.STORAGE_BLOCKS_TIN, ICItemTags.STORAGE_BLOCKS_TIN);
        copy(ICBlockTags.STORAGE_BLOCKS_LEAD, ICItemTags.STORAGE_BLOCKS_LEAD);
        copy(ICBlockTags.STORAGE_BLOCKS_ALUMINIUM, ICItemTags.STORAGE_BLOCKS_ALUMINIUM);
        copy(ICBlockTags.STORAGE_BLOCKS_BRONZE, ICItemTags.STORAGE_BLOCKS_BRONZE);
        copy(ICBlockTags.STORAGE_BLOCKS_STEEL, ICItemTags.STORAGE_BLOCKS_STEEL);

        tag(ICItemTags.INGOTS_TIN).add(ICItems.TIN_INGOT.get());
        tag(ICItemTags.INGOTS_LEAD).add(ICItems.LEAD_INGOT.get());
        tag(ICItemTags.INGOTS_ALUMINIUM).add(ICItems.ALUMINIUM_INGOT.get());
        tag(ICItemTags.INGOTS_BRONZE).add(ICItems.BRONZE_INGOT.get());
        tag(ICItemTags.INGOTS_STEEL).add(ICItems.STEEL_INGOT.get());

        copy(ICBlockTags.RUBBER_LOGS, ICItemTags.RUBBER_LOGS);

        // Vanilla
        tag(ItemTags.LOGS)
                .add(ICBlockItems.RUBBER_LOG.get())
                .add(ICBlockItems.STRIPPED_RUBBER_LOG.get())
                .add(ICBlockItems.RUBBER_WOOD.get())
                .add(ICBlockItems.STRIPPED_RUBBER_WOOD.get());

        tag(ItemTags.LOGS_THAT_BURN)
                .add(ICBlockItems.RUBBER_LOG.get())
                .add(ICBlockItems.STRIPPED_RUBBER_LOG.get())
                .add(ICBlockItems.RUBBER_WOOD.get())
                .add(ICBlockItems.STRIPPED_RUBBER_WOOD.get());

        tag(ItemTags.SAPLINGS).add(ICBlockItems.RUBBER_SAPLING.get());
        tag(ItemTags.LEAVES).add(ICBlockItems.RUBBER_LEAVES.get());
        tag(ItemTags.PLANKS).add(ICBlockItems.RUBBER_PLANKS.get());
        tag(ItemTags.WOODEN_STAIRS).add(ICBlockItems.RUBBER_STAIRS.get());
        tag(ItemTags.WOODEN_SLABS).add(ICBlockItems.RUBBER_SLAB.get());
        tag(ItemTags.FENCES).add(ICBlockItems.RUBBER_FENCE.get());
        tag(ItemTags.WOODEN_FENCES).add(ICBlockItems.RUBBER_FENCE_GATE.get());
        tag(ItemTags.WOODEN_PRESSURE_PLATES).add(ICBlockItems.RUBBER_PRESSURE_PLATE.get());

        // Forge
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(BlockTags.FENCE_GATES, Tags.Items.FENCE_GATES);
        copy(Tags.Blocks.FENCE_GATES_WOODEN, Tags.Items.FENCE_GATES_WOODEN);

    }

    @Override
    public String getName() {
        return "[IndustrialCraft-NEXT] Item tags";
    }
}
