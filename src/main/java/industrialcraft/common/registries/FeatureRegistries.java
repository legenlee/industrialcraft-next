package industrialcraft.common.registries;

import java.util.function.Supplier;

import industrialcraft.IndustrialCraft;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FeatureRegistries {
    protected static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES,
            IndustrialCraft.MOD_ID);

    // @formatter:off

    
    // @formatter:on
    private static <FC extends FeatureConfiguration> RegistryObject<Feature<FC>> register(String name,
            Supplier<? extends Feature<FC>> sup) {
        final RegistryObject<Feature<FC>> registryObject = FEATURES.register(name, sup);
        return registryObject;
    }

    public static void setup(final IEventBus bus) {
        FEATURES.register(bus);
    }
}
