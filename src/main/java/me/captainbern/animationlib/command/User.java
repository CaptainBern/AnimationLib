package me.captainbern.animationlib.command;

import org.bukkit.entity.Player;

public class User {

    private Player sender;

    public User(Player player){
        this.sender = player;
    }

    public boolean isAuthorized(ICommand cmd, String permissionPrefix){
        return this.sender.hasPermission(permissionPrefix + cmd.getName()) ? true : false;
    }

    public void sendMessage(String message){
        this.sender.sendMessage(message);
    }

    public final Player getBase() {
        return sender;
    }
}
