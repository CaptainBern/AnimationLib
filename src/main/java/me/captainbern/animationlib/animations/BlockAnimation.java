package me.captainbern.animationlib.animations;

import me.captainbern.animationlib.AnimationLib;
import me.captainbern.animationlib.event.BlockAnimationEvent;
import me.captainbern.animationlib.protocol.Packet;
import me.captainbern.animationlib.protocol.PacketType;
import me.captainbern.animationlib.utils.PlayerUtil;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.Collection;

public enum BlockAnimation {

    BLOCK_BREAK {
        @Override
        protected void broadcastAnimation(Block block, short damage) {
            try{

                if(damage > 7 || damage < 0){
                    throw new NumberFormatException("Damage needs to be between 0 and 7!");
                }

                Packet packet = new Packet(PacketType.BLOCK_BREAK_ANIMATION);
                packet.write("a", 0);
                packet.write("b", block.getX());
                packet.write("c", block.getY());
                packet.write("d", block.getZ());
                packet.write("e", Integer.valueOf(Short.toString(damage)));

                sendPacketNearby(block.getLocation(), Arrays.asList(packet), this, block);

            }catch(Exception e){
                Bukkit.getLogger().warning(AnimationLib.LOG_PREFIX + "Something went wrong while crafting the Packet55BlockBreakAnimation packet! (BLOCK_BREAK)");
                e.printStackTrace();
            }
        }
    };

	/* STOP ENUMS */

    public void play(Block block, short damage){
        broadcastAnimation(block, damage);
    }

    private static void sendPacketNearby(Location loc, Collection<Packet> packets, BlockAnimation blockAnimation, Block block) {
        World world = loc.getWorld();
        for(Player player : Bukkit.getOnlinePlayers()){
            if(player == null || player.getWorld() != world){
                continue;
            }
            BlockAnimationEvent event = new BlockAnimationEvent(block, blockAnimation);
            Bukkit.getPluginManager().callEvent(event);
            if(!event.isCancelled()) {
                for(Packet packet : packets){
                    PlayerUtil.sendPacket(player, packet);
                }
            }
        }
    }

    protected void broadcastAnimation(Block block, short damage){
        throw new UnsupportedOperationException(AnimationLib.LOG_PREFIX + "Unimplemented animation");
    }
}
