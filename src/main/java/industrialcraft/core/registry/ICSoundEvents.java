package industrialcraft.core.registry;

import industrialcraft.IndustrialCraft;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ICSoundEvents {
    protected static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister
            .create(ForgeRegistries.SOUND_EVENTS, IndustrialCraft.MOD_ID);

    // @formatter:off
    public static final RegistryObject<SoundEvent> MUSIC_DISC_YOUR_EVERYDAY_HAPPYCORE = register("music_disc.your_everyday_happycore");

    // @formatter:on
    private static final RegistryObject<SoundEvent> register(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(IndustrialCraft.modPrefix(name)));
    }

    public static void setup(final IEventBus bus) {
        SOUND_EVENTS.register(bus);
    }
}
