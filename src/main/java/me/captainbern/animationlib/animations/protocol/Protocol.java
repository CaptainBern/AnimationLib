package me.captainbern.animationlib.animations.protocol;

import me.captainbern.animationlib.reflection.NMSClassTemplate;

public enum Protocol {

    HANDSHAKE,
    PLAY,
    STATUS,
    LOGIN;

    private Protocol() {}

    public Object toVanilla() {
        switch (this) {
            case HANDSHAKE : return Enum.valueOf(NMSClassTemplate.create("EnumProtocol").getType(), "HANDSHAKING");
            case PLAY : return Enum.valueOf(NMSClassTemplate.create("EnumProtocol").getType(), "PLAY");
            case STATUS : return Enum.valueOf(NMSClassTemplate.create("EnumProtocol").getType(), "STATUS");
            case LOGIN : return Enum.valueOf(NMSClassTemplate.create("EnumProtocol").getType(), "LOGIN");
            default : return null;
        }
    }
}
