package me.captainbern.animationlib.animations;

import java.util.Arrays;
import java.util.Collection;

import me.captainbern.animationlib.AnimationLib;
import me.captainbern.animationlib.event.PlayerAnimationEvent;
import me.captainbern.animationlib.protocol.Packet;
import me.captainbern.animationlib.protocol.PacketType;
import me.captainbern.animationlib.utils.PlayerUtil;
import me.captainbern.animationlib.utils.wrappers.DataWatcher;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public enum PlayerAnimation {

    ARM_SWING {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.ARM_ANIMATION);
                packet.write("a", player.getEntityId());
                packet.write("b", 1);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet18ArmAnimation packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    CRIT {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.ARM_ANIMATION);
                packet.write("a", player.getEntityId());
                packet.write("b", 6);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet18ArmAnimation packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    HURT {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.ARM_ANIMATION);
                packet.write("a", player.getEntityId());
                packet.write("b", 2);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet18ArmAnimation packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    DEAD {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.BED);
                packet.write("c", player.getEntityId());
                packet.write("b", 3);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet70Bed packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    MAGIC_CRIT {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.ARM_ANIMATION);
                packet.write("a", player.getEntityId());
                packet.write("b", 7);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet18ArmAnimation packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    SLEEP {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.ENTITY_LOCATION_ACTION);
                packet.write("a", player.getEntityId());
                packet.write("e", 0);
                packet.write("b", player.getLocation().getX());
                packet.write("c", player.getLocation().getY());
                packet.write("d", player.getLocation().getZ());

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet17EntityLocation packet!" + "(" + this + ")");
                e.printStackTrace();
            }

        }
    },
    STOP_SLEEPING {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.ARM_ANIMATION);
                packet.write("a", player.getEntityId());
                packet.write("b", 3);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet18ArmAnimation packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    START_RAIN {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.BED);
                packet.write("c", player.getEntityId());
                packet.write("b", 1);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet70Bed packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    STOP_RAIN {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.BED);
                packet.write("c", player.getEntityId());
                packet.write("b", 2);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet70Bed packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    ENTER_CREDITS {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.BED);
                packet.write("c", player.getEntityId());
                packet.write("b", 4);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet70Bed packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    CHANGE_GAMEMODE {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.BED);
                packet.write("c", player.getEntityId());
                packet.write("b", 3);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet70Bed packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    SIT {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.ATTACH_ENTITY);
                packet.write("a", 0); //leash present or not?
                packet.write("b", player.getEntityId());
                packet.write("c", player.getEntityId());

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet39AttachEntity packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    STOP_SITTING {
        @Override
        protected void broadcastAnimation(Player player) {
            player.eject();
        }
    },
    INVISIBLE {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.ENTITY_METADATA);
                packet.write("a", player.getEntityId());

                DataWatcher watcher = new DataWatcher();
                watcher.write(0, (byte) 0x20);
                watcher.write(1, (short) 0);
                watcher.write(8, (byte) 0);

                packet.write("b", watcher.getAllWatched());

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet40EntityMetadata packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    VISIBLE {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.ENTITY_METADATA);
                packet.write("a", player.getEntityId());

                DataWatcher watcher = new DataWatcher();
                watcher.write(0, (byte) 0);
                watcher.write(1, (short) 0);
                watcher.write(8, (byte) 0);

                packet.write("b", watcher.getAllWatched());

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet40EntityMetadata packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    ON_FIRE {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.ENTITY_METADATA);
                packet.write("a", player.getEntityId());

                DataWatcher watcher = new DataWatcher();
                watcher.write(0, (byte) 0x01);
                watcher.write(1, (short) 0);
                watcher.write(8, (byte) 0);

                packet.write("b", watcher.getAllWatched());

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

            } catch (Exception e) {
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet40EntityMetadata packet!" + "(" + this + "), this girl isn't on fire!");
                e.printStackTrace();
            }
        }
    };

	/* STOP ENUMS */

    public void play(Player player){
        broadcastAnimation(player);
    }

    private static void sendPacketNearby(Location loc, Collection<Packet> packets, PlayerAnimation pa) {
        World world = loc.getWorld();
        for(Player player : Bukkit.getOnlinePlayers()){
            if(player == null || player.getWorld() != world){
                continue;
            }
            PlayerAnimationEvent event = new PlayerAnimationEvent(player, pa);
            Bukkit.getPluginManager().callEvent(event);
            if(!event.isCancelled()) {
                for(Packet packet : packets){
                    PlayerUtil.sendPacket(player, packet);
                }
            }
        }
    }

    protected void broadcastAnimation(Player player){
        throw new UnsupportedOperationException(AnimationLib.LOG_PREFIX + "Unimplemented animation");
    }
}
