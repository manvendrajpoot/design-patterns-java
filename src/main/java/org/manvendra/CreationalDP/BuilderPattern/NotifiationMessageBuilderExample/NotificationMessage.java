package main.java.org.manvendra.CreationalDP.BuilderPattern.NotifiationMessageBuilderExample;

import java.util.List;

public class NotificationMessage {
    private final String recipient;
    private final String subject; // Optional for SMS/Push
    private final String content;
    private final List<String> attachments; // Optional

    // Private constructor forces the use of the Builder
    private NotificationMessage(Builder builder) {
        this.recipient = builder.recipient;
        this.subject = builder.subject;
        this.content = builder.content;
        this.attachments = builder.attachments;
    }

    // Getters omitted for brevity...
    public String getRecipient() { return recipient; }
    public String getContent() { return content; }
    public String getSubject() { return subject; }

    public void printMessage() {
        System.out.println("Sending MSG to: " + recipient);
        System.out.println("with Subject: " + subject);
        System.out.println("and Body: " + content);
    }

    // The Builder Class
    public static class Builder {
        private String recipient;
        private String content;
        private String subject;
        private List<String> attachments;

        public Builder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }
        public Builder setContent(String content) {
            this.content = content;
            return this;
        }
        public Builder setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public Builder setAttachments(List<String> attachments) {
            this.attachments = attachments;
            return this;
        }
        public NotificationMessage build() {
            if (recipient == null || content == null) {
                throw new IllegalStateException("Recipient and Content are required.");
            }
            return new NotificationMessage(this);
        }
    }
}
