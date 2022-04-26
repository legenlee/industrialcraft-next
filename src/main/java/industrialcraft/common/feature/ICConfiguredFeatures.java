package industrialcraft.common.feature;

import industrialcraft.IndustrialCraft;
import industrialcraft.common.registries.BlockRegistries;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ICConfiguredFeatures {
    public static class Ores {
    }

    public static class Vegetations {
        public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> RUBBER_TREE = FeatureUtils.register(
                IndustrialCraft.modPrefix("rubber_tree").toString(), Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(BlockRegistries.RUBBER_LOG.get()),
                        new StraightTrunkPlacer(5, 2, 0),
                        BlockStateProvider.simple(BlockRegistries.RUBBER_LEAVES.get()),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1))
                        .ignoreVines().build());
    }
}
