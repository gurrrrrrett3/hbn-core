package hbncore.modules;

import hbncore.Main;
import hbncore.commands.CommandGiveItem;
import hbncore.items.materials.ItemCobaltIngot;
import hbncore.items.materials.ItemToolRod;
import hbncore.items.tools.ItemCobaltPickaxe;

public class ItemEnabler {

    public ItemList list = new ItemList();

    public void enableItems(Main main) {

        list.addItem(ItemCobaltIngot.add(main), ItemCobaltIngot.item());
        list.addItem(ItemCobaltPickaxe.add(main), ItemCobaltPickaxe.item());
        list.addItem(ItemToolRod.add(main), ItemToolRod.item());


        main.getCommand("giveitem").setExecutor(new CommandGiveItem(list.map));
    }



}
