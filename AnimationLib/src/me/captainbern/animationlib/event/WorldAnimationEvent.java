package me.captainbern.animationlib.event;

import me.captainbern.animationlib.animations.WorldAnimation;

import org.bukkit.World;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class WorldAnimationEvent extends Event implements Cancellable{

	private static final HandlerList handlers = new HandlerList();
	private boolean cancelled = false;
	private World world;
	private WorldAnimation wa;

	public WorldAnimationEvent(World world, WorldAnimation pa){
		super();
		this.world = world;
		this.wa = pa;
	}

	public World getWorld(){
		return world;
	}

	public WorldAnimation getWorldAnimationType(){
		return wa;
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
	
