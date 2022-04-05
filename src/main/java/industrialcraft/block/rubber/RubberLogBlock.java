package industrialcraft.block.rubber;

import javax.annotation.Nullable;

import industrialcraft.block.ICProperties;
import industrialcraft.registry.ICBlocks;
import industrialcraft.registry.ICItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;

public class RubberLogBlock extends RotatedPillarBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty HAS_SAP = ICProperties.HAS_SAP;
    public static final BooleanProperty CAN_CREATE_SAP = ICProperties.CAN_CREATE_SAP;

    public RubberLogBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(FACING, Direction.NORTH)
                .setValue(AXIS, Direction.Axis.Y)
                .setValue(HAS_SAP, false)
                .setValue(CAN_CREATE_SAP, true));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return super.getStateForPlacement(context).setValue(CAN_CREATE_SAP, false);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder.add(FACING, HAS_SAP, CAN_CREATE_SAP));
    }

    public static boolean canExtractSap(BlockState state, Direction direction) {
        if (state.is(ICBlocks.RUBBER_LOG.get())) {
            if (state.hasProperty(HAS_SAP) && state.getValue(HAS_SAP)) {
                if (state.hasProperty(FACING) && state.getValue(FACING) == direction) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand,
            BlockHitResult result) {
        boolean flag = state.getValue(HAS_SAP);
        Direction direction = state.getValue(FACING);

        if (!flag) {
            return InteractionResult.PASS;
        } else {
            if (player.getItemInHand(hand).is(ICItems.TREETAP.get()) && result.getDirection() == direction) {
                int dropStack = 1 + level.random.nextInt(2);
                popResource(level, pos, new ItemStack(ICItems.SAP.get(), dropStack));
                level.setBlock(pos, state.setValue(ICProperties.HAS_SAP, Boolean.valueOf(false)), 2);

                if (player != null) {
                    player.getItemInHand(hand).hurtAndBreak(1, player, (target) -> {
                        target.broadcastBreakEvent(hand);
                    });
                }

                return InteractionResult.sidedSuccess(level.isClientSide);
            }

            return InteractionResult.PASS;
        }
    }
}
