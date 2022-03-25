package industrialcraft.registry;

import java.util.List;

import industrialcraft.IndustrialCraft;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ICConfiguredFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> RUBBER_TREE = register("rubber_tree",
            Feature.TREE,
            new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ICBlocks.RUBBER_LOG.get()),
                    new StraightTrunkPlacer(5, 2, 0), BlockStateProvider.simple(ICBlocks.RUBBER_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1))
                    .ignoreVines().build());

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> Holder<ConfiguredFeature<FC, ?>> register(
            String name, F feature, FC config) {
        return BuiltinRegistries.registerExact(BuiltinRegistries.CONFIGURED_FEATURE,
                IndustrialCraft.modPrefix(name).toString(), new ConfiguredFeature<>(feature, config));
    }
}
