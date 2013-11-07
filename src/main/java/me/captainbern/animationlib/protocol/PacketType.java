package me.captainbern.animationlib.protocol;

import me.captainbern.animationlib.reflection.ClassTemplate;
import me.captainbern.animationlib.reflection.NMSClassTemplate;
import me.captainbern.animationlib.reflection.SafeField;
import me.captainbern.animationlib.utils.refs.PacketRef;

import java.util.List;

public enum PacketType {

    UNKNOW(-1),
    KEEP_ALIVE(0),
    LOGIN(1),
    CHAT(3),
    UPDATE_TIME(4),
    ENTITY_EQUIPMENT(5),
    SPAWN_POSITION(6),
    UPDATE_HEALTH(8),
    RESPAWN(9),
    FLYING(10),
    PLAYER_POSITION(11),
    PLAYER_LOOK(12),
    PLAYER_LOOK_MOVE(13),


    /**
     * Made bi-directional in 1.4.6.
     */
    BLOCK_ITEM_SWITCH(16),
    ENTITY_LOCATION_ACTION (17),
    ARM_ANIMATION(18),
    NAMED_ENTITY_SPAWN(20),


    /**
     * Removed in 1.4.6 and replaced with VEHICLE_SPAWN.
     * @see <a href="http://www.wiki.vg/Protocol_History#2012-12-20">Protocol History - MinecraftCoalition</a>
     */
    @Deprecated()
    PICKUP_SPAWN(21),
    COLLECT(22),
    VEHICLE_SPAWN(23),
    MOB_SPAWN(24),
    ENTITY_PAINTING(25),
    ADD_EXP_ORB(26),
    ENTITY_VELOCITY(28),
    DESTROY_ENTITY(29),
    ENTITY(30),
    REL_ENTITY_MOVE(31),
    ENTITY_LOOK(32),
    REL_ENTITY_MOVE_LOOK(33),
    ENTITY_TELEPORT(34),
    ENTITY_HEAD_ROTATION(35),
    ENTITY_STATUS(38),
    ATTACH_ENTITY(39),


    /**
     * Sent when an entities DataWatcher is updated.
     * <p>
     */
    ENTITY_METADATA(40),
    MOB_EFFECT(41),
    REMOVE_MOB_EFFECT(42),
    SET_EXPERIENCE(43),
    UPDATE_ATTRIBUTES(44),
    MAP_CHUNK(51),
    MULTI_BLOCK_CHANGE(52),
    BLOCK_CHANGE(53),
    PLAY_NOTE_BLOCK(54),
    BLOCK_BREAK_ANIMATION(55),
    MAP_CHUNK_BULK(56),
    EXPLOSION(60),
    WORLD_EVENT(61),
    NAMED_SOUND_EFFECT(62),
    WORLD_PARTICLES(63),
    BED(70),
    WEATHER(71),
    OPEN_WINDOW(100),
    CLOSE_WINDOW(101),
    SET_SLOT(103),
    WINDOW_ITEMS(104),
    CRAFT_PROGRESS_BAR(105),
    TRANSACTION(106),
    SET_CREATIVE_SLOT(107),
    UPDATE_SIGN(130),
    ITEM_DATA(131),


    /**
     * Sent the first time a tile entity (chest inventory, etc.) is withing range of the player, or has been updated.
     * <p>
     */
    TILE_ENTITY_DATA(132),
    OPEN_TILE_ENTITY(133),
    STATISTIC(200),
    PLAYER_INFO(201),
    ABILITIES(202),
    TAB_COMPLETE(203),
    SCOREBOARD_OBJECTIVE(206),
    UPDATE_SCORE(207),
    DISPLAY_SCOREBOARD(208),
    TEAMS(209),
    CUSTOM_PAYLOAD(250),
    KEY_RESPONSE(252),
    KEY_REQUEST(253),
    KICK_DISCONNECT(255);


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
