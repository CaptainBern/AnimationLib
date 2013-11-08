package me.captainbern.animationlib.event;

import me.captainbern.animationlib.animations.SoundEffect;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class SoundEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled = false;
    private SoundEffect effect;

    public SoundEvent(SoundEffect effect){
        super();
        this.effect = effect;
    }

    public SoundEffect getEffectType(){
        return effect;
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
