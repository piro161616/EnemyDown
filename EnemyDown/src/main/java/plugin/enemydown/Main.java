package plugin.enemydown;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import plugin.enemydown.command.enemyDownCommand;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        enemyDownCommand enemyDownCommand = new enemyDownCommand();
        Bukkit.getPluginManager().registerEvents(enemyDownCommand,
            this);
        getCommand("enemyDown").setExecutor(enemyDownCommand);
    }
}
