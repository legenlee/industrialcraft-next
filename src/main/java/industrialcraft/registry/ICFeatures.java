package industrialcraft.registry;

import java.util.function.Supplier;

import industrialcraft.IndustrialCraft;
import industrialcraft.world.generation.tree.rubber.RubberTreeFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ICFeatures {
    private static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES,
            IndustrialCraft.MOD_ID);

    public static final RegistryObject<Feature<TreeConfiguration>> RUBBER_TREE = registerFeature("rubber_tree", () -> new RubberTreeFeature(NoneFeatureConfiguration.CODEC));

    public static <FC extends FeatureConfiguration> RegistryObject<Feature<FC>> registerFeature(String name, Supplier<? extends Feature<FC>> sup) {
        final RegistryObject<Feature<FC>> registryObject = FEATURES.register(name, sup);
        return registryObject;
    }

    public static void setup(final IEventBus bus) {
        FEATURES.register(bus);
    }
}
