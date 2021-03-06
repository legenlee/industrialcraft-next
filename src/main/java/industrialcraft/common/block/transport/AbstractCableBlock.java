package industrialcraft.common.block.transport;

import javax.annotation.Nonnull;

import industrialcraft.common.block.TransportBlock;
import industrialcraft.common.tier.CableTier;

public abstract class AbstractCableBlock extends TransportBlock {
    private final CableTier tier;

    protected AbstractCableBlock(CableTier tier) {
        this.tier = tier;
    }

    @Nonnull
    public boolean canDamageNearbyEntity() {
        return false;
    };
}
