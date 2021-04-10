package wampel.cr.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import wampel.cr.Main;
import wampel.cr.utils.Config;

public class ChatListener implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        //%1$s %2$s

        if (player.getName().equals(Config.get("Give yourself Admin permissions by putting your ingame name in this config .Admin Ingame Name"))) {
            event.setFormat(Main.getAdminPrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 1. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 1. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamOnePrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 2. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 2. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamTwoPrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 3. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 3. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamThreePrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 4. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 4. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamFourPrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 5. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 5. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamFivePrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 6. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 6. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamSixPrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 7. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 7. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamSevenPrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 8. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 8. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamEightPrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 9. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 9. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamNinePrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 10. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 10. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamTenPrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 11. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 11. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamElevenPrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 12. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 12. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamTwelvePrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 13. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 13. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamThirteenPrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 14. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 14. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamFourteenPrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
        if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 15. Ingame Name Teammate 1")) || player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 15. Ingame Name Teammate 2"))) {
            event.setFormat(Main.getTeamFifteenPrefix() + ChatColor.GRAY + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }
    }
}