package industrialcraft.world.generation.tree.rubber;

import com.mojang.serialization.Codec;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;

public class RubberTreeFeature extends Feature<TreeConfiguration> {
    public RubberTreeFeature(Codec codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<TreeConfiguration> context) {
        WorldGenLevel reader = context.level();
        BlockPos pos = context.origin();

        final BlockState state = reader.getBlockState(pos);

        if (state.isAir()) {
            return false;
        }

        Feature.TREE.place(context);
        return true;
    }
}
