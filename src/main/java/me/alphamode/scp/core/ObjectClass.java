package me.alphamode.scp.core;


public enum ObjectClass {
    SAFE,
    EUCLID,
    KETER;

    public static ObjectClass create(String name) {
        throw new IllegalStateException("Enum not extended");
    }
}
