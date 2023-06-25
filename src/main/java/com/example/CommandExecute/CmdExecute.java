package com.example.CommandExecute;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.example.Plugin;

import net.md_5.bungee.api.ChatColor;

public class CmdExecute implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("last_death") && sender instanceof Player) {
            if (args.length == 0) {
                Location loc = Plugin.deathPoints.get(sender.getName());
                sender.sendMessage(
                        ChatColor.GOLD + "Последняя смерть X: " + (int) loc.getX() + " Y: " + (int) loc.getY() + " Z: "
                                + (int) loc.getZ());
                return true;
            } else if (args.length == 1) {
                Location loc = Plugin.deathPoints.get(args[0]);
                sender.sendMessage(
                        ChatColor.GOLD + "Последняя смерть " + args[0] + " X: " + (int) loc.getX() + " Y: "
                                + (int) loc.getY() + " Z: "
                                + (int) loc.getZ());
                return true;
            }
        }
        return false;
    }

}
