package hbncore;

import hbncore.commands.CommandStarter;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

@Override
    public void onEnable() {
    this.getCommand("starter").setExecutor(new CommandStarter());
    }
}
