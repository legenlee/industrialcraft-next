package industrialcraft.datagen;

import industrialcraft.IndustrialCraft;
import industrialcraft.registry.ICBlocks;
import industrialcraft.tags.ICBlockTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagGenerator extends BlockTagsProvider {
    public BlockTagGenerator(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, IndustrialCraft.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(ICBlockTags.RUBBER_LOGS)
                .add(ICBlocks.RUBBER_LOG.get())
                .add(ICBlocks.STRIPPED_RUBBER_LOG.get())
                .add(ICBlocks.RUBBER_WOOD.get())
                .add(ICBlocks.STRIPPED_RUBBER_WOOD.get());

        tag(ICBlockTags.IC_ORES)
                .add(ICBlocks.TIN_ORE.get())
                .add(ICBlocks.DEEPSLATE_TIN_ORE.get())
                .add(ICBlocks.LEAD_ORE.get())
                .add(ICBlocks.DEEPSLATE_LEAD_ORE.get())
                .add(ICBlocks.BAUXITE_ORE.get())
                .add(ICBlocks.DEEPSLATE_BAUXITE_ORE.get());

        tag(BlockTags.LOGS).addTag(ICBlockTags.RUBBER_LOGS);
        tag(BlockTags.LOGS_THAT_BURN).addTag(ICBlockTags.RUBBER_LOGS);

        tag(Tags.Blocks.ORES).addTag(ICBlockTags.IC_ORES);

        tag(BlockTags.SAPLINGS).add(ICBlocks.RUBBER_SAPLING.get());
        tag(BlockTags.LEAVES).add(ICBlocks.RUBBER_LEAVES.get());

        tag(BlockTags.PLANKS).add(ICBlocks.RUBBER_PLANKS.get());

        tag(BlockTags.STAIRS).add(ICBlocks.RUBBER_STAIRS.get());
        tag(BlockTags.WOODEN_STAIRS).add(ICBlocks.RUBBER_STAIRS.get());

        tag(BlockTags.SLABS).add(ICBlocks.RUBBER_SLAB.get());
        tag(BlockTags.WOODEN_SLABS).add(ICBlocks.RUBBER_SLAB.get());

        tag(BlockTags.FENCES).add(ICBlocks.RUBBER_FENCE.get());
        tag(BlockTags.WOODEN_FENCES).add(ICBlocks.RUBBER_FENCE.get());

        tag(BlockTags.FENCE_GATES).add(ICBlocks.RUBBER_FENCE_GATE.get());
        tag(Tags.Blocks.FENCE_GATES_WOODEN).add(ICBlocks.RUBBER_FENCE_GATE.get());

        tag(BlockTags.BUTTONS).add(ICBlocks.RUBBER_BUTTON.get());
        tag(BlockTags.WOODEN_BUTTONS).add(ICBlocks.RUBBER_BUTTON.get());

        tag(BlockTags.PRESSURE_PLATES).add(ICBlocks.RUBBER_PRESSURE_PLATE.get());
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ICBlocks.RUBBER_PRESSURE_PLATE.get());

        tag(BlockTags.FLOWER_POTS).add(ICBlocks.POTTED_RUBBER_SAPLING.get());
    }
}
