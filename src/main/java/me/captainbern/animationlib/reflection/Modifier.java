package me.captainbern.animationlib.reflection;

import com.google.common.collect.Maps;

import java.util.HashMap;

public class Modifier<T> {

    protected ClassTemplate<T> targetTemplate;
    protected Object target;

    private HashMap<Class, Modifier> cache = Maps.newHashMap();

    public Modifier(Object object) {
        this(ClassTemplate.create(object.getClass()), object);
    }

    public Modifier(Class<?> clazz) {
        this(ClassTemplate.create(clazz), null);
    }

    public Modifier(ClassTemplate template, Object object) {
        this.targetTemplate = template;
        this.target = object;
    }

    public <T> Modifier<T> withType(T type) {
        //TODO scan fields, check if they're instanceof type.
        if(cache.containsKey(type)) {
            return cache.get(type);
        }

        for(SafeField field : targetTemplate.getFields()) {
            if(field.getType().isAssignableFrom(type.getClass())) {

            }
        }

        return null;
    }
}
