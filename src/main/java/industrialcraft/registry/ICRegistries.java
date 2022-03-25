package industrialcraft.registry;

import net.minecraftforge.eventbus.api.IEventBus;

public class ICRegistries {
    public static void init(final IEventBus bus) {
        ICSoundEvents.setup(bus);
        ICBlocks.setup(bus);
        ICBlockItems.setup(bus);
        ICItems.setup(bus);
        ICEntities.setup(bus);
        ICFeatures.setup(bus);
    }
}
