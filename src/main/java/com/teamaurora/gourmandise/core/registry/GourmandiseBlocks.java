package com.teamaurora.gourmandise.core.registry;

import com.minecraftabnormals.abnormals_core.common.blocks.*;
import com.minecraftabnormals.abnormals_core.common.blocks.chest.AbnormalsChestBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.chest.AbnormalsTrappedChestBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.sign.AbnormalsStandingSignBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.sign.AbnormalsWallSignBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.wood.*;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;
import com.mojang.datafixers.util.Pair;
import com.teamaurora.gourmandise.common.block.BranchyGrapeLeavesBlock;
import com.teamaurora.gourmandise.common.block.GrapesBlock;
import com.teamaurora.gourmandise.common.block.PineappleBlock;
import com.teamaurora.gourmandise.common.block.trees.GrapeTree;
import com.teamaurora.gourmandise.core.Gourmandise;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.trees.OakTree;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gourmandise.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GourmandiseBlocks {
    public static final BlockSubRegistryHelper HELPER = Gourmandise.REGISTRY_HELPER.getBlockSubHelper();

    // grape wood
    public static final RegistryObject<Block> STRIPPED_GRAPE_LOG = HELPER.createBlock("stripped_grape_log", ()->new StrippedLogBlock(Block.Properties.from(Blocks.STRIPPED_OAK_LOG)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_GRAPE_WOOD = HELPER.createBlock("stripped_grape_wood", ()->new StrippedWoodBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAPE_LOG= HELPER.createBlock("grape_log", ()->new AbnormalsLogBlock(STRIPPED_GRAPE_LOG, Block.Properties.from(Blocks.OAK_LOG)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAPE_WOOD = HELPER.createBlock("grape_wood", ()->new WoodBlock(STRIPPED_GRAPE_WOOD, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAPE_LEAVES = HELPER.createBlock("grape_leaves", ()->new AbnormalsLeavesBlock(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT).notSolid().setAllowsSpawn((BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> entity)->(entity == EntityType.OCELOT || entity == EntityType.PARROT)).setSuffocates((BlockState state, IBlockReader reader, BlockPos pos)->false).setBlocksVision((BlockState state, IBlockReader reader, BlockPos pos)->false)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BRANCHY_GRAPE_LEAVES = HELPER.createBlock("branchy_grape_leaves", ()->new BranchyGrapeLeavesBlock(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT).notSolid().setAllowsSpawn((BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> entity)->(entity == EntityType.OCELOT || entity == EntityType.PARROT)).setSuffocates((BlockState state, IBlockReader reader, BlockPos pos)->false).setBlocksVision((BlockState state, IBlockReader reader, BlockPos pos)->false)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> GRAPE_SAPLING = HELPER.createBlock("grape_sapling", ()->new AbnormalsSaplingBlock(new GrapeTree(), Block.Properties.from(Blocks.OAK_SAPLING)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> POTTED_GRAPE_SAPLING = HELPER.createBlockNoItem("potted_grape_sapling", ()->new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GRAPE_SAPLING, Block.Properties.from(Blocks.POTTED_ALLIUM)));
    public static final RegistryObject<Block> GRAPE_PLANKS = HELPER.createBlock("grape_planks", ()->new PlanksBlock(Block.Properties.from(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAPE_SLAB = HELPER.createBlock("grape_slab", ()->new WoodSlabBlock(Block.Properties.from(Blocks.OAK_SLAB)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAPE_STAIRS = HELPER.createBlock("grape_stairs", ()->new WoodStairsBlock(GRAPE_PLANKS.get().getDefaultState(), Block.Properties.from(Blocks.OAK_STAIRS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAPE_PRESSURE_PLATE = HELPER.createBlock("grape_pressure_plate", ()->new WoodPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.from(Blocks.OAK_PRESSURE_PLATE)), ItemGroup.REDSTONE);
    public static final RegistryObject<Block> GRAPE_FENCE = HELPER.createBlock("grape_fence", ()->new WoodFenceBlock(Block.Properties.from(Blocks.OAK_FENCE)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> GRAPE_FENCE_GATE = HELPER.createBlock("grape_fence_gate", ()->new WoodFenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)), ItemGroup.REDSTONE);
    public static final RegistryObject<Block> GRAPE_BUTTON = HELPER.createBlock("grape_button", ()->new AbnormalsWoodButtonBlock(Block.Properties.from(Blocks.OAK_BUTTON)), ItemGroup.REDSTONE);
    public static final RegistryObject<Block> GRAPE_DOOR = HELPER.createBlock("grape_door", ()->new WoodDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ItemGroup.REDSTONE);
    public static final RegistryObject<Block> GRAPE_TRAPDOOR = HELPER.createBlock("grape_trapdoor", ()->new WoodTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ItemGroup.REDSTONE);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>, RegistryObject<AbnormalsWallSignBlock>> GRAPE_SIGNS = HELPER.createSignBlock("grape", MaterialColor.PURPLE_TERRACOTTA);

    public static final RegistryObject<Block> GRAPE_BOOKSHELF = HELPER.createCompatBlock("quark", "grape_bookshelf", ()->new BookshelfBlock(Block.Properties.from(Blocks.BOOKSHELF)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_GRAPE_PLANKS = HELPER.createCompatBlock("quark", "vertical_grape_planks", ()->new Block(Block.Properties.from(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAPE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "grape_vertical_slab", ()->new VerticalSlabBlock(Block.Properties.from(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAPE_LADDER = HELPER.createCompatBlock("quark", "grape_ladder", ()->new AbnormalsLadderBlock(Block.Properties.from(Blocks.LADDER).harvestTool(ToolType.AXE)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> GRAPE_LEAF_CARPET = HELPER.createBlock("grape_leaf_carpet", ()->new LeafCarpetBlock(Block.Properties.from(GRAPE_LEAVES.get())), ItemGroup.DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> GRAPE_CHESTS = HELPER.createCompatChestBlocks("grape", MaterialColor.PURPLE_TERRACOTTA);

    public static final RegistryObject<Block> GRAPE_BEEHIVE = HELPER.createCompatBlock("buzzier_bees", "grape_beehive", ()->new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);

    public static final RegistryObject<Block> GRAPE_BRANCH = HELPER.createBlock("grape_branch", ()->new GrapesBlock(AbstractBlock.Properties.create(Material.PLANTS).tickRandomly().sound(SoundType.CROP)), ItemGroup.DECORATIONS);

    // cheese
    public static final RegistryObject<Block> CHEESE_BLOCK = HELPER.createBlock("cheese_block", ()->new Block(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHEESE_STAIRS = HELPER.createBlock("cheese_stairs", ()->new AbnormalsStairsBlock(CHEESE_BLOCK.get().getDefaultState(), Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHEESE_SLAB = HELPER.createBlock("cheese_slab", ()->new SlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHEESE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cheese_vertical_slab", ()->new VerticalSlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHISELED_CHEESE_BLOCK = HELPER.createBlock("chiseled_cheese_block", ()->new Block(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHEESE_TILES = HELPER.createBlock("cheese_tiles", ()->new Block(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHEESE_TILE_STAIRS = HELPER.createBlock("cheese_tile_stairs", ()->new AbnormalsStairsBlock(CHEESE_TILES.get().getDefaultState(), Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHEESE_TILE_SLAB = HELPER.createBlock("cheese_tile_slab", ()->new SlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHEESE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cheese_tile_vertical_slab", ()->new VerticalSlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> BLUE_CHEESE_BLOCK = HELPER.createBlock("blue_cheese_block", ()->new Block(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_CHEESE_STAIRS = HELPER.createBlock("blue_cheese_stairs", ()->new AbnormalsStairsBlock(BLUE_CHEESE_BLOCK.get().getDefaultState(), Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_CHEESE_SLAB = HELPER.createBlock("blue_cheese_slab", ()->new SlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_CHEESE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "blue_cheese_vertical_slab", ()->new VerticalSlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHISELED_BLUE_CHEESE_BLOCK = HELPER.createBlock("chiseled_blue_cheese_block", ()->new Block(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_CHEESE_TILES = HELPER.createBlock("blue_cheese_tiles", ()->new Block(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_CHEESE_TILE_STAIRS = HELPER.createBlock("blue_cheese_tile_stairs", ()->new AbnormalsStairsBlock(BLUE_CHEESE_TILES.get().getDefaultState(), Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_CHEESE_TILE_SLAB = HELPER.createBlock("blue_cheese_tile_slab", ()->new SlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_CHEESE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "blue_cheese_tile_vertical_slab", ()->new VerticalSlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> SOFT_CHEESE_BLOCK = HELPER.createBlock("soft_cheese_block", ()->new Block(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SOFT_CHEESE_STAIRS = HELPER.createBlock("soft_cheese_stairs", ()->new AbnormalsStairsBlock(SOFT_CHEESE_BLOCK.get().getDefaultState(), Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SOFT_CHEESE_SLAB = HELPER.createBlock("soft_cheese_slab", ()->new SlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SOFT_CHEESE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "soft_cheese_vertical_slab", ()->new VerticalSlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHISELED_SOFT_CHEESE_BLOCK = HELPER.createBlock("chiseled_soft_cheese_block", ()->new Block(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SOFT_CHEESE_TILES = HELPER.createBlock("soft_cheese_tiles", ()->new Block(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SOFT_CHEESE_TILE_STAIRS = HELPER.createBlock("soft_cheese_tile_stairs", ()->new AbnormalsStairsBlock(SOFT_CHEESE_TILES.get().getDefaultState(), Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SOFT_CHEESE_TILE_SLAB = HELPER.createBlock("soft_cheese_tile_slab", ()->new SlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SOFT_CHEESE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "soft_cheese_tile_vertical_slab", ()->new VerticalSlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> MELTED_CHEESE_BLOCK = HELPER.createBlock("melted_cheese_block", ()->new Block(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MELTED_CHEESE_STAIRS = HELPER.createBlock("melted_cheese_stairs", ()->new AbnormalsStairsBlock(MELTED_CHEESE_BLOCK.get().getDefaultState(), Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MELTED_CHEESE_SLAB = HELPER.createBlock("melted_cheese_slab", ()->new SlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MELTED_CHEESE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "melted_cheese_vertical_slab", ()->new VerticalSlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHISELED_MELTED_CHEESE_BLOCK = HELPER.createBlock("chiseled_melted_cheese_block", ()->new Block(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MELTED_CHEESE_TILES = HELPER.createBlock("melted_cheese_tiles", ()->new Block(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MELTED_CHEESE_TILE_STAIRS = HELPER.createBlock("melted_cheese_tile_stairs", ()->new AbnormalsStairsBlock(MELTED_CHEESE_TILES.get().getDefaultState(), Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MELTED_CHEESE_TILE_SLAB = HELPER.createBlock("melted_cheese_tile_slab", ()->new SlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MELTED_CHEESE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "melted_cheese_tile_vertical_slab", ()->new VerticalSlabBlock(Properties.CHEESE), ItemGroup.BUILDING_BLOCKS);

    // golden wheat
    public static final RegistryObject<Block> GOLDEN_HAY_BLOCK = HELPER.createBlock("golden_hay_block", ()->new HayBlock(AbstractBlock.Properties.from(Blocks.HAY_BLOCK).harvestTool(ToolType.HOE)), ItemGroup.BUILDING_BLOCKS);

    // pineapple (latter two need better block properties in the future)
    public static final RegistryObject<Block> PINEAPPLE_LEAVES_BLOCK = HELPER.createBlock("pineapple_leaves_block", ()->new Block(AbstractBlock.Properties.from(Blocks.DRIED_KELP_BLOCK)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINEAPPLE_BLOCK = HELPER.createBlock("pineapple_block", ()->new Block(AbstractBlock.Properties.from(Blocks.DRIED_KELP_BLOCK)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINEAPPLE_TILES = HELPER.createBlock("pineapple_tiles", ()->new Block(AbstractBlock.Properties.from(Blocks.DRIED_KELP_BLOCK)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINEAPPLE = HELPER.createBlockNoItem("pineapple", ()->new PineappleBlock(AbstractBlock.Properties.create(Material.PLANTS).notSolid().tickRandomly().zeroHardnessAndResistance().sound(SoundType.WOOD)));

    static class Properties {
        public static final AbstractBlock.Properties CHEESE = AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD);
    }
}
