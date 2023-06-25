package com.example;

import java.util.Hashtable;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import com.example.CommandExecute.CmdExecute;
import com.example.Player.PlayerListener;

public class Plugin extends JavaPlugin {
  private static final Logger LOGGER = Logger.getLogger("point-of-death");
  public static Hashtable<String, Location> deathPoints = new Hashtable<>();
  private CmdExecute execute = new CmdExecute();

  public void onEnable() {
    LOGGER.info("point-of-death enabled");

    getCommand("last_death").setExecutor(execute);

    Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
  }

  public void onDisable() {
    LOGGER.info("point-of-death disabled");
  }
}
