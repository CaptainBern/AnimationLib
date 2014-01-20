package me.captainbern.animationlib.reflection.conversion;

public interface Converter<T> {

    public T convert(Object value, T def);

    public T convert(Object value);

    public Class<T> getOutputType();

}
