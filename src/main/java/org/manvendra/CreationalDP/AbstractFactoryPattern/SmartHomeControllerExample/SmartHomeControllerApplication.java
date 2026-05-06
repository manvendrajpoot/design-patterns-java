package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;

/// --- 5. The Client Code (The Hub) ---
/// Notice: The Controller has ZERO knowledge of Apple or Google.
/// It only knows about "SmartLights" and "SmartThermostats".

public class SmartHomeControllerApplication {
    private SmartFan smartFan;
    private SmartLight smartLight;
    private SmartThermostate smartThermostate;

    SmartHomeControllerApplication(SmartHomeFactory factory) {
        this.smartFan = factory.createFan();
        this.smartLight = factory.createLight();
        this.smartThermostate = factory.createThermostat();
    }

    /// Smart Thermostat
    public void turnOnSmartThermostate() {
        smartThermostate.turnOn();
    }
    public void turnOffSmartThermostate() {
        smartThermostate.turnOff();
    }
    public void setSmartThermostateTemperature(double temperature) {
        smartThermostate.setTemperature(temperature);
    }

    ///  Smart fan
    public void turnOnSmartFan() {
        smartFan.turnOn();
    }
    public void turnOffSmartFan() {
        smartFan.turnOff();
    }
    public void setSmartFanSpeed(int rpm) {
        smartFan.setSpeed(rpm);
    }

    ///  Smart Light
    public void turnOnSmartLight() {
        smartLight.turnOn();
    }
    public void turnOffSmartLight() {
        smartLight.turnOff();
    }
    public void setSmartLightLuminance(int nits) {
        smartLight.setLuminance(nits);
    }

}
