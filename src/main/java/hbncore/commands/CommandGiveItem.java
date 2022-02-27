package hbncore.commands;

import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommandGiveItem implements TabExecutor {
    public HashMap<NamespacedKey, ItemStack> items;
    public CommandGiveItem(HashMap<NamespacedKey, ItemStack> items) {
        this.items = items;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String string, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            NamespacedKey key = NamespacedKey.fromString(args[0]);

            if (items.get(key) == null) {
                player.sendMessage(args[0] + " is not a valid item from hbncore" );
                return  false;
            } else {
                ItemStack item = this.items.get(key);
                player.getInventory().addItem(item);
                player.sendMessage("Gave 1x " + item.getItemMeta().getDisplayName() + ChatColor.RESET + " to " + player.getDisplayName());
                return  true;
            }
        } else {
            sender.sendMessage("You have to be a player to run this command!");
            return false;
        }
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        List<String> out = new ArrayList<String>();

        for (NamespacedKey key : this.items.keySet()) {
            out.add(key.toString());
        }
        return out;
    }
}
