package me.captainbern.animationlib.utils;

import me.captainbern.animationlib.protocol.Packet;
import me.captainbern.animationlib.reflection.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class EntityUtil {

    public static void sendPacket(Player player, Packet packet){
        MethodAccessor<Void> sendPacket = new SafeMethod<Void>(BukkitServer.getNMSClass("PlayerConnection"), "sendPacket", BukkitServer.getNMSClass("Packet"));
        Object playerConnection = getPlayerConnection(player);

        sendPacket.invoke(playerConnection, packet.getHandle());
    }

    public static Object playerToEntityPlayer(Player player){
        MethodAccessor<Object> getHandle = new SafeMethod<Object>(player.getClass(), "getHandle");
        return getHandle.invoke(player);
    }

    public static Object getPlayerConnection(Player player){
        FieldAccessor<Object> playerConnection = new SafeField<Object>(BukkitServer.getNMSClass("EntityPlayer"), "playerConnection");
        return playerConnection.get(playerToEntityPlayer(player));
    }

    public static Object getHandle(Entity entity){
        return new SafeMethod(entity.getClass(), "getHandle").invoke(entity);
    }
}
