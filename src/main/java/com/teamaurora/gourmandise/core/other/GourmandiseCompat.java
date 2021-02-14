package com.teamaurora.gourmandise.core.other;

import com.minecraftabnormals.abnormals_core.core.util.DataUtil;
import com.teamaurora.gourmandise.core.registry.GourmandiseBlocks;
import com.teamaurora.gourmandise.core.registry.GourmandiseItems;

public class GourmandiseCompat {
    public static void registerCompostables() {
        DataUtil.registerCompostable(GourmandiseBlocks.GRAPE_LEAVES.get(), 0.3F);
        DataUtil.registerCompostable(GourmandiseBlocks.GRAPE_SAPLING.get(), 0.3F);
        DataUtil.registerCompostable(GourmandiseBlocks.GRAPE_LEAF_CARPET.get(), 0.3F);

        DataUtil.registerCompostable(GourmandiseItems.GRAPES.get(), 0.65F);
    }

    public static void registerFlammables() {
        DataUtil.registerFlammable(GourmandiseBlocks.GRAPE_LEAVES.get(), 30, 60);
        DataUtil.registerFlammable(GourmandiseBlocks.GRAPE_LOG.get(), 5, 5);
        DataUtil.registerFlammable(GourmandiseBlocks.GRAPE_WOOD.get(), 5, 5);
        DataUtil.registerFlammable(GourmandiseBlocks.STRIPPED_GRAPE_LOG.get(), 5, 5);
        DataUtil.registerFlammable(GourmandiseBlocks.STRIPPED_GRAPE_WOOD.get(), 5, 5);
        DataUtil.registerFlammable(GourmandiseBlocks.GRAPE_PLANKS.get(), 5, 20);
        DataUtil.registerFlammable(GourmandiseBlocks.GRAPE_SLAB.get(), 5, 20);
        DataUtil.registerFlammable(GourmandiseBlocks.GRAPE_STAIRS.get(), 5, 20);
        DataUtil.registerFlammable(GourmandiseBlocks.GRAPE_FENCE.get(), 5, 20);
        DataUtil.registerFlammable(GourmandiseBlocks.GRAPE_FENCE_GATE.get(), 5, 20);
        DataUtil.registerFlammable(GourmandiseBlocks.VERTICAL_GRAPE_PLANKS.get(), 5, 20);
        DataUtil.registerFlammable(GourmandiseBlocks.GRAPE_LEAF_CARPET.get(), 30, 60);
        DataUtil.registerFlammable(GourmandiseBlocks.GRAPE_VERTICAL_SLAB.get(), 5, 20);
        DataUtil.registerFlammable(GourmandiseBlocks.GRAPE_BOOKSHELF.get(), 30, 20);
        DataUtil.registerFlammable(GourmandiseBlocks.GRAPE_BEEHIVE.get(), 5, 20);
    }
}
