package wampel.cr.commands;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import wampel.cr.Main;
import wampel.cr.utils.Config;

import java.io.IOException;


public class Start implements CommandExecutor {
    //Tasks
    public int countdown;

    //Vars
    World world = Bukkit.getWorld("world");
    WorldBorder border = world.getWorldBorder();
    int secondsPrep;
    int secondsProt;
    int secondsFirstBorder;
    int secondsSecondBorder;
    int secondsSecondBorderDivTwo;
    int confBorderSize;
    int confSecondBorderSize;
    int confFinalBorderSize;
    int secondsFinalBorder;
    boolean uhcActive;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        world.setGameRule(GameRule.ANNOUNCE_ADVANCEMENTS, false);
        //Get Config value for prepartion time and set them into the secondsPrep Variable if not there create the config
        if (Config.contains("Set the preparation time in seconds.Preparation time")) {
            secondsPrep = (int) Config.get("Set the preparation time in seconds.Preparation time");
        } else {
            try {
                Config.set("Set the preparation time in seconds.Preparation time", 120);
            } catch (IOException e) {
                e.printStackTrace();
                secondsPrep = (int) Config.get("Set the preparation time in seconds.Preparation time");
            }
        }
        //Get Config value for protection time and set them into the secondsProt Variable if not there create the config
        if (Config.contains("Set the protection time in seconds.Protection time")) {
            secondsProt = (int) Config.get("Set the protection time in seconds.Protection time");
        } else {
            try {
                Config.set("Set the protection time in seconds.Protection time", 300);
            } catch (IOException e) {
                e.printStackTrace();
            }
                secondsProt = (int) Config.get("Set the protection time in seconds.Protection time");
        }

        //Get config value for the 1st Border shrink after preparation time, creates Config Value with Default value if not exist
        if (Config.contains("Set the time to the first border shrink. 1st Border shrink")) {
            secondsFirstBorder = (int) Config.get("Set the time to the first border shrink. 1st Border shrink");
        } else {
            try {
                Config.set("Set the time to the first border shrink. 1st Border shrink", 1200);
            } catch (IOException e) {
                e.printStackTrace();
            }
            secondsFirstBorder = (int) Config.get("Set the time to the first border shrink. 1st Border shrink");
        }
        //Get config value for the 2nd Border shrink after 1st Border shrink time, creates Config Value with Default value if not exist
        if (Config.contains("Timer for the seconds Border shrink to happen.2nd Bordershrink in seconds")) {
            secondsSecondBorder = (int) Config.get("Timer for the seconds Border shrink to happen.2nd Bordershrink in seconds");
            secondsSecondBorderDivTwo = secondsSecondBorder/2; //A variable I use to compare the initial value to the other in line 139
        } else {
            try {
                Config.set("Timer for the seconds Border shrink to happen.2nd Bordershrink in seconds", 10*60);
            } catch (IOException e) {
                e.printStackTrace();
            }
            secondsSecondBorder = (int) Config.get("Timer for the seconds Border shrink to happen.2nd Bordershrink in seconds");
            secondsSecondBorderDivTwo = secondsSecondBorder/2; //A variable I use to compare the initial value to the other in line 139
        }
        //Get config value for the final Border shrink, creates Config Value with Default value if not exist
        if (Config.contains("How long the final Border moves.Final Border time in seconds")) {
            secondsFinalBorder = (int) Config.get("How long the final Border moves.Final Border time in seconds");
        } else {
            try {
                Config.set("How long the final Border moves.Final Border time in seconds", 600);
            } catch (IOException e) {
                e.printStackTrace();
            }
            secondsFinalBorder = (int) Config.get("How long the final Border moves.Final Border time in seconds");
        }
        //Get the value of the border size and define them in the confBorderSize int variable
        if (Config.contains("The maximum size of the border in Blocks.Maximum Border Size in Blocks")) {
            confBorderSize = (int) Config.get("The maximum size of the border in Blocks.Maximum Border Size in Blocks");
        } else {
            try {
                Config.set("The maximum size of the border in Blocks.Maximum Border Size in Blocks", 1000);
            } catch (IOException e) {
                e.printStackTrace();
            }
            confBorderSize = (int) Config.get("The maximum size of the border in Blocks.Maximum Border Size in Blocks");
        }
        //Get the value of the  2nd border size and define them in the confSecondBorderSize int variable
        if (Config.contains("The size of the 2nd border in Blocks.2nd Border Size in Blocks")) {
            confSecondBorderSize = (int) Config.get("The size of the 2nd border in Blocks.2nd Border Size in Blocks");
        } else {
            try {
                Config.set("The size of the 2nd border in Blocks.2nd Border Size in Blocks", 250);
            } catch (IOException e) {
                e.printStackTrace();
            }
            confSecondBorderSize = (int) Config.get("The size of the 2nd border in Blocks.2nd Border Size in Blocks");
        }
        //Get the value of the  final border size and define them in the confFinalBorderSize int variable
        if (Config.contains("The size of the final border in Blocks.Final Border Size in Blocks")) {
            confFinalBorderSize = (int) Config.get("The size of the final border in Blocks.Final Border Size in Blocks");
        } else {
            try {
                Config.set("The size of the final border in Blocks.Final Border Size in Blocks", 100);
            } catch (IOException e) {
                e.printStackTrace();
            }
            confFinalBorderSize = (int) Config.get("The size of the final border in Blocks.Final Border Size in Blocks");
        }
        //UHC active or not active(no natural regeneration)
        if (Config.contains("UHC (no natural regeneration) active or not active. UHC active true or false")) {
            uhcActive = (boolean) Config.get("UHC (no natural regeneration) active or not active. UHC active true or false");
        } else {
            try {
                Config.set("UHC (no natural regeneration) active or not active. UHC active true or false", false);
            } catch (IOException e) {
                e.printStackTrace();
            }
            uhcActive = (boolean) Config.get("UHC (no natural regeneration) active or not active. UHC active true or false");
        }
        if (uhcActive) {
            world.setGameRule(GameRule.NATURAL_REGENERATION, false);
        } else {
            world.setGameRule(GameRule.NATURAL_REGENERATION, true);
        }
        Player player = (Player) sender;
        if (player.isOp()) {
            //Countdown Preptime
            this.countdown = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
                private int schutzzeit;
                @Override
                public void run() {
                    for(Player player : Bukkit.getOnlinePlayers()){
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.AQUA + "Game will start in " + ChatColor.RED + secondsPrep + ChatColor.AQUA + " Seconds!"));
                    }
                    secondsPrep--;
                    if (secondsPrep == 0) {
                        Bukkit.getScheduler().cancelTask(countdown);
                        for(Player player : Bukkit.getOnlinePlayers()) {
                            player.playSound(player.getLocation(), Sound.ENTITY_WITHER_SPAWN, 1, 1);
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.RED + "The game has started!"));
                            player.getInventory().clear();
                        }
                            world.setDifficulty(Difficulty.EASY);
                            world.setTime(1000);
                            border.setSize(confBorderSize, 20);

                            //Protection time
                            this.schutzzeit = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
                                private int firstborder;
                                @Override
                                public void run() {
                                    for(Player player : Bukkit.getOnlinePlayers()){
                                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.AQUA + "Pvp is enabled in " + ChatColor.RED + secondsProt + ChatColor.AQUA + " Seconds!"));
                                    }
                                    secondsProt--;
                                    if (secondsProt == -1) {
                                        Bukkit.getScheduler().cancelTask(schutzzeit);
                                        for(Player player : Bukkit.getOnlinePlayers()) {
                                            player.playSound(player.getLocation(), Sound.ENTITY_WITHER_HURT, 1, 1);
                                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.RED + "PvP ist an!"));
                                        }
                                        world.setPVP(true);


                                        //1st Border shrink
                                        this.firstborder = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
                                            private int finalborder;
                                            @Override
                                            public void run() {
                                                for(Player player : Bukkit.getOnlinePlayers()) {
                                                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.AQUA + "Border will shrink in " + ChatColor.RED + secondsFirstBorder + ChatColor.AQUA + " Seconds!"));
                                                }
                                                secondsFirstBorder--;
                                                if (secondsFirstBorder == -1) {
                                                    Bukkit.getScheduler().cancelTask(firstborder);
                                                    border.setSize(confSecondBorderSize, secondsSecondBorderDivTwo);

                                                    //This runnable is responsible for the 2nd border shrink
                                                    this.finalborder = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (secondsSecondBorder < secondsSecondBorderDivTwo) {
                                                                for (Player player : Bukkit.getOnlinePlayers()) {
                                                                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.AQUA + "Border will shrink in " + ChatColor.RED + secondsSecondBorder + ChatColor.AQUA + " Seconds!"));
                                                                }
                                                            } else {
                                                                for (Player player : Bukkit.getOnlinePlayers()) {
                                                                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.AQUA + "Border is currently shrinking!"));
                                                                }
                                                            }
                                                            secondsSecondBorder--;
                                                            if (secondsSecondBorder == -1) {
                                                                Bukkit.getScheduler().cancelTask(finalborder);
                                                                border.setSize(confFinalBorderSize, secondsFinalBorder);
                                                                world.setMonsterSpawnLimit(0);
                                                                Bukkit.broadcastMessage(Main.getPrefix() + ChatColor.RED + "Mob spawning is disabled!");
                                                            }
                                                        }
                                                    }, 0,20);
                                                }
                                            }
                                        },0,20);
                                    }
                                }
                            }, 0, 20);
                        }


                    }
            }, 0,20);

        } else {
            player.sendRawMessage(Main.getPrefix() + ChatColor.GRAY +"You are not allowed to use this command!");
        }

        return false;
    }
}