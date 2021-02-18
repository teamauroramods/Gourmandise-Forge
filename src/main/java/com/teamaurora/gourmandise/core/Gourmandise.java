package com.teamaurora.gourmandise.core;

import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;
import com.teamaurora.gourmandise.core.other.GourmandiseCompat;
import com.teamaurora.gourmandise.core.registry.GourmandiseFeatures;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.teamaurora.gourmandise.core.Gourmandise.MODID;

@Mod(MODID)
public class Gourmandise
{
    public static final String MODID = "gourmandise";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MODID);

    public Gourmandise() {
        final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        REGISTRY_HELPER.register(eventBus);

        GourmandiseFeatures.FEATURES.register(eventBus);

        eventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            GourmandiseFeatures.Configured.registerConfiguredFeatures();
            GourmandiseCompat.registerFlammables();
            GourmandiseCompat.registerCompostables();
        });
    }
}
