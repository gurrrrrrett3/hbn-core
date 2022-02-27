package hbncore;

import hbncore.commands.CommandRules;
import hbncore.commands.CommandStarter;
import hbncore.items.ItemCobaltPickaxe;
import hbncore.modules.CommandEnabler;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

@Override
    public void onEnable() {
    CommandEnabler.enableCommands(this);

    ItemCobaltPickaxe.add(this);
    }
}
