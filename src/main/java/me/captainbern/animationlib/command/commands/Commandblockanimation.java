package me.captainbern.animationlib.command.commands;

import me.captainbern.animationlib.animations.BlockAnimation;
import me.captainbern.animationlib.command.AnimationLibCommand;
import me.captainbern.animationlib.command.CommandInfo;
import me.captainbern.animationlib.command.CommandSource;
import me.captainbern.animationlib.command.User;
import me.captainbern.animationlib.utils.StringUtil;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class Commandblockanimation extends AnimationLibCommand{

    public Commandblockanimation() {
        super("blockanimation");
    }

    @Override
    public void run(Server server, CommandSource sender, CommandInfo info) {
        sender.sendMessage(ChatColor.RED + "This command can only be run in-game!");
    }

    @Override
    public void run(Server server, User sender, CommandInfo info) {
        if(info.getArgs().length == 0) {
            sender.sendMessage(ChatColor.RED + "Wrong arguments! Type '/blockanimation help' to see a list of available animations.");
            return;
        }

        if(info.getArgs().length == 1) {
            if(info.getArgs()[0].equalsIgnoreCase("help")) {
                sender.sendMessage("All possible player animations are: ");

                StringBuilder builder = new StringBuilder(1000);
                for(BlockAnimation type : BlockAnimation.values()) {
                    builder.append(type.name() + ", ");
                }

                String types = builder.substring(0, builder.length() - 2);

                sender.sendMessage(types);
                return;
            } else {
                sender.sendMessage(ChatColor.RED + "Wrong arguments! Type '/blockanimation help' to see a list of available animations.");
                return;
            }
        }

        if(info.getArgs().length == 2) {
            if(getAnimationFromString(info.getArgs()[0]) == null) {
                sender.sendMessage(ChatColor.RED + "Could not find a valid animation type for: " + info.getArgs()[0]);
                return;
            }

            if (!StringUtil.isNumeric(info.getArgs()[1])) {
                sender.sendMessage(ChatColor.RED + "Wrong arguments! Second argument needs to be an integer between 0 and 9!");
                return;
            }
            int i = Integer.parseInt(info.getArgs()[1]);

            if ((i < 0) || (i > 9)) {
                sender.sendMessage(ChatColor.RED + "Wrong arguments! Second argument needs to be between 0 and 9!");
                return;
            }

            BlockAnimation animation = getAnimationFromString(info.getArgs()[0]);
            Player player = sender.getBase();
            Block block = player.getTargetBlock(null, 200);
            short damage = Short.parseShort(info.getArgs()[1]);
            animation.play(block, damage);
            sender.sendMessage(ChatColor.GREEN + "played '" + animation.name() + "' at: " + block.getX() + ", " + block.getY() + ", " + block.getY());
        } else {
            sender.sendMessage(ChatColor.RED + "Wrong arguments! Type '/blockanimation help' to see a list of available animations.");
        }
    }

    private BlockAnimation getAnimationFromString(String value) {
        for(BlockAnimation animation : BlockAnimation.values()) {
            if(animation.name().equalsIgnoreCase(value)) {
                return animation;
            }
        }
        return null;
    }
}
