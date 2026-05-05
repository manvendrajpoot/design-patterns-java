package main.java.org.manvendra.CreationalDP.SingletonPattern.LoggerExample;

public class Client {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Logger is here to use");

        Logger logger2 = Logger.getInstance();
        if (logger2 == logger) {
            System.out.println("Both 'logger' and 'logger2' contain the same instance");
        }
    }
}
