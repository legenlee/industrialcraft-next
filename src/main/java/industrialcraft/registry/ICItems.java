package industrialcraft.registry;

import industrialcraft.IndustrialCraft;
import industrialcraft.item.ICCreativeModeTab;
import industrialcraft.item.ICToolTier;
import industrialcraft.item.tool.TreetapItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ICItems {
    protected static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            IndustrialCraft.MOD_ID);

    // @formatter:off
    public static final RegistryObject<Item> RAW_TIN = register("raw_tin");
    public static final RegistryObject<Item> TIN_INGOT = register("tin_ingot");
    public static final RegistryObject<Item> TIN_NUGGET = register("tin_nugget");
    public static final RegistryObject<Item> TIN_DUST = register("tin_dust");

    public static final RegistryObject<Item> RAW_LEAD = register("raw_lead");
    public static final RegistryObject<Item> LEAD_INGOT = register("lead_ingot");
    public static final RegistryObject<Item> LEAD_NUGGET = register("lead_nugget");
    public static final RegistryObject<Item> LEAD_DUST = register("lead_dust");

    public static final RegistryObject<Item> RAW_BAUXITE = register("raw_bauxite");
    public static final RegistryObject<Item> ALUMINIUM_INGOT = register("aluminium_ingot");
    public static final RegistryObject<Item> ALUMINIUM_NUGGET = register("aluminium_nugget");
    public static final RegistryObject<Item> ALUMINIUM_DUST = register("aluminium_dust");

    public static final RegistryObject<Item> BRONZE_INGOT = register("bronze_ingot");
    public static final RegistryObject<Item> BRONZE_NUGGET = register("bronze_nugget");
    public static final RegistryObject<Item> BRONZE_DUST = register("bronze_dust");
    
    public static final RegistryObject<Item> STEEL_INGOT = register("steel_ingot");
    public static final RegistryObject<Item> STEEL_NUGGET = register("steel_nugget");
    public static final RegistryObject<Item> STEEL_DUST = register("steel_dust");

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ICToolTier.BRONZE, 3, -2.4f, new Item.Properties().tab(ICCreativeModeTab.ICNEXT)));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ICToolTier.BRONZE, 1.5f, -3, new Item.Properties().tab(ICCreativeModeTab.ICNEXT)));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ICToolTier.BRONZE, 1, -2.8f, new Item.Properties().tab(ICCreativeModeTab.ICNEXT)));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ICToolTier.BRONZE, 6, -3.1f, new Item.Properties().tab(ICCreativeModeTab.ICNEXT)));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ICToolTier.BRONZE, -2, -1, new Item.Properties().tab(ICCreativeModeTab.ICNEXT)));

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ICToolTier.STEEL, 3, -2.4f, new Item.Properties().tab(ICCreativeModeTab.ICNEXT)));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(ICToolTier.STEEL, 1.5f, -3, new Item.Properties().tab(ICCreativeModeTab.ICNEXT)));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ICToolTier.STEEL, 1, -2.8f, new Item.Properties().tab(ICCreativeModeTab.ICNEXT)));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ICToolTier.STEEL, 6, -3.1f, new Item.Properties().tab(ICCreativeModeTab.ICNEXT)));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ICToolTier.STEEL, -2, -1, new Item.Properties().tab(ICCreativeModeTab.ICNEXT)));

    public static final RegistryObject<Item> TREETAP = ITEMS.register("treetap", () -> new TreetapItem(new Item.Properties().tab(ICCreativeModeTab.ICNEXT).durability(49).setNoRepair()));

    public static final RegistryObject<Item> MUSIC_DISC_YOUR_EVERYDAY_HAPPYCORE = ITEMS.register("music_disc_your_everyday_happycore", () -> new RecordItem(15, () -> ICSoundEvents.YOUR_EVERYDAY_HAPPYCORE.get(), new Item.Properties().stacksTo(1).tab(ICCreativeModeTab.ICNEXT).rarity(Rarity.RARE)));

    // @formatter:on
    private static final RegistryObject<Item> register(String name) {
        final RegistryObject<Item> registryObject = ITEMS.register(name,
                () -> new Item(new Item.Properties().tab(ICCreativeModeTab.ICNEXT)));
        return registryObject;
    }

    public static void setup(final IEventBus bus) {
        ITEMS.register(bus);
    }
}
