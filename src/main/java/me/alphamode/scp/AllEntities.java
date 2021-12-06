package me.alphamode.scp;

import me.alphamode.scp.entity.SCP173;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

@Mod.EventBusSubscriber(modid = SCPMod.ID)
public class AllEntities {
    public static final MobCategory SCP = MobCategory.create("SCP", "scp", -1, false, false, 64);

    public static final EntityType<SCP173> SCP_173 = buildScp(SCP173::new, 173, EntityDimensions.fixed(1f, 5f));

    public static <E extends Entity> EntityType<E> buildScp(EntityType.EntityFactory<E> factory, int id, EntityDimensions dimensions) {
        EntityType<E> entityType = EntityType.Builder.of(factory, SCP).build("scp_" + id);
        entityType.setRegistryName(SCPMod.ID, "scp_" + id);
        entities.add(entityType);
        return entityType;
    }

    private static final List<EntityType<?>> entities = new ArrayList<>();

    @SubscribeEvent
    public static void onRegister(RegistryEvent.Register<EntityType<?>> register) {
        entities.forEach(register.getRegistry()::register);
    }
}
