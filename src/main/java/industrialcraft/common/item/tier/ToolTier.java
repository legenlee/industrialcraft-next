package industrialcraft.common.item.tier;

import java.util.List;

import industrialcraft.IndustrialCraft;
import industrialcraft.common.registry.ICItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

public class ToolTier {
    public static final Tier BRONZE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 224, 6.0f, 2.5f, 12,
                    BlockTags.createOptional(IndustrialCraft.getResourceLocation("needs_bronze_tool")),
                    () -> Ingredient.of(ICItems.BRONZE_INGOT.get())),
            IndustrialCraft.getResourceLocation("bronze"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1804, 8.0f, 3.0f, 12,
                    BlockTags.createOptional(IndustrialCraft.getResourceLocation("needs_steel_tool")),
                    () -> Ingredient.of(ICItems.STEEL_INGOT.get())),
            IndustrialCraft.getResourceLocation("steel"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
}
