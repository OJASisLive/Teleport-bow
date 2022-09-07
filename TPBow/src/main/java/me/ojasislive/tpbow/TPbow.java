package me.ojasislive.tpbow;

import me.ojasislive.tpbow.commands.GiveCommand;
import me.ojasislive.tpbow.itemManager.Item;
import me.ojasislive.tpbow.listeners.ArrowListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TPbow extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Plugin developed by OJASisLive#9313!!!");
        Item.init();
        getServer().getPluginManager().registerEvents(new ArrowListener(),this);
        getCommand("givebow").setExecutor(new GiveCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
