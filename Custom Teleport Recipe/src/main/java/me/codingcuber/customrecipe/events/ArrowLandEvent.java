package me.codingcuber.customrecipe.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

import java.util.Objects;

public class ArrowLandEvent implements Listener {

    @EventHandler
    public void onArrowLand(ProjectileHitEvent e) {
        if (e.getEntity() instanceof Arrow) {

            Player player = (Player) e.getEntity().getShooter();
            Arrow arrow = (Arrow) e.getEntity();

            assert player != null;
            if (Objects.requireNonNull(player.getInventory().getItemInMainHand().getItemMeta()).getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "" + ChatColor.GOLD + "Teleport Bow")) {

                player.teleport(arrow.getLocation());


            }

        }
    }

}
