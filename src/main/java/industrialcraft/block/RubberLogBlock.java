package industrialcraft.block;

import javax.annotation.Nullable;

import industrialcraft.block.properties.ICBlockStateProperties;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class RubberLogBlock extends RotatedPillarBlock {
    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
    public static final BooleanProperty HAS_SAP = ICBlockStateProperties.HAS_SAP;
    public static final BooleanProperty CAN_MAKE_SAP = ICBlockStateProperties.CAN_MAKE_SAP;

    public RubberLogBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(AXIS, Direction.Axis.Y)
                .setValue(HAS_SAP, false)
                .setValue(CAN_MAKE_SAP, false));
    }

    // @Nullable
    // @Override
    // public BlockState getStateForPlacement(BlockPlaceContext context) {
    // return this.defaultBlockState();
    // }
}
