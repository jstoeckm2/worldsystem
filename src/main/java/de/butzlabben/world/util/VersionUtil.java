package de.butzlabben.world.util;

import org.bukkit.Bukkit;

/**
 * @author Butzlabben
 * @since 14.08.2018
 */
public class VersionUtil {

    private static int version;

    private VersionUtil() {
    }

    public static int getVersion() {
        if (version == 0) {
            // Detect version
            String v = Bukkit.getVersion();
            if (v.contains("1.14"))
                version = 14;
            else if (v.contains("1.13"))
                version = 13;
            else if (v.contains("1.12"))
                version = 12;
            else if (v.contains("1.11"))
                version = 11;
            else if (v.contains("1.10"))
                version = 10;
            else if (v.contains("1.9"))
                version = 9;
            else if (v.contains("1.8"))
                version = 8;
            else if (v.contains("1.7"))
                version = 7;
            else if (v.contains("1.6"))
                version = 6;
            else if (v.contains("1.5"))
                version = 5;
            else if (v.contains("1.4"))
                version = 4;
            else if (v.contains("1.3"))
                version = 3;
        }
        if (version == 0) {
            System.err.println("[WorldSystem] Unknown version: " + Bukkit.getVersion());
            System.err.println("[WorldSystem] Choosing version 1.12.2");
            version = 12;
        }
        return version;
    }
}
