package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

public class GoogleFan implements SmartFan{
    @Override
    public void turnOn() {
        System.out.println("Google Fan turned On!");
    }

    @Override
    public void turnOff() {
        System.out.println("Google Fan turned Off!");
    }

    @Override
    public void setSpeed(int rpm) {
        System.out.println("Google Fan's speed set to: " + rpm + " rpm.");
    }
}
