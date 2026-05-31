package main.java.org.manvendra.StructuralDP.DecoratorPattern.NotificationLibraryExample;

/**
 * 4. CONCRETE DECORATORS (The Add-on Channels)
 * */
public class SMSNotifier extends NotifierDecorator{
    private String phoneNo;

    SMSNotifier(Notifier wrapperNotifier, String phoneNo) {
        super(wrapperNotifier);
        this.phoneNo = phoneNo;
    }

    @Override
    public void send(String msg) {
        // 1. Do the base behavior (e.g., Email)
        super.send(msg);

        // 2. Add the new behavior (SMS)
        System.out.println("[SMS] Sending to " + phoneNo + ": " + msg);
    }
}
