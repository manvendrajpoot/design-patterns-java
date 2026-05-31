package main.java.org.manvendra.StructuralDP.DecoratorPattern.NotificationLibraryExample;

/**
 * 4. CONCRETE DECORATORS (The Add-on Channels)
 * */
public class SlackNotifier extends NotifierDecorator{
    private String slackChannel;

    SlackNotifier(Notifier wrapperNotifier, String slackChannel) {
        super(wrapperNotifier);
        this.slackChannel = slackChannel;
    }

    @Override
    public void send(String msg) {
        // 1. Do the base behavior
        super.send(msg);

        // 2. Add the new behavior (Slack)
        System.out.println("[Slack] Posting to " + slackChannel + ": " + msg);
    }
}
