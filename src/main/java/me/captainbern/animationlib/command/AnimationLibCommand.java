package me.captainbern.animationlib.command;

import org.bukkit.Server;

public class AnimationLibCommand implements ICommand {

    private String name;

    public AnimationLibCommand(String commandName) {
        this.name = commandName;
    }

    @Override
    public void run(Server server, User user, CommandInfo info) {
        run(server, new CommandSource(user.getBase()), info);
    }

    @Override
    public void run(Server server, CommandSource sender, CommandInfo info) { }

    @Override
    public String getName() {
        return this.name;
    }
}
