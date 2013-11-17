package me.captainbern.animationlib.animations.mobs;

import me.captainbern.animationlib.AnimationLib;
import me.captainbern.animationlib.protocol.Packet;
import me.captainbern.animationlib.protocol.PacketType;

import org.bukkit.entity.Creeper;

public enum CreeperAnimation {

    CHARGED{
        @Override
        protected void broadcastAnimation(Creeper entity){

            Packet packet = new Packet(PacketType.ENTITY_METADATA);
            packet.write("a", entity.getEntityId());

        }
    },
    UNCHARGED,
    FUSE;

    public void play(Creeper entity){
        broadcastAnimation(entity);
    }

    protected void broadcastAnimation(Creeper entity){
        throw new UnsupportedOperationException(AnimationLib.LOG_PREFIX + "Unimplemented animation");
    }
}
