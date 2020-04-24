package me.pikod.fireplus;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandMain implements CommandExecutor {
	
	public CommandMain(Plugin pl) {
		pl.getCommand("fireplus").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		sender.sendMessage(Lang.Color("&b&l&m-----------------------------\n&cPlugin created by pikod. Click for more: \n&b&l* &7https://github.com/ByPikod/\n&cVersion &l0.1 &c- Support discord: \n&b&l* &7https://discord.gg/dkbNmFJ\n&b&l&m-----------------------------"));
		return true;
	}
	
}
