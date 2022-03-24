package industrialcraft.tags;

import industrialcraft.IndustrialCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ICItemTags {
    // @formatter:off
    public static final TagKey<Item> IC_ORES = createItemTag(IndustrialCraft.modPrefix("ores"));
    public static final TagKey<Item> RUBBER_LOGS = createItemTag(IndustrialCraft.modPrefix("rubber_logs"));

    public static final TagKey<Item> TIN_ORES = createItemTag(IndustrialCraft.forgePrefix("ores/tin"));
    public static final TagKey<Item> LEAD_ORES = createItemTag(IndustrialCraft.forgePrefix("ores/lead"));
    public static final TagKey<Item> ALUMINIUM_ORES = createItemTag(IndustrialCraft.forgePrefix("ores/aluminium"));

    public static final TagKey<Item> TIN_INGOTS = createItemTag(IndustrialCraft.forgePrefix("ingots/tin"));
    public static final TagKey<Item> LEAD_INGOTS = createItemTag(IndustrialCraft.forgePrefix("ingots/lead"));
    public static final TagKey<Item> ALUMINIUM_INGOTS = createItemTag(IndustrialCraft.forgePrefix("ingots/aluminium"));
    public static final TagKey<Item> BRONZE_INGOTS = createItemTag(IndustrialCraft.forgePrefix("ingots/bronze"));
    public static final TagKey<Item> STEEL_INGOTS = createItemTag(IndustrialCraft.forgePrefix("ingots/steel"));

    public static final TagKey<Item> TIN_STORAGE_BLOCKS = createItemTag(IndustrialCraft.forgePrefix("storage_blocks/tin"));
    public static final TagKey<Item> LEAD_STORAGE_BLOCKS = createItemTag(IndustrialCraft.forgePrefix("storage_blocks/lead"));
    public static final TagKey<Item> ALUMINIUM_STORAGE_BLOCKS = createItemTag(IndustrialCraft.forgePrefix("storage_blocks/aluminium"));
    public static final TagKey<Item> BRONZE_STORAGE_BLOCKS = createItemTag(IndustrialCraft.forgePrefix("storage_blocks/bronze"));
    public static final TagKey<Item> STEEL_STORAGE_BLOCKS = createItemTag(IndustrialCraft.forgePrefix("storage_blocks/steel"));

    // @formatter:on
    public static final TagKey<Item> createItemTag(ResourceLocation location) {
        final TagKey<Item> tagKey = ItemTags.create(location);
        return tagKey;
    }
}
