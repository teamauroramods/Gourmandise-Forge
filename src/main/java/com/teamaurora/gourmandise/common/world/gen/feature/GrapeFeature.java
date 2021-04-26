package com.teamaurora.gourmandise.common.world.gen.feature;

import com.google.common.collect.Sets;
import com.minecraftabnormals.abnormals_core.core.util.TreeUtil;
import com.mojang.serialization.Codec;
import com.teamaurora.gourmandise.common.block.GrapesBlock;
import com.teamaurora.gourmandise.core.registry.GourmandiseBlocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

import java.util.*;

public class GrapeFeature extends Feature<BaseTreeFeatureConfig> {
    private final int variant;

    // 0 = no grapes, small
    // 1 = grapes, small
    // 2 = large
    public GrapeFeature(Codec<BaseTreeFeatureConfig> codec, int variant) {
        super(codec);
        this.variant = variant;
    }

    @Override
    public boolean generate(ISeedReader worldIn, ChunkGenerator generator, Random rand, BlockPos position, BaseTreeFeatureConfig config) {
        int height = rand.nextInt(2) + 2;
        if (position.getY() <= 0 || position.getY() + height > worldIn.getHeight() - 1) {
            return false;
        }
        if (!TreeUtil.isValidGround(worldIn, position.down(), (SaplingBlock) GourmandiseBlocks.GRAPE_SAPLING.get())) {
            return false;
        }

        List<BlockPos> logs = new ArrayList<>();
        List<BlockPos> leaves = new ArrayList<>();
        List<BlockPos> leavesHanging = new ArrayList<>();

        for (int i = 0; i <= height + 1; i++) {
            if (i <= height)
                logs.add(position.up(i));
            if (i == 2) {
                if (this.variant == 2) {
                    disc2(position.up(i), leaves, leavesHanging, true);
                } else {
                    disc1(position.up(i), leaves, leavesHanging, 2);
                }
            } else if (i == 3) {
                if (height == 3) {
                    if (this.variant == 2) {
                        disc2(position.up(i), leaves, leavesHanging, false);
                    } else {
                        disc1(position.up(i), leaves, leavesHanging, 1);
                    }
                } else {
                    disc1(position.up(i), leaves, leavesHanging, 0);
                }
            } else if (i == 4) {
                disc1(position.up(i), leaves, leavesHanging, 0);
            }
        }

        List<BlockPos> leavesClean = cleanLeavesArray(leaves, logs);

        boolean flag = true;
        for (BlockPos log : logs) {
            if (!TreeUtil.isAirOrLeaves(worldIn, log)) {
                flag = false;
            }
        }
        if (!flag) return false;

        TreeUtil.setDirtAt(worldIn, position.down());

        for (BlockPos log : logs) {
            TreeUtil.placeLogAt(worldIn, log, rand, config);
        }
        for (BlockPos leaf : leavesClean) {
            TreeUtil.placeLeafAt(worldIn, leaf, rand, config);
        }
        for (BlockPos leaf : leavesHanging) {
            if (TreeUtil.isAirOrLeaves(worldIn, leaf)) {
                TreeUtil.setForcedState(worldIn, leaf, GourmandiseBlocks.BRANCHY_GRAPE_LEAVES.get().getDefaultState());
            }
            if (TreeUtil.isAirOrLeaves(worldIn, leaf.down()) && rand.nextInt(3) != 0 && variant != 0) {
                TreeUtil.setForcedState(worldIn, leaf.down(), GourmandiseBlocks.GRAPE_BRANCH.get().getDefaultState().with(GrapesBlock.AGE, rand.nextInt(4)));
            }
        }


        Set<BlockPos> decSet = Sets.newHashSet();
        MutableBoundingBox mutableBoundingBox = MutableBoundingBox.getNewBoundingBox();

        List<BlockPos> logsPos = new ArrayList<>();
        for (BlockPos log : logs) {
            logsPos.add(log);
        }

        if (!config.decorators.isEmpty()) {
            logsPos.sort(Comparator.comparingInt(Vector3i::getY));
            leavesClean.sort(Comparator.comparingInt(Vector3i::getY));
            config.decorators.forEach((decorator) -> decorator.func_225576_a_(worldIn, rand, logsPos, leavesClean, decSet, mutableBoundingBox));
        }

        return true;
    }

    // 0 = no corners
    // 1 = corners
    // 2 = corners w/ grapes
    private void disc1(BlockPos pos, List<BlockPos> leaves, List<BlockPos> leavesHanging, int variant) {
        for (int x = -1; x <= 1; x++) {
            for (int z = -1; z <= 1; z++) {
                if (Math.abs(x) != 1 || Math.abs(z) != 1 || variant == 1) {
                    leaves.add(pos.add(x, 0, z));
                } else if (variant == 2) {
                    leavesHanging.add(pos.add(x, 0, z));
                }
            }
        }
    }

    private void disc2(BlockPos pos, List<BlockPos> leaves, List<BlockPos> leavesHanging, boolean hanging) {
        if (hanging) {
            leavesHanging.add(pos.north(2));
            leavesHanging.add(pos.east(2));
            leavesHanging.add(pos.south(2));
            leavesHanging.add(pos.west(2));
            leavesHanging.add(pos.add(-1, 0, -1));
            leavesHanging.add(pos.add(1, 0, -1));
            leavesHanging.add(pos.add(-1, 0, 1));
            leavesHanging.add(pos.add(1, 0, 1));
        }
        for (int x = -2; x <= 2; x++) {
            for (int z = -2; z <= 2; z++) {
                if (Math.abs(x) != 2 || Math.abs(z) != 2 && !leavesHanging.contains(pos.add(x,0,z))) {
                    leaves.add(pos.add(x, 0, z));
                }
            }
        }
    }

    private List<BlockPos> cleanLeavesArray(List<BlockPos> leaves, List<BlockPos> logs) {
        List<BlockPos> newLeaves = new ArrayList<>();
        for (BlockPos leaf : leaves) {
            if (!logs.contains(leaf)) {
                newLeaves.add(leaf);
            }
        }
        return newLeaves;
    }
}
