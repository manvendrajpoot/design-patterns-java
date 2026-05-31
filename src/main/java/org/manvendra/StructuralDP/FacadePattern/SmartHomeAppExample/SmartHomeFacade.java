package main.java.org.manvendra.StructuralDP.FacadePattern.SmartHomeAppExample;

/**
 * 2. THE FACADE (The Simplified Wrapper)
 */
public class SmartHomeFacade {
    private LightController lights;
    private SmartLock locks;
    private SecurityAlarm alarm;
    private ThermostatController climateControl;

    // Subsystems can be injected via Constructor
    public SmartHomeFacade(
            LightController lights,
            SmartLock locks,
            SecurityAlarm alarm,
            ThermostatController climateControl
    ) {
        this.lights = lights;
        this.locks = locks;
        this.alarm = alarm;
        this.climateControl = climateControl;
    }

    // Facade Method 1: Simplifies the complex orchestration into one call
    public void executeGoodnightRoutine() {
        System.out.println("\n>>> Initiating 'Goodnight Routine' Facade Operation <<<");
        lights.turnOffAllLights();
        locks.lockAllDoors();
        climateControl.turnOn();
        climateControl.setTemperature(22); // Lowers AC for sleep comfort
        alarm.armStayMode();
        System.out.println(">>> Goodnight Routine successfully completed. <<<\n");
    }

    // Facade Method 2: Another simplified macro workflow
    public void executeLeaveHomeRoutine() {
        System.out.println("\n>>> Initiating 'Leave Home Routine' Facade Operation <<<");
        lights.turnOffAllLights();
        locks.lockAllDoors();
        climateControl.turnOff();
        alarm.armAwayMode();
        System.out.println(">>> System configured for Away state. <<<\n");
    }
}
