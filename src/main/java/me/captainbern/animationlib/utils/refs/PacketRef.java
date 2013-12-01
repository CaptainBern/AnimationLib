package me.captainbern.animationlib.utils.refs;

import com.google.common.collect.BiMap;
import me.captainbern.animationlib.reflection.ClassTemplate;
import me.captainbern.animationlib.reflection.FieldAccessor;
import me.captainbern.animationlib.reflection.NMSClassTemplate;
import me.captainbern.animationlib.reflection.SafeField;
import me.captainbern.animationlib.utils.wrappers.IntHashMap;

public class PacketRef {

    public static final ClassTemplate<Object> protocol = NMSClassTemplate.create("EnumProtocol");

    public static BiMap getServerPacketRegistry(){
       return (BiMap) protocol.getField("h");
    }
}
