package me.captainbern.animationlib.protocol;

import me.captainbern.animationlib.protocol.packets.*;

public class PacketClasses {

    public static NMSPacket DEFAULT = new NMSPacket();
    public static Packet17EntityLocationAction ENTITY_LOCATION_ACTION = new Packet17EntityLocationAction();
    public static Packet18ArmAnimation ARM_ANIMATION = new Packet18ArmAnimation();
    public static Packet40EntityMetadata ENTITY_METADATA = new Packet40EntityMetadata();
    public static Packet55BlockBreakAnimation BLOCK_BREAK_ANIMATION = new Packet55BlockBreakAnimation();
    public static Packet62NamedSoundEffect NAMED_SOUND_EFFECT = new Packet62NamedSoundEffect();
    public static Packet63WorldParticles WORLD_PARTICLES = new Packet63WorldParticles();
    public static Packet70Bed BED = new Packet70Bed();

}
