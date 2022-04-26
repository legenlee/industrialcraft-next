package industrialcraft.common.registries;

import industrialcraft.IndustrialCraft;
import industrialcraft.common.ICCreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockItemRegistries {
    protected static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            IndustrialCraft.MOD_ID);

    // @formatter:off
    public static final RegistryObject<BlockItem> TIN_ORE = register("tin_ore", BlockRegistries.TIN_ORE, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> DEEPSLATE_TIN_ORE = register("deepslate_tin_ore", BlockRegistries.DEEPSLATE_TIN_ORE, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> LEAD_ORE = register("lead_ore", BlockRegistries.LEAD_ORE, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> DEEPSLATE_LEAD_ORE = register("deepslate_lead_ore", BlockRegistries.DEEPSLATE_LEAD_ORE, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> BAUXITE_ORE = register("bauxite_ore", BlockRegistries.BAUXITE_ORE, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> DEEPSLATE_BAUXITE_ORE = register("deepslate_bauxite_ore", BlockRegistries.DEEPSLATE_BAUXITE_ORE, ICCreativeModeTabs.GENERAL);
    
    public static final RegistryObject<BlockItem> RAW_TIN_BLOCK = register("raw_tin_block", BlockRegistries.RAW_TIN_BLOCK, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> RAW_BAUXITE_BLOCK = register("raw_bauxite_block", BlockRegistries.RAW_BAUXITE_BLOCK, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> RAW_LEAD_BLOCK = register("raw_lead_block", BlockRegistries.RAW_LEAD_BLOCK, ICCreativeModeTabs.GENERAL);

    public static final RegistryObject<BlockItem> TIN_BLOCK = register("tin_block", BlockRegistries.TIN_BLOCK, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> LEAD_BLOCK = register("lead_block", BlockRegistries.LEAD_BLOCK, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> ALUMINUM_BLOCK = register("aluminum_block", BlockRegistries.ALUMINUM_BLOCK, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> BRONZE_BLOCK = register("bronze_block", BlockRegistries.BRONZE_BLOCK, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> STEEL_BLOCK = register("steel_block", BlockRegistries.STEEL_BLOCK, ICCreativeModeTabs.GENERAL);

    public static final RegistryObject<BlockItem> RUBBER_LOG = register("rubber_log", BlockRegistries.RUBBER_LOG, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> STRIPPED_RUBBER_LOG = register("stripped_rubber_log", BlockRegistries.STRIPPED_RUBBER_LOG, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_WOOD = register("rubber_wood", BlockRegistries.RUBBER_WOOD, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> STRIPPED_RUBBER_WOOD = register("stripped_rubber_wood", BlockRegistries.STRIPPED_RUBBER_WOOD, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_LEAVES = register("rubber_leaves", BlockRegistries.RUBBER_LEAVES, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_SAPLING = register("rubber_sapling", BlockRegistries.RUBBER_SAPLING, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_PLANKS = register("rubber_planks", BlockRegistries.RUBBER_PLANKS, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_STAIRS = register("rubber_stairs", BlockRegistries.RUBBER_STAIRS, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_SLAB = register("rubber_slab", BlockRegistries.RUBBER_SLAB, ICCreativeModeTabs.GENERAL);
    // public static final RegistryObject<BlockItem> RUBBER_DOOR = register("rubber_door", ICBlocks.RUBBER_DOOR, ICCreativeModeTab.GENERAL);
    // public static final RegistryObject<BlockItem> RUBBER_TRAPDOOR = register("rubber_trapdoor", ICBlocks.RUBBER_TRAPDOOR, ICCreativeModeTab.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_FENCE = register("rubber_fence", BlockRegistries.RUBBER_FENCE, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_FENCE_GATE = register("rubber_fence_gate", BlockRegistries.RUBBER_FENCE_GATE, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_PRESSURE_PLATE = register("rubber_pressure_plate", BlockRegistries.RUBBER_PRESSURE_PLATE, ICCreativeModeTabs.GENERAL);
    public static final RegistryObject<BlockItem> RUBBER_BUTTON = register("rubber_button", BlockRegistries.RUBBER_BUTTON, ICCreativeModeTabs.GENERAL);
    
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
