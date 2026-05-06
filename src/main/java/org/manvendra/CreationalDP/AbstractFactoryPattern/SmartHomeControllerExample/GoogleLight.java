package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

public class GoogleLight implements SmartLight{
    @Override
    public void turnOn() {
        System.out.println("Google Light turned On!");
    }

    @Override
    public void turnOff() {
        System.out.println("Google Light turned Off!");
    }

    @Override
    public void setLuminance(int nits) {
        System.out.println("Google Light luminance set to: " + nits);

    }
}
