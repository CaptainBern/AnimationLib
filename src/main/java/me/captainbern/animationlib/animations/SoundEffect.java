package me.captainbern.animationlib.animations;

import me.captainbern.animationlib.protocol.Packet;
import me.captainbern.animationlib.protocol.PacketType;
import me.captainbern.animationlib.utils.PlayerUtil;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.Collection;

public enum SoundEffect {

    AMBIENT_CAVE {
        @Override
        protected void broadcastAnimation(Location loc, float volume, int pitch) {
            try{

                Packet packet = new Packet(PacketType.NAMED_SOUND_EFFECT);
                packet.write("a", SoundType.AmbientCave);
                packet.write("b", (int) loc.getY() * 8.0D);
                packet.write("c", (int) loc.getY() * 8.0D);
                packet.write("d", (int) loc.getZ() * 8.0D);
                packet.write("e", volume);

                pitch = (int) (pitch * 63.0F);
                if(pitch < 0){
                    pitch = 0;
                }

                if(pitch > 255){
                    pitch = 255;
                }

                packet.write("f", pitch);

                sendPacketNearby(loc, Arrays.asList(packet));

            }catch(Exception e){
                Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
                e.printStackTrace();
            }
        }
    },
	AMBIENT_WEATHER_RAIN {
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{

                Packet packet = new Packet(PacketType.NAMED_SOUND_EFFECT);
                packet.write("a", SoundType.AmbientWeatherRain);
                packet.write("b", (int) loc.getY() * 8.0D);
                packet.write("c", (int) loc.getY() * 8.0D);
                packet.write("d", (int) loc.getZ() * 8.0D);
                packet.write("e", volume);

                pitch = (int) (pitch * 63.0F);
                if(pitch < 0){
                    pitch = 0;
                }

                if(pitch > 255){
                    pitch = 255;
                }

                packet.write("f", pitch);

                sendPacketNearby(loc, Arrays.asList(packet));

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},;
	/*AMBIENT_WEATHER_THUNDER {
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{
				
				Packet packet = new Packet("Packet62NamedSoundEffect");
				packet.setPrivateValue("a", "ambient.weather.thunder");
				packet.setPrivateValue("b", (int) loc.getX() * 8.0D);
				packet.setPrivateValue("c", (int) loc.getY() * 8.0D);
				packet.setPrivateValue("d", (int) loc.getZ() * 8.0D);
				packet.setPrivateValue("e", volume);
				pitch = (int) (pitch * 63.0F);
				if(pitch < 0){
					pitch = 0;
				}
				
				if(pitch > 255){
					pitch = 255;
				}
				
				packet.setPrivateValue("f", pitch);
	
				sendPacketNearby(loc, Arrays.asList(packet));

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},
	DAMAGE_FALL_BIG{
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{
				
				Packet packet = new Packet("Packet62NamedSoundEffect");
				packet.setPrivateValue("a", "damage.fallbig");
				packet.setPrivateValue("b", (int) loc.getX() * 8.0D);
				packet.setPrivateValue("c", (int) loc.getY() * 8.0D);
				packet.setPrivateValue("d", (int) loc.getZ() * 8.0D);
				packet.setPrivateValue("e", volume);
				pitch = (int) (pitch * 63.0F);
				if(pitch < 0){
					pitch = 0;
				}
				
				if(pitch > 255){
					pitch = 255;
				}
				
				packet.setPrivateValue("f", pitch);
	
				sendPacketNearby(loc, Arrays.asList(packet));

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},
	DAMAGE_FALL_SMALL {
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{
				
				Packet packet = new Packet("Packet62NamedSoundEffect");
				packet.setPrivateValue("a", "damage.fallsmall");
				packet.setPrivateValue("b", (int) loc.getX() * 8.0D);
				packet.setPrivateValue("c", (int) loc.getY() * 8.0D);
				packet.setPrivateValue("d", (int) loc.getZ() * 8.0D);
				packet.setPrivateValue("e", volume);
				pitch = (int) (pitch * 63.0F);
				if(pitch < 0){
					pitch = 0;
				}
				
				if(pitch > 255){
					pitch = 255;
				}
				
				packet.setPrivateValue("f", pitch);
	
				sendPacketNearby(loc, Arrays.asList(packet));

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},
	FIRE {
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{
				
				Packet packet = new Packet("Packet62NamedSoundEffect");
				packet.setPrivateValue("a", "fire.fire");
				packet.setPrivateValue("b", (int) loc.getX() * 8.0D);
				packet.setPrivateValue("c", (int) loc.getY() * 8.0D);
				packet.setPrivateValue("d", (int) loc.getZ() * 8.0D);
				packet.setPrivateValue("e", volume);
				pitch = (int) (pitch * 63.0F);
				if(pitch < 0){
					pitch = 0;
				}
				
				if(pitch > 255){
					pitch = 255;
				}
				
				packet.setPrivateValue("f", pitch);
	
				sendPacketNearby(loc, Arrays.asList(packet));

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},
	FIRE_IGNITE {
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{
				
				Packet packet = new Packet("Packet62NamedSoundEffect");
				packet.setPrivateValue("a", "fire.ignite");
				packet.setPrivateValue("b", (int) loc.getX() * 8.0D);
				packet.setPrivateValue("c", (int) loc.getY() * 8.0D);
				packet.setPrivateValue("d", (int) loc.getZ() * 8.0D);
				packet.setPrivateValue("e", volume);
				pitch = (int) (pitch * 63.0F);
				if(pitch < 0){
					pitch = 0;
				}
				
				if(pitch > 255){
					pitch = 255;
				}
				
				packet.setPrivateValue("f", pitch);
	
				sendPacketNearby(loc, Arrays.asList(packet));

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},
	LIQUID_LAVA {
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{
				
				Packet packet = new Packet("Packet62NamedSoundEffect");
				packet.setPrivateValue("a", "liquid.lava");
				packet.setPrivateValue("b", (int) loc.getX() * 8.0D);
				packet.setPrivateValue("c", (int) loc.getY() * 8.0D);
				packet.setPrivateValue("d", (int) loc.getZ() * 8.0D);
				packet.setPrivateValue("e", volume);
				pitch = (int) (pitch * 63.0F);
				if(pitch < 0){
					pitch = 0;
				}
				
				if(pitch > 255){
					pitch = 255;
				}
				
				packet.setPrivateValue("f", pitch);
	
				sendPacketNearby(loc, Arrays.asList(packet));
				
			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},
	LAVA_POP {
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{
				
				Packet packet = new Packet("Packet62NamedSoundEffect");
				packet.setPrivateValue("a", "liquid.lavapop");
				packet.setPrivateValue("b", (int) loc.getX() * 8.0D);
				packet.setPrivateValue("c", (int) loc.getY() * 8.0D);
				packet.setPrivateValue("d", (int) loc.getZ() * 8.0D);
				packet.setPrivateValue("e", volume);
				pitch = (int) (pitch * 63.0F);
				if(pitch < 0){
					pitch = 0;
				}
				
				if(pitch > 255){
					pitch = 255;
				}
				
				packet.setPrivateValue("f", pitch);

				sendPacketNearby(loc, Arrays.asList(packet));

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},
	SPLASH {
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{
				
				Packet packet = new Packet("Packket62NamedSoundEffect");
				packet.setPrivateValue("a", "liquid.splash");
				packet.setPrivateValue("b", (int) loc.getX() * 8.0D);
				packet.setPrivateValue("c", (int) loc.getY() * 8.0D);
				packet.setPrivateValue("d", (int) loc.getZ() * 8.0D);
				packet.setPrivateValue("e", volume);
				pitch = (int) (pitch * 63.0F);
				if(pitch < 0){
					pitch = 0;
				}
				
				if(pitch > 255){
					pitch = 255;
				}
				
				packet.setPrivateValue("f", pitch);
	
				sendPacketNearby(loc, Arrays.asList(packet));

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},
	WATER {
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{
				
				Packet packet = new Packet("Packet62NamedSoundEffect");
				packet.setPrivateValue("a", "liquid.water");
				packet.setPrivateValue("b", (int) loc.getX() * 8.0D);
				packet.setPrivateValue("c", (int) loc.getY() * 8.0D);
				packet.setPrivateValue("d", (int) loc.getZ() * 8.0D);
				packet.setPrivateValue("e", volume);
				pitch = (int) (pitch * 63.0F);
				if(pitch < 0){
					pitch = 0;
				}
				
				if(pitch > 255){
					pitch = 255;
				}
				
				packet.setPrivateValue("f", pitch);
	
				sendPacketNearby(loc, Arrays.asList(packet));

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},
	BLAZE_BREATHE {
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{
				
				Packet packet = new Packet("Packet62NamedSoundEffect");
				packet.setPrivateValue("a", "mob.blaze.breathe");
				packet.setPrivateValue("b", (int) loc.getX() * 8.0D);
				packet.setPrivateValue("c", (int) loc.getY() * 8.0D);
				packet.setPrivateValue("d", (int) loc.getZ() * 8.0D);
				packet.setPrivateValue("e", volume);
				pitch = (int) (pitch * 63.0F);
				if(pitch < 0){
					pitch = 0;
				}
				
				if(pitch > 255){
					pitch = 255;
				}
				
				packet.setPrivateValue("f", pitch);
				
				sendPacketNearby(loc, Arrays.asList(packet));
	
			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},
	BLAZE_DEATH {
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{
				
				Packet packet = new Packet("Packet62NamedSoundEffect");
				packet.setPrivateValue("a", "mob.blaze.death");
				packet.setPrivateValue("b", (int) loc.getX() * 8.0D);
				packet.setPrivateValue("c", (int) loc.getY() * 8.0D);
				packet.setPrivateValue("d", (int) loc.getZ() * 8.0D);
				packet.setPrivateValue("e", volume);
				pitch = (int) (pitch * 63.0F);
				if(pitch < 0){
					pitch = 0;
				}
				
				if(pitch > 255){
					pitch = 255;
				}
				
				packet.setPrivateValue("f", pitch);
				
				sendPacketNearby(loc, Arrays.asList(packet));

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},
	BLAZE_HIT {
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{
				
				Packet packet = new Packet("Packet62NamedSoundEffect");
				packet.setPrivateValue("a", "mob.blaze.hit");
				packet.setPrivateValue("b", (int) loc.getX() * 8.0D);
				packet.setPrivateValue("c", (int) loc.getY() * 8.0D);
				packet.setPrivateValue("d", (int) loc.getZ() * 8.0D);
				packet.setPrivateValue("e", volume);
				pitch = (int) (pitch * 63.0F);
				if(pitch < 0){
					pitch = 0;
				}
				
				if(pitch > 255){
					pitch = 255;
				}
				
				packet.setPrivateValue("f", pitch);
				
				sendPacketNearby(loc, Arrays.asList(packet));

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},
	CAT_HISS {
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{
				
				Packet packet = new Packet("Packet62NamedSoundEffect");
				packet.setPrivateValue("a", "mob.cat.hiss");
				packet.setPrivateValue("b", (int) loc.getX() * 8.0D);
				packet.setPrivateValue("c", (int) loc.getY() * 8.0D);
				packet.setPrivateValue("d", (int) loc.getZ() * 8.0D);
				packet.setPrivateValue("e", volume);
				pitch = (int) (pitch * 63.0F);
				if(pitch < 0){
					pitch = 0;
				}
				
				if(pitch > 255){
					pitch = 255;
				}
				
				packet.setPrivateValue("f", pitch);
				
				sendPacketNearby(loc, Arrays.asList(packet));

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},
	CAT_HIT {
		@Override
		protected void broadcastAnimation(Location loc, float volume, int pitch) {
			try{
				
				Packet packet = new Packet("Packet62NamedSoundEffect");
				packet.setPrivateValue("a", "mob.cat.hit");
				packet.setPrivateValue("b", (int) loc.getX() * 8.0D);
				packet.setPrivateValue("c", (int) loc.getY() * 8.0D);
				packet.setPrivateValue("d", (int) loc.getZ() * 8.0D);
				packet.setPrivateValue("e", volume);
				pitch = (int) (pitch * 63.0F);
				if(pitch < 0){
					pitch = 0;
				}
				
				if(pitch > 255){
					pitch = 255;
				}
				
				packet.setPrivateValue("f", pitch);
				
				sendPacketNearby(loc, Arrays.asList(packet));

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet62NamedSoundEffect packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	},;  */

	/* STOP ENUMS */

    public void play(Location loc, float volume, int pitch){
        broadcastAnimation(loc, pitch, pitch);
    }

    private static void sendPacketNearby(Location loc, Collection<Packet> packets) {
        World world = loc.getWorld();
        for(Player player : Bukkit.getOnlinePlayers()){
            if(player == null || player.getWorld() != world){
                continue;
            }
            for(Packet packet : packets){
                PlayerUtil.sendPacket(player, packet);
            }
        }
    }

    protected void broadcastAnimation(Location loc, float volume, int pitch){
        throw new UnsupportedOperationException("[AnimationLib] Unimplemented animation");
    }

}
