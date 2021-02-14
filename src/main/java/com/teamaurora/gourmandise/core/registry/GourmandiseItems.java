package com.teamaurora.gourmandise.core.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;
import com.teamaurora.gourmandise.core.Gourmandise;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gourmandise.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GourmandiseItems {
    public static final ItemSubRegistryHelper HELPER = Gourmandise.REGISTRY_HELPER.getItemSubHelper();

    public static final RegistryObject<Item> GRAPE_BOAT = HELPER.createBoatItem("grape", GourmandiseBlocks.GRAPE_PLANKS);

    public static class Foods {

    }
}
