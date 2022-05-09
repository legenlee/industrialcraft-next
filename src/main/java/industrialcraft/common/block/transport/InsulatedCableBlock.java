package industrialcraft.common.block.transport;

import industrialcraft.common.tier.CableTier;

public class InsulatedCableBlock extends AbstractCableBlock {
    public InsulatedCableBlock(CableTier tier) {
        super(tier);
    }

    @Override
    public boolean canDamageNearbyEntity() {
        return false;
    }
}
