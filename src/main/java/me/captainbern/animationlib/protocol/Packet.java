package me.captainbern.animationlib.protocol;

import me.captainbern.animationlib.AnimationLib;
import me.captainbern.animationlib.reflection.ClassTemplate;
import me.captainbern.animationlib.reflection.FieldAccessor;
import me.captainbern.animationlib.reflection.SafeField;

import java.lang.reflect.Field;
import java.util.logging.Level;

public class Packet {

    protected ClassTemplate<?> packetTemplate;
    protected Object handle;

    public Packet(Class<?> packettype) {
        this.packetTemplate = new ClassTemplate(packettype);
        this.handle = packetTemplate.newInstance();
    }

    public Packet(PacketType packetType) {
        this.packetTemplate = packetType.getPacketClassAsTemplate();
        this.handle = packetType.getPacketClassAsTemplate().newInstance();
    }

    public Packet(Object handle) {
        this.packetTemplate = new ClassTemplate(handle.getClass());
        this.handle = handle;
    }

    public Object getHandle() {
        return this.handle;
    }

    public <T> void write(FieldAccessor<T> accessor, T value) {
        accessor.set(this.getHandle(), value);
    }

    public void write(Field field, Object value) {
        try {
            field.set(this.getHandle(), value);
        } catch (IllegalAccessException e) {
            AnimationLib.getInstance().getLogger().log(Level.WARNING, "Could not access field: '{0}'!", field.getName());
            e.printStackTrace();
        }
    }

    public void write(String fieldName, Object value) {
        SafeField.set(this.getHandle(), fieldName, value);
    }

    public void write(int index, Object value) {
        String field = String.valueOf(this.packetTemplate.getFields().get(index));
        write(field, value);
    }

    public <T> T read(FieldAccessor<T> field) {
        return field.get(this.getHandle());
    }

    public Object read(Field field) {
        try {
            return field.get(this.getHandle());
        } catch (IllegalAccessException e) {
            AnimationLib.getInstance().getLogger().log(Level.WARNING, "Could not read field: '{0}'!", field.getName());
            return null;
        }
    }

    public Object read(int index) {
        return this.packetTemplate.getFields().get(index).get(this.getHandle());
    }

    public Object read(String fieldName) {
        return packetTemplate.getField(fieldName).get(this.getHandle());
    }
}