package me.captainbern.animationlib.protocol.packets;

import me.captainbern.animationlib.reflection.BukkitServer;
import me.captainbern.animationlib.reflection.MethodAccessor;
import me.captainbern.animationlib.reflection.NMSClassTemplate;

public class NMSPacket extends NMSClassTemplate{

    private Class<?> packetClass = BukkitServer.getNMSClass("Packet");
    private MethodAccessor<Void> register = getMethod("a", int.class, boolean.class, boolean.class, Class.class);
    private MethodAccessor<Integer> size = getMethod("a");

    public void register(int id, boolean serverSide, boolean clientSide, Class<?> packetClass){
        register.invoke(null, id, serverSide, clientSide, packetClass);
    }

    public int getPacketSize(Object packet){
        return size.invoke(packet);
    }

    public NMSPacket(Class<?> clazz){
        this.setNMSClass(clazz.getName());
    }
}
