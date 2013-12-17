package me.captainbern.animationlib.command.commands;

import me.captainbern.animationlib.animations.PlayerAnimation;
import me.captainbern.animationlib.command.AnimationLibCommand;
import me.captainbern.animationlib.command.CommandInfo;
import me.captainbern.animationlib.command.CommandSource;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.entity.Player;

public class Commandplayeranimation extends AnimationLibCommand {

    public Commandplayeranimation() {
        super("playeranimation");
    }

    @Override
    public void run(Server server, CommandSource sender, CommandInfo info) {
        if(info.getArgs().length == 0) {
            sender.sendMessage(ChatColor.RED + "Wrong arguments! Type '/playeranimation help' to see a list of available animations.");
            return;
        }

        if(info.getArgs().length == 1) {
            if(info.getArgs()[0].equalsIgnoreCase("help")) {
                sender.sendMessage("All possible player animations are: ");

                StringBuilder builder = new StringBuilder(1000);
                for(PlayerAnimation type : PlayerAnimation.values()) {
                    builder.append(type.name() + ", ");
                }

                String types = builder.substring(0, builder.length() - 2);

                sender.sendMessage(types);
                return;
            } else {
                sender.sendMessage(ChatColor.RED + "Wrong arguments! Type '/playeranimation help' to see a list of available animations.");
                return;
            }
        }

        if(info.getArgs().length != 2) {
            sender.sendMessage(ChatColor.RED + "Not enough arguments! Correct usage: /playeranimation <animation> <player>");
            return;
        }

        if(getAnimationFromString(info.getArgs()[0]) == null) {
            sender.sendMessage(ChatColor.RED + "Could not find a valid animation type for: " + info.getArgs()[0]);
            return;
        }

        if(Bukkit.getPlayer(info.getArgs()[1]) == null) {
            sender.sendMessage(ChatColor.RED + "Could not find a valid player for name: " + info.getArgs()[1]);
            return;
        }

        Player player = Bukkit.getPlayerExact(info.getArgs()[1]);
        PlayerAnimation animation = getAnimationFromString(info.getArgs()[0]);
        animation.play(player);
        sender.sendMessage(ChatColor.GREEN + "Played '" + animation.name() + "' at player: " + player.getName());
    }

    private PlayerAnimation getAnimationFromString(String value) {
        for(PlayerAnimation animation : PlayerAnimation.values()) {
            if(animation.name().equalsIgnoreCase(value)) {
                return animation;
            }
        }
        return null;
    }
}
