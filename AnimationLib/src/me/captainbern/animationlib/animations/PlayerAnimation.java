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

import me.captainbern.animationlib.event.PlayerAnimationEvent;
import me.captainbern.animationlib.utils.Packet;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public enum PlayerAnimation {
	
	ARM_SWING {
		@Override
		protected void broadcastAnimation(Player player) {
			try {

				Packet packet = new Packet("Packet18ArmAnimation");
				packet.setValue("a", player.getEntityId());
				packet.setValue("b", 1);
				sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet18ArmAnimation packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	CRIT {
		@Override
		protected void broadcastAnimation(Player player) {
			try {

				Packet packet = new Packet("Packet18ArmAnimation");
				packet.setValue("a", player.getEntityId());
				packet.setValue("b", 6);
				sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet18ArmAnimation packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	HURT {
		@Override
		protected void broadcastAnimation(Player player) {
			try {

				Packet packet = new Packet("Packet18ArmAnimation");
				packet.setValue("a", player.getEntityId());
				packet.setValue("b", 2);
				sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet18ArmAnimation packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	DEAD {
		@Override
		protected void broadcastAnimation(Player player) {
			try {

				Packet packet = new Packet("Packet70Bed");
				packet.setValue("c", player.getEntityId());
				packet.setValue("b", 3);
				sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet70Bed packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	MAGIC_CRIT {
		@Override
		protected void broadcastAnimation(Player player) {
			try {

				Packet packet = new Packet("Packet18ArmAnimation");
				packet.setValue("a", player.getEntityId());
				packet.setValue("b", 7);
				sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet18ArmAnimation packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	SLEEP {
		@Override
		protected void broadcastAnimation(Player player) {
			try {

				Packet packet = new Packet("Packet17EntityLocationAction");
				packet.setValue("a", player.getEntityId());
				packet.setValue("e", 0);
				packet.setValue("b", (int) player.getLocation().getX());
				packet.setValue("c", (int) player.getLocation().getY());
				packet.setValue("d", (int) player.getLocation().getZ());
				sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet17EntityLocation packet!" + "(" + this + ")");
				e.printStackTrace();
			}

		}
	},
	STOP_SLEEPING {
		@Override
		protected void broadcastAnimation(Player player) {
			try {

				Packet packet = new Packet("Packet18ArmAnimation");
				packet.setValue("a", player.getEntityId());
				packet.setValue("b", 3);
				sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet18ArmAnimation packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	START_RAIN {
		@Override
		protected void broadcastAnimation(Player player) {
			try {

				Packet packet = new Packet("Packet70Bed");
				packet.setValue("c", player.getEntityId());
				packet.setValue("b", 1);
				sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet70Bed packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	STOP_RAIN {
		@Override
		protected void broadcastAnimation(Player player) {
			try {

				Packet packet = new Packet("Packet70Bed");
				packet.setValue("c", player.getEntityId());
				packet.setValue("b", 2);
				sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet70Bed packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	ENTER_CREDITS {
		@Override
		protected void broadcastAnimation(Player player) {
			try {

				Packet packet = new Packet("Packet70Bed");
				packet.setValue("c", player.getEntityId());
				packet.setValue("b", 4);
				sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet70Bed packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	CHANGE_GAMEMODE {
		@Override
		protected void broadcastAnimation(Player player) {
			try {

				Packet packet = new Packet("Packet70Bed");
				packet.setValue("c", player.getEntityId());
				packet.setValue("b", 3);
				sendPacketNearby(player.getLocation(), Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet70Bed packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	/*SIT {
		@Override
		protected void broadcastAnimation(Player player) {
			try {

				Object entityPlayer = ReflectionUtil.BukkitPlayerToEntityPlayer(player);

				Packet mob = new Packet("Packet24MobSpawn");
				mob.setValue("a", 12345);
				mob.setValue("b", (byte) EntityType.HORSE.getTypeId());
				mob.setValue("c", player.getLocation().getX());
				mob.setValue("d", player.getLocation().getX());
				mob.setValue("e", player.getLocation().getX());
				mob.setValue("f", 0);
				mob.setValue("g", 0);
				mob.setValue("h", null);
				mob.setValue("i", 0);
				mob.setValue("j", 0);
				mob.setValue("k", 0);

				Object watcher = ReflectionUtil.getNMSClass("DataWatcher");
				Method a = ReflectionUtil.getMethod("a", watcher.getClass(), 2);
				a.setAccessible(true);
				a.invoke(watcher, 0, (byte)0x20);
				a.invoke(watcher, 6, (Float) (float) 10);
				a.invoke(watcher, 7, (Integer) (int) 0);
				a.invoke(watcher, 8, (Byte) (byte) 0);
				a.invoke(watcher, 10, (String) "awesome_chair");
				a.invoke(watcher, 11, (Byte) (byte) 1);
				mob.setValue("t", watcher);

				Packet packet = new Packet("Packet39AttachEntity");
				packet.setValue("a", 0);
				packet.setValue("b", player.getEntityId());
				packet.setValue("c", 12345);
				
				Collection<Packet> packets = Arrays.asList(mob , packet);

				sendPacketNearby(player.getLocation(), packets, this);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	},
	/*STOP_SITTING {
		@Override
		protected void broadcastAnimation(Player player) {
			player.mount(null);
		}
	},*/
	/*SNEAK {
		@Override
		protected void broadcastAnimation(Player player) {
			player.setSneaking(true);
			try {
				player.setSneaking(true);
				Packet packet = new Packet("Packet40EntityMetadata");
				packet.setValue("a", player.getEntityId());
				DataWatcherUtil dw = new DataWatcherUtil((byte) 4);
				packet.setValue("b", dw.c());
				sendPacketNearby(player.getLocation(), packet);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[PlayerAnimationLib] Something went wrong while crafting the Packet40EntityMetadata packet! (SNEAK)");
				e.printStackTrace();
			}
		}
	},
	/*STOP_SNEAKING {
		@Override
		protected void broadcastAnimation(Player player) {
			player.getBukkitEntity().setSneaking(false);
			sendPacketNearby(new Packet40EntityMetadata(player.id, player.getDataWatcher(), true), player, radius);
		}
	}*/;
	/*
	 * You can look again
	 */

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
			if(!event.isCancelled()){
				for(Packet packet : packets){
					packet.send(player);
				}
			}
		}
	}

	protected void broadcastAnimation(Player player){
		throw new UnsupportedOperationException("unimplemented animation");
	}

}
