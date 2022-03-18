package industrialcraft.registry;

import java.util.function.Supplier;

import industrialcraft.IndustrialCraft;
import industrialcraft.item.ICCreativeModeTab;
import industrialcraft.item.ICToolTier;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
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
    public static final RegistryObject<Item> TREETAP = registerItem("treetap");

    public static final RegistryObject<Item> RAW_TIN = registerItem("raw_tin");
    public static final RegistryObject<Item> TIN_INGOT = registerItem("tin_ingot");
    public static final RegistryObject<Item> TIN_NUGGET = registerItem("tin_nugget");
    public static final RegistryObject<Item> TIN_DUST = registerItem("tin_dust");

    public static final RegistryObject<Item> RAW_LEAD = registerItem("raw_lead");
    public static final RegistryObject<Item> LEAD_INGOT = registerItem("lead_ingot");
    public static final RegistryObject<Item> LEAD_NUGGET = registerItem("lead_nugget");
    public static final RegistryObject<Item> LEAD_DUST = registerItem("lead_dust");

    public static final RegistryObject<Item> RAW_BAUXITE = registerItem("raw_bauxite");
    public static final RegistryObject<Item> ALUMINIUM_INGOT = registerItem("aluminium_ingot");
    public static final RegistryObject<Item> ALUMINIUM_NUGGET = registerItem("aluminium_nugget");
    public static final RegistryObject<Item> ALUMINIUM_DUST = registerItem("aluminium_dust");

    public static final RegistryObject<Item> BRONZE_INGOT = registerItem("bronze_ingot");
    public static final RegistryObject<Item> BRONZE_NUGGET = registerItem("bronze_nugget");
    public static final RegistryObject<Item> BRONZE_DUST = registerItem("bronze_dust");
    
    public static final RegistryObject<Item> STEEL_INGOT = registerItem("steel_ingot");
    public static final RegistryObject<Item> STEEL_NUGGET = registerItem("steel_nugget");
    public static final RegistryObject<Item> STEEL_DUST = registerItem("steel_dust");

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ICToolTier.BRONZE, 3, -2.4f, new Item.Properties().tab(ICCreativeModeTab.GENERAL)));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ICToolTier.BRONZE, 1.5f, -3, new Item.Properties().tab(ICCreativeModeTab.GENERAL)));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ICToolTier.BRONZE, 1, -2.8f, new Item.Properties().tab(ICCreativeModeTab.GENERAL)));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ICToolTier.BRONZE, 6, -3.1f, new Item.Properties().tab(ICCreativeModeTab.GENERAL)));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ICToolTier.BRONZE, -2, -1, new Item.Properties().tab(ICCreativeModeTab.GENERAL)));

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ICToolTier.STEEL, 3, -2.4f, new Item.Properties().tab(ICCreativeModeTab.GENERAL)));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(ICToolTier.STEEL, 1.5f, -3, new Item.Properties().tab(ICCreativeModeTab.GENERAL)));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ICToolTier.STEEL, 1, -2.8f, new Item.Properties().tab(ICCreativeModeTab.GENERAL)));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ICToolTier.STEEL, 6, -3.1f, new Item.Properties().tab(ICCreativeModeTab.GENERAL)));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ICToolTier.STEEL, -2, -1, new Item.Properties().tab(ICCreativeModeTab.GENERAL)));

    // @formatter:on
    public static final RegistryObject<Item> registerItem(String name) {
        final RegistryObject<Item> registryObject = ITEMS.register(name,
                () -> new Item(new Item.Properties().tab(ICCreativeModeTab.GENERAL)));
        return registryObject;
    }

    public static void setup(final IEventBus bus) {
        ITEMS.register(bus);
    }
}
