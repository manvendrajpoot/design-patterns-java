package main.java.org.manvendra.CreationalDP.FactoryMethodPattern.NotificationSystemExample;

public class NotificationService {
    void dispatchNotification(ChannelType type, String msg) {
        /// Factory provides the correct sender implementation

        NotificationSender sender = NotificationFactory.createNotificationSender(type);

        sender.send(msg);

    }
}
