package industrialcraft.client;

import industrialcraft.common.registry.ICBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class BlockRenderHandler {
    public static void setup() {
        final RenderType CUTOUT = RenderType.cutout();
        final RenderType CUTOUT_MIPPED = RenderType.cutoutMipped();
        final RenderType TRANSLUCENT = RenderType.translucent();

        ItemBlockRenderTypes.setRenderLayer(ICBlocks.RUBBER_LEAVES.get(), CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(ICBlocks.RUBBER_SAPLING.get(), CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ICBlocks.RUBBER_DOOR.get(), CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ICBlocks.RUBBER_TRAPDOOR.get(), CUTOUT);
    }
}
