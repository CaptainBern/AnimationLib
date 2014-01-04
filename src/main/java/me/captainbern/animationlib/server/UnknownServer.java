package me.captainbern.animationlib.server;

import me.captainbern.animationlib.AnimationLib;

public class UnknownServer extends CraftBukkitServer { //we do not know this server brand so let's guess it's some random bukkit server.

    public boolean init() {
        if(!super.init()) {
            return false;
        }
        AnimationLib.LOGGER.warning("Could not identify this server brand! The API may not work correctly now!");
        return true;
    }

    @Override
    public String getName() {
        return "UNKNOWN SERVER";
    }
}
