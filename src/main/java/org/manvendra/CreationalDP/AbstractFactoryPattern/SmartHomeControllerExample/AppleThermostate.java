package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

public class AppleThermostate implements SmartThermostate{
    @Override
    public void turnOn() {
        System.out.println("Apple thermostate turned On!");
    }

    @Override
    public void turnOff() {
        System.out.println("Apple thermostate turned Off!");
    }

    @Override
    public void setTemperature(double temp) {
        System.out.println("Apple thermostate's temp set to: " + temp);
    }
}
