package me.ojasislive.tpbow.commands;

import me.ojasislive.tpbow.itemManager.Item;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "Only Players can use this command!!");
            return true;
        }
        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("givebow")){
            if(player.hasPermission("tpbow.bow")){
                player.getInventory().addItem(Item.enderbow);
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have the permission to use this command!!!");
            }
        }
        return true;
    }
}
