package me.ojasislive.tpbow.listeners;

import me.ojasislive.tpbow.itemManager.Item;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

import java.util.Objects;

public class ArrowListener implements Listener {
    @EventHandler
    public void onArrowHit(ProjectileHitEvent e) {
        Projectile projectile = e.getEntity();
        if (projectile instanceof Arrow) {
            Location location = e.getEntity().getLocation();
            if (e.getEntity().getShooter() instanceof Player) {
                Player p = (Player) e.getEntity().getShooter();
                assert p != null;
                if (p.getInventory().getItemInMainHand().getType().equals(Material.BOW)) {
                    if (Objects.requireNonNull(p.getInventory().getItemInMainHand().getItemMeta()).equals(Item.enderbow.getItemMeta())) {
                        p.teleport(location);
                        p.sendMessage(ChatColor.GREEN + "Swoosh");
                        p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0F, 1.0F);
                    }
                }
            }
        }
    }
}


