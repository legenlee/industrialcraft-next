package industrialcraft.datagen;

import java.util.function.Consumer;

import industrialcraft.common.registries.BlockRegistries;
import industrialcraft.common.registries.ItemRegistries;
import industrialcraft.common.tags.ICTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
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
        Smelting.build(consumer);
    }

    public static class Crafting {
        public static void build(Consumer<FinishedRecipe> consumer) {
            // @formatter:off
            planksFromLog(consumer, BlockRegistries.RUBBER_PLANKS.get(), ICTags.Items.RUBBER_LOGS);
            woodFromLogs(consumer, BlockRegistries.RUBBER_WOOD.get(), BlockRegistries.RUBBER_LOG.get());
            woodFromLogs(consumer, BlockRegistries.STRIPPED_RUBBER_WOOD.get(), BlockRegistries.STRIPPED_RUBBER_LOG.get());
            slabBuilder(BlockRegistries.RUBBER_SLAB.get(), Ingredient.of(BlockRegistries.RUBBER_PLANKS.get())).unlockedBy("has_rubber_planks", has(BlockRegistries.RUBBER_PLANKS.get())).group("wooden_slab").save(consumer);
            stairBuilder(BlockRegistries.RUBBER_STAIRS.get(), Ingredient.of(BlockRegistries.RUBBER_PLANKS.get())).unlockedBy("has_rubber_planks", has(BlockRegistries.RUBBER_PLANKS.get())).group("wooden_stairs").save(consumer);
            buttonBuilder(BlockRegistries.RUBBER_BUTTON.get(), Ingredient.of(BlockRegistries.RUBBER_PLANKS.get())).unlockedBy("has_rubber_planks", has(BlockRegistries.RUBBER_PLANKS.get())).group("wooden_button").save(consumer);
            pressurePlateBuilder(BlockRegistries.RUBBER_PRESSURE_PLATE.get(), Ingredient.of(BlockRegistries.RUBBER_PLANKS.get())).unlockedBy("has_rubber_planks", has(BlockRegistries.RUBBER_PLANKS.get())).group("wooden_pressure_plate").save(consumer);

            ShapedRecipeBuilder.shaped(ItemRegistries.TREETAP.get()).define('#', ItemTags.PLANKS).define('/', Tags.Items.RODS_WOODEN).define('*', Tags.Items.NUGGETS_IRON)
                .pattern(" / ")
                .pattern("##*")
                .pattern("#  ").unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer);
            // @formatter:on
        }
    }

    public static class Smelting {
        public static void build(Consumer<FinishedRecipe> consumer) {
            SimpleCookingRecipeBuilder
                    .smelting(Ingredient.of(ItemRegistries.SAP.get()), ItemRegistries.RUBBER.get(), 0.3f, 200)
                    .unlockedBy("has_sap", has(ItemRegistries.SAP.get())).save(consumer);
        }
    }

    @Override
    public String getName() {
        return "[IndustrialCraft-NEXT] Recipes";
    }
}
