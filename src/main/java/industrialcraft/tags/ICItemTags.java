package industrialcraft.tags;

import industrialcraft.IndustrialCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ICItemTags {
    // @formatter:off
    public static final TagKey<Item> RUBBER_LOGS = create(IndustrialCraft.modPrefix("rubber_logs"));

    public static final TagKey<Item> ORES_TIN = create(IndustrialCraft.forgePrefix("ores/tin"));
    public static final TagKey<Item> ORES_LEAD = create(IndustrialCraft.forgePrefix("ores/lead"));
    public static final TagKey<Item> ORES_BAUXITE = create(IndustrialCraft.forgePrefix("ores/bauxite"));

    public static final TagKey<Item> INGOTS_TIN = create(IndustrialCraft.forgePrefix("ingots/tin"));
    public static final TagKey<Item> INGOTS_LEAD = create(IndustrialCraft.forgePrefix("ingots/lead"));
    public static final TagKey<Item> INGOTS_ALUMINIUM = create(IndustrialCraft.forgePrefix("ingots/aluminium"));
    public static final TagKey<Item> INGOTS_BRONZE = create(IndustrialCraft.forgePrefix("ingots/bronze"));
    public static final TagKey<Item> INGOTS_STEEL = create(IndustrialCraft.forgePrefix("ingots/steel"));

    public static final TagKey<Item> STORAGE_BLOCKS_TIN = create(IndustrialCraft.forgePrefix("storage_blocks/tin"));
    public static final TagKey<Item> STORAGE_BLOCKS_LEAD = create(IndustrialCraft.forgePrefix("storage_blocks/lead"));
    public static final TagKey<Item> STORAGE_BLOCKS_ALUMINIUM = create(IndustrialCraft.forgePrefix("storage_blocks/aluminium"));
    public static final TagKey<Item> STORAGE_BLOCKS_BRONZE = create(IndustrialCraft.forgePrefix("storage_blocks/bronze"));
    public static final TagKey<Item> STORAGE_BLOCKS_STEEL = create(IndustrialCraft.forgePrefix("storage_blocks/steel"));

    // @formatter:on
    public static final TagKey<Item> create(ResourceLocation location) {
        final TagKey<Item> tagKey = ItemTags.create(location);
        return tagKey;
    }
}
