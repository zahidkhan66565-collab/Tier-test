package me.tiertest;

import net.luckperms.api.LuckPermsProvider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {

        String tier = TierTestPro.instance.tierManager
                .getTier(e.getPlayer());

        String rank = LuckPermsProvider.get()
                .getUserManager()
                .getUser(e.getPlayer().getUniqueId())
                .getPrimaryGroup();

        e.setFormat("§6[" + tier + "] §7[" + rank.toUpperCase() + "] §f"
                + e.getPlayer().getName()
                + " §7» §f"
                + e.getMessage());
    }
}
