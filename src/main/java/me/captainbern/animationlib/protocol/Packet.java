package me.captainbern.animationlib.protocol;

import me.captainbern.animationlib.AnimationLib;
import me.captainbern.animationlib.protocol.packets.NMSPacket;
import me.captainbern.animationlib.reflection.FieldAccessor;
import me.captainbern.animationlib.reflection.SafeField;

import java.lang.reflect.Field;
import java.util.logging.Level;

public class Packet {

    private NMSPacket type;
    private Object handle;

    public Packet(NMSPacket packettype){
        type = packettype;
    }

    public Packet(PacketType packetType) {
        this.type = packetType.getPacket();
    }

    public Object getHandle(){
        return handle;
    }

    public <T> void write(FieldAccessor<T> accessor, T value){
        accessor.set(getHandle(), value);
    }

    public void write(Field field, Object value){
        try {
            field.set(getHandle(), value);
        } catch (IllegalAccessException e) {
            AnimationLib.getInstance().getLogger().log(Level.WARNING, "Could not access field: '{0}'!", field.getName());
            e.printStackTrace();
        }
    }

    public void write(String fieldName, Object value){
        SafeField.set(getHandle(), fieldName, value);
    }

    public void write(int index, Object value){
        FieldAccessor accessor = type.getFields().get(index);
        accessor.set(handle, value);
    }
}
