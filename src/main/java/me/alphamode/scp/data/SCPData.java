package me.alphamode.scp.data;

import me.alphamode.scp.SCPMod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import net.minecraft.data.DataGenerator;

public class SCPData {
    public static void gatherData(final GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        gen.addProvider(new LangProvider(gen, SCPMod.ID, "en_us"));
    }
}
