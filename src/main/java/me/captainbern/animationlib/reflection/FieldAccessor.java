package me.captainbern.animationlib.reflection;

public interface FieldAccessor<T> {

    public ClassTemplate getType();

    boolean set(Object instance, T value);

    T get(Object instance);

    T transfer(Object from, Object to);

    boolean isPublic();

    boolean isReadOnly();

    void setReadOnly(Object target, boolean value);

}
