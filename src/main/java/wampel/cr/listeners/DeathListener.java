package wampel.cr.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import wampel.cr.Main;
import wampel.cr.utils.Config;

public class DeathListener implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Player killer = event.getEntity().getKiller();

        //Sound when anyone dies
        for(Player p : Bukkit.getOnlinePlayers()) {
            p.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1, 1);
        }
        //Kick player when he dies
        player.kickPlayer(ChatColor.GOLD + "You are out. gg!");


        //If player dies check which team he is in and if he got killed, if killed display killer
        if (player.getName().equals(Config.get("Give yourself Admin permissions by putting your ingame name in this config .Admin Ingame Name"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.DARK_RED + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.DARK_RED + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 1. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 1. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.AQUA + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.AQUA + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 2. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 2. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.GREEN + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.GREEN + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 3. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 3. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.YELLOW + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.YELLOW + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 4. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 4. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.BLUE + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.BLUE + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 5. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 5. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.DARK_GREEN + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.DARK_GREEN + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 6. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 6. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.BLACK + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.BLACK + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 7. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 7. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.DARK_PURPLE + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.DARK_PURPLE + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 8. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 8. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.WHITE + ChatColor.BOLD + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.WHITE + ChatColor.BOLD + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 9. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 9. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.GOLD + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.GOLD + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 10. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 10. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.LIGHT_PURPLE + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 11. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 11. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.DARK_BLUE + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.DARK_BLUE + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 12. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 12. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.DARK_GREEN + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.DARK_GREEN + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 13. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 13. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.RED + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.RED + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 14. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 14. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.DARK_GRAY + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.DARK_GRAY + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 15. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 15. Ingame Name Teammate 2"))) {
            if (killer == null) {
                event.setDeathMessage(Main.getPrefix() + ChatColor.DARK_PURPLE + player.getName() + ChatColor.WHITE + " died");
            } else {
                event.setDeathMessage(Main.getPrefix() + ChatColor.DARK_PURPLE + player.getName() + " was killed by " + ChatColor.WHITE + ChatColor.BOLD + killer.getName());
            }
        }
    }
}
