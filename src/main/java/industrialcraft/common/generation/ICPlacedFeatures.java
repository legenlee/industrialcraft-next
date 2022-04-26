package industrialcraft.common.generation;

import industrialcraft.IndustrialCraft;
import industrialcraft.common.registries.BlockRegistries;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ICPlacedFeatures {
    public static class Ores {
    }

    public static class Vegetations {
        public static final Holder<PlacedFeature> RUBBER_CHECKED = PlacementUtils.register(
                IndustrialCraft.modPrefix("rubber_checked").toString(), ICConfiguredFeatures.Vegetations.RUBBER_TREE,
                PlacementUtils.filteredByBlockSurvival(BlockRegistries.RUBBER_SAPLING.get()));
    }

}
