package industrialcraft.api.tier;

import net.minecraft.util.StringRepresentable;

public enum BaseTier implements StringRepresentable {
    LV("LV", 32),
    MV("MV", 128),
    HV("HV", 512),
    EV("EV", 2048),
    IV("IV", 8192);

    private static final BaseTier[] TIERS = values();

    private final String name;
    private final int maxCapacity;

    BaseTier(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String getSerializedName() {
        return name.toLowerCase();
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
