package me.alphamode.scp;

import me.alphamode.scp.data.SCPData;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.minecraft.resources.ResourceLocation;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("scp")
public class SCPMod {
    public static final String ID = "scp";

    public SCPMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(SCPData::gatherData);
    }

    public static ResourceLocation asResource(String id) {
        return new ResourceLocation(ID, id);
    }
}
