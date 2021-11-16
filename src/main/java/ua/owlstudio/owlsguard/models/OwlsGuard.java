package ua.owlstudio.owlsguard.models;

import java.io.*;
import ua.owlstudio.owlsguard.*;
import org.bukkit.plugin.java.*;
import ua.owlstudio.owlsguard.models.accepter.*;

public class OwlsGuard {

    public OwlsGuard(JavaPlugin javaPlugin, ConsumerVerifiers consumer, File file) {
        if (Cracker.access == "AJNSJDNVJSDNVCJSNDVSDF") {
            Logger.info("&c[OwlsCracker] Enabling " + javaPlugin.getName() + "...");
            try {
                consumer.getConsumer().activate();
            } catch (Exception ex) {
                ex.printStackTrace();
                Logger.info("&c[OwlsCracker] Error starting " + javaPlugin.getName() + ".");
            }
        }
    }

}