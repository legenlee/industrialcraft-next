package industrialcraft.datagen;

import industrialcraft.IndustrialCraft;
import industrialcraft.core.registry.ICBlocks;
import industrialcraft.core.ICTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ICBlockTagsProvider extends BlockTagsProvider {
    public ICBlockTagsProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, IndustrialCraft.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        // ICNext
        tag(ICTags.Blocks.ORES_TIN).add(
                ICBlocks.TIN_ORE.get(),
                ICBlocks.DEEPSLATE_TIN_ORE.get());

        tag(ICTags.Blocks.ORES_LEAD).add(
                ICBlocks.LEAD_ORE.get(),
                ICBlocks.DEEPSLATE_LEAD_ORE.get());

        tag(ICTags.Blocks.ORES_ALUMINUM).add(
                ICBlocks.BAUXITE_ORE.get(),
                ICBlocks.DEEPSLATE_BAUXITE_ORE.get());

        tag(ICTags.Blocks.STORAGE_BLOCKS_RAW_TIN).add(ICBlocks.RAW_TIN_BLOCK.get());
        tag(ICTags.Blocks.STORAGE_BLOCKS_RAW_LEAD).add(ICBlocks.RAW_LEAD_BLOCK.get());
        tag(ICTags.Blocks.STORAGE_BLOCKS_RAW_ALUMINUM).add(ICBlocks.RAW_BAUXITE_BLOCK.get());

        tag(ICTags.Blocks.STORAGE_BLOCKS_TIN).add(ICBlocks.TIN_BLOCK.get());
        tag(ICTags.Blocks.STORAGE_BLOCKS_LEAD).add(ICBlocks.LEAD_BLOCK.get());
        tag(ICTags.Blocks.STORAGE_BLOCKS_ALUMINUM).add(ICBlocks.ALUMINIUM_BLOCK.get());
        tag(ICTags.Blocks.STORAGE_BLOCKS_BRONZE).add(ICBlocks.BRONZE_BLOCK.get());
        tag(ICTags.Blocks.STORAGE_BLOCKS_STEEL).add(ICBlocks.STEEL_BLOCK.get());

        tag(ICTags.Blocks.RUBBER_LOGS).add(
                ICBlocks.RUBBER_LOG.get(),
                ICBlocks.STRIPPED_RUBBER_LOG.get(),
                ICBlocks.RUBBER_WOOD.get(),
                ICBlocks.STRIPPED_RUBBER_WOOD.get());

        // Vanilla
        tag(BlockTags.LOGS).addTag(ICTags.Blocks.RUBBER_LOGS);
        tag(BlockTags.LOGS_THAT_BURN).addTag(ICTags.Blocks.RUBBER_LOGS);
        tag(BlockTags.SAPLINGS).add(ICBlocks.RUBBER_SAPLING.get());
        tag(BlockTags.LEAVES).add(ICBlocks.RUBBER_LEAVES.get());
        tag(BlockTags.PLANKS).add(ICBlocks.RUBBER_PLANKS.get());
        tag(BlockTags.STAIRS).add(ICBlocks.RUBBER_STAIRS.get());
        tag(BlockTags.SLABS).add(ICBlocks.RUBBER_SLAB.get());
        tag(BlockTags.FENCES).add(ICBlocks.RUBBER_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ICBlocks.RUBBER_FENCE_GATE.get());
        tag(BlockTags.BUTTONS).add(ICBlocks.RUBBER_BUTTON.get());
        tag(BlockTags.PRESSURE_PLATES).add(ICBlocks.RUBBER_PRESSURE_PLATE.get());
        tag(BlockTags.WOODEN_STAIRS).add(ICBlocks.RUBBER_STAIRS.get());
        tag(BlockTags.WOODEN_SLABS).add(ICBlocks.RUBBER_SLAB.get());
        tag(BlockTags.WOODEN_FENCES).add(ICBlocks.RUBBER_FENCE.get());
        tag(BlockTags.WOODEN_BUTTONS).add(ICBlocks.RUBBER_BUTTON.get());
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ICBlocks.RUBBER_PRESSURE_PLATE.get());

        tag(BlockTags.FLOWER_POTS).add(ICBlocks.POTTED_RUBBER_SAPLING.get());

        // Forge
        tag(Tags.Blocks.ORES).addTags(
                ICTags.Blocks.ORES_TIN,
                ICTags.Blocks.ORES_LEAD,
                ICTags.Blocks.ORES_ALUMINUM);

        tag(Tags.Blocks.ORE_RATES_SINGULAR).addTags(
                ICTags.Blocks.ORES_TIN,
                ICTags.Blocks.ORES_LEAD,
                ICTags.Blocks.ORES_ALUMINUM);

        tag(Tags.Blocks.STORAGE_BLOCKS).addTags(
                ICTags.Blocks.STORAGE_BLOCKS_RAW_TIN,
                ICTags.Blocks.STORAGE_BLOCKS_RAW_LEAD,
                ICTags.Blocks.STORAGE_BLOCKS_RAW_ALUMINUM,
                ICTags.Blocks.STORAGE_BLOCKS_TIN,
                ICTags.Blocks.STORAGE_BLOCKS_LEAD,
                ICTags.Blocks.STORAGE_BLOCKS_ALUMINUM,
                ICTags.Blocks.STORAGE_BLOCKS_BRONZE,
                ICTags.Blocks.STORAGE_BLOCKS_STEEL);

        tag(Tags.Blocks.FENCES_WOODEN).add(ICBlocks.RUBBER_FENCE.get());
        tag(Tags.Blocks.FENCE_GATES_WOODEN).add(ICBlocks.RUBBER_FENCE_GATE.get());

        // Mineable
        tag(BlockTags.MINEABLE_WITH_AXE).add(
                ICBlocks.RUBBER_LOG.get(),
                ICBlocks.STRIPPED_RUBBER_LOG.get(),
                ICBlocks.RUBBER_WOOD.get(),
                ICBlocks.STRIPPED_RUBBER_WOOD.get(),
                ICBlocks.RUBBER_PLANKS.get(),
                ICBlocks.RUBBER_STAIRS.get(),
                ICBlocks.RUBBER_SLAB.get(),
                // ICBlocks.RUBBER_DOOR.get(),
                // ICBlocks.RUBBER_TRAPDOOR.get(),
                ICBlocks.RUBBER_FENCE.get(),
                ICBlocks.RUBBER_FENCE_GATE.get(),
                ICBlocks.RUBBER_PRESSURE_PLATE.get(),
                ICBlocks.RUBBER_BUTTON.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ICBlocks.TIN_ORE.get(),
                ICBlocks.DEEPSLATE_TIN_ORE.get(),
                ICBlocks.LEAD_ORE.get(),
                ICBlocks.DEEPSLATE_LEAD_ORE.get(),
                ICBlocks.BAUXITE_ORE.get(),
                ICBlocks.DEEPSLATE_BAUXITE_ORE.get(),
                ICBlocks.RAW_TIN_BLOCK.get(),
                ICBlocks.RAW_LEAD_BLOCK.get(),
                ICBlocks.RAW_BAUXITE_BLOCK.get(),
                ICBlocks.TIN_BLOCK.get(),
                ICBlocks.LEAD_BLOCK.get(),
                ICBlocks.ALUMINIUM_BLOCK.get(),
                ICBlocks.BRONZE_BLOCK.get(),
                ICBlocks.STEEL_BLOCK.get());

        tag(BlockTags.NEEDS_STONE_TOOL).add(
                ICBlocks.TIN_ORE.get(),
                ICBlocks.DEEPSLATE_TIN_ORE.get(),
                ICBlocks.LEAD_ORE.get(),
                ICBlocks.DEEPSLATE_LEAD_ORE.get(),
                ICBlocks.BAUXITE_ORE.get(),
                ICBlocks.DEEPSLATE_BAUXITE_ORE.get(),
                ICBlocks.RAW_TIN_BLOCK.get(),
                ICBlocks.RAW_LEAD_BLOCK.get(),
                ICBlocks.RAW_BAUXITE_BLOCK.get(),
                ICBlocks.TIN_BLOCK.get(),
                ICBlocks.LEAD_BLOCK.get(),
                ICBlocks.ALUMINIUM_BLOCK.get(),
                ICBlocks.BRONZE_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL).add(
                ICBlocks.STEEL_BLOCK.get());
    }

    @Override
    public String getName() {
        return "[IndustrialCraft-NEXT] Block tags";
    }
}
