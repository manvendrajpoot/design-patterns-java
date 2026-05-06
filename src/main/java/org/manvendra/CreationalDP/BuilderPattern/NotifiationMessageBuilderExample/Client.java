package main.java.org.manvendra.CreationalDP.BuilderPattern.NotifiationMessageBuilderExample;

public class Client {
    public static void main(String[] args) {
        NotificationMessage emailMessage = new NotificationMessage.Builder()
                .setRecipient("jane.doe@company.com")
                .setSubject("Q3 Performance Review")
                .setContent("Please find the attached review document.")
                .build();

        emailMessage.printMessage();

        // Scenario 2: Constructing and sending a simple SMS
        NotificationMessage smsMessage = new NotificationMessage.Builder()
                .setRecipient("+1-555-0199")
                .setContent("Your OTP code is 4829.")
                .build(); // Notice we simply skip the Subject and Attachments

        smsMessage.printMessage();
    }
}
