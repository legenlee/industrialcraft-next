package industrialcraft.core.item;

import java.util.List;

import industrialcraft.IndustrialCraft;
import industrialcraft.core.registry.ICItems;
import industrialcraft.core.ICTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

public class ICToolTier {
    public static final Tier BRONZE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 224, 6.0f, 2.5f, 12,
                    ICTags.Blocks.NEEDS_BRONZE_TOOL,
                    () -> Ingredient.of(ICItems.BRONZE_INGOT.get())),
            IndustrialCraft.modPrefix("bronze"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1804, 8.0f, 3.0f, 12,
                    ICTags.Blocks.NEEDS_STEEL_TOOL,
                    () -> Ingredient.of(ICItems.STEEL_INGOT.get())),
            IndustrialCraft.modPrefix("steel"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
}
