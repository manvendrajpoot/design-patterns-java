package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

public class GoogleThermostate implements SmartThermostate{
    @Override
    public void turnOn() {
        System.out.println("google thermostate turned On!");
    }

    @Override
    public void turnOff() {
        System.out.println("google thermostate turned Off!");
    }

    @Override
    public void setTemperature(double temp) {
        System.out.println("google thermostate's temp set to: " + temp);
    }
}
