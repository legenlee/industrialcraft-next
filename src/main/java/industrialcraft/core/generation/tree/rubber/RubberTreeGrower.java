package industrialcraft.core.generation.tree.rubber;

import java.util.Random;

import javax.annotation.Nullable;

import industrialcraft.core.generation.ICConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class RubberTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random random, boolean beeHive) {
        return ICConfiguredFeatures.RUBBER_TREE;
    }
}
