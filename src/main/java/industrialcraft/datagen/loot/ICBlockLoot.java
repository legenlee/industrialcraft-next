package industrialcraft.datagen.loot;

import java.util.function.Supplier;
import java.util.stream.Collectors;

import industrialcraft.common.registries.BlockRegistries;
import industrialcraft.common.registries.ItemRegistries;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;

public class ICBlockLoot extends BlockLoot {
    @Override
    protected void addTables() {
        // @formatter:off
        dropSelf(BlockRegistries.RAW_TIN_BLOCK.get());
        dropSelf(BlockRegistries.RAW_LEAD_BLOCK.get());
        dropSelf(BlockRegistries.RAW_BAUXITE_BLOCK.get());

        dropSelf(BlockRegistries.TIN_BLOCK.get());
        dropSelf(BlockRegistries.LEAD_BLOCK.get());
        dropSelf(BlockRegistries.ALUMINUM_BLOCK.get());
        dropSelf(BlockRegistries.BRONZE_BLOCK.get());
        dropSelf(BlockRegistries.STEEL_BLOCK.get());

        dropSelf(BlockRegistries.RUBBER_LOG.get());
        dropSelf(BlockRegistries.STRIPPED_RUBBER_LOG.get());
        dropSelf(BlockRegistries.RUBBER_WOOD.get());
        dropSelf(BlockRegistries.STRIPPED_RUBBER_WOOD.get());
        dropSelf(BlockRegistries.RUBBER_SAPLING.get());
        dropSelf(BlockRegistries.RUBBER_PLANKS.get());
        dropSelf(BlockRegistries.RUBBER_STAIRS.get());
        dropSelf(BlockRegistries.RUBBER_SLAB.get());
        dropSelf(BlockRegistries.RUBBER_FENCE.get());
        dropSelf(BlockRegistries.RUBBER_FENCE_GATE.get());
        dropSelf(BlockRegistries.RUBBER_PRESSURE_PLATE.get());
        dropSelf(BlockRegistries.RUBBER_BUTTON.get());

        dropPottedContents(BlockRegistries.POTTED_RUBBER_SAPLING.get());

        add(BlockRegistries.RUBBER_LEAVES.get(), (block) -> createLeavesDrops(block, BlockRegistries.RUBBER_SAPLING.get(), new float[] { 0.05F, 0.0625F, 0.083333336F, 0.1F }));
        
        add(BlockRegistries.TIN_ORE.get(), (block) -> createOreDrop(block, ItemRegistries.RAW_TIN.get()));
        add(BlockRegistries.DEEPSLATE_TIN_ORE.get(), (block) -> createOreDrop(block, ItemRegistries.RAW_TIN.get()));
        add(BlockRegistries.LEAD_ORE.get(), (block) -> createOreDrop(block, ItemRegistries.RAW_LEAD.get()));
        add(BlockRegistries.DEEPSLATE_LEAD_ORE.get(), (block) -> createOreDrop(block, ItemRegistries.RAW_LEAD.get()));
        add(BlockRegistries.BAUXITE_ORE.get(), (block) -> createOreDrop(block, ItemRegistries.RAW_BAUXITE.get()));
        add(BlockRegistries.DEEPSLATE_BAUXITE_ORE.get(), (block) -> createOreDrop(block, ItemRegistries.RAW_BAUXITE.get()));

        // @formatter:on
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockRegistries.getCollection().stream().map(Supplier::get).collect(Collectors.toList());
    }
}
