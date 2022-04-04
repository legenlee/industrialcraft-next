package industrialcraft.block.rubber;

import javax.annotation.Nullable;

import industrialcraft.block.ICProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder.Direct;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;

public class RubberLogBlock extends RotatedPillarBlock {
    public static final DirectionProperty SAP_FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty HAS_SAP = ICProperties.HAS_SAP;
    public static final BooleanProperty IS_SAP_GENERABLE = ICProperties.IS_SAP_GENERABLE;

    public RubberLogBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(SAP_FACING, Direction.NORTH)
                .setValue(AXIS, Direction.Axis.Y)
                .setValue(HAS_SAP, false)
                .setValue(IS_SAP_GENERABLE, true));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(SAP_FACING, Direction.NORTH)
                .setValue(AXIS, context.getClickedFace().getAxis())
                .setValue(IS_SAP_GENERABLE, false);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder.add(SAP_FACING, HAS_SAP, IS_SAP_GENERABLE));
    }

    // @Override
    // public InteractionResult use(BlockState state, Level level, BlockPos pos,
    // Player player, InteractionHand hand,
    // BlockHitResult hit) {
    // return InteractionResult.PASS;
    // }
}
