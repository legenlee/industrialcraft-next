package industrialcraft.common.feature.vegetation.rubber;

import java.util.Random;

import javax.annotation.Nullable;

import industrialcraft.common.feature.ICConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class RubberTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random random, boolean beeHive) {
        return ICConfiguredFeatures.Vegetations.RUBBER_TREE;
    }
}
