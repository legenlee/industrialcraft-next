package industrialcraft.registry;

import industrialcraft.IndustrialCraft;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ICFeatures {
    private static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES,
            IndustrialCraft.MOD_ID);

    public static void setup(final IEventBus bus) {
        FEATURES.register(bus);
    }
}
