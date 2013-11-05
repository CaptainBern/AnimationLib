package me.captainbern.animationlib.reflection;

public interface FieldAccessor<T> {

    boolean set(Object instance, T value);

    T get(Object instance);

}
