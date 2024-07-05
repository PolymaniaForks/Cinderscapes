package com.terraformersmc.cinderscapes.data;

import com.terraformersmc.cinderscapes.Cinderscapes;
import com.terraformersmc.cinderscapes.init.CinderscapesBlocks;
import com.terraformersmc.cinderscapes.init.CinderscapesItems;
import com.terraformersmc.cinderscapes.tag.CinderscapesItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CinderscapesRecipeProvider extends FabricRecipeProvider {
	protected CinderscapesRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	public void generate(RecipeExporter exporter) {
		// vanilla recipes
		ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.COMPARATOR, 1)
				.pattern(" T ")
				.pattern("TQT")
				.pattern("SSS")
				.input('T', Items.REDSTONE_TORCH)
				.input('Q', ConventionalItemTags.QUARTZ_GEMS)
				.input('S', Items.STONE)
				.criterion("has_quartz", InventoryChangedCriterion.Conditions.items(getItemTagPredicate(ConventionalItemTags.QUARTZ_GEMS)))
				.offerTo(exporter, Identifier.ofVanilla("comparator"));

		ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.DAYLIGHT_DETECTOR, 1)
				.pattern("GGG")
				.pattern("QQQ")
				.pattern("WWW")
				.input('G', Items.GLASS)
				.input('Q', ConventionalItemTags.QUARTZ_GEMS)
				.input('W', ItemTags.WOODEN_SLABS)
				.criterion("has_quartz", InventoryChangedCriterion.Conditions.items(getItemTagPredicate(ConventionalItemTags.QUARTZ_GEMS)))
				.offerTo(exporter, Identifier.ofVanilla("daylight_detector"));

		ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.OBSERVER, 1)
				.pattern("CCC")
				.pattern("RRQ")
				.pattern("CCC")
				.input('C', Items.COBBLESTONE)
				.input('Q', ConventionalItemTags.QUARTZ_GEMS)
				.input('R', Items.REDSTONE)
				.criterion("has_quartz", InventoryChangedCriterion.Conditions.items(getItemTagPredicate(ConventionalItemTags.QUARTZ_GEMS)))
				.offerTo(exporter, Identifier.ofVanilla("observer"));


		// misc. recipes
		ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, CinderscapesBlocks.ASH, 6)
				.pattern("AAA")
				.input('A', CinderscapesBlocks.ASH_BLOCK)
				.criterion("has_ash_blocks", InventoryChangedCriterion.Conditions.items(CinderscapesBlocks.ASH_BLOCK))
				.offerTo(exporter);

		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.ASH_BLOCK, 1)
				.pattern("aa")
				.pattern("aa")
				.input('a', CinderscapesItems.ASH_PILE)
				.criterion("has_ash_piles", InventoryChangedCriterion.Conditions.items(CinderscapesItems.ASH_PILE))
				.offerTo(exporter);

		ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GUNPOWDER, 1)
				.input(CinderscapesItemTags.SULFURS)
				.input(ItemTags.COALS)
				.input(Items.BONE_MEAL)
				.criterion("has_sulfurs", InventoryChangedCriterion.Conditions.items(getItemTagPredicate(CinderscapesItemTags.SULFURS)))
				.offerTo(exporter);

		offerReversibleCompactingRecipes(exporter,
				RecipeCategory.MISC, CinderscapesItems.SULFUR,
				RecipeCategory.BUILDING_BLOCKS,
				CinderscapesBlocks.SULFUR_BLOCK);

		offerBlasting(exporter,
				List.of(CinderscapesItems.SULFUR_ORE),
				RecipeCategory.MISC,
				CinderscapesItems.SULFUR,
				0.1f, 100, "blasting");

		offerSmelting(exporter,
				List.of(CinderscapesItems.SULFUR_ORE),
				RecipeCategory.MISC,
				CinderscapesItems.SULFUR,
				0.1f, 200, "smelting");


		// quartz recipes
		offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.CHISELED_ROSE_QUARTZ_BLOCK, CinderscapesBlocks.ROSE_QUARTZ_BLOCK);
		offerSmelting(exporter, List.of(CinderscapesBlocks.ROSE_QUARTZ_ORE), RecipeCategory.MISC, CinderscapesItems.ROSE_QUARTZ, 0.2f, 200, "misc");
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.ROSE_QUARTZ_BLOCK, 1)
				.pattern("qq")
				.pattern("qq")
				.input('q', CinderscapesItems.ROSE_QUARTZ)
				.criterion("has_quartz", InventoryChangedCriterion.Conditions.items(CinderscapesItems.ROSE_QUARTZ))
				.offerTo(exporter);
		offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.ROSE_QUARTZ_BRICKS, CinderscapesBlocks.ROSE_QUARTZ_BLOCK);
		offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.ROSE_QUARTZ_BRICKS, CinderscapesBlocks.ROSE_QUARTZ_BLOCK);
		offerBlasting(exporter, List.of(CinderscapesBlocks.ROSE_QUARTZ_ORE), RecipeCategory.MISC, CinderscapesItems.ROSE_QUARTZ, 0.2f, 100, "misc");
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.ROSE_QUARTZ_PILLAR, 2)
				.pattern("Q")
				.pattern("Q")
				.input('Q', CinderscapesBlocks.ROSE_QUARTZ_BLOCK)
				.criterion("has_quartz_blocks", InventoryChangedCriterion.Conditions.items(CinderscapesBlocks.ROSE_QUARTZ_BLOCK))
				.offerTo(exporter);
		offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.ROSE_QUARTZ_PILLAR, CinderscapesBlocks.ROSE_QUARTZ_BLOCK);

		offerSmelting(exporter, List.of(CinderscapesBlocks.ROSE_QUARTZ_BLOCK), RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.SMOOTH_ROSE_QUARTZ, 0.1f, 200, "building_blocks");

		offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.CHISELED_SMOKY_QUARTZ_BLOCK, CinderscapesBlocks.SMOKY_QUARTZ_BLOCK);
		offerSmelting(exporter, List.of(CinderscapesBlocks.SMOKY_QUARTZ_ORE), RecipeCategory.MISC, CinderscapesItems.SMOKY_QUARTZ, 0.2f, 200, "misc");
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.SMOKY_QUARTZ_BLOCK, 1)
				.pattern("qq")
				.pattern("qq")
				.input('q', CinderscapesItems.SMOKY_QUARTZ)
				.criterion("has_quartz", InventoryChangedCriterion.Conditions.items(CinderscapesItems.SMOKY_QUARTZ))
				.offerTo(exporter);
		offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.SMOKY_QUARTZ_BRICKS, CinderscapesBlocks.SMOKY_QUARTZ_BLOCK);
		offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.SMOKY_QUARTZ_BRICKS, CinderscapesBlocks.SMOKY_QUARTZ_BLOCK);
		offerBlasting(exporter, List.of(CinderscapesBlocks.SMOKY_QUARTZ_ORE), RecipeCategory.MISC, CinderscapesItems.SMOKY_QUARTZ, 0.2f, 100, "misc");
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.SMOKY_QUARTZ_PILLAR, 2)
				.pattern("Q")
				.pattern("Q")
				.input('Q', CinderscapesBlocks.SMOKY_QUARTZ_BLOCK)
				.criterion("has_quartz_blocks", InventoryChangedCriterion.Conditions.items(CinderscapesBlocks.SMOKY_QUARTZ_BLOCK))
				.offerTo(exporter);
		offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.SMOKY_QUARTZ_PILLAR, CinderscapesBlocks.SMOKY_QUARTZ_BLOCK);
		offerSmelting(exporter, List.of(CinderscapesBlocks.SMOKY_QUARTZ_BLOCK), RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.SMOOTH_SMOKY_QUARTZ, 0.1f, 200, "building_blocks");


		offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.CHISELED_SULFUR_QUARTZ_BLOCK, CinderscapesBlocks.SULFUR_QUARTZ_BLOCK);
		offerSmelting(exporter, List.of(CinderscapesBlocks.SULFUR_QUARTZ_ORE), RecipeCategory.MISC, CinderscapesItems.SULFUR_QUARTZ, 0.2f, 200, "misc");
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.SULFUR_QUARTZ_BLOCK, 1)
				.pattern("qq")
				.pattern("qq")
				.input('q', CinderscapesItems.SULFUR_QUARTZ)
				.criterion("has_quartz", InventoryChangedCriterion.Conditions.items(CinderscapesItems.SULFUR_QUARTZ))
				.offerTo(exporter);
		offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.SULFUR_QUARTZ_BRICKS, CinderscapesBlocks.SULFUR_QUARTZ_BLOCK);
		offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.SULFUR_QUARTZ_BRICKS, CinderscapesBlocks.SULFUR_QUARTZ_BLOCK);
		offerBlasting(exporter, List.of(CinderscapesBlocks.SULFUR_QUARTZ_ORE), RecipeCategory.MISC, CinderscapesItems.SULFUR_QUARTZ, 0.2f, 100, "misc");
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.SULFUR_QUARTZ_PILLAR, 2)
				.pattern("Q")
				.pattern("Q")
				.input('Q', CinderscapesBlocks.SULFUR_QUARTZ_BLOCK)
				.criterion("has_quartz_blocks", InventoryChangedCriterion.Conditions.items(CinderscapesBlocks.SULFUR_QUARTZ_BLOCK))
				.offerTo(exporter);
		offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.SULFUR_QUARTZ_PILLAR, CinderscapesBlocks.SULFUR_QUARTZ_BLOCK);

		offerSmelting(exporter, List.of(CinderscapesBlocks.SULFUR_QUARTZ_BLOCK), RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.SMOOTH_SULFUR_QUARTZ, 0.1f, 200, "building_blocks");


		// wood recipes
		ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WARPED_PLANKS, 4)
				.input(CinderscapesItemTags.UMBRAL_STEMS)
				.group("planks")
				.criterion("has_logs", conditionsFromTag(CinderscapesItemTags.UMBRAL_STEMS))
				.offerTo(exporter, "cinderscapes:umbral_planks");

		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.STRIPPED_SCORCHED_HYPHAE, 3)
				.group("bark")
				.pattern("LL")
				.pattern("LL")
				.input('L', CinderscapesBlocks.STRIPPED_SCORCHED_STEM)
				.criterion("has_logs", InventoryChangedCriterion.Conditions.items(CinderscapesBlocks.STRIPPED_SCORCHED_STEM))
				.offerTo(exporter);

		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.UMBRAL_HYPHAE, 3)
				.group("bark")
				.pattern("LL")
				.pattern("LL")
				.input('L', CinderscapesBlocks.UMBRAL_STEM)
				.criterion("has_logs", InventoryChangedCriterion.Conditions.items(CinderscapesBlocks.UMBRAL_STEM))
				.offerTo(exporter);

		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CinderscapesBlocks.STRIPPED_UMBRAL_HYPHAE, 3)
				.group("bark")
				.pattern("LL")
				.pattern("LL")
				.input('L', CinderscapesBlocks.STRIPPED_UMBRAL_STEM)
				.criterion("has_logs", InventoryChangedCriterion.Conditions.items(CinderscapesBlocks.STRIPPED_UMBRAL_STEM))
				.offerTo(exporter);
	}

	// Returns an ItemPredicate matching any item in the provided ItemTag key.
	private static ItemPredicate getItemTagPredicate(TagKey<Item> itemTagKey) {
		return ItemPredicate.Builder.create().tag(itemTagKey).build();
	}

	@Override
	protected Identifier getRecipeIdentifier(Identifier identifier) {
		return Identifier.of(Cinderscapes.MOD_ID, identifier.getPath());
	}
}
