package me.captainbern.animationlib;

import me.captainbern.animationlib.command.CommandInfo;
import me.captainbern.animationlib.command.CommandSource;
import me.captainbern.animationlib.command.ICommand;
import me.captainbern.animationlib.command.User;
import me.captainbern.animationlib.server.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class AnimationLib extends JavaPlugin {

    private static AnimationLib instance;

    public static final int SUPPORTED_VERSION_NUMERIC = 171;
    public static final String CRAFBUKKIT_ROOT = "org.bukkit.craftbukkit";
    public static final String MINECRAFT_ROOT = "net.minecraft.server";
    public static Server SERVER = null;

    public static final ModuleLogger LOGGER = new ModuleLogger("AnimationLib");

    public void onEnable(){
        initServer();
        instance = this;
        getLogger().info("Enabled");
    }

    protected void initServer() {
        List<Server> servers = new ArrayList<Server>();
        servers.add(new MCPCPlusServer());
        servers.add(new SpigotServer());
        servers.add(new CraftBukkitServer());
        servers.add(new UnknownServer());

        for(Server server : servers) {
            if(server.init()) {   //the first server type that returns true on init is a valid server brand.
                this.SERVER = server;
                break;
            }
        }

        if(SERVER == null) {
            LOGGER.warning("Failed to identify the server brand! The API will not run correctly -> disabling");
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        } else {
            if(!SERVER.isCompatible()) {
                LOGGER.warning("This Server version may not be compatible with AnimationLib!");
            }
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        String permissionPrefix = "animationlib.debug.";
        String commandPath = "me.captainbern.animationlib.command.commands.Command";
        ICommand cmd = null;

        User user = null;
        Block sBlock = null;

        if(sender instanceof Player){

            user = new User((Player) sender);

        }else if(sender instanceof BlockCommandSender){

            BlockCommandSender bCmdSender = (BlockCommandSender) sender;
            sBlock = bCmdSender.getBlock();

            LOGGER.log(Level.INFO, "CommandBlock at {0}, {1}, {2} issued AnimationLib (debug) command: /{3}", new Object[]
                    {
                            sBlock.getX(), sBlock.getY(), sBlock.getZ(), command.getName()
                    });

        }

        CommandSource source = new CommandSource(sender);

        try {

            cmd = (ICommand) this.getClassLoader().loadClass(commandPath + command.getName()).newInstance();

        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Failed to execute {0} command!", command.getName());
            return true;
        }

        if(user != null && !user.isAuthorized(cmd, permissionPrefix)){
            user.sendMessage(ChatColor.RED + "You don't have permission to execute this command.");
            LOGGER.log(Level.INFO, "Player {0} issued AnimationLib (debug) command: /{1}", new Object[]{user.getBase().getName(), command.getName()});
            return true;
        }

        //run the command
        try{
            if(user != null){
                cmd.run(getServer(), user, new CommandInfo(command, args));
                return true;
            }else{
                cmd.run(getServer(), source, new CommandInfo(command, args));
                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return true;
    }

    public static AnimationLib getInstance(){
        if(instance == null) {
            LOGGER.warning("Instance is null!");
            return null;
        }
        return instance;
    }

    public String generateServerInfo() {
        StringBuilder builder = new StringBuilder(1000);
        builder.append("Identified server brand: " + AnimationLib.SERVER.getName() + "\n");
        builder.append("Detected MC version: " + AnimationLib.SERVER.getVersion() + "\n");
        builder.append("Supported MC version: " + AnimationLib.SUPPORTED_VERSION_NUMERIC + "\n");
        return builder.toString();
    }
}
