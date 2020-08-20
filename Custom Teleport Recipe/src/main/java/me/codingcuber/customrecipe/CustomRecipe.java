package me.codingcuber.customrecipe;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class CustomRecipe extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta bow_meta = bow.getItemMeta();
        bow_meta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GOLD + "Teleport Bow");
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.GOLD + "Wherever you shoot the arrow, you will teleport");
        bow_meta.setLore(lore);
        bow_meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        bow_meta.setUnbreakable(true);
        bow.setItemMeta(bow_meta);




        NamespacedKey key = new NamespacedKey(this, "teleport_bow");
        ShapedRecipe recipe = new ShapedRecipe(key, bow);
        recipe.shape("***", "*&*","***");
        recipe.setIngredient('&', Material.BOW);
        recipe.setIngredient('*', Material.ENDER_PEARL);
        Bukkit.addRecipe(recipe);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
