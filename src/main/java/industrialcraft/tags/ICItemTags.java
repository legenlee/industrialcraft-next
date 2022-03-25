package industrialcraft.tags;

import industrialcraft.IndustrialCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ICItemTags {
    // @formatter:off
    public static final TagKey<Item> RUBBER_LOGS = createItemTag(IndustrialCraft.modPrefix("rubber_logs"));

    public static final TagKey<Item> ORES_TIN = createItemTag(IndustrialCraft.forgePrefix("ores/tin"));
    public static final TagKey<Item> ORES_LEAD = createItemTag(IndustrialCraft.forgePrefix("ores/lead"));
    public static final TagKey<Item> ORES_BAUXITE = createItemTag(IndustrialCraft.forgePrefix("ores/bauxite"));

    public static final TagKey<Item> INGOTS_TIN = createItemTag(IndustrialCraft.forgePrefix("ingots/tin"));
    public static final TagKey<Item> INGOTS_LEAD = createItemTag(IndustrialCraft.forgePrefix("ingots/lead"));
    public static final TagKey<Item> INGOTS_ALUMINIUM = createItemTag(IndustrialCraft.forgePrefix("ingots/aluminium"));
    public static final TagKey<Item> INGOTS_BRONZE = createItemTag(IndustrialCraft.forgePrefix("ingots/bronze"));
    public static final TagKey<Item> INGOTS_STEEL = createItemTag(IndustrialCraft.forgePrefix("ingots/steel"));

    public static final TagKey<Item> STORAGE_BLOCKS_TIN = createItemTag(IndustrialCraft.forgePrefix("storage_blocks/tin"));
    public static final TagKey<Item> STORAGE_BLOCKS_LEAD = createItemTag(IndustrialCraft.forgePrefix("storage_blocks/lead"));
    public static final TagKey<Item> STORAGE_BLOCKS_ALUMINIUM = createItemTag(IndustrialCraft.forgePrefix("storage_blocks/aluminium"));
    public static final TagKey<Item> STORAGE_BLOCKS_BRONZE = createItemTag(IndustrialCraft.forgePrefix("storage_blocks/bronze"));
    public static final TagKey<Item> STORAGE_BLOCKS_STEEL = createItemTag(IndustrialCraft.forgePrefix("storage_blocks/steel"));

    // @formatter:on
    public static final TagKey<Item> createItemTag(ResourceLocation location) {
        final TagKey<Item> tagKey = ItemTags.create(location);
        return tagKey;
    }
}
