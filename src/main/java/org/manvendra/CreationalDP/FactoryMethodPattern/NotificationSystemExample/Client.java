package main.java.org.manvendra.CreationalDP.FactoryMethodPattern.NotificationSystemExample;


import main.java.org.manvendra.SOLIDPrinciples.DIP.GoodCode.NotificationChannel;

public class Client {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        notificationService.dispatchNotification(ChannelType.SMS, "OTP 123456");
        notificationService.dispatchNotification(ChannelType.EMAIL, "Your Interview scheduled for tomorrow.");
        notificationService.dispatchNotification(ChannelType.SNAPCHAT, "Let's meet today!");
    }
}
