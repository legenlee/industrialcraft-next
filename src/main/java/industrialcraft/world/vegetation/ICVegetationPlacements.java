package industrialcraft.world.vegetation;

import industrialcraft.IndustrialCraft;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ICVegetationPlacements {
    public static final Holder<PlacedFeature> TREES_RUBBER = PlacementUtils.register(
            IndustrialCraft.modPrefix("trees_rubber").toString(),
            ICVegetationFeatures.TREES_RUBBER,
            VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1f, 1)));
}
