package me.captainbern.animationlib;

import org.bukkit.plugin.java.JavaPlugin;

public class AnimationLib extends JavaPlugin {

    private static AnimationLib instance;
    public static final String LOG_PREFIX = "[AnimationLib] ";

    public void onEnable(){
        instance = this;

        getLogger().info("Enabled");
    }

    /**
     * Used when players would activate this through console or something
     */
    public static void main(String[] args){
        System.out.print("This is a library for Bukkit, place it in your plugins folder!");
    }

    public static AnimationLib getInstance(){
        return instance;
    }
}
