package me.alphamode.scp;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

public class SCPMod implements ModInitializer {
    public static final String ID = "scp";

    @Override
    public void onInitialize() {
        AllEntities.init();
    }

    public static ResourceLocation asResource(String id) {
        return new ResourceLocation(ID, id);
    }
}
