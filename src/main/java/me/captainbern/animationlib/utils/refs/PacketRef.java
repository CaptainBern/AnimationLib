package me.captainbern.animationlib.utils.refs;

import me.captainbern.animationlib.reflection.ClassTemplate;
import me.captainbern.animationlib.reflection.FieldAccessor;
import me.captainbern.animationlib.reflection.NMSClassTemplate;
import me.captainbern.animationlib.reflection.SafeField;
import me.captainbern.animationlib.utils.wrappers.IntHashMap;

public class PacketRef {

    public static final ClassTemplate<Object> packet = NMSClassTemplate.create("Packet");
    public static final FieldAccessor l_Map = new SafeField(packet.getType(), "l");

    /**
     * We only need this method to get the IntHashMap to get the right packet by id.
     * (So we don't have to create a class for each packet)
     * @return IntHashMap, evil place where minecraft stores the packets by id.
     */
    public static IntHashMap getEvilMap(){
        Object map = l_Map.get(null);
        IntHashMap evilMap = new IntHashMap(map);
        return evilMap;
    }
}
