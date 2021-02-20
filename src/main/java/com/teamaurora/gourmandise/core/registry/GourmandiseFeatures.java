package com.teamaurora.gourmandise.core.registry;

import com.google.common.collect.ImmutableList;
import com.teamaurora.gourmandise.common.world.gen.feature.GrapeFeature;
import com.teamaurora.gourmandise.core.Gourmandise;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Gourmandise.MODID)
public class GourmandiseFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Gourmandise.MODID);

    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> GRAPE_TREE = FEATURES.register("grape_tree", ()->new GrapeFeature(BaseTreeFeatureConfig.CODEC, 0));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> WILD_GRAPE_TREE = FEATURES.register("wild_grape_tree", ()->new GrapeFeature(BaseTreeFeatureConfig.CODEC, 1));
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> LARGE_WILD_GRAPE_TREE = FEATURES.register("large_wild_grape_tree", ()->new GrapeFeature(BaseTreeFeatureConfig.CODEC, 2));

    public static final class BlockStates {
        public static final BlockState GRAPE_LOG = GourmandiseBlocks.GRAPE_LOG.get().getDefaultState();
        public static final BlockState GRAPE_LEAVES = GourmandiseBlocks.GRAPE_LEAVES.get().getDefaultState();
    }

    public static final class Configs {
        public static final BaseTreeFeatureConfig GRAPE_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockStates.GRAPE_LOG),
                new SimpleBlockStateProvider(BlockStates.GRAPE_LEAVES),
                new BlobFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), 0),
                new StraightTrunkPlacer(0, 0, 0),
                new TwoLayerFeature(0, 0, 0)
        )).setIgnoreVines().build();
    }

    public static final class Configured {
        public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> GRAPE = GourmandiseFeatures.GRAPE_TREE.get().withConfiguration(Configs.GRAPE_TREE_CONFIG);
        public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WILD_GRAPE = GourmandiseFeatures.WILD_GRAPE_TREE.get().withConfiguration(Configs.GRAPE_TREE_CONFIG);
        public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> LARGE_WILD_GRAPE = GourmandiseFeatures.LARGE_WILD_GRAPE_TREE.get().withConfiguration(Configs.GRAPE_TREE_CONFIG);

        public static final ConfiguredFeature<?, ?> TREES_GRAPE = Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WILD_GRAPE.withChance(0.5F)),LARGE_WILD_GRAPE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.CHANCE.configure(new ChanceConfig(12)));

        private static <FC extends IFeatureConfig> void register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
            Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(Gourmandise.MODID, name), configuredFeature);
        }

        public static void registerConfiguredFeatures() {
            register("grape", GRAPE);
            register("wild_grape", WILD_GRAPE);
            register("large_wild_grape", LARGE_WILD_GRAPE);

            register("trees_grape", TREES_GRAPE);
        }
    }
}
