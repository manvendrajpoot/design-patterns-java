package main.java.org.manvendra.CreationalDP.SingletonPattern.ConfigManagerExample;

public class Client {
    public static void main(String[] args) {
        ConfigurationManager cm1 = ConfigurationManager.getInstance();
        System.out.println("Timeout: " + cm1.getConfig("timeout"));

        ConfigurationManager cm2 = ConfigurationManager.getInstance();

        if (cm2 == cm1) {
            System.out.println("Both 'cm1' and 'cm2' contain the same instance");
        }
    }
}
