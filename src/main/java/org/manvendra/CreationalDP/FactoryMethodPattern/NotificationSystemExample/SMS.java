package main.java.org.manvendra.CreationalDP.FactoryMethodPattern.NotificationSystemExample;

public class SMS implements NotificationSender {
    @Override
    public void send(String msg) {
        System.out.println("Sending SMS noti: " + msg);
    }
}
