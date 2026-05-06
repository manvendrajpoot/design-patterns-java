package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

public class AmazonThermostate implements SmartThermostate{
    @Override
    public void turnOn() {
        System.out.println("Amazon thermostate turned On!");
    }

    @Override
    public void turnOff() {
        System.out.println("Amazon thermostate turned On!");
    }

    @Override
    public void setTemperature(double temp) {
        System.out.println("Amazon thermostate's temp set to : " + temp);
    }
}
