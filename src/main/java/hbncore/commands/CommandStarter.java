package hbncore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandStarter implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage("Welcome!");
        sender.sendMessage("yeah I need to put a starter message here");

        if (sender.getName() == "Pogeye") {
            sender.sendMessage("Fuck you popeye you don't need this command");
        }

        return true;
    }
}
