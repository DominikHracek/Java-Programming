package me.khakis.myfirstplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreeperPowerEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.raid.RaidSpawnWaveEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffectType;

public final class MyFirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Thanks for using my plugin");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerLevelChanged(PlayerLevelChangeEvent event) {

        Player player = event.getPlayer();
        player.setLevel(30);
        player.sendMessage("Your level has been changed, so i turned it to level 30 for you");
    }

    @EventHandler
    public void onRaidSpawnWaveEvent(RaidSpawnWaveEvent event) {

        Player player = event.getPlayer();
        player.setHealth(50);
        player.getPotionEffect(PotionEffectType.HEAL, 255);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Thanks for using my plugin");
        System.out.println("Hope you enjoyed");
    }
}
