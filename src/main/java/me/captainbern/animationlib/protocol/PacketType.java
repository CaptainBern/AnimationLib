package me.captainbern.animationlib.protocol;

import me.captainbern.animationlib.reflection.ClassTemplate;
import me.captainbern.animationlib.reflection.NMSClassTemplate;
import me.captainbern.animationlib.reflection.SafeField;
import me.captainbern.animationlib.utils.refs.PacketRef;

import java.util.List;

public enum PacketType {

    UNKNOW(-1),
    ENTITY_LOCATION_ACTION(17),
    ARM_ANIMATION(18),
    ENTITY_METADATA(40),
    BLOCK_BREAK_ANIMATION(55),
    NAMED_SOUND_EFFECT(62),
    WORLD_PARTICLES(63),
    BED(70);


    private int id;
    private ClassTemplate<?> packetTemplate;
    private final String[] fieldNames;

    private PacketType(int id){

        this.id = id;
        Class<?> type = (Class<?>) PacketRef.getEvilMap().get(id);

        if(type == null){
            this.packetTemplate = null;
            this.fieldNames = new String[0];
            return;
        }

        this.packetTemplate = NMSClassTemplate.create(type);

        List<SafeField<?>> fields = this.packetTemplate.getFields();
        this.fieldNames = new String[fields.size()];
        for(int i = 0; i < fields.size(); i++){
            SafeField<?> field = fields.get(i);
            this.fieldNames[i] = field.getName();
        }
    }

    public Object getPacket(){
        if(this.packetTemplate == null){
            return null;
        }               else{
            return this.packetTemplate.newInstance();
        }
    }

    public String getField(int index) {
        return (index >= 0 && index < fieldNames.length) ? fieldNames[index] : null;
    }

    public ClassTemplate<?> getPacketTemplate(){
        return this.packetTemplate;
    }

    public int getId(){
        return this.id;
    }
}
