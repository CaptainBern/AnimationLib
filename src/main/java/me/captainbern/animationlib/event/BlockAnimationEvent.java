package me.captainbern.animationlib.event;

import me.captainbern.animationlib.animations.BlockAnimation;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BlockAnimationEvent extends Event implements Cancellable{

	private static final HandlerList handlers = new HandlerList();
	private boolean cancelled = false;
	private Block block;
	private BlockAnimation ba;

	public BlockAnimationEvent(Block block, BlockAnimation ba){
		super();
		this.block = block;
		this.ba = ba;
	}

	public Block getBlock(){
		return block;
	}

	public BlockAnimation getBlockAnimationType(){
		return ba;
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
