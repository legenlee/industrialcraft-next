package industrialcraft.common.world;

import java.util.List;
import java.util.Set;

import industrialcraft.IndustrialCraft;
import industrialcraft.common.world.vegetation.ICVegetationPlacements;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biome.BiomeCategory;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = IndustrialCraft.MOD_ID)
public class WorldEventHandler {
    private static void addTreeGeneration(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(Decoration.VEGETAL_DECORATION);

            base.add(ICVegetationPlacements.TREES_RUBBER);
        }
    }

    private static void addOreGeneration(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(Decoration.UNDERGROUND_ORES);
        // TODO Write place features refs ore generation
    }

    @SubscribeEvent
    public static void onBiomeLoading(final BiomeLoadingEvent event) {
        addTreeGeneration(event);
        addOreGeneration(event);
    }
}
