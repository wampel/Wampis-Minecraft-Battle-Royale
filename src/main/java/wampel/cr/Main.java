package wampel.cr;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import wampel.cr.commands.*;
import wampel.cr.listeners.ChatListener;
import wampel.cr.listeners.DeathListener;
import wampel.cr.listeners.JoinListener;
import wampel.cr.listeners.QuitListener;
import wampel.cr.utils.Config;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().fine(Main.getPrefix() + ChatColor.LIGHT_PURPLE + "WMBR activated");
        listenerRegistration();
        commandRegistration();
        new Config();
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().fine(Main.getPrefix() + ChatColor.LIGHT_PURPLE + "WMBR deactivated");
    }

    private void listenerRegistration() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(), this);
        pluginManager.registerEvents(new QuitListener(), this);
        pluginManager.registerEvents(new ChatListener(), this);
        pluginManager.registerEvents(new DeathListener(), this);
    }

    private void commandRegistration() {
        getCommand("startlobby").setExecutor(new StartLobby());
        getCommand("start").setExecutor(new Start());
        getCommand("borderdist").setExecutor(new BorderDist());
        getCommand("kills").setExecutor(new Kills());
    }

    public static String getPrefix() {
        return ChatColor.LIGHT_PURPLE + "[" + ChatColor.GREEN + "MCBR" + ChatColor.LIGHT_PURPLE + "] ";
    }

    public static String getAdminPrefix() {
        return ChatColor.DARK_RED + "Admin " + ChatColor.DARK_GRAY + "| "+ ChatColor.GRAY;
    }

    public static String getTeamOnePrefix() {
        return ChatColor.AQUA + "Team 1 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }

    public static String getTeamTwoPrefix() {
        return ChatColor.GREEN + "Team 2 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }
    public static String getTeamThreePrefix() {
        return ChatColor.YELLOW + "Team 3 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }
    public static String getTeamFourPrefix() {
        return ChatColor.BLUE + "Team 4 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }
    public static String getTeamFivePrefix() {
        return ChatColor.DARK_GREEN + "Team 5 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }
    public static String getTeamSixPrefix() {
        return ChatColor.BLACK + "Team 6 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }
    public static String getTeamSevenPrefix() {
        return ChatColor.DARK_PURPLE + "Team 7 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }
    public static String getTeamEightPrefix() {
        return ChatColor.WHITE + "Team 8 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }
    public static String getTeamNinePrefix() {
        return ChatColor.GOLD + "Team 9 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }
    public static String getTeamTenPrefix() {
        return ChatColor.LIGHT_PURPLE + "Team 10 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }
    public static String getTeamElevenPrefix() {
        return ChatColor.DARK_BLUE + "Team 11 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }
    public static String getTeamTwelvePrefix() {
        return ChatColor.DARK_GREEN + "Team 12 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }
    public static String getTeamThirteenPrefix() {
        return ChatColor.RED + "Team 12 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }
    public static String getTeamFourteenPrefix() {
        return ChatColor.DARK_GRAY + "Team 14 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }
    public static String getTeamFifteenPrefix() {
        return ChatColor.WHITE + "Team 15 " +  ChatColor.DARK_GRAY + "| " + ChatColor.GRAY;
    }
}