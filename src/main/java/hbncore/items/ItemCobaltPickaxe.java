package hbncore.items;

import hbncore.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemCobaltPickaxe {
   public static void add(Main main) {
       ItemStack item = new ItemStack(Material.IRON_PICKAXE);
       ItemMeta meta = item.getItemMeta();

       meta.setDisplayName(ChatColor.BLUE + "Cobalt Pickaxe");
       meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
       meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
       meta.setUnbreakable(true);
       meta.setCustomModelData(1);

       ArrayList<String> lore = new ArrayList<String>();
       lore.add(ChatColor.AQUA + "A tool forged in cobalt, brings immense speed.");
       meta.setLore(lore.stream().toList());
       item.setItemMeta(meta);
       item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);

       NamespacedKey key = new NamespacedKey(main, "cobalt_sword");
       ShapedRecipe recipe = new ShapedRecipe(key, item);

       recipe.shape("DDD", " I ", " I ");
       recipe.setIngredient('D', Material.DIAMOND);
       recipe.setIngredient('I', Material.IRON_INGOT);

       Bukkit.addRecipe(recipe);
   }
}
