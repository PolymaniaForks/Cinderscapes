package com.terraformersmc.cinderscapes.init;

import com.terraformersmc.cinderscapes.init.helpers.CinderscapesRegistry;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;

public class CinderscapesItems {

    /////////////////
    // Ashy Shoals //
    /////////////////

    public static BlockItem SCORCHED_STEM;
    public static BlockItem STRIPPED_SCORCHED_STEM;

    public static BlockItem SCORCHED_HYPHAE;
    public static BlockItem STRIPPED_SCORCHED_HYPHAE;

    public static BlockItem SCORCHED_SHRUB;
    public static BlockItem SCORCHED_SPROUTS;
    public static BlockItem SCORCHED_TENDRILS;

    public static BlockItem ASH;
    public static BlockItem ASH_BLOCK;

    public static BlockItem PYRACINTH;

    ////////////////////
    // Luminous Grove //
    ////////////////////

    // Umbral Nylia

    public static BlockItem UMBRAL_STEM;
    public static BlockItem STRIPPED_UMBRAL_STEM;

    public static BlockItem UMBRAL_HYPHAE;
    public static BlockItem STRIPPED_UMBRAL_HYPHAE;

    public static BlockItem UMBRAL_NYLIUM;

    public static BlockItem UMBRAL_FUNGUS;

    public static BlockItem UMBRAL_WART_BLOCK;
    public static BlockItem UMBRAL_FLESH_BLOCK;


    // Other

    public static BlockItem TWILIGHT_VINE_BLOCK;
    public static BlockItem TWILIGHT_TENDRILS;
    public static BlockItem TWILIGHT_FESCUES;
    public static BlockItem PHOTOFERN;
    public static BlockItem TALL_PHOTOFERN;

    public static BlockItem LUMINOUS_POD;
    public static BlockItem GHASTLY_ECTOPLASM;

    ///////////
    // Other //
    ///////////

    public static Item ASH_PILE;

    public static BlockItem BRAMBLE_BERRIES;

    public static BlockItem NODZOL;

    public static Item SULFUR;

    public static BlockItem SULFUR_BLOCK;
    public static BlockItem SULFUR_ORE;

    public static Item ROSE_QUARTZ;
    public static Item SMOKY_QUARTZ;
    public static Item SULFUR_QUARTZ;

    ///////////////////
    // Quartz Cavern //
    ///////////////////

    public static BlockItem CRYSTINIUM;

    public static BlockItem CRYSTALLINE_QUARTZ;

    // Sulfur Quartz

    public static BlockItem SULFUR_QUARTZ_ORE;
    public static BlockItem SULFUR_QUARTZ_BLOCK;
    public static BlockItem CHISELED_SULFUR_QUARTZ_BLOCK;
    public static BlockItem SULFUR_QUARTZ_PILLAR;
    public static BlockItem SMOOTH_SULFUR_QUARTZ;
    public static BlockItem SULFUR_QUARTZ_BRICKS;

    public static BlockItem CRYSTALLINE_SULFUR_QUARTZ;

    // Rose Quartz

    public static BlockItem ROSE_QUARTZ_ORE;
    public static BlockItem ROSE_QUARTZ_BLOCK;
    public static BlockItem CHISELED_ROSE_QUARTZ_BLOCK;
    public static BlockItem ROSE_QUARTZ_PILLAR;
    public static BlockItem SMOOTH_ROSE_QUARTZ;
    public static BlockItem ROSE_QUARTZ_BRICKS;

    public static BlockItem CRYSTALLINE_ROSE_QUARTZ;

    // Smoky Quartz

    public static BlockItem SMOKY_QUARTZ_ORE;
    public static BlockItem SMOKY_QUARTZ_BLOCK;
    public static BlockItem CHISELED_SMOKY_QUARTZ_BLOCK;
    public static BlockItem SMOKY_QUARTZ_PILLAR;
    public static BlockItem SMOOTH_SMOKY_QUARTZ;
    public static BlockItem SMOKY_QUARTZ_BRICKS;

    public static BlockItem CRYSTALLINE_SMOKY_QUARTZ;

    public static void init() {

        /////////////////
        // Ashy Shoals //
        /////////////////

        SCORCHED_STEM = CinderscapesRegistry.registerBlockItem("scorched_stem", CinderscapesBlocks.SCORCHED_STEM);
        STRIPPED_SCORCHED_STEM = CinderscapesRegistry.registerBlockItem("stripped_scorched_stem", CinderscapesBlocks.STRIPPED_SCORCHED_STEM);

        SCORCHED_HYPHAE = CinderscapesRegistry.registerBlockItem("scorched_hyphae", CinderscapesBlocks.SCORCHED_HYPHAE);
        STRIPPED_SCORCHED_HYPHAE = CinderscapesRegistry.registerBlockItem("stripped_scorched_hyphae", CinderscapesBlocks.STRIPPED_SCORCHED_HYPHAE);

        SCORCHED_SHRUB = CinderscapesRegistry.registerBlockItem("scorched_shrub", CinderscapesBlocks.SCORCHED_SHRUB);
        SCORCHED_SPROUTS = CinderscapesRegistry.registerBlockItem("scorched_sprouts", CinderscapesBlocks.SCORCHED_SPROUTS);
        SCORCHED_TENDRILS = CinderscapesRegistry.registerBlockItem("scorched_tendrils", CinderscapesBlocks.SCORCHED_TENDRILS);

        ASH = CinderscapesRegistry.registerBlockItem("ash", CinderscapesBlocks.ASH);
        ASH_BLOCK = CinderscapesRegistry.registerBlockItem("ash_block", CinderscapesBlocks.ASH_BLOCK);

        PYRACINTH = CinderscapesRegistry.registerBlockItem("pyracinth", CinderscapesBlocks.PYRACINTH);

        ////////////////////
        // Luminous Grove //
        ////////////////////

        // Umbral Nylia

        UMBRAL_STEM = CinderscapesRegistry.registerBlockItem("umbral_stem", CinderscapesBlocks.UMBRAL_STEM);
        STRIPPED_UMBRAL_STEM = CinderscapesRegistry.registerBlockItem("stripped_umbral_stem", CinderscapesBlocks.STRIPPED_UMBRAL_STEM);

        UMBRAL_HYPHAE = CinderscapesRegistry.registerBlockItem("umbral_hyphae", CinderscapesBlocks.UMBRAL_HYPHAE);
        STRIPPED_UMBRAL_HYPHAE = CinderscapesRegistry.registerBlockItem("stripped_umbral_hyphae", CinderscapesBlocks.STRIPPED_UMBRAL_HYPHAE);

        UMBRAL_NYLIUM = CinderscapesRegistry.registerBlockItem("umbral_nylium", CinderscapesBlocks.UMBRAL_NYLIUM);

        UMBRAL_FUNGUS = CinderscapesRegistry.registerBlockItem("umbral_fungus", CinderscapesBlocks.UMBRAL_FUNGUS);

        UMBRAL_WART_BLOCK = CinderscapesRegistry.registerBlockItem("umbral_wart_block", CinderscapesBlocks.UMBRAL_WART_BLOCK);
        UMBRAL_FLESH_BLOCK = CinderscapesRegistry.registerBlockItem("umbral_flesh_block", CinderscapesBlocks.UMBRAL_FLESH_BLOCK);

        // Other

        TWILIGHT_VINE_BLOCK = CinderscapesRegistry.registerBlockItem("twilight_vine_block", CinderscapesBlocks.TWILIGHT_VINE_BLOCK);
        TWILIGHT_TENDRILS = CinderscapesRegistry.registerBlockItem("twilight_tendrils", CinderscapesBlocks.TWILIGHT_TENDRILS);
        TWILIGHT_FESCUES = CinderscapesRegistry.registerBlockItem("twilight_fescues", CinderscapesBlocks.TWILIGHT_FESCUES);
        PHOTOFERN = CinderscapesRegistry.registerBlockItem("photofern", CinderscapesBlocks.PHOTOFERN);
        TALL_PHOTOFERN = CinderscapesRegistry.registerBlockItem("tall_photofern", CinderscapesBlocks.TALL_PHOTOFERN);

        LUMINOUS_POD = CinderscapesRegistry.registerBlockItem("luminous_pod", CinderscapesBlocks.LUMINOUS_POD);
        GHASTLY_ECTOPLASM = CinderscapesRegistry.registerBlockItem("ghastly_ectoplasm", CinderscapesBlocks.GHASTLY_ECTOPLASM);

        ///////////
        // Other //
        ///////////

        ASH_PILE = CinderscapesRegistry.register("ash_pile", new Item(new Item.Settings()));

        BRAMBLE_BERRIES = CinderscapesRegistry.register("bramble_berries", new AliasedBlockItem(CinderscapesBlocks.BRAMBLE_BERRY_BUSH, new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600, 0), 0.8F).build())));

        NODZOL = CinderscapesRegistry.registerBlockItem("nodzol", CinderscapesBlocks.NODZOL);

        SULFUR = CinderscapesRegistry.register("sulfur", new Item(new Item.Settings()));

        SULFUR_BLOCK = CinderscapesRegistry.registerBlockItem("sulfur_block", CinderscapesBlocks.SULFUR_BLOCK);
        SULFUR_ORE = CinderscapesRegistry.registerBlockItem("sulfur_ore", CinderscapesBlocks.SULFUR_ORE);

        ROSE_QUARTZ = CinderscapesRegistry.register("rose_quartz", new Item(new Item.Settings()));
        SMOKY_QUARTZ = CinderscapesRegistry.register("smoky_quartz", new Item(new Item.Settings()));
        SULFUR_QUARTZ = CinderscapesRegistry.register("sulfur_quartz", new Item(new Item.Settings()));

        ///////////////////
        // Quartz Cavern //
        ///////////////////

        CRYSTINIUM = CinderscapesRegistry.registerBlockItem("crystinium", CinderscapesBlocks.CRYSTINIUM);

        CRYSTALLINE_QUARTZ = CinderscapesRegistry.registerBlockItem("crystalline_quartz", CinderscapesBlocks.CRYSTALLINE_QUARTZ);

        // Sulfur Quartz

        SULFUR_QUARTZ_ORE = CinderscapesRegistry.registerBlockItem("sulfur_quartz_ore", CinderscapesBlocks.SULFUR_QUARTZ_ORE);
        SULFUR_QUARTZ_BLOCK = CinderscapesRegistry.registerBlockItem("sulfur_quartz_block", CinderscapesBlocks.SULFUR_QUARTZ_BLOCK);
        CHISELED_SULFUR_QUARTZ_BLOCK = CinderscapesRegistry.registerBlockItem("chiseled_sulfur_quartz_block", CinderscapesBlocks.CHISELED_SULFUR_QUARTZ_BLOCK);
        SULFUR_QUARTZ_PILLAR = CinderscapesRegistry.registerBlockItem("sulfur_quartz_pillar", CinderscapesBlocks.SULFUR_QUARTZ_PILLAR);
        SMOOTH_SULFUR_QUARTZ = CinderscapesRegistry.registerBlockItem("smooth_sulfur_quartz", CinderscapesBlocks.SMOOTH_SULFUR_QUARTZ);
        SULFUR_QUARTZ_BRICKS = CinderscapesRegistry.registerBlockItem("sulfur_quartz_bricks", CinderscapesBlocks.SULFUR_QUARTZ_BRICKS);

        CRYSTALLINE_SULFUR_QUARTZ = CinderscapesRegistry.registerBlockItem("crystalline_sulfur_quartz", CinderscapesBlocks.CRYSTALLINE_SULFUR_QUARTZ);

        // Rose Quartz

        ROSE_QUARTZ_ORE = CinderscapesRegistry.registerBlockItem("rose_quartz_ore", CinderscapesBlocks.ROSE_QUARTZ_ORE);
        ROSE_QUARTZ_BLOCK = CinderscapesRegistry.registerBlockItem("rose_quartz_block", CinderscapesBlocks.ROSE_QUARTZ_BLOCK);
        CHISELED_ROSE_QUARTZ_BLOCK = CinderscapesRegistry.registerBlockItem("chiseled_rose_quartz_block", CinderscapesBlocks.CHISELED_ROSE_QUARTZ_BLOCK);
        ROSE_QUARTZ_PILLAR = CinderscapesRegistry.registerBlockItem("rose_quartz_pillar", CinderscapesBlocks.ROSE_QUARTZ_PILLAR);
        SMOOTH_ROSE_QUARTZ = CinderscapesRegistry.registerBlockItem("smooth_rose_quartz", CinderscapesBlocks.SMOOTH_ROSE_QUARTZ);
        ROSE_QUARTZ_BRICKS = CinderscapesRegistry.registerBlockItem("rose_quartz_bricks", CinderscapesBlocks.ROSE_QUARTZ_BRICKS);

        CRYSTALLINE_ROSE_QUARTZ = CinderscapesRegistry.registerBlockItem("crystalline_rose_quartz", CinderscapesBlocks.CRYSTALLINE_ROSE_QUARTZ);

        // Smoky Quartz

        SMOKY_QUARTZ_ORE = CinderscapesRegistry.registerBlockItem("smoky_quartz_ore", CinderscapesBlocks.SMOKY_QUARTZ_ORE);
        SMOKY_QUARTZ_BLOCK = CinderscapesRegistry.registerBlockItem("smoky_quartz_block", CinderscapesBlocks.SMOKY_QUARTZ_BLOCK);
        CHISELED_SMOKY_QUARTZ_BLOCK = CinderscapesRegistry.registerBlockItem("chiseled_smoky_quartz_block", CinderscapesBlocks.CHISELED_SMOKY_QUARTZ_BLOCK);
        SMOKY_QUARTZ_PILLAR = CinderscapesRegistry.registerBlockItem("smoky_quartz_pillar", CinderscapesBlocks.SMOKY_QUARTZ_PILLAR);
        SMOOTH_SMOKY_QUARTZ = CinderscapesRegistry.registerBlockItem("smooth_smoky_quartz", CinderscapesBlocks.SMOOTH_SMOKY_QUARTZ);
        SMOKY_QUARTZ_BRICKS = CinderscapesRegistry.registerBlockItem("smoky_quartz_bricks", CinderscapesBlocks.SMOKY_QUARTZ_BRICKS);

        CRYSTALLINE_SMOKY_QUARTZ = CinderscapesRegistry.registerBlockItem("crystalline_smoky_quartz", CinderscapesBlocks.CRYSTALLINE_SMOKY_QUARTZ);

        addCompostables();
    }

    private static void addCompostables() {
        CompostingChanceRegistry compostingRegistry = CompostingChanceRegistry.INSTANCE;
        float BERRY_CHANCE = compostingRegistry.get(Items.SWEET_BERRIES);
        float FLOWER_CHANCE = compostingRegistry.get(Items.POPPY);
        float FUNGUS_CHANCE = compostingRegistry.get(Items.CRIMSON_FUNGUS);
        float GRASS_CHANCE = compostingRegistry.get(Items.SHORT_GRASS);
        float WART_BLOCK_CHANCE = compostingRegistry.get(Items.NETHER_WART_BLOCK);

        compostingRegistry.add(BRAMBLE_BERRIES, BERRY_CHANCE);

        compostingRegistry.add(SCORCHED_SHRUB, GRASS_CHANCE);
        compostingRegistry.add(SCORCHED_SPROUTS, GRASS_CHANCE);
        compostingRegistry.add(SCORCHED_TENDRILS, GRASS_CHANCE);
        compostingRegistry.add(TWILIGHT_FESCUES, GRASS_CHANCE);
        compostingRegistry.add(TWILIGHT_TENDRILS, GRASS_CHANCE);

        compostingRegistry.add(CRYSTINIUM, FLOWER_CHANCE);
        compostingRegistry.add(GHASTLY_ECTOPLASM, FLOWER_CHANCE);
        compostingRegistry.add(LUMINOUS_POD, FLOWER_CHANCE);
        compostingRegistry.add(PHOTOFERN, FLOWER_CHANCE);
        compostingRegistry.add(PYRACINTH, FLOWER_CHANCE);
        compostingRegistry.add(TALL_PHOTOFERN, FLOWER_CHANCE);
        compostingRegistry.add(UMBRAL_FUNGUS, FUNGUS_CHANCE);

        compostingRegistry.add(TWILIGHT_VINE_BLOCK, WART_BLOCK_CHANCE);
        compostingRegistry.add(UMBRAL_FLESH_BLOCK, WART_BLOCK_CHANCE);
        compostingRegistry.add(UMBRAL_WART_BLOCK, WART_BLOCK_CHANCE);
    }
}
