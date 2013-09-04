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

package me.captainbern.animationlib.utils;

import java.lang.reflect.Field;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Packet {

	private Object crafted_packet = null;

	public Packet(String name){
		try {
			crafted_packet = ReflectionUtil.getNMSClass(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setValue(String field, Object value){
		try {
			Field f = crafted_packet.getClass().getField(field);
			f.setAccessible(true);
			f.set(crafted_packet, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void send(Player player){
		try {
			Object entityPlayer = ReflectionUtil.getMethod("getHandle", player.getClass(), 0).invoke(player);
			Object playerConnection = entityPlayer.getClass().getField("playerConnection").get(entityPlayer);
			ReflectionUtil.getMethod("sendPacket", playerConnection.getClass(), 1).invoke(playerConnection, crafted_packet);
		} catch (Exception e) {
			Bukkit.getLogger().warning("[AnimationLib] Failed to send packet to " + player.getName() + "!");
		}
	}
}
