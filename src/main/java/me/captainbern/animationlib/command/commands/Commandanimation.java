package me.captainbern.animationlib.command.commands;

import me.captainbern.animationlib.command.AnimationLibCommand;
import me.captainbern.animationlib.command.CommandInfo;
import me.captainbern.animationlib.command.CommandSource;
import org.bukkit.ChatColor;
import org.bukkit.Server;

public class Commandanimation extends AnimationLibCommand{

    public Commandanimation() {
        super("use");
    }

    @Override
    public void run(Server server, CommandSource sender, CommandInfo info) {
        sender.sendMessage(ChatColor.GOLD + "The available debug commands are:");
        sender.sendMessage(ChatColor.GREEN + "/playeranimation <animation type> <player> " + ChatColor.AQUA + "used to play an animation at a specific player");
        sender.sendMessage(ChatColor.GREEN + "/blockanimation <damage> " + ChatColor.AQUA + "Used to apply damage cracks at the target block. (damage needs to be between 0 and 9)");
    }
}
