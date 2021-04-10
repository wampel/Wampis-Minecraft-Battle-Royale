package wampel.cr.commands;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.io.BukkitObjectInputStream;
import wampel.cr.Main;

public class StartLobby implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;
        if (player.isOp()) {
            World world = Bukkit.getWorld("world");
            WorldBorder border = world.getWorldBorder();
            Bukkit.broadcastMessage(Main.getPrefix() + ChatColor.RED + "Lobby gestartet");

            border.setCenter(0, 0);
            border.setSize(20, 0);
            world.setPVP(false);
            world.setTime(1000);
            world.setDifficulty(Difficulty.PEACEFUL);

        } else {
            player.sendRawMessage(Main.getPrefix() + ChatColor.RED +"You are not allowed to use this command!");
        }
        return false;
    }
}