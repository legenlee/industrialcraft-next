package industrialcraft.common.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public abstract class TransportBlock extends ICBlock {
    protected TransportBlock() {
        super(BlockBehaviour.Properties.of(Material.PISTON).strength(1, 6));
    }
}
