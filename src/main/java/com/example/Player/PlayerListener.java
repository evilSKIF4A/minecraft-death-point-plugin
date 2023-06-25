package com.example.Player;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import com.example.Plugin;

public class PlayerListener implements Listener {

    @EventHandler
    public static void onDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Location loc = player.getLocation();
        Plugin.deathPoints.put(player.getName(), loc);
    }

}
