package me.alphamode.scp;

import me.alphamode.scp.client.rendering.entity.SCP173Renderer;
import me.alphamode.scp.entity.SCP173;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

@Mod.EventBusSubscriber(modid = SCPMod.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AllEntities {

    private static final List<EntityType<?>> ENTITIES = new ArrayList<>();

    public static final MobCategory SCP = MobCategory.create("SCP", "scp", -1, false, false, 64);

    public static final EntityType<SCP173> SCP_173 = buildScp(SCP173::new, 173, EntityDimensions.fixed(1f, 5f));

    public static <E extends Entity> EntityType<E> buildScp(EntityType.EntityFactory<E> factory, int id, EntityDimensions dimensions) {
        EntityType<E> entityType = EntityType.Builder.of(factory, SCP).build("scp_" + id);
        entityType.setRegistryName(SCPMod.ID, "scp_" + id);
        ENTITIES.add(entityType);
        return entityType;
    }

    @SubscribeEvent
    public static void onRegister(RegistryEvent.Register<EntityType<?>> register) {
        ENTITIES.forEach(register.getRegistry()::register);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(SCP_173, SCP173.attributes().build());
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(SCP_173, SCP173Renderer::new);
    }
}
