package industrialcraft.common.util;

import industrialcraft.common.item.tool.WrenchItem;
import industrialcraft.common.tags.ICTags;
import net.minecraft.world.item.ItemStack;

public final class ICUtils {
    public static boolean isWrenchItem(ItemStack stack) {
        if (stack.isEmpty()) {
            return false;
        } else if (stack.getItem() instanceof WrenchItem) {
            return true;
        } else {
            return stack.is(ICTags.Items.TOOLS_WRENCH);
        }
    }
}
