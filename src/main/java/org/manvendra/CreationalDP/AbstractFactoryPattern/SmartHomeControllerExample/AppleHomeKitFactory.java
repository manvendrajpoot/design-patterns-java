package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

public class AppleHomeKitFactory implements SmartHomeFactory{
    @Override
    public SmartFan createFan() {
        return new AppleFan();
    }

    @Override
    public SmartLight createLight() {
        return new AppleLight();
    }

    @Override
    public SmartThermostate createThermostat() {
        return new AppleThermostate();
    }
}
