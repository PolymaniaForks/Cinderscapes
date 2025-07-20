package com.terraformersmc.cinderscapes.data;

import com.terraformersmc.cinderscapes.init.CinderscapesBlocks;
import com.terraformersmc.cinderscapes.tag.CinderscapesBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class CinderscapesBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	protected CinderscapesBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	public void configure(RegistryWrapper.WrapperLookup registries) {
		/*
		 * Basic block tags
		 */
		valueLookupBuilder(BlockTags.ENDERMAN_HOLDABLE)
				.add(CinderscapesBlocks.NODZOL)
				.add(CinderscapesBlocks.UMBRAL_FUNGUS)
				.add(CinderscapesBlocks.UMBRAL_NYLIUM);

        valueLookupBuilder(BlockTags.FLOWER_POTS)
				.add(CinderscapesBlocks.POTTED_CRYSTINIUM)
				.add(CinderscapesBlocks.POTTED_LUMINOUS_POD)
				.add(CinderscapesBlocks.POTTED_PHOTOFERN)
				.add(CinderscapesBlocks.POTTED_PYRACINTH)
				.add(CinderscapesBlocks.POTTED_SCORCHED_SHRUB)
				.add(CinderscapesBlocks.POTTED_SCORCHED_TENDRILS)
				.add(CinderscapesBlocks.POTTED_TWILIGHT_TENDRILS)
				.add(CinderscapesBlocks.POTTED_UMBRAL_FUNGUS);

		valueLookupBuilder(BlockTags.INSIDE_STEP_SOUND_BLOCKS)
				.add(CinderscapesBlocks.ASH)
				.add(CinderscapesBlocks.SCORCHED_SPROUTS)
				.add(CinderscapesBlocks.SCORCHED_TENDRILS)
				.add(CinderscapesBlocks.TWILIGHT_FESCUES)
				.add(CinderscapesBlocks.TWILIGHT_TENDRILS);

		valueLookupBuilder(BlockTags.LOGS)
				.add(CinderscapesBlocks.SCORCHED_HYPHAE)
				.add(CinderscapesBlocks.SCORCHED_STEM)
				.add(CinderscapesBlocks.STRIPPED_SCORCHED_HYPHAE)
				.add(CinderscapesBlocks.STRIPPED_SCORCHED_STEM)
				.add(CinderscapesBlocks.STRIPPED_UMBRAL_HYPHAE)
				.add(CinderscapesBlocks.STRIPPED_UMBRAL_STEM)
				.add(CinderscapesBlocks.UMBRAL_HYPHAE)
				.add(CinderscapesBlocks.UMBRAL_STEM);

		valueLookupBuilder(BlockTags.MUSHROOM_GROW_BLOCK)
				.add(CinderscapesBlocks.NODZOL);

		valueLookupBuilder(BlockTags.NETHER_CARVER_REPLACEABLES)
				.add(CinderscapesBlocks.UMBRAL_NYLIUM)
				.add(CinderscapesBlocks.UMBRAL_WART_BLOCK);

		valueLookupBuilder(BlockTags.NYLIUM)
				.add(CinderscapesBlocks.UMBRAL_NYLIUM);

        valueLookupBuilder(BlockTags.SMALL_FLOWERS)
				.add(CinderscapesBlocks.CRYSTINIUM)
				.add(CinderscapesBlocks.PYRACINTH)
				.add(CinderscapesBlocks.SCORCHED_TENDRILS)
				.add(CinderscapesBlocks.TWILIGHT_TENDRILS);

        valueLookupBuilder(BlockTags.WART_BLOCKS)
				.add(CinderscapesBlocks.UMBRAL_WART_BLOCK);

		// tool block tags
        valueLookupBuilder(BlockTags.AXE_MINEABLE)
				.add(CinderscapesBlocks.SCORCHED_HYPHAE)
				.add(CinderscapesBlocks.SCORCHED_STEM)
				.add(CinderscapesBlocks.STRIPPED_SCORCHED_HYPHAE)
				.add(CinderscapesBlocks.STRIPPED_SCORCHED_STEM)
				.add(CinderscapesBlocks.STRIPPED_UMBRAL_HYPHAE)
				.add(CinderscapesBlocks.STRIPPED_UMBRAL_STEM)
				.add(CinderscapesBlocks.TWILIGHT_VINE_BLOCK)
				.add(CinderscapesBlocks.UMBRAL_FUNGUS)
				.add(CinderscapesBlocks.UMBRAL_HYPHAE)
				.add(CinderscapesBlocks.UMBRAL_STEM);

		valueLookupBuilder(BlockTags.HOE_MINEABLE)
				.add(CinderscapesBlocks.UMBRAL_FLESH_BLOCK)
				.add(CinderscapesBlocks.UMBRAL_WART_BLOCK);

		valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
				.add(CinderscapesBlocks.CHISELED_ROSE_QUARTZ_BLOCK)
				.add(CinderscapesBlocks.CHISELED_SMOKY_QUARTZ_BLOCK)
				.add(CinderscapesBlocks.CHISELED_SULFUR_QUARTZ_BLOCK)
				.add(CinderscapesBlocks.CRYSTALLINE_QUARTZ)
				.add(CinderscapesBlocks.CRYSTALLINE_ROSE_QUARTZ)
				.add(CinderscapesBlocks.CRYSTALLINE_SMOKY_QUARTZ)
				.add(CinderscapesBlocks.CRYSTALLINE_SULFUR_QUARTZ)
				.add(CinderscapesBlocks.NODZOL)
				.add(CinderscapesBlocks.ROSE_QUARTZ_BLOCK)
				.add(CinderscapesBlocks.ROSE_QUARTZ_BRICKS)
				.add(CinderscapesBlocks.ROSE_QUARTZ_ORE)
				.add(CinderscapesBlocks.ROSE_QUARTZ_PILLAR)
				.add(CinderscapesBlocks.SMOKY_QUARTZ_BLOCK)
				.add(CinderscapesBlocks.SMOKY_QUARTZ_BRICKS)
				.add(CinderscapesBlocks.SMOKY_QUARTZ_ORE)
				.add(CinderscapesBlocks.SMOKY_QUARTZ_PILLAR)
				.add(CinderscapesBlocks.SMOOTH_ROSE_QUARTZ)
				.add(CinderscapesBlocks.SMOOTH_SMOKY_QUARTZ)
				.add(CinderscapesBlocks.SMOOTH_SULFUR_QUARTZ)
				.add(CinderscapesBlocks.SULFUR_ORE)
				.add(CinderscapesBlocks.SULFUR_QUARTZ_BLOCK)
				.add(CinderscapesBlocks.SULFUR_QUARTZ_BRICKS)
				.add(CinderscapesBlocks.SULFUR_QUARTZ_ORE)
				.add(CinderscapesBlocks.SULFUR_QUARTZ_PILLAR)
				.add(CinderscapesBlocks.UMBRAL_NYLIUM);

		valueLookupBuilder(BlockTags.SHOVEL_MINEABLE)
				.add(CinderscapesBlocks.ASH)
				.add(CinderscapesBlocks.ASH_BLOCK);


		/*
		 * Conventional block tags
		 */
		valueLookupBuilder(ConventionalBlockTags.ORES)
				.add(CinderscapesBlocks.SULFUR_ORE);

		valueLookupBuilder(ConventionalBlockTags.QUARTZ_ORES)
				.add(CinderscapesBlocks.ROSE_QUARTZ_ORE)
				.add(CinderscapesBlocks.SMOKY_QUARTZ_ORE)
				.add(CinderscapesBlocks.SULFUR_QUARTZ_ORE);

		valueLookupBuilder(ConventionalBlockTags.STRIPPED_LOGS)
				.add(CinderscapesBlocks.STRIPPED_SCORCHED_STEM)
				.add(CinderscapesBlocks.STRIPPED_UMBRAL_STEM);

		valueLookupBuilder(ConventionalBlockTags.STRIPPED_WOODS)
				.add(CinderscapesBlocks.STRIPPED_SCORCHED_HYPHAE)
				.add(CinderscapesBlocks.STRIPPED_UMBRAL_HYPHAE);


		/*
		 * Local block tags
		 */
		valueLookupBuilder(CinderscapesBlockTags.ASH_PERMEABLE)
				.addTag(BlockTags.NYLIUM)
				.add(CinderscapesBlocks.ASH)
				.add(CinderscapesBlocks.ASH_BLOCK)
				.add(Blocks.BASALT)
				.add(Blocks.BEDROCK)
				.add(Blocks.BLACKSTONE)
				.add(Blocks.GLOWSTONE)
				.add(Blocks.GRAVEL)
				.add(Blocks.LAVA)
				.add(Blocks.NETHERRACK)
				.add(CinderscapesBlocks.NODZOL)
				.add(Blocks.SOUL_SAND)
				.add(Blocks.SOUL_SOIL);

		valueLookupBuilder(CinderscapesBlockTags.SCORCHED_STEMS)
				.add(CinderscapesBlocks.SCORCHED_HYPHAE)
				.add(CinderscapesBlocks.SCORCHED_STEM)
				.add(CinderscapesBlocks.STRIPPED_SCORCHED_HYPHAE)
				.add(CinderscapesBlocks.STRIPPED_SCORCHED_STEM);

		valueLookupBuilder(CinderscapesBlockTags.UMBRAL_STEMS)
				.add(CinderscapesBlocks.UMBRAL_HYPHAE)
				.add(CinderscapesBlocks.UMBRAL_STEM)
				.add(CinderscapesBlocks.STRIPPED_UMBRAL_HYPHAE)
				.add(CinderscapesBlocks.STRIPPED_UMBRAL_STEM);
	}

	@Override
	public String getName() {
		return "Cinderscapes Block Tags";
	}
}
