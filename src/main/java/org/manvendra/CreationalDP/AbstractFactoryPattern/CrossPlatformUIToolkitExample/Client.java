package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.CrossPlatformUIToolkitExample;

public class Client {
    public static void main(String[] args) {
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WinFactory();
        }

        Application app = new Application(factory);
        app.render();
    }
}
