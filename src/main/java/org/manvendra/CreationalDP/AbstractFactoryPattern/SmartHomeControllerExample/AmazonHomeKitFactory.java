package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

public class AmazonHomeKitFactory implements SmartHomeFactory {
    @Override
    public SmartFan createFan() {
        return new AmazonFan();
    }

    @Override
    public SmartLight createLight() {
        return new AmazonLight();
    }

    @Override
    public SmartThermostate createThermostat() {
        return new AmazonThermostate();
    }
}
