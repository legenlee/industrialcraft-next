package industrialcraft.client;

import industrialcraft.common.registries.BlockRegistries;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class BlockRenderHandler {
    public static void setup() {
        final RenderType cutout = RenderType.cutout();
        final RenderType cutoutMipped = RenderType.cutoutMipped();
        final RenderType translucent = RenderType.translucent();

        ItemBlockRenderTypes.setRenderLayer(BlockRegistries.RUBBER_LEAVES.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(BlockRegistries.RUBBER_SAPLING.get(), cutout);
        // ItemBlockRenderTypes.setRenderLayer(ICBlocks.RUBBER_DOOR.get(), cutout);
        // ItemBlockRenderTypes.setRenderLayer(ICBlocks.RUBBER_TRAPDOOR.get(), cutout);
    }
}
