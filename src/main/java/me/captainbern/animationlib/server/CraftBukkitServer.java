package me.captainbern.animationlib.server;

import me.captainbern.animationlib.AnimationLib;
import org.bukkit.Bukkit;

public class CraftBukkitServer implements Server {

    public String MC_VERSION;

    public int MC_VERSION_NUMERIC;

    public String CRAFTBUKKIT_VERSIONED;

    public String MINECRAFT_VERSIONED;

    @Override
    public boolean init() {
        String serverPath = Bukkit.getServer().getClass().getName();

        if(!serverPath.startsWith(AnimationLib.CRAFBUKKIT_ROOT)) {
            return false;
        }

        MC_VERSION = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];

        if(MC_VERSION.isEmpty()) {
            CRAFTBUKKIT_VERSIONED = AnimationLib.CRAFBUKKIT_ROOT;
            MINECRAFT_VERSIONED = AnimationLib.MINECRAFT_ROOT;
        } else {
            CRAFTBUKKIT_VERSIONED = AnimationLib.CRAFBUKKIT_ROOT + "." + MC_VERSION;
            MINECRAFT_VERSIONED = AnimationLib.MINECRAFT_ROOT + "." + MC_VERSION;
        }

      MC_VERSION_NUMERIC = Integer.valueOf(MC_VERSION.replaceAll("[^0-9]", ""));

        return true;
    }

    @Override
    public boolean postInit() {
        return false;
    }

    @Override
    public Class getClass(String name) {
        try{
            return Class.forName(name);
        }catch(Exception e){
            AnimationLib.LOGGER.warning("Failed to find matching class for: " + name);
            return null;
        }
    }

    @Override
    public Class getNMSClass(String name) {
        return getClass(MINECRAFT_VERSIONED + "." + name);
    }

    @Override
    public Class getCBClass(String name) {
        return getClass(CRAFTBUKKIT_VERSIONED + "." + name);
    }

    @Override
    public String getName() {
        return "CraftBukkit";
    }

    @Override
    public int getVersion() {
        return MC_VERSION_NUMERIC;
    }

    @Override
    public String getMCVersion() {
        return MC_VERSION;
    }

    @Override
    public boolean isCompatible() {
        return (AnimationLib.SUPPORTED_VERSION_NUMERIC == MC_VERSION_NUMERIC) ? true : false;
    }
}
