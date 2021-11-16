package ua.owlstudio.owlsguard;

import java.io.*;
import java.net.*;
import org.bukkit.*;
import java.nio.charset.*;
import org.bukkit.plugin.java.*;

public class Cracker extends JavaPlugin {

    public static String access;

    public void onEnable() {
        try {
            URL URL = new URL("https://pastebin.com/raw/LHeEwZZv");
            InputStream inputStream = URL.openStream();

            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                String string = bufferedReader.readLine();
                if (!Boolean.parseBoolean(string)) {
                    throw new Exception();
                }
                access = "AJNSJDNVJSDNVCJSNDVSDF";
                Logger.info("&c[OwlsCracker] Successfuly enabled. Created by WinLocker");
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Exception ex) {
            Logger.info("&c[OwlsCracker] kek");
            Bukkit.getPluginManager().disablePlugin(this);
            System.exit(0);
        }
    }

}