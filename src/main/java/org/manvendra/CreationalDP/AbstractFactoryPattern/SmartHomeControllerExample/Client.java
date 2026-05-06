package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.SmartHomeControllerExample;


public class Client {
    public static void main(String[] args) {
        // Scenario 1: User sets up their house with Apple HomeKit
        System.out.println("Setting up Apple Home Ecosystem...");
        SmartHomeFactory appleFactory = new AppleHomeKitFactory();
        SmartHomeControllerApplication appleHomeController = new SmartHomeControllerApplication(appleFactory);

        appleHomeController.turnOnSmartLight();
        appleHomeController.turnOnSmartFan();
        appleHomeController.setSmartFanSpeed(220);
        appleHomeController.turnOffSmartThermostate();

        // Scenario 2: User moves out, new tenant uses Google Home
        System.out.println("\nSetting up Google Home Ecosystem...");
        SmartHomeFactory googleFactory = new GoogleHomeKitFactory();
        SmartHomeControllerApplication googleHubController = new SmartHomeControllerApplication(googleFactory);

        googleHubController.setSmartThermostateTemperature(30.2);
    }
}
