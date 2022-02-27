package hbncore.modules;

import hbncore.Main;
import hbncore.commands.CommandRules;
import hbncore.commands.CommandStarter;

public class CommandEnabler {
    public static void enableCommands(Main main) {
        main.getCommand("starter").setExecutor(new CommandStarter());
        main.getCommand("rules").setExecutor(new CommandRules());
    }
}
