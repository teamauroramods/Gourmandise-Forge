package com.teamaurora.gourmandise.common.world.biome;

import com.minecraftabnormals.abnormals_core.core.util.DataUtil;
import com.teamaurora.gourmandise.core.Gourmandise;
import com.teamaurora.gourmandise.core.registry.GourmandiseFeatures;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gourmandise.MODID)
public class GourmandiseBiomeFeatures {

    @SubscribeEvent
    public static void addFeatures(BiomeLoadingEvent event) {
        ResourceLocation biomeName = event.getName();

        if (DataUtil.matchesKeys(biomeName, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU)) {
            event.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, GourmandiseFeatures.Configured.TREES_GRAPE);
        }
    }
}
