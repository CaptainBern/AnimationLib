package me.captainbern.animationlib.command;

import org.bukkit.Server;

public interface ICommand {

    void run(Server server, User user, CommandInfo info);

    void run(Server server, CommandSource source, CommandInfo info);

    String getName();

}
