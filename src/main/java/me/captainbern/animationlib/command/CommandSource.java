package me.captainbern.animationlib.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSource {

    private CommandSender commandSender;

    public CommandSource(CommandSender sender){
        this.commandSender = sender;
    }

    public void sendMessage(String message){
        this.commandSender.sendMessage(message);
    }

    public CommandSender getCommandSender() {
        return this.commandSender;
    }

    public boolean isPlayer(){
        return commandSender instanceof Player ? true : false;
    }
}
