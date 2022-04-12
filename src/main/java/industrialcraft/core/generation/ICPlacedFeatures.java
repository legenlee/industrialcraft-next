package industrialcraft.core.generation;

import industrialcraft.IndustrialCraft;
import industrialcraft.core.registry.ICBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ICPlacedFeatures {
    public static class Ores {
    }

    public static class Vegetations {
        public static final Holder<PlacedFeature> RUBBER_CHECKED = PlacementUtils.register(
                IndustrialCraft.modPrefix("rubber_checked").toString(), ICConfiguredFeatures.Vegetations.RUBBER_TREE,
                PlacementUtils.filteredByBlockSurvival(ICBlocks.RUBBER_SAPLING.get()));
    }

}
