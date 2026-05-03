package main.java.org.manvendra.SOLIDPrinciples.DIP.GoodCode;

public class Client {
    public static void main(String[] args) {
        NotificationService whatsAppNotiService = new NotificationService(new WhatsAppService());

        whatsAppNotiService.notify("SOLID");
    }
}
