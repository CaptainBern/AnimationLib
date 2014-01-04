package me.captainbern.animationlib.exception;

import me.captainbern.animationlib.AnimationLib;

public class PacketCraftException extends Exception {

    public PacketCraftException() {
        super(AnimationLib.getInstance().generateServerInfo());
    }

    public PacketCraftException(String message) {
        super(AnimationLib.getInstance().generateServerInfo() + message);
    }

    public PacketCraftException(String message, Throwable cause) {
        super(AnimationLib.getInstance().generateServerInfo() + message, cause);
    }
}
