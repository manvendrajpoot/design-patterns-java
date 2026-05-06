package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

public class AppleFan implements SmartFan{
    @Override
    public void turnOn() {
        System.out.println("Apple Fan turned On!");
    }

    @Override
    public void turnOff() {
        System.out.println("Apple Fan turned Off!");
    }

    @Override
    public void setSpeed(int rpm) {
        System.out.println("Apple Fan's speed set to: " + rpm + " rpm.");
    }
}
