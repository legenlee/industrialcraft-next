package industrialcraft.tags;

import industrialcraft.IndustrialCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ICBlockTags {
    // @formatter:off
    public static final TagKey<Block> NEEDS_BRONZE_TOOL = createBlockTags(IndustrialCraft.modPrefix("needs_bronze_tool"));
    public static final TagKey<Block> NEEDS_STEEL_TOOL = createBlockTags(IndustrialCraft.modPrefix("needs_steel_tool"));

    public static final TagKey<Block> ORES_TIN = createBlockTags(IndustrialCraft.forgePrefix("ores/tin"));
    public static final TagKey<Block> ORES_LEAD = createBlockTags(IndustrialCraft.forgePrefix("ores/tin"));
    public static final TagKey<Block> ORES_BAUXITE = createBlockTags(IndustrialCraft.forgePrefix("ores/tin"));

    public static final TagKey<Block> STORAGE_BLOCKS_TIN = createBlockTags(IndustrialCraft.forgePrefix("storage_blocks/tin"));
    public static final TagKey<Block> STORAGE_BLOCKS_LEAD = createBlockTags(IndustrialCraft.forgePrefix("storage_blocks/lead"));
    public static final TagKey<Block> STORAGE_BLOCKS_ALUMINIUM = createBlockTags(IndustrialCraft.forgePrefix("storage_blocks/lead"));
    public static final TagKey<Block> STORAGE_BLOCKS_BRONZE = createBlockTags(IndustrialCraft.forgePrefix("storage_blocks/bronze"));
    public static final TagKey<Block> STORAGE_BLOCKS_STEEL = createBlockTags(IndustrialCraft.forgePrefix("storage_blocks/steel"));

    public static final TagKey<Block> RUBBER_LOGS = createBlockTags(IndustrialCraft.modPrefix("rubber_logs"));

    // @formatter:on
    public static final TagKey<Block> createBlockTags(ResourceLocation location) {
        final TagKey<Block> tagKey = BlockTags.create(location);
        return tagKey;
    }
}
