package me.captainbern.animationlib.utils.refs;

import me.captainbern.animationlib.protocol.Protocol;
import me.captainbern.animationlib.protocol.Sender;
import me.captainbern.animationlib.reflection.ClassTemplate;
import me.captainbern.animationlib.reflection.FieldAccessor;
import me.captainbern.animationlib.reflection.NMSClassTemplate;

import java.util.Map;

public class EnumProtocolRef {

    public static final ClassTemplate CLASS_TEMPLATE = NMSClassTemplate.create("EnumProtocol");
    private static final FieldAccessor<Map<Integer, Class<?>>> SERVER_PACKET_MAP= CLASS_TEMPLATE.getField("i");
    private static final FieldAccessor<Map<Integer, Class<?>>> CLIENT_PACKET_MAP = CLASS_TEMPLATE.getField("h");

    public static Class getPacket(Protocol protocol, Sender sender, int id) {
        if(sender == Sender.CLIENT) {
            return CLIENT_PACKET_MAP.get(protocol.toVanilla()).get(id);
        }

        if(sender == Sender.SERVER) {
            return SERVER_PACKET_MAP.get(protocol.toVanilla()).get(id);
        }
        return null;
    }
}
