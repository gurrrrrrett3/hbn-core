package hbncore.modules;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemList {
    public HashMap<NamespacedKey, ItemStack> map = new HashMap<NamespacedKey, ItemStack>();
    public void addItem(NamespacedKey key, ItemStack value) {
        this.map.put(key, value);
    }

}
