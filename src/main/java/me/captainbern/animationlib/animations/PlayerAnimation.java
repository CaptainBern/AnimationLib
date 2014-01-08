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

                Packet packet = new Packet(PacketType.PLAY.Server.ANIMATION);
                packet.write("a", player.getEntityId());
                packet.write("b", 0);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    HURT {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.ANIMATION);
                packet.write("a", player.getEntityId());
                packet.write("b", 1);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    CRIT {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.ANIMATION);
                packet.write("a", player.getEntityId());
                packet.write("b", 4);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    MAGIC_CRIT {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.ANIMATION);
                packet.write("a", player.getEntityId());
                packet.write("b", 5);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    DEAD {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.UPDATE_HEALTH);
                packet.write("a", 0);
                packet.write("b", 0);
                packet.write("c", 0);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    SLEEP {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.BED);
                packet.write("a", player.getEntityId());
                packet.write("b", player.getLocation().getBlockX());
                packet.write("c", player.getLocation().getBlockY());
                packet.write("d", player.getLocation().getBlockZ());

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }

        }
    },
    STOP_SLEEPING {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.ANIMATION);
                packet.write("a", player.getEntityId());
                packet.write("b", 2);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    START_RAIN {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.CHANGE_GAMESTATE);
                packet.write("b", 2);
                //packet.write("c", null);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, player);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    STOP_RAIN {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.CHANGE_GAMESTATE);
                packet.write("b", 1);
                //packet.write("c", null);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, player);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    ENTER_CREDITS {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.CHANGE_GAMESTATE);
                packet.write("b", 4);
                //packet.write("b", null);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    SIT {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.ATTACH_ENTITY);
                packet.write("a", 0); //leash present or not?
                packet.write("b", player.getEntityId());
                packet.write("c", player.getEntityId());

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
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

                Packet packet = new Packet(PacketType.PLAY.Server.ENTITY_METADATA);
                packet.write("a", player.getEntityId());

                DataWatcher watcher = new DataWatcher(player);
                watcher.write(0, (byte) 0x20);
                watcher.write(1, (short) 0);
                watcher.write(8, (byte) 0);

                packet.write("b", watcher.getAllWatched());

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    VISIBLE {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.ENTITY_METADATA);
                packet.write("a", player.getEntityId());

                DataWatcher watcher = new DataWatcher(player);
                watcher.write(0, (byte) 0);
                watcher.write(1, (short) 0);
                watcher.write(8, (byte) 0);

                packet.write("b", watcher.getAllWatched());

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    ON_FIRE {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.ENTITY_METADATA);
                packet.write("a", player.getEntityId());

                DataWatcher watcher = new DataWatcher(player);
                watcher.write(0, (byte) 0x01);
                watcher.write(1, (short) 0);
                watcher.write(8, (byte) 0);

                packet.write("b", watcher.getAllWatched());

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + "), this girl isn't on fire!");
                e.printStackTrace();
            }
        }
    },
    DEMO_WELCOME {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.CHANGE_GAMESTATE);
                packet.write("b", 5);
                packet.write("c", 0);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    DEMO_TELL_MOVE_CONTROLS {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.CHANGE_GAMESTATE);
                packet.write("b", 5);
                packet.write("c", 101);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    DEMO_TELL_JUMP {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.CHANGE_GAMESTATE);
                packet.write("b", 5);
                packet.write("c", 102);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    DEMO_TELL_INVENTORY {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.CHANGE_GAMESTATE);
                packet.write("b", 5);
                packet.write("c", 103);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    FADE_DARK {
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.CHANGE_GAMESTATE);
                packet.write("b", 7);
                packet.write("c", 1);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    },
    FADE_BRIGHT{
        @Override
        protected void broadcastAnimation(Player player) {
            try {

                Packet packet = new Packet(PacketType.PLAY.Server.CHANGE_GAMESTATE);
                packet.write("b", 7);
                packet.write("c", 0);

                sendPacketNearby(player.getLocation(), Arrays.asList(packet), this, null);

            } catch (Exception e) {
                AnimationLib.LOGGER.warning("Something went wrong while crafting the packet!" + "(" + this + ")");
                e.printStackTrace();
            }
        }
    };

	/* STOP ENUMS */

    public void play(Player player){
        broadcastAnimation(player);
    }

    private static void sendPacketNearby(Location loc, Collection<Packet> packets, PlayerAnimation pa, Player playerSendTo) {
        World world = loc.getWorld();
        if(playerSendTo != null){
            PlayerAnimationEvent event = new PlayerAnimationEvent(playerSendTo, pa);
            Bukkit.getPluginManager().callEvent(event);
            if(!event.isCancelled()) {
                for(Packet packet : packets){
                    PlayerUtil.sendPacket(playerSendTo, packet);
                }
            }
        }else{
            for(Player player : Bukkit.getOnlinePlayers()){
                if(player == null || player.getWorld() != world){
                    continue;
                }
                PlayerAnimationEvent event = new PlayerAnimationEvent(player, pa);
                if(!AnimationLib.getInstance().callEvent(event).isCancelled()) {
                    for(Packet packet : packets){
                        PlayerUtil.sendPacket(player, packet);
                    }
                }
            }
        }
    }

    protected void broadcastAnimation(Player player){
        throw new UnsupportedOperationException("Unimplemented animation");
    }
}
