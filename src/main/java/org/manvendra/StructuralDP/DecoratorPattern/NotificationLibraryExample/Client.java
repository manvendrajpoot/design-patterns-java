package main.java.org.manvendra.StructuralDP.DecoratorPattern.NotificationLibraryExample;

public class Client {
    public static void main(String[] args) {
        // standard notifier
        Notifier notifier = new EmailNotifier("manvendra123@gmail.com");
        notifier.send("Your order has shipped!");

        // advanced notifier
        Notifier advanceNotifier = new SMSNotifier(notifier, "+91 8875820706");
        advanceNotifier.send("Your order has shipped!");

        //admin notifier
        Notifier adminNotifier = new SlackNotifier(advanceNotifier, "#order-trackers");
        adminNotifier.send("Your order has shipped!");
    }
}
