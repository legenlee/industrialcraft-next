package industrialcraft.common.block.transport;

import javax.annotation.Nonnull;

import industrialcraft.common.block.TransportBlock;
import industrialcraft.common.tier.CableTier;

public abstract class AbstractCableTier extends TransportBlock {
    private final CableTier tier;

    protected AbstractCableTier(CableTier tier) {
        this.tier = tier;
    }

    @Nonnull
    public boolean canDamageNearbyEntity() {
        return false;
    };
}
