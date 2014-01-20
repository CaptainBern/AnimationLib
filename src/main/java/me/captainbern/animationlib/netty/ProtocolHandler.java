package me.captainbern.animationlib.netty;

import me.captainbern.animationlib.utils.PlayerUtil;
import net.minecraft.util.io.netty.channel.ChannelDuplexHandler;
import net.minecraft.util.io.netty.channel.ChannelHandlerContext;
import net.minecraft.util.io.netty.channel.ChannelPromise;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public abstract class ProtocolHandler implements Listener {

    private Plugin plugin;
    private boolean closed = false;

    public ProtocolHandler(Plugin plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);

        for(Player player : Bukkit.getOnlinePlayers()) {
            injectPlayer(player);
        }
    }

    private void injectPlayer(final Player player) {
        // Inject our packet interceptor
        PlayerUtil.getChannel(player).pipeline().addBefore("packet_handler", getHandlerName(), new ChannelDuplexHandler() {
            @Override
            public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
                Object result = onPacketInAsync(player, msg);

                if (result != null) {
                    super.channelRead(ctx, result);
                }
            }

            @Override
            public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
                Object result = onPacketOutAsync(player, msg);

                if (result != null) {
                    super.write(ctx, result, promise);
                }
            }
        });
    }

    public final String getHandlerName() {
        return "animationlib_handler";
    }

    @EventHandler
    public final void onPlayerJoin(PlayerJoinEvent event) {
        if (closed)
            return;
        injectPlayer(event.getPlayer());
    }

    public Object onPacketOutAsync(Player reciever, Object packet) {
        return packet;
    }

    public Object onPacketInAsync(Player sender, Object packet) {
        return packet;
    }

    public final void close() {
        if (!closed) {
            closed = true;

            // Remove our handlers
            for (Player player : plugin.getServer().getOnlinePlayers()) {
                PlayerUtil.getChannel(player).pipeline().remove(getHandlerName());
            }
        }
    }
}
