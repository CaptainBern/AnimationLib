package me.captainbern.animationlib.reflection;

import me.captainbern.animationlib.AnimationLib;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.logging.Level;

public class SafeField<T> implements FieldAccessor<T> {

    private Field field;
    private boolean isStatic;

    public SafeField(Field field){
        setField(field);
    }

    public SafeField(Class<?> coreClass, String fieldName){
        try {
            Field field = coreClass.getDeclaredField(fieldName);
            setField(field);
        } catch (NoSuchFieldException e) {
            AnimationLib.getInstance().getLogger().log(Level.WARNING, "No such field '{0}'!", fieldName);
        }
    }

    protected void setField(Field field){
        if(!field.isAccessible()){
            try{
                field.setAccessible(true);
            }catch(Exception e){
                e.printStackTrace();
                field = null;
            }
        }
        this.field = field;
        this.isStatic = Modifier.isStatic(field.getModifiers());
    }

    @Override
    public boolean set(Object instance, T value) {
        if(!isStatic && instance == null){
            throw new UnsupportedOperationException("Non-static fields require a valid instance passed in!");
        }

        try {
            this.field.set(instance, value);
            return true;
        } catch (IllegalAccessException e) {
            AnimationLib.getInstance().getLogger().log(Level.WARNING, "Failed to access field '{0}'!", this.toString());
        }
        return false;
    }

    @Override
    public T get(Object instance) {
        if(!isStatic && instance == null){
            throw new UnsupportedOperationException("Non-static fields require a valid instance passed in!");
        }
        try {
            return (T) this.field.get(instance);
        } catch (IllegalAccessException e) {
            AnimationLib.getInstance().getLogger().log(Level.WARNING, "Failed to access field '{0}'!", this.toString());
        }
        return null;
    }

    public String getName(){
        return this.field.getName();
    }

    public String toString(){
        StringBuilder string = new StringBuilder(75);
        int mod = this.field.getModifiers();
        if(Modifier.isPublic(mod)){
            string.append("public ");
        }else if(Modifier.isPrivate(mod)){
            string.append("private ");
        }else if(Modifier.isProtected(mod)){
            string.append("protected ");
        }

        if(Modifier.isStatic(mod)){
            string.append("static ");
        }

        string.append(this.field.getName());

        return string.toString();
    }

    public static <T> T get(Class<?> clazz, String fieldname) {
        return new SafeField<T>(clazz, fieldname).get(null);
    }

    public static <T> T get(Object instance, String fieldName){
        return new SafeField<T>(instance.getClass(), fieldName).get(instance);
    }

    public static <T> void set(Object instance, String fieldName, T value){
        new SafeField<T>(instance.getClass(), fieldName).set(instance, value);
    }

    public static <T> void setStatic(Class<?> clazz, String fieldname, T value) {
        new SafeField<T>(clazz, fieldname).set(null, value);
    }
}
