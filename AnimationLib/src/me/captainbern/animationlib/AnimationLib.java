package me.captainbern.animationlib;

import org.bukkit.plugin.java.JavaPlugin;

public class AnimationLib extends JavaPlugin {
	
	public void onEnable(){
		getLogger().info("Enabled");
	}
	
	public static void main(String[] args){
		System.out.print("This is a library for Bukkit, place it in your plugins folder!");
	}
}
