package me.tiertest;

import org.bukkit.plugin.java.JavaPlugin;

public class TierTestPro extends JavaPlugin {

    public static TierTestPro instance;
    public TierManager tierManager;

    @Override
    public void onEnable() {

        instance = this;

        saveDefaultConfig();

        tierManager = new TierManager();

        getCommand("settier").setExecutor(new TierCommand());

        getServer().getPluginManager()
                .registerEvents(new ChatListener(), this);

        getServer().getPluginManager()
                .registerEvents(new JoinListener(), this);

        getLogger().info("TierTest PRO Enabled!");
    }
}
