package main.java.org.manvendra.SOLIDPrinciples.DIP.GoodCode;

public class EmailService implements NotificationChannel {
    @Override
    public void send(String msg) {
        System.out.println("Sending msg of Email; " + msg);
    }
}
