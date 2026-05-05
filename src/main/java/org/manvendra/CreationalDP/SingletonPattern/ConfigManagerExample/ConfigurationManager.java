package main.java.org.manvendra.CreationalDP.SingletonPattern.ConfigManagerExample;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    /*
    * The field for storing the singleton instance should be declared static.
    * */
    private static ConfigurationManager instance;

    private Map<String, String> config = new HashMap<>();

    /*
    * The singleton's constructor should always be private to prevent direct construction.
    * */
    private ConfigurationManager() {
        // example
        // Simulate loading settings from a file or environment variables
        config.put("env", "PROD");
        config.put("timeout", "5000");
        config.put("api.url", "https://example.com");

        System.out.println("Initialising the ConfigurationManager!");
    }

    /*
    * This method calls the private constructor to create an object
    * and saves it in a static field.
    * All following calls to this method return the cached object.
    * */
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return config.get(key);
    }
}
