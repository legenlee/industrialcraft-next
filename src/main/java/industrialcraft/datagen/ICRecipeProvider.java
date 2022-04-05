package industrialcraft.datagen;

import java.util.function.Consumer;

import industrialcraft.registry.ICBlocks;
import industrialcraft.registry.ICItems;
import industrialcraft.tag.ICItemTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

public class ICRecipeProvider extends RecipeProvider {
    public ICRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        Crafting.build(consumer);
    }

    public static class Crafting {
        public static void build(Consumer<FinishedRecipe> consumer) {
            // @formatter:off
            planksFromLog(consumer, ICBlocks.RUBBER_PLANKS.get(), ICItemTags.RUBBER_LOGS);
            woodFromLogs(consumer, ICBlocks.RUBBER_WOOD.get(), ICBlocks.RUBBER_LOG.get());
            woodFromLogs(consumer, ICBlocks.STRIPPED_RUBBER_WOOD.get(), ICBlocks.STRIPPED_RUBBER_LOG.get());
            slabBuilder(ICBlocks.RUBBER_SLAB.get(), Ingredient.of(ICBlocks.RUBBER_PLANKS.get())).unlockedBy("has_rubber_planks", has(ICBlocks.RUBBER_PLANKS.get())).group("wooden_slab").save(consumer);
            stairBuilder(ICBlocks.RUBBER_STAIRS.get(), Ingredient.of(ICBlocks.RUBBER_PLANKS.get())).unlockedBy("has_rubber_planks", has(ICBlocks.RUBBER_PLANKS.get())).group("wooden_stairs").save(consumer);
            buttonBuilder(ICBlocks.RUBBER_BUTTON.get(), Ingredient.of(ICBlocks.RUBBER_PLANKS.get())).unlockedBy("has_rubber_planks", has(ICBlocks.RUBBER_PLANKS.get())).group("wooden_button").save(consumer);
            pressurePlateBuilder(ICBlocks.RUBBER_PRESSURE_PLATE.get(), Ingredient.of(ICBlocks.RUBBER_PLANKS.get())).unlockedBy("has_rubber_planks", has(ICBlocks.RUBBER_PLANKS.get())).group("wooden_pressure_plate").save(consumer);

            ShapedRecipeBuilder.shaped(ICItems.TREETAP.get()).define('#', ItemTags.PLANKS).define('/', Tags.Items.RODS_WOODEN)
                .pattern(" / ")
                .pattern("###")
                .pattern("#  ").unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer);
            // @formatter:on
        }
    }

    @Override
    public String getName() {
        return "[IndustrialCraft-NEXT] Recipes";
    }
}
