package org.altervista.javadevgioelex.simplecolorchat;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{	
	
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(this,  this);
		getConfig().options().copyDefaults(true);
		saveConfig();
		getLogger().info(ChatColor.GOLD + "======================");
		getLogger().info(ChatColor.GOLD + "+" + ChatColor.GREEN + "   Plugin Enabled   " + ChatColor.GOLD + "+");
		getLogger().info(ChatColor.GOLD + "======================");
		
	}

	public void onDisable() {
		
		getLogger().info(ChatColor.RED + "=======================");
		getLogger().info(ChatColor.RED + "+" + ChatColor.GOLD + "   Plugin Disabled   " + ChatColor.RED + "+");
		getLogger().info(ChatColor.RED + "=======================");
		
	}

	ArrayList<String> black = new ArrayList<String>();
	ArrayList<String> dark_blue = new ArrayList<String>();
	ArrayList<String> dark_green = new ArrayList<String>();
	ArrayList<String> dark_aqua = new ArrayList<String>();
	ArrayList<String> dark_red = new ArrayList<String>();
	ArrayList<String> dark_purple = new ArrayList<String>();
	ArrayList<String> gold = new ArrayList<String>();
	ArrayList<String> gray = new ArrayList<String>();
	ArrayList<String> dark_gray = new ArrayList<String>();
	ArrayList<String> blue = new  ArrayList<String>();
	ArrayList<String> green = new ArrayList<String>();
	ArrayList<String> aqua = new ArrayList<String>();
	ArrayList<String> red = new ArrayList<String>();
	ArrayList<String> light_purple = new ArrayList<String>();
	ArrayList<String> yellow = new ArrayList<String>();
	ArrayList<String> white = new ArrayList<String>();
	
	
	

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("colors")) {
			
			sender.sendMessage(ChatColor.GREEN + "=============================================");
			sender.sendMessage(ChatColor.YELLOW + "  V V V V V " + ChatColor.LIGHT_PURPLE + "Minecraft Colors List" + ChatColor.YELLOW + "  V V V V V  ");
			sender.sendMessage(ChatColor.BLACK + "black");
			sender.sendMessage(ChatColor.DARK_BLUE + "dark_blue");
			sender.sendMessage(ChatColor.DARK_GREEN + "dark_green");
			sender.sendMessage(ChatColor.DARK_AQUA + "dark_aqua");
			sender.sendMessage(ChatColor.DARK_RED + "dark_red");
			sender.sendMessage(ChatColor.DARK_PURPLE + "dark_purple");
			sender.sendMessage(ChatColor.GOLD + "gold");
			sender.sendMessage(ChatColor.GRAY + "gray");
			sender.sendMessage(ChatColor.DARK_GRAY + "dark_gray");
			sender.sendMessage(ChatColor.BLUE + "blue");
			sender.sendMessage(ChatColor.GREEN + "green");
			sender.sendMessage(ChatColor.AQUA + "aqua");
			sender.sendMessage(ChatColor.RED + "red");
			sender.sendMessage(ChatColor.LIGHT_PURPLE + "light_purple");
			sender.sendMessage(ChatColor.YELLOW + "yellow");
			sender.sendMessage(ChatColor.WHITE + "white");
			sender.sendMessage(ChatColor.GREEN + "=============================================");
			
			return true;
		}	
	
		
		
		
		if (cmd.getName().equalsIgnoreCase("black")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			black.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("dark_blue")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			dark_blue.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("dark_green")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			dark_green.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("dark_aqua")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			dark_aqua.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("dark_red")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			dark_red.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("dark_purple")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			dark_purple.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("gold")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			gold.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("gray")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			gray.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("dark_gray")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			dark_gray.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("blue")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			blue.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("green")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			green.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("aqua")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			aqua.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("red")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			red.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("light_purple")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			light_purple.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("yellow")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			yellow.add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("white")) {
			black.remove(sender.getName());
			dark_blue.remove(sender.getName());
			dark_green.remove(sender.getName());
			dark_red.remove(sender.getName());
			dark_aqua.remove(sender.getName());
			dark_purple.remove(sender.getName());
			gold.remove(sender.getName());
			gray.remove(sender.getName());
			dark_gray.remove(sender.getName());
			blue.remove(sender.getName());
			green.remove(sender.getName());
			red.remove(sender.getName());
			aqua.remove(sender.getName());
			light_purple.remove(sender.getName());
			yellow.remove(sender.getName());
			white.remove(sender.getName());
			white .add(sender.getName());
			sender.sendMessage(ChatColor.GREEN + getConfig().getString("color-preference"));
			return true;
		}
		
		
		
		return true;
	}


	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		
		if (black.contains(e.getPlayer().getName().toString())) {
		e.setMessage(ChatColor.BLACK + e.getMessage());
		}
		
		if (dark_blue.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.DARK_BLUE + e.getMessage());
		}
		
		if (dark_green.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.DARK_GREEN + e.getMessage());
		}
		
		if (dark_aqua.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.DARK_AQUA + e.getMessage());
		}
		
		if (dark_red.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.DARK_RED + e.getMessage());
		}
		
		if (dark_purple.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.DARK_PURPLE + e.getMessage());
		}
		
		if (gold.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.GOLD + e.getMessage());
		}
		
		if (gray.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.GRAY + e.getMessage());
		}
		
		if (dark_gray.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.DARK_GRAY + e.getMessage());
		}
		
		if (blue.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.BLUE + e.getMessage());
		}
		
		if (green.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.GREEN + e.getMessage());
		}
		
		if (aqua.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.AQUA + e.getMessage());
		}
		
		if (red.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.RED + e.getMessage());
		}
		
		if (yellow.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.YELLOW + e.getMessage());
		}
		
		if (white.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.WHITE + e.getMessage());
		}
		
		if (light_purple.contains(e.getPlayer().getName())) {
			e.setMessage(ChatColor.LIGHT_PURPLE + e.getMessage());
		}
		
		
		
	
	}
}
