package me.captainbern.animationlib.protocol.packets;

import me.captainbern.animationlib.reflection.FieldAccessor;

public class Packet63WorldParticles extends NMSPacket {

    public final FieldAccessor<String> particleName = getField("a");

    public final FieldAccessor<Float> xField = getField("b");
    public final FieldAccessor<Float> yField = getField("c");
    public final FieldAccessor<Float> zField = getField("d");

    public final FieldAccessor<Float> offesetX = getField("e");
    public final FieldAccessor<Float> offesetY = getField("f");
    public final FieldAccessor<Float> offsetZ = getField("g");

    public final FieldAccessor<Float> speed = getField("h");
    public final FieldAccessor<Integer> amount = getField("i");

}
