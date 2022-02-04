package industrialcraft.common.registries;

import industrialcraft.IndustrialCraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ICItems {
    public static void setup(IEventBus bus) {
        ITEMS.register(bus);
    }

    protected static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            IndustrialCraft.MOD_ID);

    // Start of BlockItems
    public static final RegistryObject<BlockItem> TIN_ORE = ITEMS.register("tin_ore",
            () -> new BlockItem(ICBlocks.TIN_ORE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> DEEPSLATE_TIN_ORE = ITEMS.register("deepslate_tin_ore",
            () -> new BlockItem(
                    ICBlocks.DEEPSLATE_TIN_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> LEAD_ORE = ITEMS.register("lead_ore",
            () -> new BlockItem(ICBlocks.LEAD_ORE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> DEEPSLATE_LEAD_ORE = ITEMS.register("deepslate_lead_ore",
            () -> new BlockItem(ICBlocks.DEEPSLATE_LEAD_ORE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> BAUXITE_ORE = ITEMS.register("bauxite_ore",
            () -> new BlockItem(ICBlocks.BAUXITE_ORE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> DEEPSLATE_BAUXITE_ORE = ITEMS.register("deepslate_bauxite_ore",
            () -> new BlockItem(ICBlocks.DEEPSLATE_BAUXITE_ORE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RAW_TIN_BLOCK = ITEMS.register("raw_tin_block",
            () -> new BlockItem(ICBlocks.RAW_TIN_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> TIN_BLOCK = ITEMS.register("tin_block",
            () -> new BlockItem(ICBlocks.TIN_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RAW_ALUMINIUM_BLOCK = ITEMS.register("raw_aluminium_block",
            () -> new BlockItem(ICBlocks.RAW_ALUMINIUM_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> LEAD_BLOCK = ITEMS.register("lead_block",
            () -> new BlockItem(ICBlocks.LEAD_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RAW_LEAD_BLOCK = ITEMS.register("raw_lead_block",
            () -> new BlockItem(ICBlocks.RAW_LEAD_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_LOG = ITEMS.register("rubber_log",
            () -> new BlockItem(ICBlocks.RUBBER_LOG.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> STRIPPED_RUBBER_LOG = ITEMS.register("stripped_rubber_log",
            () -> new BlockItem(ICBlocks.STRIPPED_RUBBER_LOG.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_WOOD = ITEMS.register("rubber_wood",
            () -> new BlockItem(ICBlocks.RUBBER_WOOD.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> STRIPPED_RUBBER_WOOD = ITEMS.register("stripped_rubber_wood",
            () -> new BlockItem(ICBlocks.STRIPPED_RUBBER_WOOD.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_LEAVES = ITEMS.register("rubber_leaves",
            () -> new BlockItem(ICBlocks.RUBBER_LEAVES.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_SAPLING = ITEMS.register("rubber_sapling",
            () -> new BlockItem(ICBlocks.RUBBER_SAPLING.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_PLANKS = ITEMS.register("rubber_planks",
            () -> new BlockItem(ICBlocks.RUBBER_PLANKS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_STAIRS = ITEMS.register("rubber_stairs",
            () -> new BlockItem(ICBlocks.RUBBER_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_SLAB = ITEMS.register("rubber_slab",
            () -> new BlockItem(ICBlocks.RUBBER_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_DOOR = ITEMS.register("rubber_door",
            () -> new BlockItem(ICBlocks.RUBBER_DOOR.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<BlockItem> RUBBER_TRAPDOOR = ITEMS.register("rubber_trapdoor",
            () -> new BlockItem(ICBlocks.RUBBER_TRAPDOOR.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<BlockItem> RUBBER_FENCE = ITEMS.register("rubber_fence",
            () -> new BlockItem(ICBlocks.RUBBER_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBBER_FENCE_GATE = ITEMS.register("rubber_fence_gate",
            () -> new BlockItem(ICBlocks.RUBBER_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<BlockItem> RUBBER_PRESSURE_PLATE = ITEMS.register("rubber_pressure_plate1",
            () -> new BlockItem(ICBlocks.RUBBER_PRESSURE_PLATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<BlockItem> RUBBER_BUTTON = ITEMS.register("rubber_button",
            () -> new BlockItem(ICBlocks.RUBBER_BUTTON.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
}
