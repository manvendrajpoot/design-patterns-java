package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

/// --- 3. Abstract Factory ---
public interface SmartHomeFactory {
    SmartFan createFan();
    SmartLight createLight();
    SmartThermostate createThermostat();
}
