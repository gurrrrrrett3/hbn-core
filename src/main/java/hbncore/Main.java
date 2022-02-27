package hbncore;

import hbncore.modules.CommandEnabler;
import hbncore.modules.ItemEnabler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Main extends JavaPlugin {

@Override
    public void onEnable() {
    Logger loggger = Bukkit.getLogger();
    loggger.log(new LogRecord(Level.ALL, "Enabling hbncore..."));

    CommandEnabler.enableCommands(this);
    new ItemEnabler().enableItems(this);

    }
}
