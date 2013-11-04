package me.captainbern.animationlib.protocol.packets;

import me.captainbern.animationlib.reflection.FieldAccessor;

public class Packet18ArmAnimation extends NMSPacket {

    public final FieldAccessor<Integer> idField = this.getField("a");
    public final FieldAccessor<Integer> actionField = this.getField("b");

}
