package industrialcraft.core.registry;

import java.util.function.Supplier;

import industrialcraft.IndustrialCraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.BlastFurnaceScreen;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.BlastFurnaceMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ICContainers {
    protected static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister
            .create(ForgeRegistries.CONTAINERS, IndustrialCraft.MOD_ID);

    // @formatter:off

    
    // @formatter:on
    private static final <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> register(String name,
            Supplier<? extends MenuType<T>> sup) {
        final RegistryObject<MenuType<T>> registryObject = CONTAINERS.register(name, sup);
        return registryObject;
    }

    public static void setup(final IEventBus bus) {
        CONTAINERS.register(bus);
    }
}
