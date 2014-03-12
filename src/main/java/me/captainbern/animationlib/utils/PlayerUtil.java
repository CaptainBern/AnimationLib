package me.captainbern.animationlib.utils;

import me.captainbern.animationlib.AnimationLib;
import me.captainbern.animationlib.protocol.Packet;
import me.captainbern.animationlib.reflection.*;
import net.minecraft.util.io.netty.channel.Channel;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class PlayerUtil {

    private static final MethodAccessor<Void> sendPacket = new SafeMethod<Void>(AnimationLib.SERVER.getNMSClass("PlayerConnection"), "sendPacket", AnimationLib.SERVER.getNMSClass("Packet"));
    private static final FieldAccessor<Object> playerConnection = new SafeField<Object>(AnimationLib.SERVER.getNMSClass("EntityPlayer"), "playerConnection");
    private static final FieldAccessor<Object> networkManager = new SafeField<Object>(AnimationLib.SERVER.getNMSClass("PlayerConnection"), "networkManager");
    private static final FieldAccessor<Channel> channelField = new SafeField<Channel>(AnimationLib.SERVER.getNMSClass("NetworkManager"), "k");

    public static void sendPacket(Player player, Packet packet) {
        Object playerConnection = getPlayerConnection(player);

        sendPacket.invoke(playerConnection, packet.getHandle());
    }

    public static Object playerToEntityPlayer(Player player) {
        MethodAccessor<Object> getHandle = new SafeMethod<Object>(player.getClass(), "getHandle");
        return getHandle.invoke(player);
    }

    public static Object getPlayerConnection(Player player) {
        return playerConnection.get(playerToEntityPlayer(player));
    }

    public static Object getNetworkManager(Player player) {
        return networkManager.get(getPlayerConnection(player));
    }

    public static Channel getChannel(Player player) {
        return channelField.get(getNetworkManager(player));
    }

    public static Object getHandle(Entity entity){
        return new SafeMethod(entity.getClass(), "getHandle").invoke(entity);
    }
}
