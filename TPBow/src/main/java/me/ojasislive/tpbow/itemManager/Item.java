package me.ojasislive.tpbow.itemManager;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Item {
    public static ItemStack enderbow;

    public static void init(){
        createBow();
    }


    private static void createBow() {

        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§lEnder Bow");
        List<String> lore = new ArrayList<>();
        lore.add("§5Bow which teleports");
        lore.add("§5you where the");
        lore.add("§5arrow lands.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK,1, false);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(123456);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        enderbow = item;
    }

}
