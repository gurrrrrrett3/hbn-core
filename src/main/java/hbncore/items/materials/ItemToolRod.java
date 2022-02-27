package hbncore.items.materials;

import hbncore.Main;
import hbncore.modules.Util;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemToolRod {
    public static ItemStack item() {
        ItemStack item = new ItemStack(Material.STICK);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.GRAY + "Tool Rod");
        Util.addLore(meta, ChatColor.AQUA  + "A hardened rod used for tools.");
        item.setItemMeta(meta);

        return item;
    }

    public static NamespacedKey add(Main main) {
        ItemStack item = ItemToolRod.item();

        NamespacedKey key = new NamespacedKey(main, "tool_rod");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape(" C ", " C ", " C ");
        recipe.setIngredient('C', new RecipeChoice.ExactChoice(ItemCobaltIngot.item()));

        Bukkit.addRecipe(recipe);
        return key;
    }
}
