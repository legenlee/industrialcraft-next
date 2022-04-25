package industrialcraft.api.tier;

import java.util.Locale;

import net.minecraft.util.StringRepresentable;

public enum CableTier implements StringRepresentable {
    LV("lv"),
    MV("mv"),
    HV("hv"),
    EV("ev");

    private static final CableTier[] TIERS = values();

    private final String name;

    CableTier(String name) {
        this.name = name;
    }

    @Override
    public String getSerializedName() {
        return name.toLowerCase(Locale.ROOT);
    }
}
