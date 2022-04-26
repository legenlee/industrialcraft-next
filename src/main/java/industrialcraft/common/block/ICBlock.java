package industrialcraft.common.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public abstract class ICBlock extends Block {
    protected ICBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }
}
