package org.paultherandom.voidechoes.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import org.paultherandom.voidechoes.item.ModItems;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SHADOW_SEAL, 1)
                .pattern("BEB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', Items.AMETHYST_SHARD)
                .input('E', Items.ENDER_EYE)
                .input('B', Items.POLISHED_DEEPSLATE)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .criterion(hasItem(Items.ENDER_EYE), conditionsFromItem(Items.ENDER_EYE))
                .criterion(hasItem(Items.POLISHED_DEEPSLATE), conditionsFromItem(Items.POLISHED_DEEPSLATE))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.SHADOW_SEAL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SHADOW_EXTRACTOR, 1)
                .pattern(" O ")
                .pattern("NSN")
                .pattern(" D ")
                .input('D', Items.DIAMOND)
                .input('O', ModItems.OMINOUS_MOLD)
                .input('S', Items.SCULK_CATALYST)
                .input('N', Items.NETHERITE_SCRAP)
                .criterion(hasItem(ModItems.SHADOW_FABRIC), conditionsFromItem(ModItems.SHADOW_FABRIC))
                .criterion(hasItem(ModItems.OMINOUS_MOLD), conditionsFromItem(ModItems.OMINOUS_MOLD))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.SHADOW_EXTRACTOR)));
    }
}
