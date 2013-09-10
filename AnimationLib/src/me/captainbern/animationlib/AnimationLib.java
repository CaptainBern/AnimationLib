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

package me.captainbern.animationlib;

import org.bukkit.plugin.java.JavaPlugin;

public class AnimationLib extends JavaPlugin {
	
	public void onEnable(){
		getLogger().info("Enabled");
	}
	
	/**
	 * Used when players would activate this trough concole or something
	 */
	public static void main(String[] args){
		System.out.print("This is a library for Bukkit, place it in your plugins folder!");
	}
}
