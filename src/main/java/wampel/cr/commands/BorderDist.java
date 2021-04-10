package wampel.cr.commands;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import wampel.cr.Main;

public class BorderDist implements CommandExecutor {
    private int task;
    private int zähler = 300;


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //Vars
        Player player = (Player) sender;
        World world = Bukkit.getWorld("world");
        WorldBorder border = world.getWorldBorder();
        BossBar bossbar = Bukkit.createBossBar("Distance to Border", BarColor.PURPLE, BarStyle.SOLID, BarFlag.CREATE_FOG);
        bossbar.addPlayer(player);
        this.task = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
            @Override
            public void run() {



                //mathe
                int zp = player.getLocation().getBlockZ();
                int xp = player.getLocation().getBlockX();
                double bs = border.getSize() / 2;

                double distancetoz = bs - zp -1;                       //zeige immer die größte an
                double distancetox = bs - xp - 1;
                double distancetox2 = bs + xp;
                double distancetoz2 = bs + zp;

                if (distancetox < distancetoz && distancetox < distancetox2 && distancetox < distancetoz2) { //distance to x
                    bossbar.setTitle(ChatColor.WHITE + "Distance to Border: " + ChatColor.RED + (int) Math.round(distancetox));
                } else if (distancetox2 < distancetox && distancetox2 < distancetoz && distancetox2 < distancetoz2){ //distance to x2
                    bossbar.setTitle(ChatColor.WHITE +"Distance to Border: " + ChatColor.RED +(int) Math.round(distancetox2));
                } else if (distancetoz < distancetox && distancetoz < distancetox2 && distancetoz < distancetoz2) { //distance to z
                    bossbar.setTitle(ChatColor.WHITE +"Distance to Border: " + ChatColor.RED +(int) Math.round(distancetoz));
                } else if (distancetoz2 < distancetox && distancetoz2 < distancetox2 && distancetoz2 < distancetoz) { //distance to z2
                    bossbar.setTitle(ChatColor.WHITE +"Distance to Border: " + ChatColor.RED +(int) Math.round(distancetoz2));
                }

                if (zähler == 0) {
                    Bukkit.getScheduler().cancelTask(task);
                }
            }
        }, 0, 5);

        return false;
    }
}
