package industrialcraft.api.tier;

import java.util.Locale;

import net.minecraft.util.StringRepresentable;

public enum BaseTier implements StringRepresentable {
    LV("LV"),
    MV("MV"),
    HV("HV"),
    EV("EV");

    private static final BaseTier[] TIERS = values();

    private final String name;

    BaseTier(String name) {
        this.name = name;
    }

    @Override
    public String getSerializedName() {
        return name.toLowerCase(Locale.ROOT);
    }
}
