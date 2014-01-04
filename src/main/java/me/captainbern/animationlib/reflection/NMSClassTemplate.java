package me.captainbern.animationlib.reflection;

import me.captainbern.animationlib.AnimationLib;

import java.util.logging.Level;

public class NMSClassTemplate extends ClassTemplate {

    protected NMSClassTemplate(){
        setNMSClass(getClass().getSimpleName());
    }

    public NMSClassTemplate(String className){
        setNMSClass(className);
    }

    protected void setNMSClass(String name){
        Class clazz = AnimationLib.SERVER.getNMSClass(name);
        if(clazz == null){
            AnimationLib.getInstance().getLogger().log(Level.WARNING, "Failed to find a valid class for name = {0}!", name);
        }
        setClass(clazz);
    }

    public static NMSClassTemplate create(String className){
        return new NMSClassTemplate(className);
    }
}
