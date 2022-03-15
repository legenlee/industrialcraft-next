package industrialcraft.block.rubber;

import javax.annotation.Nullable;

import industrialcraft.block.ICBlockStates;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class RubberLogBlock extends RotatedPillarBlock {
    public static final BooleanProperty HAS_SAP = ICBlockStates.HAS_SAP;
    public static final BooleanProperty IS_SAP_GENERABLE = ICBlockStates.IS_SAP_GENERABLE;

    public RubberLogBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(AXIS, Direction.Axis.Y)
                .setValue(HAS_SAP, false)
                .setValue(IS_SAP_GENERABLE, true));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(AXIS, context.getClickedFace().getAxis())
                .setValue(IS_SAP_GENERABLE, false);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder.add(HAS_SAP, IS_SAP_GENERABLE));
    }
}
