package me.captainbern.animationlib.protocol;

import me.captainbern.animationlib.reflection.ClassTemplate;
import me.captainbern.animationlib.reflection.NMSClassTemplate;
import me.captainbern.animationlib.reflection.SafeField;
import me.captainbern.animationlib.utils.refs.Protocol;

import java.util.List;

public enum PacketType {

    /**
     * Update to MC 1.7.2
     */

    UNKNOWN(-1),
    KEEP_ALIVE(0),
    LOGIN(1),
    CHAT(2),
    UPDATE_TIME(3),
    ENTITY_EQUIPMENT(4),
    SPAWN_POSITION(5),
    UPDATE_HEALTH(6),
    RESPAWN(7),
    PLAYER_POSITON(8),
    HELD_ITEM_SLOT(9),
    BED(10),
    ANIMATION(11),
    NAMED_ENTITY_SPAWN(12),
    COLLECT(13),
    SPAWN_ENTITY(14),
    SPAWN_ENTITY_LIVING(15),
    SPAWN_ENTITY_PAINTING(16),
    SPAWN_ENTITY_EXPERIENCE_ORB(17),
    ENTITY_VELOCITY(18),
    DESTROY_ENTITY(19),
    ENTITY(20),
    REL_ENTITY_MOVE(21),
    ENTITY_LOOK(22),
    REL_ENTITY_MOVE_LOOK(23),
    ENTITY_TELEPORT(24),
    ENTITY_HEAD_ROTATION(25),
    ENTITY_STATUS(26),
    ATTACH_ENTITY(27),
    ENTITY_METADATA(28),
    ENTITY_EFFECT(29),
    REMOVE_ENTITY_EFFECT(30),
    SET_EXPIERINCE(31),
    UPDATE_ATTRIBUTES(32),
    MAP_CHUNK(33),
    MULTI_BLOCK_CHANGE(34),
    BLOCK_CHANGE(35),
    BLOCK_ACTION(36),
    BLOCK_BREAK_ANIMATION(37),
    MAP_CHUNK_BULK(38),
    EXPLOSION(39),
    WORLD_EVENT(40),
    NAMED_SOUND_EFFECT(41),
    WORLD_PARTICLES(42),
    CHANGE_GAME_STATE(43),
    WEATHER(44), /** b(44, PacketPlayOutSpawnEntityWeather.class); */
    OPEN_WINDOW(45),
    CLOSE_WINDOW(46),
    SET_SLOT(47),
    WINDOW_ITEMS(48),
    CRAFT_PROGRESS_BAR(49),
    TRANSACTION(50),
    UPDATE_SIGN(51),
    MAP(52), /** MAP_CHUNK_BULK ? */
    TILE_ENTITY_DATA(53),
    OPEN_SIGN_EDIT(54), /** b(54, PacketPlayOutOpenSignEditor.class); */
    STATISTIC(55),
    PLAYER_INFO(56),
    ABILITIES(57),
    TAB_COMPLETE(58),
    SCOREBOARD_OBJECTIVE(59),
    UPDATE_SCORE(60),
    DISPLAY_SCOREBOARD(61),
    TEAMS(62),
    /**	b(59, PacketPlayOutScoreboardObjective.class);
     b(60, PacketPlayOutScoreboardScore.class);
     b(61, PacketPlayOutScoreboardDisplayObjective.class);
     b(62, PacketPlayOutScoreboardTeam.class); */
    CUSTOM_PAYLOAD(63),
    KICK_DISCONNECT(64);

    private int id;
    private ClassTemplate<?> packetTemplate;
    private final String[] fieldNames;

    private PacketType(int id){

        this.id = id;
        Class<?> type = (Class<?>) Protocol.getServerPacketRegistry().get(id);

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
