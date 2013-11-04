/*  
 *  PlayerAnimationLib
 *  Copyright (C) 2013 CaptainBern
 *   
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.captainbern.animationlib.animations;

import java.util.Arrays;
import java.util.Collection;

import me.captainbern.animationlib.event.BlockAnimationEvent;
import me.captainbern.animationlib.utils.Packet;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public enum BlockAnimation {

	BLOCK_BREAK {
		@Override
		protected void broadcastAnimation(Block block, short damage) {
			try{

				if(damage > 7 || damage < 0){
					throw new NumberFormatException("Damage needs to be between 0 and 7!");
				}
				
				Packet packet = new Packet("Packet55BlockBreakAnimation");
				packet.setPrivateValue("a", 0);
				packet.setPrivateValue("b", block.getX());
				packet.setPrivateValue("c", block.getY());
				packet.setPrivateValue("d", block.getZ());
				packet.setPrivateValue("e", Integer.valueOf(Short.toString(damage)));
				sendPacketNearby(block.getLocation(), Arrays.asList(packet), this, block);

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet55BlockBreakAnimation packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	};

	/* STOP ENUMS */

	public void play(Block block, short damage){
		broadcastAnimation(block, damage);
	}

	private static void sendPacketNearby(Location loc, Collection<Packet> packets, BlockAnimation ba, Block block) {
		World world = loc.getWorld();
		for(Player player : Bukkit.getOnlinePlayers()){
			if(player == null || player.getWorld() != world){
				continue;
			}
			BlockAnimationEvent event = new BlockAnimationEvent(block, ba);
			Bukkit.getPluginManager().callEvent(event);
			if(!event.isCancelled()){
				for(Packet packet : packets){
					packet.send(player);
				}
			}
		}
	}

	protected void broadcastAnimation(Block block, short damage){
		throw new UnsupportedOperationException("[AnimationLib] Unimplemented animation");
	}

}
