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
