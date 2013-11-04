package me.captainbern.animationlib.reflection;

import me.captainbern.animationlib.AnimationLib;

import java.util.logging.Level;

public class CBClassTemplate extends ClassTemplate<Object> {

    public CBClassTemplate(){
        setCBClass(getClass().getSimpleName());
    }

    public CBClassTemplate(String className){
        setCBClass(className);
    }

    protected void setCBClass(String name){
        Class clazz = BukkitServer.getCBClass(name);
        if(clazz == null){
            AnimationLib.getInstance().getLogger().log(Level.WARNING, "Failed to find a valid class for name = {0}!", name);
        }
        setClass(clazz);
    }

    public static CBClassTemplate create(String className){
        return new CBClassTemplate(className);
    }
}
