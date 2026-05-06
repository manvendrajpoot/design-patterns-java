package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

public class GoogleHomeKitFactory implements SmartHomeFactory{
    @Override
    public SmartFan createFan() {
        return new GoogleFan();
    }

    @Override
    public SmartLight createLight() {
        return new GoogleLight();
    }

    @Override
    public SmartThermostate createThermostat() {
        return new GoogleThermostate();
    }
}
