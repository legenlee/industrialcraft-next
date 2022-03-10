package industrialcraft.util;

import industrialcraft.IndustrialCraft;
import net.minecraft.resources.ResourceLocation;

public class LocationUtil {
    public static ResourceLocation getModLocation(String name) {
        return new ResourceLocation(IndustrialCraft.MOD_ID, name);
    }

    public static ResourceLocation getForgeLocation(String name) {
        return new ResourceLocation("forge", name);
    }

    public static ResourceLocation getVanillaLocation(String name) {
        return new ResourceLocation("minecraft", name);
    }
}
