package industrialcraft.common.tier;

public enum CableTier {
    TIN(32),
    COPPER(128),
    GOLD(512),
    IRON(2048),
    FIBRE(8192);

    private final long maxCapacity;

    CableTier(long maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    private static final CableTier[] TIERS = values();

    public long getMaxCapacity() {
        return maxCapacity;
    }
}
