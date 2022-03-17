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
    public static final TagKey<Block> IC_ORES = createBlockTags(IndustrialCraft.modPrefix("ores"));
    public static final TagKey<Block> RUBBER_LOGS = createBlockTags(IndustrialCraft.modPrefix("rubber_logs"));

    // @formatter:on
    public static final TagKey<Block> createBlockTags(ResourceLocation location) {
        final TagKey<Block> tagKey = BlockTags.create(location);
        return tagKey;
    }
}
