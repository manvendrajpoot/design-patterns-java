package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

public interface SmartFan {
    void turnOn();
    void turnOff();
    void setSpeed(int rpm); /** rpm = rotation per minute */
}
