package industrialcraft.common.world.grower;

import java.util.Random;

import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class RubberTreeGrower extends AbstractTreeGrower {
    protected ConfiguredFeature<?, ?> getConfiguredFeature(Random fancyTreeRandom, boolean isBeeHiveGenerated) {
        return TreeFeatures.OAK;
    }
}
