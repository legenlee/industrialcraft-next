package industrialcraft.common.tier;

import industrialcraft.api.tier.BaseTier;

public enum CableTier {
    TIN(BaseTier.LV, 0.2f),
    COPPER(BaseTier.MV, 0.2f),
    GOLD(BaseTier.HV, 0.4f),
    IRON(BaseTier.EV, 0.8f),
    FIBRE(BaseTier.IV, 0.025f);

    private final BaseTier tier;
    private final float loseRate;

    CableTier(BaseTier tier, float loseRate) {
        this.tier = tier;
        this.loseRate = loseRate;
    }

    public BaseTier getBaseTier() {
        return tier;
    }

    public float getLoseRate() {
        return loseRate;
    }
}
