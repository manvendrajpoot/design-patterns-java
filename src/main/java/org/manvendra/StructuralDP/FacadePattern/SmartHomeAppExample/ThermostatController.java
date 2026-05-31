package main.java.org.manvendra.StructuralDP.FacadePattern.SmartHomeAppExample;

public class ThermostatController {
    public void setTemperature(int targetTemp) {
        System.out.println("[Thermostat] Adjusting climate control target to: " + targetTemp + "°C.");
    }
    public void turnOff() {
        System.out.println("[Thermostat] Turn it off!");
    }
    public void turnOn() {
        System.out.println("[Thermostat] Turn it On!");
    }
}
