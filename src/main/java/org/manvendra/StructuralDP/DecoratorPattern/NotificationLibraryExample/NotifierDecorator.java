package main.java.org.manvendra.StructuralDP.DecoratorPattern.NotificationLibraryExample;

/**
 * 3. BASE DECORATOR
 * */
abstract public class NotifierDecorator implements Notifier{
    protected Notifier wrapperNotifier;

    NotifierDecorator(Notifier wrapperNotifier) {
        this.wrapperNotifier = wrapperNotifier;
    }

    @Override
    public void send(String msg) {
        // Delegate to the wrapped object
        wrapperNotifier.send(msg);
    }
}
