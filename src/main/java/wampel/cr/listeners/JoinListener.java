package wampel.cr.listeners;


import org.bukkit.ChatColor;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import wampel.cr.Main;
import wampel.cr.utils.Config;

import java.io.IOException;

public class JoinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
            /*
            if (player.getName().equals("xWampi")) {
            player.setPlayerListName(ChatColor.DARK_RED+ "[Admin] " + ChatColor.WHITE + player.getName());
                }
            }*/
        //Tell player to check config.yml
        if (Config.contains("I have read the config.yml. True or false")) {
            if (!((Boolean) Config.get("I have read the config.yml. True or false"))) {
                player.sendRawMessage(Main.getPrefix() + "Check the config yml");
            }
        } else {
            try {
                Config.set("I have read the config.yml. True or false", false);
            } catch (IOException e) {
                e.printStackTrace();
            }
            player.sendRawMessage(Main.getPrefix() + "Check the config.yml");
        }

        //give Admin prefix and create Config
        if (Config.contains("Give yourself Admin permissions by putting your ingame name in this config .Admin Ingame Name")) {
            if (player.getName().equals(Config.get("Give yourself Admin permissions by putting your ingame name in this config .Admin Ingame Name"))) {
                player.setPlayerListName(Main.getAdminPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.DARK_RED + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Give yourself Admin permissions by putting your ingame name in this config .Admin Ingame Name", "Admin ingame name");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 1 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 1. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 1. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamOnePrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.AQUA + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 1. Ingame Name Teammate 1", "Player of Team 1");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 1. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 1. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamOnePrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.AQUA + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 1. Ingame Name Teammate 2", "Player of Team 1");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 2 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 2. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 2. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamTwoPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.GREEN + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 2. Ingame Name Teammate 1", "Player of Team 2");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 2. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 2. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamTwoPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.GREEN + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 2. Ingame Name Teammate 2", "Player of Team 2");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 3 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 3. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 3. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamThreePrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.YELLOW + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 3. Ingame Name Teammate 1", "Player of Team 3");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 3. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 3. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamThreePrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.YELLOW + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 3. Ingame Name Teammate 2", "Player of Team 3");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 4 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 4. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 4. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamFourPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.BLUE + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 4. Ingame Name Teammate 1", "Player of Team 4");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 4. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 4. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamFourPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.BLUE + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 4. Ingame Name Teammate 2", "Player of Team 4");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 5 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 5. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 5. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamFivePrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.DARK_GREEN + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 5. Ingame Name Teammate 1", "Player of Team 5");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 5. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 5. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamFivePrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.DARK_GREEN + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 5. Ingame Name Teammate 2", "Player of Team 5");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 6 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 6. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 6. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamSixPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.BLACK + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 6. Ingame Name Teammate 1", "Player of Team 6");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 6. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 6. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamSixPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.BLACK + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 6. Ingame Name Teammate 2", "Player of Team 6");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 7 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 7. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 7. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamSevenPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.DARK_PURPLE + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 7. Ingame Name Teammate 1", "Player of Team 7");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 7. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 7. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamSevenPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.DARK_PURPLE + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 7. Ingame Name Teammate 2", "Player of Team 7");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 8 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 8. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 8. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamEightPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.WHITE + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 8. Ingame Name Teammate 1", "Player of Team 8");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 8. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 8. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamEightPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.WHITE + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 8. Ingame Name Teammate 2", "Player of Team 8");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 9 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 9. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 9. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamNinePrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.GOLD + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 9. Ingame Name Teammate 1", "Player of Team 9");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 9. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 9. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamNinePrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.GOLD + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 9. Ingame Name Teammate 2", "Player of Team 9");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 10 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 10. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 10. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamTenPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 10. Ingame Name Teammate 1", "Player of Team 10");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 10. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 10. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamTenPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 10. Ingame Name Teammate 2", "Player of Team 10");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 11 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 11. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 11. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamElevenPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.DARK_BLUE + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 11. Ingame Name Teammate 1", "Player of Team 11");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 11. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 11. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamElevenPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.DARK_BLUE + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 11. Ingame Name Teammate 2", "Player of Team 11");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 12 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 12. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 12. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamTwelvePrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.DARK_GREEN + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 12. Ingame Name Teammate 1", "Player of Team 12");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 12. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 12. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamTwelvePrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.DARK_GREEN + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 12. Ingame Name Teammate 2", "Player of Team 12");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 13 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 13. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 13. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamThirteenPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.RED + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 13. Ingame Name Teammate 1", "Player of Team 13");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 13. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 13. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamThirteenPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.RED + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 13. Ingame Name Teammate 2", "Player of Team 13");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 14 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 14. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 14. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamFourteenPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.DARK_GRAY + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 14. Ingame Name Teammate 1", "Player of Team 14");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 14. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 14. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamFourteenPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.DARK_GRAY + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 14. Ingame Name Teammate 2", "Player of Team 14");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Team 15 Prefix
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 15. Ingame Name Teammate 1")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 15. Ingame Name Teammate 1"))) {
                player.setPlayerListName(Main.getTeamFifteenPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.WHITE + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 15. Ingame Name Teammate 1", "Player of Team 15");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Config.contains("Set the Ingame names in this config to give Prefixes This is Team 15. Ingame Name Teammate 2")) {
            if (player.getName().equals(Config.get("Set the Ingame names in this config to give Prefixes This is Team 15. Ingame Name Teammate 2"))) {
                player.setPlayerListName(Main.getTeamFifteenPrefix() + player.getName());
                event.setJoinMessage(Main.getPrefix() + ChatColor.WHITE + player.getName() + ChatColor.GRAY + " joined the game");
            }
        } else {
            try {
                Config.set("Set the Ingame names in this config to give Prefixes This is Team 15. Ingame Name Teammate 2", "Player of Team 15");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}