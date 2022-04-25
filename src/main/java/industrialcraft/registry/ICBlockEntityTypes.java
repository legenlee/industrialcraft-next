package industrialcraft.registry;

import java.util.function.Supplier;

import industrialcraft.IndustrialCraft;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ICBlockEntityTypes {
    protected static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister
            .create(ForgeRegistries.BLOCK_ENTITIES, IndustrialCraft.MOD_ID);

    // @formatter:off
    

    // @formatter:on
    private static final <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String name,
            Supplier<? extends BlockEntityType<T>> sup) {
        final RegistryObject<BlockEntityType<T>> registryObject = BLOCK_ENTITY_TYPES.register(name, sup);
        return registryObject;
    }

    public static void setup(final IEventBus bus) {
        BLOCK_ENTITY_TYPES.register(bus);
    }
}
