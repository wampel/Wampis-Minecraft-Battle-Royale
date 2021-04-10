package wampel.cr.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import wampel.cr.Main;

public class Kills implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        player.sendRawMessage(Main.getPrefix() + ChatColor.GRAY + "Du hast " + player.getStatistic(Statistic.PLAYER_KILLS) + ChatColor.GRAY + " Kills!");

        return false;
    }
}
