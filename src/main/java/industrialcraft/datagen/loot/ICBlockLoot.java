package industrialcraft.datagen.loot;

import java.util.function.Supplier;
import java.util.stream.Collectors;

import industrialcraft.registry.ICBlocks;
import industrialcraft.registry.ICItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;

public class ICBlockLoot extends BlockLoot {
    // @formatter:off
    @Override
    protected void addTables() {
        dropSelf(ICBlocks.RAW_TIN_BLOCK.get());
        dropSelf(ICBlocks.RAW_LEAD_BLOCK.get());
        dropSelf(ICBlocks.RAW_BAUXITE_BLOCK.get());

        dropSelf(ICBlocks.TIN_BLOCK.get());
        dropSelf(ICBlocks.LEAD_BLOCK.get());
        dropSelf(ICBlocks.ALUMINIUM_BLOCK.get());
        dropSelf(ICBlocks.BRONZE_BLOCK.get());
        dropSelf(ICBlocks.STEEL_BLOCK.get());

        dropSelf(ICBlocks.RUBBER_LOG.get());
        dropSelf(ICBlocks.STRIPPED_RUBBER_LOG.get());
        dropSelf(ICBlocks.RUBBER_WOOD.get());
        dropSelf(ICBlocks.STRIPPED_RUBBER_WOOD.get());
        dropSelf(ICBlocks.RUBBER_SAPLING.get());
        dropSelf(ICBlocks.RUBBER_PLANKS.get());
        dropSelf(ICBlocks.RUBBER_STAIRS.get());
        dropSelf(ICBlocks.RUBBER_SLAB.get());
        dropSelf(ICBlocks.RUBBER_FENCE.get());
        dropSelf(ICBlocks.RUBBER_FENCE_GATE.get());
        dropSelf(ICBlocks.RUBBER_PRESSURE_PLATE.get());
        dropSelf(ICBlocks.RUBBER_BUTTON.get());

        dropPottedContents(ICBlocks.POTTED_RUBBER_SAPLING.get());

        add(ICBlocks.RUBBER_LEAVES.get(), (block) -> createLeavesDrops(block, ICBlocks.RUBBER_LEAVES.get(), new float[] { 0.05F, 0.0625F, 0.083333336F, 0.1F }));
        
        add(ICBlocks.TIN_ORE.get(), (block) -> createOreDrop(block, ICItems.RAW_TIN.get()));
        add(ICBlocks.DEEPSLATE_TIN_ORE.get(), (block) -> createOreDrop(block, ICItems.RAW_TIN.get()));
        add(ICBlocks.LEAD_ORE.get(), (block) -> createOreDrop(block, ICItems.RAW_LEAD.get()));
        add(ICBlocks.DEEPSLATE_LEAD_ORE.get(), (block) -> createOreDrop(block, ICItems.RAW_LEAD.get()));
        add(ICBlocks.BAUXITE_ORE.get(), (block) -> createOreDrop(block, ICItems.RAW_BAUXITE.get()));
        add(ICBlocks.DEEPSLATE_BAUXITE_ORE.get(), (block) -> createOreDrop(block, ICItems.RAW_BAUXITE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ICBlocks.getCollection().stream().map(Supplier::get).collect(Collectors.toList());
    }
}
