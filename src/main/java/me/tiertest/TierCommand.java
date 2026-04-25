package me.tiertest;

import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class TierCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender,
                             Command cmd,
                             String label,
                             String[] args) {

        if (!sender.hasPermission("tiertest.tester"))
            return true;

        if (args.length < 2) {
            sender.sendMessage("/settier <player> <tier>");
            return true;
        }

        Player target = Bukkit.getPlayer(args[0]);

        if (target == null) {
            sender.sendMessage("Player offline");
            return true;
        }

        String tier = args[1].toUpperCase();

        TierTestPro.instance.tierManager
                .setTier(target, tier);

        sender.sendMessage("Tier set to " + tier);

        return true;
    }
}
