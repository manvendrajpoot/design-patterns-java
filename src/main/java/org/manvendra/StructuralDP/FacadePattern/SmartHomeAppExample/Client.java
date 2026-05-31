package main.java.org.manvendra.StructuralDP.FacadePattern.SmartHomeAppExample;

public class Client {
    public static void main(String[] args) {
        // Initialize the messy, complicated subsystem instances
        LightController lights = new LightController();
        SmartLock locks = new SmartLock();
        SecurityAlarm alarm = new SecurityAlarm();
        ThermostatController climate = new ThermostatController();

        // Wrap them up in our Facade
        SmartHomeFacade smartHome = new SmartHomeFacade(lights, locks, alarm, climate);

        // The API controller handling the user request doesn't need to know device states.
        // It just asks the facade to execute the predefined routine.
        smartHome.executeGoodnightRoutine();

        // Alternatively, when the user rushes out for work:
        smartHome.executeLeaveHomeRoutine();

    }
}
