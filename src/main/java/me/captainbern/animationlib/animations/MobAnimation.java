package me.captainbern.animationlib.animations;

import me.captainbern.animationlib.event.MobAnimationEvent;
import me.captainbern.animationlib.protocol.Packet;
import me.captainbern.animationlib.protocol.PacketType;
import me.captainbern.animationlib.utils.EntityUtil;
import me.captainbern.animationlib.utils.wrappers.DataWatcher;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.Collection;

public class MobAnimation {

    public static enum Horse {

        SADDLED {

        };

        /* STOP ENUMS */

        public void play(org.bukkit.entity.Horse horse){
            broadcastAnimation(horse);
        }

        private static void sendPacketNearby(Location loc, Collection<Packet> packets, MobAnimation mobAnimation, Entity entity) {
            World world = loc.getWorld();
            for(Player player : Bukkit.getOnlinePlayers()){
                if(player == null || player.getWorld() != world){
                    continue;
                }
                MobAnimationEvent event = new MobAnimationEvent(entity, mobAnimation);
                Bukkit.getPluginManager().callEvent(event);
                if(!event.isCancelled()) {
                    for(Packet packet : packets){
                        EntityUtil.sendPacket(player, packet);
                    }
                }
            }
        }

        protected void broadcastAnimation(org.bukkit.entity.Horse horse){
            throw new UnsupportedOperationException("Unimplemented animation");
        }
    }

    public static enum Bat {

        HANGING {
            @Override
            protected void broadcastAnimation(org.bukkit.entity.Bat bat) {

            }
        },

        STOP_HANGING {
            @Override
            protected void broadcastAnimation(org.bukkit.entity.Bat bat) {
                Packet packet = new Packet(PacketType.PLAY.Server.ENTITY_METADATA);
                packet.write("a", bat.getEntityId());

                DataWatcher dataWatcher = new DataWatcher(bat);
                dataWatcher.write(16, 0);

                packet.write("b", dataWatcher);

                sendPacketNearby(bat.getLocation(), Arrays.asList(packet), this, bat);
            }
        };

        /* STOP ENUMS */

        public void play(org.bukkit.entity.Bat bat){
            broadcastAnimation(bat);
        }

        private static void sendPacketNearby(Location loc, Collection<Packet> packets, Object mobAnimation, Entity entity) {
            World world = loc.getWorld();
            for(Player player : Bukkit.getOnlinePlayers()){
                if(player == null || player.getWorld() != world){
                    continue;
                }
                MobAnimationEvent event = new MobAnimationEvent(entity, (MobAnimation) mobAnimation);
                Bukkit.getPluginManager().callEvent(event);
                if(!event.isCancelled()) {
                    for(Packet packet : packets){
                        EntityUtil.sendPacket(player, packet);
                    }
                }
            }
        }

        protected void broadcastAnimation(org.bukkit.entity.Bat bat){
            throw new UnsupportedOperationException("Unimplemented animation");
        }
    }

    public static enum Ocelot {

    }

    public static enum Wolf {

    }

    public static enum Pig {

    }

    public static enum Sheep {

    }

    public static enum Villager {

    }

    public static enum Enderman {

    }

    public static enum Zombie {

    }

    public static enum ZombiePigman {

    }

    public static enum Blaze {

    }

    public static enum Spider {

    }

    public static enum CaveSpider {

    }

    public static enum Creeper {

    }

    public static enum Ghast {

    }

    public static enum Slime {

    }

    public static enum MagamagaCube {

    }

    public static enum Skeleton {

    }

    public static enum Witch {

    }

    public static enum Minecart {

    }

    public static enum FurnanceMinecart {

    }
}
