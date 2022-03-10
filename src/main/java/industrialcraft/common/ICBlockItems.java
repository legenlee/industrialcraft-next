package industrialcraft.common;

import industrialcraft.IndustrialCraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ICBlockItems {
    protected static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            IndustrialCraft.MOD_ID);

    public static void setup(final IEventBus bus) {
        BLOCK_ITEMS.register(bus);
    }

    public static final RegistryObject<BlockItem> TIN_ORE = BLOCK_ITEMS.register("tin_ore",
            () -> new BlockItem(ICBlocks.TIN_ORE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> DEEPSLATE_TIN_ORE = BLOCK_ITEMS.register("deepslate_tin_ore",
            () -> new BlockItem(
                    ICBlocks.DEEPSLATE_TIN_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> LEAD_ORE = BLOCK_ITEMS.register("lead_ore",
            () -> new BlockItem(ICBlocks.LEAD_ORE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> DEEPSLATE_LEAD_ORE = BLOCK_ITEMS.register("deepslate_lead_ore",
            () -> new BlockItem(ICBlocks.DEEPSLATE_LEAD_ORE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> BAUXITE_ORE = BLOCK_ITEMS.register("bauxite_ore",
            () -> new BlockItem(ICBlocks.BAUXITE_ORE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> DEEPSLATE_BAUXITE_ORE = BLOCK_ITEMS.register("deepslate_bauxite_ore",
            () -> new BlockItem(ICBlocks.DEEPSLATE_BAUXITE_ORE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RAW_TIN_BLOCK = BLOCK_ITEMS.register("raw_tin_block",
            () -> new BlockItem(ICBlocks.RAW_TIN_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> TIN_BLOCK = BLOCK_ITEMS.register("tin_block",
            () -> new BlockItem(ICBlocks.TIN_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RAW_ALUMINIUM_BLOCK = BLOCK_ITEMS.register("raw_aluminium_block",
            () -> new BlockItem(ICBlocks.RAW_ALUMINIUM_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> LEAD_BLOCK = BLOCK_ITEMS.register("lead_block",
            () -> new BlockItem(ICBlocks.LEAD_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RAW_LEAD_BLOCK = BLOCK_ITEMS.register("raw_lead_block",
            () -> new BlockItem(ICBlocks.RAW_LEAD_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> BRONZE_BLOCK = BLOCK_ITEMS.register("bronze_block",
            () -> new BlockItem(ICBlocks.BRONZE_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> STEEL_BLOCK = BLOCK_ITEMS.register("steel_block",
            () -> new BlockItem(ICBlocks.STEEL_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_LOG = BLOCK_ITEMS.register("rubber_log",
            () -> new BlockItem(ICBlocks.RUBBER_LOG.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> STRIPPED_RUBBER_LOG = BLOCK_ITEMS.register("stripped_rubber_log",
            () -> new BlockItem(ICBlocks.STRIPPED_RUBBER_LOG.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_WOOD = BLOCK_ITEMS.register("rubber_wood",
            () -> new BlockItem(ICBlocks.RUBBER_WOOD.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> STRIPPED_RUBBER_WOOD = BLOCK_ITEMS.register("stripped_rubber_wood",
            () -> new BlockItem(ICBlocks.STRIPPED_RUBBER_WOOD.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_LEAVES = BLOCK_ITEMS.register("rubber_leaves",
            () -> new BlockItem(ICBlocks.RUBBER_LEAVES.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_SAPLING = BLOCK_ITEMS.register("rubber_sapling",
            () -> new BlockItem(ICBlocks.RUBBER_SAPLING.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_PLANKS = BLOCK_ITEMS.register("rubber_planks",
            () -> new BlockItem(ICBlocks.RUBBER_PLANKS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_STAIRS = BLOCK_ITEMS.register("rubber_stairs",
            () -> new BlockItem(ICBlocks.RUBBER_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_SLAB = BLOCK_ITEMS.register("rubber_slab",
            () -> new BlockItem(ICBlocks.RUBBER_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_DOOR = BLOCK_ITEMS.register("rubber_door",
            () -> new BlockItem(ICBlocks.RUBBER_DOOR.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<BlockItem> RUBBER_TRAPDOOR = BLOCK_ITEMS.register("rubber_trapdoor",
            () -> new BlockItem(ICBlocks.RUBBER_TRAPDOOR.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<BlockItem> RUBBER_FENCE = BLOCK_ITEMS.register("rubber_fence",
            () -> new BlockItem(ICBlocks.RUBBER_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_FENCE_GATE = BLOCK_ITEMS.register("rubber_fence_gate",
            () -> new BlockItem(ICBlocks.RUBBER_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<BlockItem> RUBBER_PRESSURE_PLATE = BLOCK_ITEMS.register("rubber_pressure_plate",
            () -> new BlockItem(ICBlocks.RUBBER_PRESSURE_PLATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<BlockItem> RUBBER_BUTTON = BLOCK_ITEMS.register("rubber_button",
            () -> new BlockItem(ICBlocks.RUBBER_BUTTON.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
}
