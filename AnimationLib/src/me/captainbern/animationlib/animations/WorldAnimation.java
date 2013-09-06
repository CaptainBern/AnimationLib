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

import me.captainbern.animationlib.event.WorldAnimationEvent;
import me.captainbern.animationlib.utils.Packet;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public enum WorldAnimation {
	
	HUGE_EXPLOSION {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {
				                      
				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "hugeexplosion");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	LARGE_EXPLODE {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "largeexplode");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	FIREWORK_SPARK {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "fireworksSpark");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	BUBBLE {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "bubble");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", (float) offsetX);
				packet.setValue("f", (float) offsetY);
				packet.setValue("g", (float) offsetZ);
				packet.setValue("h", (float) speed);
				packet.setValue("i", (int) ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	SUSPENDED {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "suspended");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	DEPHT_SUSPEND {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "dephtsuspend");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	TOWN_AURA {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "townaura");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	CRIT {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "crit");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	MAGIC_CRIT {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "magicCrit");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	SMOKE {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "smoke");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	MOBSPELL {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "mobSpell");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	MOBSPELL_AMBIENT {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "mobSpellAmbient");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	SPELL {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "spell");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	INSTANT_SPELL {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "instantSpell");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	WITCH_MAGIC {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "witchMagic");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	NOTE {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "note");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	PORTAL {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "portal");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	ENCHANTMENT_TABLE {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "enchantmenttable");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	EXPLODE {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "explode");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	FLAME {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "flame");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	LAVA {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "lava");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	FOOTSTEP {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "footstep");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	LARGE_SMOKE {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "largesmoke");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	CLOUD {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "cloud");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	RED_DUST {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "reddust");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	SNOWBALL_POOF {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "snowballpoof");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	DRIP_WATER {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "dripWater");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	DRIP_LAVA {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "dripLava");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	SNOW_SHOVEL {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "snowshovel");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	SLIME {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "slime");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	HEART {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "heart");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	ANGRY_VILLAGER {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "angryVillager");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	HAPPY_VILLAGER {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int ammount, float offsetX, float offsetY, float offsetZ) {
			try {

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setValue("a", "happyVillager");
				packet.setValue("b", (float) loc.getX());
				packet.setValue("c", (float) loc.getYaw());
				packet.setValue("d", (float) loc.getZ());
				packet.setValue("e", offsetX);
				packet.setValue("f", offsetY);
				packet.setValue("g", offsetZ);
				packet.setValue("h", speed);
				packet.setValue("i", ammount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},;
	
	public void play(Location loc, float speed, int ammount, float offX, float offY, float offZ){
		broadcastAnimation(loc, speed, ammount, offX, offY, offZ);
	}

	private static void sendPacketNearby(Location loc, Collection<Packet> packets, WorldAnimation wa) {
		World world = loc.getWorld();
		for(Player player : Bukkit.getOnlinePlayers()){
			if(player == null || player.getWorld() != world){
				continue;
			}
			WorldAnimationEvent event = new WorldAnimationEvent(loc.getWorld(), wa);
			Bukkit.getPluginManager().callEvent(event);
			if(!event.isCancelled()){
				for(Packet packet : packets){
					packet.send(player);
				}
			}
		}
	}

	protected void broadcastAnimation(Location loc, float speed, int ammount, float offX, float offY, float offZ){
		throw new UnsupportedOperationException("unimplemented animation");
	}

}
