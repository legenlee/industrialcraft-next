package industrialcraft.common;

import industrialcraft.IndustrialCraft;
import industrialcraft.common.registries.ItemRegistries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.RegistryObject;

public class ICCreativeModeTabs {
    // @formatter:off
    public static final CreativeModeTab GENERAL = createCreativeModeTab("general", ItemRegistries.TIN_INGOT);
    public static final CreativeModeTab TRANSPORTATION = createCreativeModeTab("transportation", ItemRegistries.TIN_INGOT);
    public static final CreativeModeTab TOOLS = createCreativeModeTab("tools", ItemRegistries.TIN_INGOT);

    // @formatter:on
    private static final CreativeModeTab createCreativeModeTab(String label, RegistryObject<Item> itemObject) {
        return new CreativeModeTab(IndustrialCraft.MOD_ID + "." + label) {
            @Override
            @OnlyIn(Dist.CLIENT)
            public ItemStack makeIcon() {
                return new ItemStack(itemObject.get());
            }
        };
    }
}
