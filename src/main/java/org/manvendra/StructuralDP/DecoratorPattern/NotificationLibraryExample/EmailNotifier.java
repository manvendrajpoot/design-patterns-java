package main.java.org.manvendra.StructuralDP.DecoratorPattern.NotificationLibraryExample;

/**
 * 2. CONCRETE COMPONENT (The Base Layer)
 **/

public class EmailNotifier implements Notifier {
    private String email;

    EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void send(String msg) {
        System.out.println("[Email] Sending to " + email + ": " + msg);
    }
}
