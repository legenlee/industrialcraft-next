package industrialcraft.client;

import industrialcraft.registry.ICBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class ICBlockRenderHandler {
    public static void setup() {
        final RenderType cutout = RenderType.cutout();
        final RenderType cutoutMipped = RenderType.cutoutMipped();
        final RenderType translucent = RenderType.translucent();

        ItemBlockRenderTypes.setRenderLayer(ICBlocks.RUBBER_LEAVES.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(ICBlocks.RUBBER_SAPLING.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(ICBlocks.RUBBER_DOOR.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(ICBlocks.RUBBER_TRAPDOOR.get(), cutout);
    }
}
