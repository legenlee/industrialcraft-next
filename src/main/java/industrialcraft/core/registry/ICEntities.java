package industrialcraft.core.registry;

import java.util.function.Supplier;

import industrialcraft.IndustrialCraft;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ICEntities {
    protected static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
            IndustrialCraft.MOD_ID);

    // @formatter:off


    // @formatter:on
    private static final <T extends Entity> RegistryObject<EntityType<T>> register(String name,
            Supplier<? extends EntityType<T>> sup) {
        final RegistryObject<EntityType<T>> registryObject = ENTITIES.register(name, sup);
        return registryObject;
    }

    public static void setup(final IEventBus bus) {
        ENTITIES.register(bus);
    }
}
