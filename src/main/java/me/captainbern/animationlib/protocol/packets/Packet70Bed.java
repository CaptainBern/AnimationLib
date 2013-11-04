package me.captainbern.animationlib.protocol.packets;

import me.captainbern.animationlib.reflection.FieldAccessor;

public class Packet70Bed extends NMSPacket {

    public final FieldAccessor<Integer> idField = getField("a");
    public final FieldAccessor<Integer> actionField = getField("b");

}
