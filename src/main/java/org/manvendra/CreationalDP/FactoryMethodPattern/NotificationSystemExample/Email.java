package main.java.org.manvendra.CreationalDP.FactoryMethodPattern.NotificationSystemExample;

public class Email implements NotificationSender {
    @Override
    public void send(String msg) {
        System.out.println("Sending email noti: " + msg);
    }
}
