package com.teamaurora.gourmandise.common.block.trees;

import com.teamaurora.gourmandise.core.registry.GourmandiseFeatures;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class GrapeTree extends Tree {
    @Nullable
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(@Nullable Random randomIn, boolean largeHive) {
        return GourmandiseFeatures.Configured.GRAPE;
    }
}
