package industrialcraft.common.world.vegetation;

import java.util.List;

import industrialcraft.IndustrialCraft;
import industrialcraft.common.feature.ICPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;

public class ICVegetationFeatures {
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> TREES_RUBBER = FeatureUtils.register(
            IndustrialCraft.modPrefix("trees_rubber").toString(), Feature.RANDOM_SELECTOR,
            new RandomFeatureConfiguration(
                    List.of(new WeightedPlacedFeature(ICPlacedFeatures.Vegetations.RUBBER_CHECKED, 0.05f)),
                    ICPlacedFeatures.Vegetations.RUBBER_CHECKED));
}
