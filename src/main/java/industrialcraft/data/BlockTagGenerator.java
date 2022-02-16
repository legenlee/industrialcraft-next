package industrialcraft.data;

import industrialcraft.IndustrialCraft;
import industrialcraft.common.registry.ICBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagGenerator extends BlockTagsProvider {
    public BlockTagGenerator(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, IndustrialCraft.MOD_ID, helper);
    }

    public static final Tag.Named<Block> IC_ORES = BlockTags
            .bind(IndustrialCraft.getResourceLocation("ores").toString());

    public static final Tag.Named<Block> RUBBER_LOGS = BlockTags
            .bind(IndustrialCraft.getResourceLocation("rubber_logs").toString());

    @Override
    protected void addTags() {
        tag(IC_ORES)
                .add(ICBlocks.TIN_ORE.get())
                .add(ICBlocks.DEEPSLATE_TIN_ORE.get())
                .add(ICBlocks.LEAD_ORE.get())
                .add(ICBlocks.DEEPSLATE_LEAD_ORE.get())
                .add(ICBlocks.BAUXITE_ORE.get())
                .add(ICBlocks.DEEPSLATE_BAUXITE_ORE.get());

        tag(Tags.Blocks.ORES).addTag(IC_ORES);

        tag(BlockTags.LOGS).add(ICBlocks.RUBBER_LOG.get());
        tag(BlockTags.LOGS_THAT_BURN).add(ICBlocks.RUBBER_LOG.get());

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