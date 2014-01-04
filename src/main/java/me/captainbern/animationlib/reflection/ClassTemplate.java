package me.captainbern.animationlib.reflection;

import me.captainbern.animationlib.AnimationLib;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

public class ClassTemplate<T> {

    private Class<T> type;
    private List<SafeField<?>> fields;

    public ClassTemplate(){ }

    public ClassTemplate(Class<T> clazz){
        setClass(clazz);
    }

    protected void setClass(Class<T> clazz){
        this.type = clazz;
    }

    public List<SafeField<?>> getFields() {
        if (type == null) {
            return Collections.emptyList();
        }
        if (fields == null) {
            fields = populateFieldList(new ArrayList<SafeField<?>>(), type);
        }
        return Collections.unmodifiableList(fields);
    }

    private static List<SafeField<?>> populateFieldList(List<SafeField<?>> fields, Class<?> clazz) {
        if (clazz == null) {
            return fields;
        }
        Field[] declared = clazz.getDeclaredFields();
        ArrayList<SafeField<?>> newFields = new ArrayList<SafeField<?>>(declared.length);
        for (Field field : declared) {
            if (!Modifier.isStatic(field.getModifiers())) {
                newFields.add(new SafeField<Object>(field));
            }
        }
        fields.addAll(0, newFields);
        return populateFieldList(fields, clazz.getSuperclass());
    }

    public T newInstance(){
        if(this.type == null){
            throw new IllegalStateException("Class not set.");
        }

        try {
            return  getType().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Class<T> getType(){
        return this.type;
    }

    public static ClassTemplate<?> create(Class<?> type){
        if(type == null){
            AnimationLib.getInstance().getLogger().log(Level.WARNING, "Cannot create a ClassTemplate with null!");
            return null;
        }
        return new ClassTemplate(type);
    }

    public static ClassTemplate<?> create(String className){
        Class clazz = AnimationLib.SERVER.getClass(className);

        if(clazz == null){
            AnimationLib.getInstance().getLogger().log(Level.WARNING, "Failed to find a class for name = {0}!", className);
            return null;
        }
        return new ClassTemplate<Object>(clazz);
    }

    public boolean isAssignableFrom(Class<?> clazz){
        return this.getType().isAssignableFrom(clazz);
    }

    public boolean isInstanceOf(Object object){
        return this.getType().isInstance(object);
    }

    public <K> MethodAccessor<K> getMethod(String methodname, Class<?>... params){
        return new SafeMethod<K>(this.getType(), methodname, params);
    }

    public <K> FieldAccessor<K> getField(String fieldName){
        return new SafeField<K>(getType(), fieldName);
    }

    public <K> SafeConstructor<K> getConstructor(Class<?>... params){
        return new SafeConstructor<K>(getType(), params);
    }

    public <K> K getStaticFieldValue(String name) {
        return SafeField.get(getType(), name);
    }

    public <K> void setStaticFieldValue(String name, K value) {
        SafeField.setStatic(getType(), name, value);
    }
}
