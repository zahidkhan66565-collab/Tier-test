package me.tiertest;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class TierManager {

    FileConfiguration config =
            TierTestPro.instance.getConfig();

    public void setTier(Player p, String tier) {

        config.set("tiers." + p.getUniqueId(), tier);
        TierTestPro.instance.saveConfig();
    }

    public String getTier(Player p) {

        return config.getString(
                "tiers." + p.getUniqueId(),
                "UNRANKED");
    }
}
