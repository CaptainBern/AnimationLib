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

package me.captainbern.animationlib.event;

import me.captainbern.animationlib.animations.PlayerAnimation;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerAnimationEvent extends Event implements Cancellable{

	private static final HandlerList handlers = new HandlerList();
	private boolean cancelled = false;
	private Player player;
	private PlayerAnimation pa;

	public PlayerAnimationEvent(Player player, PlayerAnimation pa){
		super();
		this.player = player;
		this.pa = pa;
	}

	public Player getPlayer(){
		return player;
	}

	public PlayerAnimation getPlayerAnimationType(){
		return pa;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean arg0) {
		this.cancelled = arg0;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
