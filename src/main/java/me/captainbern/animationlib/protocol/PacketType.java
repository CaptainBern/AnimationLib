package me.captainbern.animationlib.protocol;

import me.captainbern.animationlib.reflection.ClassTemplate;
import me.captainbern.animationlib.utils.refs.EnumProtocolRef;

public class PacketType {

    public static final int UNKNOWN_PACKET = -1;

    public static class HANDSHAKE {
        private static final Protocol PROTOCOL = Protocol.HANDSHAKE;

        public static class Client {
            private static final Sender SENDER = Sender.CLIENT;

            public static final PacketType SET_PROTOCOL = new PacketType(PROTOCOL, SENDER, 0);

            private Client() {}
        }

        public static class Server {
            private static final Sender SENDER = Sender.SERVER;

            public static final PacketType KEEP_ALIVE = new PacketType(PROTOCOL, SENDER, 0);
            public static final PacketType LOGIN = new PacketType(PROTOCOL, SENDER, 1);
            public static final PacketType CHAT = new PacketType(PROTOCOL, SENDER, 2);
            public static final PacketType UPDATE_TIME = new PacketType(PROTOCOL, SENDER, 3);
            public static final PacketType ENTITY_EQUIPMENT = new PacketType(PROTOCOL, SENDER, 4);
            public static final PacketType SPAWN_POSITION = new PacketType(PROTOCOL, SENDER, 5);
            public static final PacketType UPDATE_HEALTH = new PacketType(PROTOCOL, SENDER, 6);

            private Server() {}
        }
    }

    public static class PLAY {

        private static final Protocol PROTOCOL = Protocol.PLAY;

        public static class Client {
            private static final Sender SENDER = Sender.CLIENT;

            public static final PacketType KEEP_ALIVE = new PacketType(PROTOCOL, SENDER, 0);
            public static final PacketType CHAT = new PacketType(PROTOCOL, SENDER, 1);
            public static final PacketType USE_ENTITY = new PacketType(PROTOCOL, SENDER, 2);
            public static final PacketType FLYING = new PacketType(PROTOCOL, SENDER, 3);
            public static final PacketType POSITION = new PacketType(PROTOCOL, SENDER, 4);
            public static final PacketType LOOK = new PacketType(PROTOCOL, SENDER, 5);
            public static final PacketType POSITION_LOOK = new PacketType(PROTOCOL, SENDER, 6);
            public static final PacketType BLOCK_DIG = new PacketType(PROTOCOL, SENDER, 7);
            public static final PacketType BLOCK_PLACE = new PacketType(PROTOCOL, SENDER, 8);
            public static final PacketType HELDITEM = new PacketType(PROTOCOL, SENDER, 9);
            public static final PacketType ANIMATION = new PacketType(PROTOCOL, SENDER, 10);
            public static final PacketType ENTITY_ACTION = new PacketType(PROTOCOL, SENDER, 11);
            public static final PacketType STEER_VEHICLE = new PacketType(PROTOCOL, SENDER, 12);
            public static final PacketType CLOSE_WINDOW = new PacketType(PROTOCOL, SENDER, 13);
            public static final PacketType WINDOW_CLICK = new PacketType(PROTOCOL, SENDER, 14);
            public static final PacketType TRANSACTION = new PacketType(PROTOCOL, SENDER, 15);
            public static final PacketType SET_CREATIVE_SLOT = new PacketType(PROTOCOL, SENDER, 16);
            public static final PacketType ENCHANT_ITEM = new PacketType(PROTOCOL, SENDER, 17);
            public static final PacketType UPDATE_SIGN = new PacketType(PROTOCOL, SENDER, 18);
            public static final PacketType ABILITIES = new PacketType(PROTOCOL, SENDER, 19);
            public static final PacketType TAB_COMPLETE = new PacketType(PROTOCOL, SENDER, 20);
            public static final PacketType CLIENT_SETTINGS = new PacketType(PROTOCOL, SENDER, 21);
            public static final PacketType CLIENT_COMMAND = new PacketType(PROTOCOL, SENDER, 22);
            public static final PacketType CUSTOM_PAYLOAD = new PacketType(PROTOCOL, SENDER, 23);

            private Client() {}
        }

        public static class Server {
            private static final Sender SENDER = Sender.SERVER;

            public static final PacketType KEEP_ALIVE = new PacketType(PROTOCOL, SENDER, 0);
            public static final PacketType LOGIN = new PacketType(PROTOCOL, SENDER, 1);
            public static final PacketType CHAT = new PacketType(PROTOCOL, SENDER, 2);
            public static final PacketType UPDATE_TIME = new PacketType(PROTOCOL, SENDER, 3);
            public static final PacketType ENTITY_EQUIPMENT = new PacketType(PROTOCOL, SENDER, 4);
            public static final PacketType SPAWN_POSITION = new PacketType(PROTOCOL, SENDER, 5);
            public static final PacketType UPDATE_HEALTH = new PacketType(PROTOCOL, SENDER, 6);
            public static final PacketType RESPAWN = new PacketType(PROTOCOL, SENDER, 7);
            public static final PacketType POSITION = new PacketType(PROTOCOL, SENDER, 8);
            public static final PacketType HELD_ITEM_SLOT = new PacketType(PROTOCOL, SENDER, 9);
            public static final PacketType BED = new PacketType(PROTOCOL, SENDER, 10);
            public static final PacketType ANIMATION = new PacketType(PROTOCOL, SENDER, 11);
            public static final PacketType NAMED_ENTITY_SPAWN = new PacketType(PROTOCOL, SENDER, 12);
            public static final PacketType COLLECT = new PacketType(PROTOCOL, SENDER, 13);
            public static final PacketType SPAWN_ENTITY = new PacketType(PROTOCOL, SENDER, 14);
            public static final PacketType SPAWN_ENTITY_LIVING = new PacketType(PROTOCOL, SENDER, 15);
            public static final PacketType SPAWN_ENTITY_PAINTING = new PacketType(PROTOCOL, SENDER, 16);
            public static final PacketType SPAWN_ENTITY_EXPERIENCE_ORB = new PacketType(PROTOCOL, SENDER, 17);
            public static final PacketType ENTITY_VELOCITY = new PacketType(PROTOCOL, SENDER, 18);
            public static final PacketType ENTITY_DESTROY = new PacketType(PROTOCOL, SENDER, 19);
            public static final PacketType ENTITY = new PacketType(PROTOCOL, SENDER, 20);
            public static final PacketType REL_ENTITY_MOVE = new PacketType(PROTOCOL, SENDER, 21);
            public static final PacketType REL_ENTITY_LOOK = new PacketType(PROTOCOL, SENDER, 22);
            public static final PacketType REL_ENTITY_MOVE_LOOK = new PacketType(PROTOCOL, SENDER, 23);
            public static final PacketType ENTITY_TELEPORT = new PacketType(PROTOCOL, SENDER, 24);
            public static final PacketType ENTITY_HEAD_ROTATION = new PacketType(PROTOCOL, SENDER, 25);
            public static final PacketType ETITY_STATUS = new PacketType(PROTOCOL, SENDER, 26);
            public static final PacketType ATTACH_ENTITY = new PacketType(PROTOCOL, SENDER, 27);
            public static final PacketType ENTITY_METADATA = new PacketType(PROTOCOL, SENDER, 28);
            public static final PacketType ENTITY_EFFECT = new PacketType(PROTOCOL, SENDER, 29);
            public static final PacketType REMOVE_ENTITY_EFFECT = new PacketType(PROTOCOL, SENDER, 30);
            public static final PacketType SET_EXPERIENCE = new PacketType(PROTOCOL, SENDER, 31);
            public static final PacketType UPDATE_ATTRIBUTES = new PacketType(PROTOCOL, SENDER, 32);
            public static final PacketType MAP_CHUNK = new PacketType(PROTOCOL, SENDER, 33);
            public static final PacketType MULTI_BLOCK_CHANGE = new PacketType(PROTOCOL, SENDER, 34);
            public static final PacketType BLOCK_CHANGE = new PacketType(PROTOCOL, SENDER, 35);
            public static final PacketType BLOCK_ACTION = new PacketType(PROTOCOL, SENDER, 36);
            public static final PacketType BLOCK_BREAK_ANIMATION = new PacketType(PROTOCOL, SENDER, 37);
            public static final PacketType MAP_CHUNK_BULK = new PacketType(PROTOCOL, SENDER, 38);
            public static final PacketType EXPLOSION = new PacketType(PROTOCOL, SENDER, 39);
            public static final PacketType WORLD_EVENT = new PacketType(PROTOCOL, SENDER, 40);
            public static final PacketType NAMED_SOUND_EFFECT = new PacketType(PROTOCOL, SENDER, 41);
            public static final PacketType WORLD_PARTICLES = new PacketType(PROTOCOL, SENDER, 42);
            public static final PacketType CHANGE_GAMESTATE = new PacketType(PROTOCOL, SENDER, 43);
            public static final PacketType SPAWN_ENTITY_WEATHER = new PacketType(PROTOCOL, SENDER, 44);
            public static final PacketType OPEN_WINDOW = new PacketType(PROTOCOL, SENDER, 45);
            public static final PacketType CLOSE_WINDOW = new PacketType(PROTOCOL, SENDER, 46);
            public static final PacketType SET_SLOT = new PacketType(PROTOCOL, SENDER, 47);
            public static final PacketType WINDOW_ITEMS = new PacketType(PROTOCOL, SENDER, 48);
            public static final PacketType CRAFT_PROGRESS_BAR = new PacketType(PROTOCOL, SENDER, 49);
            public static final PacketType TRANSACTION = new PacketType(PROTOCOL, SENDER, 50);
            public static final PacketType UPDATE_SIGN = new PacketType(PROTOCOL, SENDER, 51);
            public static final PacketType MAP = new PacketType(PROTOCOL, SENDER, 52);
            public static final PacketType OPEN_TILE_ENTITY_DATA = new PacketType(PROTOCOL, SENDER, 53);
            public static final PacketType OPEN_SIGN_EDITOR = new PacketType(PROTOCOL, SENDER, 54);
            public static final PacketType STATISTIC = new PacketType(PROTOCOL, SENDER, 55);
            public static final PacketType PLAYER_INFO = new PacketType(PROTOCOL, SENDER, 56);
            public static final PacketType PLAYER_ABILITIES = new PacketType(PROTOCOL, SENDER, 57);
            public static final PacketType TAB_COMPLETE = new PacketType(PROTOCOL, SENDER, 58);
            public static final PacketType SCOREBOARD_OBJECTIVE = new PacketType(PROTOCOL, SENDER, 59);
            public static final PacketType SCOREBOARD_SCORE = new PacketType(PROTOCOL, SENDER, 60);
            public static final PacketType SCOREBOARD_DISPLAY_SCORE = new PacketType(PROTOCOL, SENDER, 61);
            public static final PacketType SCOREBOARD_TEAM = new PacketType(PROTOCOL, SENDER, 62);
            public static final PacketType CUSTOM_PAYLOAD = new PacketType(PROTOCOL, SENDER, 63);
            public static final PacketType KICK_DISCONNECT = new PacketType(PROTOCOL, SENDER, 64);

            private Server() {}
        }
    }

    public static class STATUS {

        private static final Protocol PROTOCOL = Protocol.STATUS;

        public static class Client {
            private static final Sender SENDER = Sender.CLIENT;

            public static final PacketType START = new PacketType(PROTOCOL, SENDER, 0);
            public static final PacketType PING = new PacketType(PROTOCOL, SENDER, 1);

            private Client() {}
        }

        public static class Server {
            private static final Sender SENDER = Sender.SERVER;

            public static final PacketType SERVER_INFO = new PacketType(PROTOCOL, SENDER, 0);
            public static final PacketType PONG = new PacketType(PROTOCOL, SENDER, 1);

            private Server() {}
        }
    }

    public static class LOGIN {

        private static final Protocol PROTOCOL = Protocol.LOGIN;

        public static class Client {
            private static final Sender SENDER = Sender.CLIENT;

            public static final PacketType LOGIN_START = new PacketType(PROTOCOL, SENDER, 0);
            public static final PacketType ENCRYPTION_BEGIN = new PacketType(PROTOCOL, SENDER, 1);

            private Client() {}
        }

        public static class Server {
            private static final Sender SENDER = Sender.SERVER;

            public static final PacketType DISCONNECT = new PacketType(PROTOCOL, SENDER, 0);
            public static final PacketType ENCRYPTION_BEGIN = new PacketType(PROTOCOL, SENDER, 1);
            public static final PacketType ENCRYPTION_SUCCESS = new PacketType(PROTOCOL, SENDER, 2);

            private Server() {}
        }
    }

    private Protocol protocol;
    private Sender sender;
    private int id;

    private ClassTemplate packetClass;

    public PacketType(Protocol protocol, Sender sender, int id) {
        this.protocol = protocol;
        this.sender = sender;
        this.id = id;

        this.packetClass = new ClassTemplate(EnumProtocolRef.getPacket(protocol, sender, id));
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public Sender getSender() {
        return sender;
    }

    public int getId() {
        return id;
    }

    public Class<?> getPacketClass() {
        return packetClass.getType();
    }

    public ClassTemplate getPacketClassAsTemplate() {
        return packetClass;
    }
}
