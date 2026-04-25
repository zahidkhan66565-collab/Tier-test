package me.tiertest;

import org.bukkit.event.*;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player p = e.getPlayer();

        String tier =
                TierTestPro.instance.tierManager
                        .getTier(p);

        p.setPlayerListName(
                "§c[" + tier + "] §f" + p.getName());
    }
}
