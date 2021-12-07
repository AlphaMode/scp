package me.alphamode.scp;

import me.alphamode.scp.entity.SCP173;

import net.minecraft.core.Registry;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class AllEntities {
    public static final EntityType<SCP173> SCP_173 = buildScp(SCP173::new, 173, EntityDimensions.fixed(1f, 5f));

    public static <E extends Entity> EntityType<E> buildScp(EntityType.EntityFactory<E> factory, int id, EntityDimensions dimensions) {
        EntityType<E> entityType = EntityType.Builder.of(factory, MobCategory.MONSTER).build("scp_" + id);
        return Registry.register(Registry.ENTITY_TYPE, SCPMod.asResource("scp_" + id), entityType);
    }

    public static <E extends Entity> EntityType<E> buildScp(EntityType.EntityFactory<E> factory, int id, EntityDimensions dimensions, MobCategory category) {
        EntityType<E> entityType = EntityType.Builder.of(factory, category).build("scp_" + id);
        return Registry.register(Registry.ENTITY_TYPE, SCPMod.asResource("scp_" + id), entityType);
    }

    public static void init() {}
}
