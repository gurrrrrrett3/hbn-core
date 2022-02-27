package hbncore.modules;

import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

public class Util {
    public static void addLore(ItemMeta meta, String[] loreLines) {
        meta.setLore(Arrays.asList(loreLines));
    }

    public static void addLore(ItemMeta meta, String loreLine) {
        ArrayList<String> loreList = new ArrayList<String>();
        loreList.add(loreLine);
        meta.setLore(loreList.stream().toList());
    }
}
