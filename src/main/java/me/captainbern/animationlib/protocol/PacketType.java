package me.captainbern.animationlib.protocol;

import me.captainbern.animationlib.AnimationLib;
import me.captainbern.animationlib.protocol.packets.*;

import java.util.HashMap;
import java.util.logging.Level;

public enum PacketType {

    UNKNOW(-1),
    ENTITY_LOCATION_ACTION(17),
    ARM_ANIMATION(18),
    ENTITY_METADATA(40),
    BLOCK_BREAK_ANIMATION(55),
    NAMED_SOUND_EFFECT(62),
    WORLD_PARTICLES(63),
    BED(70);


    private final HashMap<Integer, NMSPacket> packets = new HashMap<>();
    private NMSPacket packet;

    private PacketType(int id){
        if(packets.containsKey(id)){
            throw new UnsupportedOperationException("Unimplemented Packet!");
        }
        packet = packetById(id);
    }

    public NMSPacket getPacket(){
        return packet == null ? null : packet;
    }

    public NMSPacket packetById(int id){
        if(id >= 0 && id < 256){
            return packets.get(id);
        }else{
            return null;
        }
    }

    private void register(int id, NMSPacket packet){
        if(packets.containsKey(id)){
            AnimationLib.getInstance().getLogger().log(Level.WARNING, "Cannot register already registered: '{0}' ({1})!", new Object[]{packet.toString(), id});
            return;
        }
        packets.put(id, packet);
    }

    {
        register(-1, PacketClasses.DEFAULT);
        register(17, PacketClasses.ENTITY_LOCATION_ACTION);
        register(18, PacketClasses.ARM_ANIMATION);
        register(40, PacketClasses.ENTITY_METADATA);
        register(55, PacketClasses.BLOCK_BREAK_ANIMATION);
        register(62, PacketClasses.NAMED_SOUND_EFFECT);
        register(63, PacketClasses.WORLD_PARTICLES);
        register(70, PacketClasses.BED);
    }
}
