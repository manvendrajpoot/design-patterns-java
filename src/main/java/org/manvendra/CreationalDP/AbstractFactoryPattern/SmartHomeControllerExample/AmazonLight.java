package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

public class AmazonLight implements SmartLight {
    @Override
    public void turnOn() {
        System.out.println("Amazon Light turned On!");
    }

    @Override
    public void turnOff() {
        System.out.println("Amazon Light turned Off!");
    }

    @Override
    public void setLuminance(int nits) {
        System.out.println("Amazon Light luminance set to: " + nits);
    }
}
