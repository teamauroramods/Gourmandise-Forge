package com.teamaurora.gourmandise.core.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;
import com.teamaurora.gourmandise.core.Gourmandise;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gourmandise.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GourmandiseBlocks {
    public static final BlockSubRegistryHelper HELPER = Gourmandise.REGISTRY_HELPER.getBlockSubHelper();


}
