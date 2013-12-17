package me.captainbern.animationlib.command;

import org.bukkit.command.Command;

public class CommandInfo {

    private Command command;
    private String[] args;

    public CommandInfo(Command command, String[] commandArgs) {
        this.command = command;
        this.args = commandArgs;
    }

    public Command getCommand() {
        return this.command;
    }

    public String[] getArgs() {
        return this.args;
    }
}
