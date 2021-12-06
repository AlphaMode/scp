package me.alphamode.scp.entity;

import me.alphamode.scp.core.ObjectClass;
import me.alphamode.scp.core.SCP;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.NotNull;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class SCP173 extends Entity implements SCP {
    public SCP173(EntityType<?> p_19870_, Level p_19871_) {
        super(p_19870_, p_19871_);
    }

    @Override
    public ObjectClass getObjectClass() {
        return null;
    }

    @Override
    protected void defineSynchedData() {

    }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {

    }

    @Override
    public @NotNull Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
