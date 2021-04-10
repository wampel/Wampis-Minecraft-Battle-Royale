package wampel.cr.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import wampel.cr.Main;
import wampel.cr.utils.Config;

public class QuitListener implements Listener {
    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        if (player.getName().equals(Config.get("Give yourself Admin permissions by putting your ingame name in this config .Admin Ingame Name"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.DARK_RED + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 1. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 1. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.AQUA + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 2. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 2. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.GREEN + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 3. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 3. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.YELLOW + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 4. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 4. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.BLUE + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 5. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 5. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.DARK_GREEN + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 6. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 6. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.BLACK + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 7. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 7. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.DARK_PURPLE + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 8. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 8. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.WHITE + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 9. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 9. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.GOLD + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 10. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 10. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 11. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 11. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.DARK_BLUE + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 12. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 12. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.DARK_GREEN + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 13. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 13. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.RED + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 14. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 14. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.GRAY + player.getName() + ChatColor.GRAY + " left the game");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 15. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 15. Ingame Name Teammate 2"))) {
            event.setQuitMessage(Main.getPrefix() + ChatColor.GRAY + player.getName() + ChatColor.GRAY + " left the game");
        }
    }
}