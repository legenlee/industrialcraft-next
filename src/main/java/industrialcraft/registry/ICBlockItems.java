package industrialcraft.registry;

import industrialcraft.IndustrialCraft;
import industrialcraft.item.ICCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ICBlockItems {
    protected static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            IndustrialCraft.MOD_ID);

    // @formatter:off
    public static final RegistryObject<BlockItem> TIN_ORE = register("tin_ore", ICBlocks.TIN_ORE, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> DEEPSLATE_TIN_ORE = register("deepslate_tin_ore", ICBlocks.DEEPSLATE_TIN_ORE, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> LEAD_ORE = register("lead_ore", ICBlocks.LEAD_ORE, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> DEEPSLATE_LEAD_ORE = register("deepslate_lead_ore", ICBlocks.DEEPSLATE_LEAD_ORE, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> BAUXITE_ORE = register("bauxite_ore", ICBlocks.BAUXITE_ORE, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> DEEPSLATE_BAUXITE_ORE = register("deepslate_bauxite_ore", ICBlocks.DEEPSLATE_BAUXITE_ORE, ICCreativeModeTab.GENERAL);
    
    public static final RegistryObject<BlockItem> RAW_TIN_BLOCK = register("raw_tin_block", ICBlocks.RAW_TIN_BLOCK, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RAW_BAUXITE_BLOCK = register("raw_bauxite_block", ICBlocks.RAW_BAUXITE_BLOCK, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RAW_LEAD_BLOCK = register("raw_lead_block", ICBlocks.RAW_LEAD_BLOCK, ICCreativeModeTab.GENERAL);

    public static final RegistryObject<BlockItem> TIN_BLOCK = register("tin_block", ICBlocks.TIN_BLOCK, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> LEAD_BLOCK = register("lead_block", ICBlocks.LEAD_BLOCK, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> BRONZE_BLOCK = register("bronze_block", ICBlocks.BRONZE_BLOCK, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> STEEL_BLOCK = register("steel_block", ICBlocks.STEEL_BLOCK, ICCreativeModeTab.GENERAL);

    public static final RegistryObject<BlockItem> RUBBER_LOG = register("rubber_log", ICBlocks.RUBBER_LOG, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> STRIPPED_RUBBER_LOG = register("stripped_rubber_log", ICBlocks.STRIPPED_RUBBER_LOG, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_WOOD = register("rubber_wood", ICBlocks.RUBBER_WOOD, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> STRIPPED_RUBBER_WOOD = register("stripped_rubber_wood", ICBlocks.STRIPPED_RUBBER_WOOD, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_LEAVES = register("rubber_leaves", ICBlocks.RUBBER_LEAVES, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_SAPLING = register("rubber_sapling", ICBlocks.RUBBER_SAPLING, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_PLANKS = register("rubber_planks", ICBlocks.RUBBER_PLANKS, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_STAIRS = register("rubber_stairs", ICBlocks.RUBBER_STAIRS, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_SLAB = register("rubber_slab", ICBlocks.RUBBER_SLAB, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_DOOR = register("rubber_door", ICBlocks.RUBBER_DOOR, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_TRAPDOOR = register("rubber_trapdoor", ICBlocks.RUBBER_TRAPDOOR, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_FENCE = register("rubber_fence", ICBlocks.RUBBER_FENCE, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_FENCE_GATE = register("rubber_fence_gate", ICBlocks.RUBBER_FENCE_GATE, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_PRESSURE_PLATE = register("rubber_pressure_plate", ICBlocks.RUBBER_PRESSURE_PLATE, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_BUTTON = register("rubber_button", ICBlocks.RUBBER_BUTTON, ICCreativeModeTab.GENERAL);
    
    // @formatter:on
    private static final RegistryObject<BlockItem> register(String name,
            RegistryObject<? extends Block> blockObject, CreativeModeTab tab) {
        final RegistryObject<BlockItem> registryObject = BLOCK_ITEMS.register(name,
                () -> new BlockItem(blockObject.get(), new Item.Properties().tab(tab)));
        return registryObject;
    }

    public static void setup(final IEventBus bus) {
        BLOCK_ITEMS.register(bus);
    }
}
