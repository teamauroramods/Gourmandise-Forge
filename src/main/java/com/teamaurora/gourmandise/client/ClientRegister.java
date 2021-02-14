package com.teamaurora.gourmandise.client;

import com.minecraftabnormals.abnormals_core.core.util.DataUtil;
import com.teamaurora.gourmandise.core.Gourmandise;
import com.teamaurora.gourmandise.core.registry.GourmandiseBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.Arrays;

@Mod.EventBusSubscriber(modid = Gourmandise.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegister {
    // one day this will do something
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            registerBlockColors();
            setupRenderLayer();
        });
    }

    public static void setupRenderLayer() {
        RenderTypeLookup.setRenderLayer(GourmandiseBlocks.GRAPE_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(GourmandiseBlocks.POTTED_GRAPE_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(GourmandiseBlocks.GRAPE_LEAF_CARPET.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(GourmandiseBlocks.GRAPE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(GourmandiseBlocks.GRAPE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(GourmandiseBlocks.GRAPE_TRAPDOOR.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(GourmandiseBlocks.GRAPES.get(), RenderType.getCutout());
    }

    // TODO: make this a better color
    public static void registerBlockColors() {
        BlockColors blockColors = Minecraft.getInstance().getBlockColors();
        DataUtil.registerBlockColor(blockColors, (x, world, pos, u) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefault(), Arrays.asList(GourmandiseBlocks.GRAPE_LEAVES, GourmandiseBlocks.GRAPE_LEAF_CARPET, GourmandiseBlocks.BRANCHY_GRAPE_LEAVES));

        ItemColors itemColors = Minecraft.getInstance().getItemColors();
        DataUtil.registerBlockItemColor(itemColors, (color, items) -> FoliageColors.getDefault(), Arrays.asList(GourmandiseBlocks.GRAPE_LEAVES, GourmandiseBlocks.GRAPE_LEAF_CARPET, GourmandiseBlocks.BRANCHY_GRAPE_LEAVES));
    }
}
