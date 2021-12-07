package me.alphamode.scp.client.rendering.entity;

import me.alphamode.scp.SCPMod;
import me.alphamode.scp.client.model.SCP173Model;
import me.alphamode.scp.entity.SCP173;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.resources.ResourceLocation;

public class SCP173Renderer extends LivingEntityRenderer<SCP173, SCP173Model> {
    public SCP173Renderer(EntityRendererProvider.Context context) {
        super(context, new SCP173Model(context.bakeLayer(SCP173Model.LAYER_LOCATION)), .5f);
    }

    @Override
    public ResourceLocation getTextureLocation(SCP173 p_114482_) {
        return SCPMod.asResource("");
    }
}
