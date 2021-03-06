package me.alphamode.scp.core;

import net.minecraftforge.common.IExtensibleEnum;

public enum ObjectClass implements IExtensibleEnum {
    SAFE,
    EUCLID,
    KETER;

    public String getTranslationKey() {
        return "scp.object_class." + name().toLowerCase();
    }

    public static ObjectClass create(String name) {
        throw new IllegalStateException("Enum not extended");
    }
}
