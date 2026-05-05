package main.java.org.manvendra.CreationalDP.FactoryMethodPattern.NotificationSystemExample;

public class SnapChat implements NotificationSender {
    @Override
    public void send(String msg) {
        System.out.println("Sending snapChat noti: " + msg);
    }
}
