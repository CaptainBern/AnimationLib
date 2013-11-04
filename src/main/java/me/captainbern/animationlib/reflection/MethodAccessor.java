package me.captainbern.animationlib.reflection;

public interface MethodAccessor<T> {

    T invoke(Object instance, Object... args);

}
