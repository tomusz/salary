package org.salary.files;

import java.io.IOException;
import java.util.Properties;

public final class PropertiesHolder {

    static {
        try {
            appProperties = FileHandler.loadFile("config.properties");
            messageProperties = FileHandler.loadFile("messages.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Properties appProperties;
    public static Properties messageProperties;
}