package me.captainbern.animationlib.reflection;

import me.captainbern.animationlib.AnimationLib;

import java.util.logging.Level;

public class ClassTemplate<T> {

    private Class<T> type;

    public ClassTemplate(){ }

    public ClassTemplate(Class<T> clazz){
        setClass(clazz);
    }

    protected void setClass(Class<T> clazz){
        this.type = clazz;
    }

    public T newInstance(){
        if(this.type == null){
            throw new IllegalStateException(AnimationLib.LOG_PREFIX + "Class not set.");
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

    public static ClassTemplate<?> create(String className){
        Class clazz = BukkitServer.getClass(className);

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
}
