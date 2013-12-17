package me.captainbern.animationlib.protocol;

import me.captainbern.animationlib.reflection.BukkitServer;

public enum Protocol {

    HANDSHAKE,
    PLAY,
    STATUS,
    LOGIN;

    private Protocol() {}

    public Object toVanilla() {
        switch (this) {
            case HANDSHAKE : return Enum.valueOf(BukkitServer.getNMSClass("EnumProtocol"), "HANDSHAKING");
            case PLAY : return Enum.valueOf(BukkitServer.getNMSClass("EnumProtocol"), "PLAY");
            case STATUS : return Enum.valueOf(BukkitServer.getNMSClass("EnumProtocol"), "STATUS");
            case LOGIN : return Enum.valueOf(BukkitServer.getNMSClass("EnumProtocol"), "LOGIN");
            default : return null;
        }
    }
}
