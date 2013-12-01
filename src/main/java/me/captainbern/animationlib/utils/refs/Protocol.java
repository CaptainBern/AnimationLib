package me.captainbern.animationlib.utils.refs;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import me.captainbern.animationlib.AnimationLib;
import me.captainbern.animationlib.reflection.BukkitServer;

import org.bukkit.Bukkit;

public class Protocol {

    private static final BiMap serverPackets = HashBiMap.create();

    public static BiMap getServerPacketRegistry(){
        return serverPackets;
    }

    protected static void addServerPacket(int id, Class<?> packet){
        String str;
        if (serverPackets.containsKey(Integer.valueOf(id))) {
            str = "Serverbound packet ID " + id + " is already assigned to "
                    + serverPackets.get(Integer.valueOf(id)) + "; cannot re-assign to "
                    + packet;
            Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + str);
            throw new IllegalArgumentException(str);
        }
        if (serverPackets.containsValue(packet)) {
            str = "Serverbound packet " + packet + " is already assigned to ID "
                    + serverPackets.inverse().get(packet) + "; cannot re-assign to "
                    + id;
            Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + str);
            throw new IllegalArgumentException(str);
        }
        serverPackets.put(Integer.valueOf(id), packet);
    }
    static{
        addServerPacket(0, BukkitServer.getNMSClass("PacketPlayOutKeepAlive"));
        addServerPacket(1, BukkitServer.getNMSClass("PacketPlayOutLogin"));
        addServerPacket(2, BukkitServer.getNMSClass("PacketPlayOutChat"));
        addServerPacket(3, BukkitServer.getNMSClass("PacketPlayOutUpdateTime"));
        addServerPacket(4, BukkitServer.getNMSClass("PacketPlayOutEntityEquipment"));
        addServerPacket(5, BukkitServer.getNMSClass("PacketPlayOutSpawnPosition"));
        addServerPacket(6, BukkitServer.getNMSClass("PacketPlayOutUpdateHealth"));
        addServerPacket(7, BukkitServer.getNMSClass("PacketPlayOutRespawn"));
        addServerPacket(8, BukkitServer.getNMSClass("PacketPlayOutPosition"));
        addServerPacket(9, BukkitServer.getNMSClass("PacketPlayOutHeldItemSlot"));
        addServerPacket(10, BukkitServer.getNMSClass("PacketPlayOutBed"));
        addServerPacket(11, BukkitServer.getNMSClass("PacketPlayOutAnimation"));
        addServerPacket(12, BukkitServer.getNMSClass("PacketPlayOutNamedEntitySpawn"));
        addServerPacket(13, BukkitServer.getNMSClass("PacketPlayOutCollect"));
        addServerPacket(14, BukkitServer.getNMSClass("PacketPlayOutSpawnEntity"));
        addServerPacket(15, BukkitServer.getNMSClass("PacketPlayOutSpawnEntityLiving"));
        addServerPacket(16, BukkitServer.getNMSClass("PacketPlayOutSpawnEntityPainting"));
        addServerPacket(17, BukkitServer.getNMSClass("PacketPlayOutSpawnEntityExperienceOrb"));
        addServerPacket(18, BukkitServer.getNMSClass("PacketPlayOutEntityVelocity"));
        addServerPacket(19, BukkitServer.getNMSClass("PacketPlayOutEntityDestroy"));
        addServerPacket(20, BukkitServer.getNMSClass("PacketPlayOutEntity"));
        addServerPacket(21, BukkitServer.getNMSClass("PacketPlayOutRelEntityMove"));
        addServerPacket(22, BukkitServer.getNMSClass("PacketPlayOutEntityLook"));
        addServerPacket(23, BukkitServer.getNMSClass("PacketPlayOutRelEntityMoveLook"));
        addServerPacket(24, BukkitServer.getNMSClass("PacketPlayOutEntityTeleport"));
        addServerPacket(25, BukkitServer.getNMSClass("PacketPlayOutEntityHeadRotation"));
        addServerPacket(26, BukkitServer.getNMSClass("PacketPlayOutEntityStatus"));
        addServerPacket(27, BukkitServer.getNMSClass("PacketPlayOutAttachEntity"));
        addServerPacket(28, BukkitServer.getNMSClass("PacketPlayOutEntityMetadata"));
        addServerPacket(29, BukkitServer.getNMSClass("PacketPlayOutEntityEffect"));
        addServerPacket(30, BukkitServer.getNMSClass("PacketPlayOutRemoveEntityEffect"));
        addServerPacket(31, BukkitServer.getNMSClass("PacketPlayOutExperience"));
        addServerPacket(32, BukkitServer.getNMSClass("PacketPlayOutUpdateAttributes"));
        addServerPacket(33, BukkitServer.getNMSClass("PacketPlayOutMapChunk"));
        addServerPacket(34, BukkitServer.getNMSClass("PacketPlayOutMultiBlockChange"));
        addServerPacket(35, BukkitServer.getNMSClass("PacketPlayOutBlockChange"));
        addServerPacket(36, BukkitServer.getNMSClass("PacketPlayOutBlockAction"));
        addServerPacket(37, BukkitServer.getNMSClass("PacketPlayOutBlockBreakAnimation"));
        addServerPacket(38, BukkitServer.getNMSClass("PacketPlayOutMapChunkBulk"));
        addServerPacket(39, BukkitServer.getNMSClass("PacketPlayOutExplosion"));
        addServerPacket(40, BukkitServer.getNMSClass("PacketPlayOutWorldEvent"));
        addServerPacket(41, BukkitServer.getNMSClass("PacketPlayOutNamedSoundEffect"));
        addServerPacket(42, BukkitServer.getNMSClass("PacketPlayOutWorldParticles"));
        addServerPacket(43, BukkitServer.getNMSClass("PacketPlayOutGameStateChange"));
        addServerPacket(44, BukkitServer.getNMSClass("PacketPlayOutSpawnEntityWeather"));
        addServerPacket(45, BukkitServer.getNMSClass("PacketPlayOutOpenWindow"));
        addServerPacket(46, BukkitServer.getNMSClass("PacketPlayOutCloseWindow"));
        addServerPacket(47, BukkitServer.getNMSClass("PacketPlayOutSetSlot"));
        addServerPacket(48, BukkitServer.getNMSClass("PacketPlayOutWindowItems"));
        addServerPacket(49, BukkitServer.getNMSClass("PacketPlayOutCraftProgressBar"));
        addServerPacket(50, BukkitServer.getNMSClass("PacketPlayOutTransaction"));
        addServerPacket(51, BukkitServer.getNMSClass("PacketPlayOutUpdateSign"));
        addServerPacket(52, BukkitServer.getNMSClass("PacketPlayOutMap"));
        addServerPacket(53, BukkitServer.getNMSClass("PacketPlayOutTileEntityData"));
        addServerPacket(54, BukkitServer.getNMSClass("PacketPlayOutOpenSignEditor"));
        addServerPacket(55, BukkitServer.getNMSClass("PacketPlayOutStatistic"));
        addServerPacket(56, BukkitServer.getNMSClass("PacketPlayOutPlayerInfo"));
        addServerPacket(57, BukkitServer.getNMSClass("PacketPlayOutAbilities"));
        addServerPacket(58, BukkitServer.getNMSClass("PacketPlayOutTabComplete"));
        addServerPacket(59, BukkitServer.getNMSClass("PacketPlayOutScoreboardObjective"));
        addServerPacket(60, BukkitServer.getNMSClass("PacketPlayOutScoreboardScore"));
        addServerPacket(61, BukkitServer.getNMSClass("PacketPlayOutScoreboardDisplayObjective"));
        addServerPacket(62, BukkitServer.getNMSClass("PacketPlayOutScoreboardTeam"));
        addServerPacket(63, BukkitServer.getNMSClass("PacketPlayOutCustomPayload"));
        addServerPacket(64, BukkitServer.getNMSClass("PacketPlayOutKickDisconnect"));
    }
}
