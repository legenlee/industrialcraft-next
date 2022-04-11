package industrialcraft.tag;

import industrialcraft.IndustrialCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ICBlockTags {
    // @formatter:off
    public static final TagKey<Block> NEEDS_BRONZE_TOOL = create(IndustrialCraft.modPrefix("needs_bronze_tool"));
    public static final TagKey<Block> NEEDS_STEEL_TOOL = create(IndustrialCraft.modPrefix("needs_steel_tool"));

    public static final TagKey<Block> ORES_TIN = create(IndustrialCraft.forgePrefix("ores/tin"));
    public static final TagKey<Block> ORES_LEAD = create(IndustrialCraft.forgePrefix("ores/lead"));
    public static final TagKey<Block> ORES_ALUMINUM = create(IndustrialCraft.forgePrefix("ores/aluminum"));

    public static final TagKey<Block> STORAGE_BLOCKS_RAW_TIN = create(IndustrialCraft.forgePrefix("storage_blocks/raw_tin"));
    public static final TagKey<Block> STORAGE_BLOCKS_RAW_LEAD = create(IndustrialCraft.forgePrefix("storage_blocks/raw_lead"));
    public static final TagKey<Block> STORAGE_BLOCKS_RAW_ALUMINUM = create(IndustrialCraft.forgePrefix("storage_blocks/raw_aluminum"));

    public static final TagKey<Block> STORAGE_BLOCKS_TIN = create(IndustrialCraft.forgePrefix("storage_blocks/tin"));
    public static final TagKey<Block> STORAGE_BLOCKS_LEAD = create(IndustrialCraft.forgePrefix("storage_blocks/lead"));
    public static final TagKey<Block> STORAGE_BLOCKS_ALUMINUM = create(IndustrialCraft.forgePrefix("storage_blocks/aluminum"));
    public static final TagKey<Block> STORAGE_BLOCKS_BRONZE = create(IndustrialCraft.forgePrefix("storage_blocks/bronze"));
    public static final TagKey<Block> STORAGE_BLOCKS_STEEL = create(IndustrialCraft.forgePrefix("storage_blocks/steel"));

    public static final TagKey<Block> RUBBER_LOGS = create(IndustrialCraft.modPrefix("rubber_logs"));
    public static final TagKey<Block> MACHINES = create(IndustrialCraft.modPrefix("machines"));

    // @formatter:on
    public static final TagKey<Block> create(ResourceLocation location) {
        final TagKey<Block> tagKey = BlockTags.create(location);
        return tagKey;
    }
}
