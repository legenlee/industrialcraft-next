package industrialcraft.data;

import industrialcraft.IndustrialCraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTagGenerator extends ItemTagsProvider {
    public static final TagKey<Item> IC_ORES = ItemTags.create(IndustrialCraft.modPrefix("ores"));
    public static final TagKey<Item> RUBBER_LOGS = ItemTags.create(IndustrialCraft.modPrefix("rubber_logs"));

    public static final TagKey<Item> TIN_ORES = ItemTags.create(IndustrialCraft.forgePrefix("ores/tin"));
    public static final TagKey<Item> LEAD_ORES = ItemTags.create(IndustrialCraft.forgePrefix("ores/lead"));
    public static final TagKey<Item> ALUMINIUM_ORES = ItemTags.create(IndustrialCraft.forgePrefix("ores/aluminium"));

    public static final TagKey<Item> TIN_INGOTS = ItemTags.create(IndustrialCraft.forgePrefix("ingots/tin"));
    public static final TagKey<Item> LEAD_INGOTS = ItemTags.create(IndustrialCraft.forgePrefix("ingots/lead"));
    public static final TagKey<Item> ALUMINIUM_INGOTS = ItemTags
            .create(IndustrialCraft.forgePrefix("ingots/aluminium"));
    public static final TagKey<Item> BRONZE_INGOTS = ItemTags.create(IndustrialCraft.forgePrefix("ingots/bronze"));
    public static final TagKey<Item> STEEL_INGOTS = ItemTags.create(IndustrialCraft.forgePrefix("ingots/steel"));

    public static final TagKey<Item> TIN_STORAGE_BLOCKS = ItemTags
            .create(IndustrialCraft.forgePrefix("storage_blocks/tin"));
    public static final TagKey<Item> LEAD_STORAGE_BLOCKS = ItemTags
            .create(IndustrialCraft.forgePrefix("storage_blocks/lead"));
    public static final TagKey<Item> ALUMINIUM_STORAGE_BLOCKS = ItemTags
            .create(IndustrialCraft.forgePrefix("storage_blocks/aluminium"));
    public static final TagKey<Item> BRONZE_STORAGE_BLOCKS = ItemTags
            .create(IndustrialCraft.forgePrefix("storage_blocks/bronze"));
    public static final TagKey<Item> STEEL_STORAGE_BLOCKS = ItemTags
            .create(IndustrialCraft.forgePrefix("storage_blocks/steel"));

    public ItemTagGenerator(DataGenerator generator, BlockTagsProvider provider, ExistingFileHelper helper) {
        super(generator, provider, IndustrialCraft.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        this.copy(BlockTagGenerator.RUBBER_LOGS, RUBBER_LOGS);
        this.copy(BlockTagGenerator.IC_ORES, IC_ORES);

        this.copy(Tags.Blocks.ORES, Tags.Items.ORES);

        this.copy(BlockTags.LOGS, ItemTags.LOGS);
        this.copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);

        this.copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);
        this.copy(BlockTags.LEAVES, ItemTags.LEAVES);

        this.copy(BlockTags.PLANKS, ItemTags.PLANKS);

        this.copy(BlockTags.STAIRS, ItemTags.STAIRS);
        this.copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);

        this.copy(BlockTags.SLABS, ItemTags.SLABS);
        this.copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);

        this.copy(BlockTags.FENCES, ItemTags.FENCES);
        this.copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);

        this.copy(BlockTags.FENCE_GATES, Tags.Items.FENCE_GATES);
        this.copy(Tags.Blocks.FENCE_GATES_WOODEN, Tags.Items.FENCE_GATES_WOODEN);

        this.copy(BlockTags.WOODEN_PRESSURE_PLATES, ItemTags.WOODEN_PRESSURE_PLATES);
    }
}
