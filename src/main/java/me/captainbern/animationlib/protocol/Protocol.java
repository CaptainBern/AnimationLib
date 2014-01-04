package me.captainbern.animationlib.protocol;

import me.captainbern.animationlib.AnimationLib;

public enum Protocol {

    HANDSHAKE,
    PLAY,
    STATUS,
    LOGIN;

    private Protocol() {}

    public Object toVanilla() {
        switch (this) {
            case HANDSHAKE : return Enum.valueOf(AnimationLib.SERVER.getNMSClass("EnumProtocol"), "HANDSHAKING");
            case PLAY : return Enum.valueOf(AnimationLib.SERVER.getNMSClass("EnumProtocol"), "PLAY");
            case STATUS : return Enum.valueOf(AnimationLib.SERVER.getNMSClass("EnumProtocol"), "STATUS");
            case LOGIN : return Enum.valueOf(AnimationLib.SERVER.getNMSClass("EnumProtocol"), "LOGIN");
            default : return null;
        }
    }
}
