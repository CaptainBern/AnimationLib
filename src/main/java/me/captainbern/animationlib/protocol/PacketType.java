package me.captainbern.animationlib.protocol;

import me.captainbern.animationlib.AnimationLib;
import me.captainbern.animationlib.protocol.packets.*;

import java.util.HashMap;
import java.util.logging.Level;

public class PacketType {

    private static final HashMap<Integer, NMSPacket> packets = new HashMap<>();

    public static NMSPacket DEFAULT = new NMSPacket();
    public static Packet17EntityLocationAction ENTITY_LOCATION_ACTION = new Packet17EntityLocationAction();
    public static Packet18ArmAnimation ARM_ANIMATION = new Packet18ArmAnimation();
    public static Packet40EntityMetadata ENTITY_METADATA = new Packet40EntityMetadata();
    public static Packet55BlockBreakAnimation BLOCK_BREAK_ANIMATION = new Packet55BlockBreakAnimation();
    public static Packet62NamedSoundEffect NAMED_SOUND_EFFECT = new Packet62NamedSoundEffect();
    public static Packet63WorldParticles WORLD_PARTICLES = new Packet63WorldParticles();
    public static Packet70Bed BED = new Packet70Bed();

    public static Object byId(int id){
        if(id >= 0 && id < 256){
            return packets.get(id);
        }else{
            return null;
        }
    }

    private static void register(int id, NMSPacket packet){
        if(packets.containsKey(id)){
            AnimationLib.getInstance().getLogger().log(Level.WARNING, "Cannot register already registered: '{0}' ({1})!", new Object[]{packet.toString(), id});
            return;
        }
        packets.put(id, packet);
    }

    static{
        register(-1, DEFAULT);
        register(17, ENTITY_LOCATION_ACTION);
        register(18, ARM_ANIMATION);
        register(40, ENTITY_METADATA);
        register(55, BLOCK_BREAK_ANIMATION);
        register(62, NAMED_SOUND_EFFECT);
        register(63, WORLD_PARTICLES);
        register(70, BED);
    }
}
