package ua.owlstudio.owlsguard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Logger {
    public static void info(String message) {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }
}
