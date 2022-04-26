package industrialcraft.common.tags;

import industrialcraft.IndustrialCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ICTags {
    public static class Blocks {
        // @formatter:off
        public static final TagKey<Block> NEEDS_BRONZE_TOOL = createTag("needs_bronze_tool");
        public static final TagKey<Block> NEEDS_STEEL_TOOL = createTag("needs_steel_tool");

        public static final TagKey<Block> ORES_TIN = createForgeTag("ores/tin");
        public static final TagKey<Block> ORES_LEAD = createForgeTag("ores/lead");
        public static final TagKey<Block> ORES_ALUMINUM = createForgeTag("ores/aluminum");

        public static final TagKey<Block> STORAGE_BLOCKS_RAW_TIN = createForgeTag("storage_blocks/raw_tin");
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_LEAD = createForgeTag("storage_blocks/raw_lead");
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_ALUMINUM = createForgeTag("storage_blocks/raw_aluminum");

        public static final TagKey<Block> STORAGE_BLOCKS_TIN = createForgeTag("storage_blocks/tin");
        public static final TagKey<Block> STORAGE_BLOCKS_LEAD = createForgeTag("storage_blocks/lead");
        public static final TagKey<Block> STORAGE_BLOCKS_ALUMINUM = createForgeTag("storage_blocks/aluminum");
        public static final TagKey<Block> STORAGE_BLOCKS_BRONZE = createForgeTag("storage_blocks/bronze");
        public static final TagKey<Block> STORAGE_BLOCKS_STEEL = createForgeTag("storage_blocks/steel");

        public static final TagKey<Block> RUBBER_LOGS = createTag("rubber_logs");
        public static final TagKey<Block> MACHINES = createTag("machines");

        // @formatter:on
        public static TagKey<Block> createTag(String name) {
            return BlockTags.create(IndustrialCraft.modPrefix(name));
        }

        public static TagKey<Block> createForgeTag(String name) {
            return BlockTags.create(IndustrialCraft.forgePrefix(name));
        }
    }

    public static class Items {
        // @formatter:off
        public static final TagKey<Item> ORES_TIN = createForgeTag("ores/tin");
        public static final TagKey<Item> ORES_LEAD = createForgeTag("ores/lead");
        public static final TagKey<Item> ORES_ALUMINUM = createForgeTag("ores/aluminum");

        public static final TagKey<Item> RAW_MATERIALS_TIN = createForgeTag("raw_materials/tin");
        public static final TagKey<Item> RAW_MATERIALS_LEAD = createForgeTag("raw_materials/lead");
        public static final TagKey<Item> RAW_MATERIALS_ALUMINUM = createForgeTag("raw_materials/aluminum");

        public static final TagKey<Item> INGOTS_TIN = createForgeTag("ingots/tin");
        public static final TagKey<Item> INGOTS_LEAD = createForgeTag("ingots/lead");
        public static final TagKey<Item> INGOTS_ALUMINUM = createForgeTag("ingots/aluminum");
        public static final TagKey<Item> INGOTS_BRONZE = createForgeTag("ingots/bronze");
        public static final TagKey<Item> INGOTS_STEEL = createForgeTag("ingots/steel");

        public static final TagKey<Item> NUGGETS_TIN = createForgeTag("nuggets/tin");
        public static final TagKey<Item> NUGGETS_LEAD = createForgeTag("nuggets/lead");
        public static final TagKey<Item> NUGGETS_ALUMINUM = createForgeTag("nuggets/aluminum");
        public static final TagKey<Item> NUGGETS_BRONZE = createForgeTag("nuggets/bronze");
        public static final TagKey<Item> NUGGETS_STEEL = createForgeTag("nuggets/steel");
        
        public static final TagKey<Item> DUSTS_TIN = createForgeTag("dusts/tin");
        public static final TagKey<Item> DUSTS_LEAD = createForgeTag("dusts/lead");
        public static final TagKey<Item> DUSTS_ALUMINUM = createForgeTag("dusts/aluminum");
        public static final TagKey<Item> DUSTS_BRONZE = createForgeTag("dusts/bronze");
        public static final TagKey<Item> DUSTS_STEEL = createForgeTag("dusts/steel");

        public static final TagKey<Item> STORAGE_BLOCKS_RAW_TIN = createForgeTag("storage_blocks/raw_tin");
        public static final TagKey<Item> STORAGE_BLOCKS_RAW_LEAD = createForgeTag("storage_blocks/raw_lead");
        public static final TagKey<Item> STORAGE_BLOCKS_RAW_ALUMINUM = createForgeTag("storage_blocks/raw_aluminum");

        public static final TagKey<Item> STORAGE_BLOCKS_TIN = createForgeTag("storage_blocks/tin");
        public static final TagKey<Item> STORAGE_BLOCKS_LEAD = createForgeTag("storage_blocks/lead");
        public static final TagKey<Item> STORAGE_BLOCKS_ALUMINUM = createForgeTag("storage_blocks/aluminum");
        public static final TagKey<Item> STORAGE_BLOCKS_BRONZE = createForgeTag("storage_blocks/bronze");
        public static final TagKey<Item> STORAGE_BLOCKS_STEEL = createForgeTag("storage_blocks/steel");

        public static final TagKey<Item> RUBBER = createForgeTag("rubber");

        public static final TagKey<Item> TOOLS_WRENCH = createForgeTag("tools/wrench");

        public static final TagKey<Item> RUBBER_LOGS = createTag("rubber_logs");
        public static final TagKey<Item> MACHINES = createTag("machines");

        // @formatter:on
        public static final TagKey<Item> createTag(String name) {
            return ItemTags.create(IndustrialCraft.modPrefix(name));
        }

        public static final TagKey<Item> createForgeTag(String name) {
            return ItemTags.create(IndustrialCraft.forgePrefix(name));
        }
    }
}
