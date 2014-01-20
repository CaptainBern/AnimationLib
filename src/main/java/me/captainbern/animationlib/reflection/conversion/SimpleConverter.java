package me.captainbern.animationlib.reflection.conversion;

public abstract class SimpleConverter<T> implements Converter<T> {

    private Class<T> output;

    public SimpleConverter(Class<T> output) {
        this.output = output;
    }

    protected abstract T convert(Object value, Class<?> valueClass, T def);

    @Override
    @SuppressWarnings("unchecked")
    public final T convert(Object value, T def) {
        if (value == null) {
            return def;
        } else if (getOutputType().isInstance(value)) {
            return (T) value;
        } else {
            return convert(value, value.getClass(), def);
        }
    }

    @Override
    public final T convert(Object value) {
        return convert(value, null);
    }

    @Override
    public Class<T> getOutputType() {
        return output;
    }
}
