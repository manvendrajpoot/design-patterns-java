package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

public interface SmartLight {
    void turnOn();
    void turnOff();
    void setLuminance(int nits); /** range [250 ... 400] for a room */
}
