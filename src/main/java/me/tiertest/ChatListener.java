package me.tiertest;

import org.bukkit.event.*;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {

        String tier =
                TierTestPro.instance.tierManager
                        .getTier(e.getPlayer());

        e.setFormat("§c[" + tier + "] §f"
                + e.getPlayer().getName()
                + " §7» §f"
                + e.getMessage());
    }
}
