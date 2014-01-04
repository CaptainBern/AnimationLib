package me.captainbern.animationlib.animations.protocol;

import com.captainbern.npclib.reflection.ReflectionUtil;

public enum Protocol {

    HANDSHAKE,
    PLAY,
    STATUS,
    LOGIN;

    private Protocol() {}

    public Object toVanilla() {
        switch (this) {
            case HANDSHAKE : return Enum.valueOf(ReflectionUtil.getNMSClass("EnumProtocol"), "HANDSHAKING");
            case PLAY : return Enum.valueOf(ReflectionUtil.getNMSClass("EnumProtocol"), "PLAY");
            case STATUS : return Enum.valueOf(ReflectionUtil.getNMSClass("EnumProtocol"), "STATUS");
            case LOGIN : return Enum.valueOf(ReflectionUtil.getNMSClass("EnumProtocol"), "LOGIN");
            default : return null;
        }
    }
}
