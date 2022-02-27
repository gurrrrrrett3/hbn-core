package hbncore.items.tools;

import hbncore.Main;
import hbncore.items.materials.ItemCobaltIngot;
import hbncore.modules.Util;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemCobaltPickaxe {
    public static ItemStack item() {
        ItemStack item = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.BLUE + "Cobalt Pickaxe");
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(1);

        Util.addLore(meta, (ChatColor.AQUA + "A tool forged in cobalt, brings immense speed."));
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);

        return item;
    }

    public static NamespacedKey add(Main main) {
        ItemStack item = ItemCobaltPickaxe.item();
        NamespacedKey key = new NamespacedKey(main, "cobalt_pickaxe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("CCC", " I ", " I ");
        recipe.setIngredient('C', new RecipeChoice.ExactChoice(ItemCobaltIngot.item()));
        recipe.setIngredient('I', Material.IRON_INGOT);

        Bukkit.addRecipe(recipe);
        return key;
    }
}
