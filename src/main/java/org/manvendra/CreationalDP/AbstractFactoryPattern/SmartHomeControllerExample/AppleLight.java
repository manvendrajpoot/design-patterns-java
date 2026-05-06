package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

public class AppleLight implements SmartLight {
    @Override
    public void turnOn() {
        System.out.println("Apple Light turned On!");
    }

    @Override
    public void turnOff() {
        System.out.println("Apple Light turned Off!");
    }

    @Override
    public void setLuminance(int nits) {
        System.out.println("Apple Light luminance set to: " + nits);
    }
}
