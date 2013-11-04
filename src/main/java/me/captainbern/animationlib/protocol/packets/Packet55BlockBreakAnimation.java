package me.captainbern.animationlib.protocol.packets;

import me.captainbern.animationlib.reflection.FieldAccessor;

public class Packet55BlockBreakAnimation extends NMSPacket {

    public final FieldAccessor<Integer> actionField = getField("a");

    public final FieldAccessor<Integer> xField = getField("b");
    public final FieldAccessor<Integer> yField = getField("c");
    public final FieldAccessor<Integer> zField = getField("d");

    public final FieldAccessor<Integer> damageField = getField("e");

}
