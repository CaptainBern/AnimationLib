package me.captainbern.animationlib.protocol.packets;

import me.captainbern.animationlib.reflection.FieldAccessor;

public class Packet40EntityMetadata extends NMSPacket {

    public final FieldAccessor<Integer> idField = getField("a");
    public final FieldAccessor<Object> dataWatcherField = getField("b");

}
