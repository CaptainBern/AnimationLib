package me.captainbern.animationlib.protocol.packets;

import me.captainbern.animationlib.reflection.FieldAccessor;

public class Packet17EntityLocationAction extends NMSPacket {

    public final FieldAccessor<Integer> idField = getField("a");
    public final FieldAccessor<Integer> actionField = getField("e");

    public final FieldAccessor<Integer> xField = getField("b");
    public final FieldAccessor<Integer> yField = getField("c");
    public final FieldAccessor<Integer> zField = getField("d");

}
