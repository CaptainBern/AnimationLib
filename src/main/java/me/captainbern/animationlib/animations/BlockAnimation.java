package me.captainbern.animationlib.animations;

import org.bukkit.block.Block;

public enum BlockAnimation {

    NULL;

	/*BLOCK_BREAK {
		@Override
		protected void broadcastAnimation(Block block, short damage) {
			try{

				if(damage > 7 || damage < 0){
					throw new NumberFormatException("Damage needs to be between 0 and 7!");
				}
				
				Packet packet = new Packet("Packet55BlockBreakAnimation");
				packet.setPrivateValue("a", 0);
				packet.setPrivateValue("b", block.getX());
				packet.setPrivateValue("c", block.getY());
				packet.setPrivateValue("d", block.getZ());
				packet.setPrivateValue("e", Integer.valueOf(Short.toString(damage)));
				sendPacketNearby(block.getLocation(), Arrays.asList(packet), this, block);

			}catch(Exception e){
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet55BlockBreakAnimation packet! (BLOCK_BREAK)");
				e.printStackTrace();
			}
		}
	}; */

	/* STOP ENUMS */

	/*public void play(Block block, short damage){
		broadcastAnimation(block, damage);
	}

	private static void sendPacketNearby(Location loc, Collection<Packet> packets, BlockAnimation ba, Block block) {
		World world = loc.getWorld();
		for(Player player : Bukkit.getOnlinePlayers()){
			if(player == null || player.getWorld() != world){
				continue;
			}
			BlockAnimationEvent event = new BlockAnimationEvent(block, ba);
			Bukkit.getPluginManager().callEvent(event);
			if(!event.isCancelled()){
				for(Packet packet : packets){
					packet.send(player);
				}
			}
		}
	} */

	protected void broadcastAnimation(Block block, short damage){
		throw new UnsupportedOperationException("[AnimationLib] Unimplemented animation");
	}

}
