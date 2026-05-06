package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

public class AmazonFan implements SmartFan {
    @Override
    public void turnOn() {
        System.out.println("Amazon Fan turned On!");
    }

    @Override
    public void turnOff() {
        System.out.println("Amazon Fan turned Off!");
    }

    @Override
    public void setSpeed(int rpm) {
        System.out.println("Amazon Fan's speed set to: " + rpm + " rpm.");
    }
}
