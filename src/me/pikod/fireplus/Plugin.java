package me.pikod.fireplus;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new CommandMain(this);
		new Listen(this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public class Listen implements Listener {
		public Listen(Plugin pl) {
			pl.getServer().getPluginManager().registerEvents(this, pl);
		}
		
		@EventHandler
		public void onRedstone(BlockRedstoneEvent event) {
			if(event.getBlock().getType() == Material.NETHERRACK) {
				if(event.getBlock().getRelative(BlockFace.UP).getType() != Material.FIRE && event.getBlock().getRelative(BlockFace.UP).getType() != Material.AIR) return;
				if(event.getBlock().getBlockPower() != 0) {
					event.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
				}else {
					event.getBlock().getRelative(BlockFace.UP).setType(Material.AIR);
				}
			}
		}
	}
	
}
