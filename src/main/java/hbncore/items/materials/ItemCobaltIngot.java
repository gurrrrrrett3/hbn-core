package hbncore.items.materials;

import hbncore.Main;
import hbncore.modules.Util;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemCobaltIngot {
    public static ItemStack item() {
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.BLUE + "Cobalt Ingot");
        Util.addLore(meta, ChatColor.AQUA  + "A strong and light material");
        item.setItemMeta(meta);

        return item;
    }

    public static NamespacedKey add(Main main) {
        ItemStack item = ItemCobaltIngot.item();

        NamespacedKey key = new NamespacedKey(main, "cobalt_ingot_furnace");
        FurnaceRecipe recipe = new FurnaceRecipe(key, item, Material.IRON_INGOT, 10, 400);

        Bukkit.addRecipe(recipe);
        return key;
    }
}
