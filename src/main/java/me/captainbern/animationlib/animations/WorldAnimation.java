package me.captainbern.animationlib.animations;

public enum WorldAnimation {

    NULL;
	
	/*HUGE_EXPLOSION {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }
				                      
				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "hugeexplosion");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	LARGE_EXPLODE {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "largeexplode");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	FIREWORK_SPARK {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "fireworksSpark");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	BUBBLE {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "bubble");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", (float) offsetX);
				packet.setPrivateValue("f", (float) offsetY);
				packet.setPrivateValue("g", (float) offsetZ);
				packet.setPrivateValue("h", (float) speed);
				packet.setPrivateValue("i", (int) amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	SUSPENDED {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "suspended");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	DEPHT_SUSPEND {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "dephtsuspend");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	TOWN_AURA {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "townaura");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	CRIT {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "crit");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	MAGIC_CRIT {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "magicCrit");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	SMOKE {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "smoke");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	MOBSPELL {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "mobSpell");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	MOBSPELL_AMBIENT {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "mobSpellAmbient");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	SPELL {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "spell");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	INSTANT_SPELL {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "instantSpell");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	WITCH_MAGIC {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "witchMagic");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	NOTE {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "note");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	PORTAL {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "portal");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	ENCHANTMENT_TABLE {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "enchantmenttable");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	EXPLODE {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "explode");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	FLAME {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "flame");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	LAVA {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "lava");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	FOOTSTEP {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "footstep");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	LARGE_SMOKE {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "largesmoke");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	CLOUD {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "cloud");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	RED_DUST {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "reddust");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	SNOWBALL_POOF {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "snowballpoof");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	DRIP_WATER {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "dripWater");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	DRIP_LAVA {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "dripLava");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	SNOW_SHOVEL {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "snowshovel");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	SLIME {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "slime");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	HEART {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "heart");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	ANGRY_VILLAGER {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "angryVillager");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},
	HAPPY_VILLAGER {
		@Override
		protected void broadcastAnimation(Location loc, float speed, int amount, float offsetX, float offsetY, float offsetZ) {
			try {
				
				if (amount < 1) {
	                throw new IllegalArgumentException("[AnimationLib] Amount param must be greater then 0!");
	            }

				Packet packet = new Packet("Packet63WorldParticles");
				packet.setPrivateValue("a", "happyVillager");
				packet.setPrivateValue("b", (float) loc.getX());
				packet.setPrivateValue("c", (float) loc.getY());
				packet.setPrivateValue("d", (float) loc.getZ());
				packet.setPrivateValue("e", offsetX);
				packet.setPrivateValue("f", offsetY);
				packet.setPrivateValue("g", offsetZ);
				packet.setPrivateValue("h", speed);
				packet.setPrivateValue("i", amount);
				
				sendPacketNearby(loc, Arrays.asList(packet), this);

			} catch (Exception e) {
				Bukkit.getLogger().warning("[AnimationLib] Something went wrong while crafting the Packet63WorldParticles packet!" + "(" + this + ")");
				e.printStackTrace();
			}
		}
	},;
	
	public void play(Location loc, float speed, int amount, float offX, float offY, float offZ){
		broadcastAnimation(loc, speed, amount, offX, offY, offZ);
	}

	private static void sendPacketNearby(Location loc, Collection<Packet> packets, WorldAnimation wa) {
		World world = loc.getWorld();
		for(Player player : Bukkit.getOnlinePlayers()){
			if(player == null || player.getWorld() != world){
				continue;
			}
			WorldAnimationEvent event = new WorldAnimationEvent(loc.getWorld(), wa);
			Bukkit.getPluginManager().callEvent(event);
			if(!event.isCancelled()){
				for(Packet packet : packets){
					packet.send(player);
				}
			}
		}
	}

	protected void broadcastAnimation(Location loc, float speed, int amount, float offX, float offY, float offZ){
		throw new UnsupportedOperationException("[AnimationLib] Unimplemented animation");
	} */

}
