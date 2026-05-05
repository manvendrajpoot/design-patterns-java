package main.java.org.manvendra.CreationalDP.FactoryMethodPattern.NotificationSystemExample;

public class NotificationFactory {

    public static NotificationSender createNotificationSender(ChannelType type) {
        return switch (type) {
            case EMAIL -> new Email();
            case SMS -> new SMS();
            case SNAPCHAT -> new SnapChat();
            default -> throw new UnsupportedOperationException(
                    "Unsupported channel type:" + type);
        };
    }
}
