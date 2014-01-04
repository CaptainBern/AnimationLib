package me.captainbern.animationlib.event;

import me.captainbern.animationlib.animations.MobAnimation;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MobAnimationEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled = false;
    private Entity mob;
    private MobAnimation ma;

    public MobAnimationEvent(Entity mob, MobAnimation ma){
        super();
        this.mob = mob;
        this.ma = ma;
    }

    public Entity getEntity(){
        return mob;
    }

    public MobAnimation getMobAnimationType(){
        return ma;
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
