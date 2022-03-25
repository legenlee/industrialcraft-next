package industrialcraft.registry;

import java.util.List;

import industrialcraft.IndustrialCraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.CountOnEveryLayerPlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

public class ICPlacedFeatures {
    public static final Holder<PlacedFeature> RUBBER_TREE = register("rubber_tree",
            ICConfiguredFeatures.RUBBER_TREE,
            List.of(CountOnEveryLayerPlacement.of(4), BiomeFilter.biome(), BlockPredicateFilter.forPredicate(
                    BlockPredicate.wouldSurvive(ICBlocks.RUBBER_SAPLING.get().defaultBlockState(), BlockPos.ZERO))));

    public static <FC extends FeatureConfiguration> Holder<PlacedFeature> register(String name,
            Holder<ConfiguredFeature<FC, ?>> feature, List<PlacementModifier> placements) {
        return PlacementUtils.register(IndustrialCraft.modPrefix(name).toString(), feature, placements);
    };

    private static <FC extends FeatureConfiguration> Holder<PlacedFeature> register(String name,
            Holder<ConfiguredFeature<FC, ?>> feature, PlacementModifier... placements) {
        return PlacementUtils.register(IndustrialCraft.modPrefix(name).toString(), feature, placements);
    };
}
