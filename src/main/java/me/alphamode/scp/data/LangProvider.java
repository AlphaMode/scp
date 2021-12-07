package me.alphamode.scp.data;

import me.alphamode.scp.core.ObjectClass;
import net.minecraftforge.common.data.LanguageProvider;

import net.minecraft.data.DataGenerator;

public class LangProvider extends LanguageProvider {
    public LangProvider(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    @Override
    protected void addTranslations() {
        add(ObjectClass.SAFE, "Safe");
        add(ObjectClass.EUCLID, "Euclid");
        add(ObjectClass.KETER, "Keter");
    }

    public void add(ObjectClass key, String name) {
        super.add(key.getTranslationKey(), name);
    }
}
