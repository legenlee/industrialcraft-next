package industrialcraft.common.registries;

import net.minecraftforge.eventbus.api.IEventBus;

public class ICRegistries {
    public static void init(IEventBus bus) {
        ICBlocks.setup(bus);
        ICItems.setup(bus);
    }
}
