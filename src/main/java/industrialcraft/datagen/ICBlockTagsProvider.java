package industrialcraft.datagen;

import industrialcraft.IndustrialCraft;
import industrialcraft.common.registries.BlockRegistries;
import industrialcraft.common.tags.ICTags;
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
                BlockRegistries.TIN_ORE.get(),
                BlockRegistries.DEEPSLATE_TIN_ORE.get());

        tag(ICTags.Blocks.ORES_LEAD).add(
                BlockRegistries.LEAD_ORE.get(),
                BlockRegistries.DEEPSLATE_LEAD_ORE.get());

        tag(ICTags.Blocks.ORES_ALUMINUM).add(
                BlockRegistries.BAUXITE_ORE.get(),
                BlockRegistries.DEEPSLATE_BAUXITE_ORE.get());

        tag(ICTags.Blocks.STORAGE_BLOCKS_RAW_TIN).add(BlockRegistries.RAW_TIN_BLOCK.get());
        tag(ICTags.Blocks.STORAGE_BLOCKS_RAW_LEAD).add(BlockRegistries.RAW_LEAD_BLOCK.get());
        tag(ICTags.Blocks.STORAGE_BLOCKS_RAW_ALUMINUM).add(BlockRegistries.RAW_BAUXITE_BLOCK.get());

        tag(ICTags.Blocks.STORAGE_BLOCKS_TIN).add(BlockRegistries.TIN_BLOCK.get());
        tag(ICTags.Blocks.STORAGE_BLOCKS_LEAD).add(BlockRegistries.LEAD_BLOCK.get());
        tag(ICTags.Blocks.STORAGE_BLOCKS_ALUMINUM).add(BlockRegistries.ALUMINUM_BLOCK.get());
        tag(ICTags.Blocks.STORAGE_BLOCKS_BRONZE).add(BlockRegistries.BRONZE_BLOCK.get());
        tag(ICTags.Blocks.STORAGE_BLOCKS_STEEL).add(BlockRegistries.STEEL_BLOCK.get());

        tag(ICTags.Blocks.RUBBER_LOGS).add(
                BlockRegistries.RUBBER_LOG.get(),
                BlockRegistries.STRIPPED_RUBBER_LOG.get(),
                BlockRegistries.RUBBER_WOOD.get(),
                BlockRegistries.STRIPPED_RUBBER_WOOD.get());

        // Vanilla
        tag(BlockTags.LOGS).addTag(ICTags.Blocks.RUBBER_LOGS);
        tag(BlockTags.LOGS_THAT_BURN).addTag(ICTags.Blocks.RUBBER_LOGS);
        tag(BlockTags.SAPLINGS).add(BlockRegistries.RUBBER_SAPLING.get());
        tag(BlockTags.LEAVES).add(BlockRegistries.RUBBER_LEAVES.get());
        tag(BlockTags.PLANKS).add(BlockRegistries.RUBBER_PLANKS.get());
        tag(BlockTags.STAIRS).add(BlockRegistries.RUBBER_STAIRS.get());
        tag(BlockTags.SLABS).add(BlockRegistries.RUBBER_SLAB.get());
        tag(BlockTags.FENCES).add(BlockRegistries.RUBBER_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(BlockRegistries.RUBBER_FENCE_GATE.get());
        tag(BlockTags.BUTTONS).add(BlockRegistries.RUBBER_BUTTON.get());
        tag(BlockTags.PRESSURE_PLATES).add(BlockRegistries.RUBBER_PRESSURE_PLATE.get());
        tag(BlockTags.WOODEN_STAIRS).add(BlockRegistries.RUBBER_STAIRS.get());
        tag(BlockTags.WOODEN_SLABS).add(BlockRegistries.RUBBER_SLAB.get());
        tag(BlockTags.WOODEN_FENCES).add(BlockRegistries.RUBBER_FENCE.get());
        tag(BlockTags.WOODEN_BUTTONS).add(BlockRegistries.RUBBER_BUTTON.get());
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(BlockRegistries.RUBBER_PRESSURE_PLATE.get());

        tag(BlockTags.FLOWER_POTS).add(BlockRegistries.POTTED_RUBBER_SAPLING.get());

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

        tag(Tags.Blocks.FENCES_WOODEN).add(BlockRegistries.RUBBER_FENCE.get());
        tag(Tags.Blocks.FENCE_GATES_WOODEN).add(BlockRegistries.RUBBER_FENCE_GATE.get());

        // Mineable
        tag(BlockTags.MINEABLE_WITH_AXE).add(
                BlockRegistries.RUBBER_LOG.get(),
                BlockRegistries.STRIPPED_RUBBER_LOG.get(),
                BlockRegistries.RUBBER_WOOD.get(),
                BlockRegistries.STRIPPED_RUBBER_WOOD.get(),
                BlockRegistries.RUBBER_PLANKS.get(),
                BlockRegistries.RUBBER_STAIRS.get(),
                BlockRegistries.RUBBER_SLAB.get(),
                // ICBlocks.RUBBER_DOOR.get(),
                // ICBlocks.RUBBER_TRAPDOOR.get(),
                BlockRegistries.RUBBER_FENCE.get(),
                BlockRegistries.RUBBER_FENCE_GATE.get(),
                BlockRegistries.RUBBER_PRESSURE_PLATE.get(),
                BlockRegistries.RUBBER_BUTTON.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                BlockRegistries.TIN_ORE.get(),
                BlockRegistries.DEEPSLATE_TIN_ORE.get(),
                BlockRegistries.LEAD_ORE.get(),
                BlockRegistries.DEEPSLATE_LEAD_ORE.get(),
                BlockRegistries.BAUXITE_ORE.get(),
                BlockRegistries.DEEPSLATE_BAUXITE_ORE.get(),
                BlockRegistries.RAW_TIN_BLOCK.get(),
                BlockRegistries.RAW_LEAD_BLOCK.get(),
                BlockRegistries.RAW_BAUXITE_BLOCK.get(),
                BlockRegistries.TIN_BLOCK.get(),
                BlockRegistries.LEAD_BLOCK.get(),
                BlockRegistries.ALUMINUM_BLOCK.get(),
                BlockRegistries.BRONZE_BLOCK.get(),
                BlockRegistries.STEEL_BLOCK.get());

        tag(BlockTags.NEEDS_STONE_TOOL).add(
                BlockRegistries.TIN_ORE.get(),
                BlockRegistries.DEEPSLATE_TIN_ORE.get(),
                BlockRegistries.LEAD_ORE.get(),
                BlockRegistries.DEEPSLATE_LEAD_ORE.get(),
                BlockRegistries.BAUXITE_ORE.get(),
                BlockRegistries.DEEPSLATE_BAUXITE_ORE.get(),
                BlockRegistries.RAW_TIN_BLOCK.get(),
                BlockRegistries.RAW_LEAD_BLOCK.get(),
                BlockRegistries.RAW_BAUXITE_BLOCK.get(),
                BlockRegistries.TIN_BLOCK.get(),
                BlockRegistries.LEAD_BLOCK.get(),
                BlockRegistries.ALUMINUM_BLOCK.get(),
                BlockRegistries.BRONZE_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL).add(
                BlockRegistries.STEEL_BLOCK.get());
    }

    @Override
    public String getName() {
        return "[IndustrialCraft-NEXT] Block tags";
    }
}
