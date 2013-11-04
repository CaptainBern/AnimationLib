package me.captainbern.animationlib.protocol.packets;

import me.captainbern.animationlib.reflection.FieldAccessor;

public class Packet62NamedSoundEffect extends NMSPacket {

    public final FieldAccessor<String> soundName = getField("a");

    public final FieldAccessor<Integer> xField = getField("b");
    public final FieldAccessor<Integer> yField = getField("c");
    public final FieldAccessor<Integer> zField = getField("d");

    public final FieldAccessor<Float> volumeField = getField("e");
    public final FieldAccessor<Integer> pitchField = getField("f");

}
