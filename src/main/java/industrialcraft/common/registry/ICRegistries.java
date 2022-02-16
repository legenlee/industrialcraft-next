package industrialcraft.common.registry;

import net.minecraftforge.eventbus.api.IEventBus;

public class ICRegistries {
    public static void init(final IEventBus bus) {
        ICBlocks.setup(bus);
        ICEntities.setup(bus);
        ICBlockItems.setup(bus);
        ICItems.setup(bus);
    }
}
