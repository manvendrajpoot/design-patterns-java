package main.java.org.manvendra.SOLIDPrinciples.OCP.GoodCode;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        PaymentMethod upi = new UPI("manu@hdfc-upi");
        PaymentMethod wallet = new Wallet("manu@hdfc-wallet");
        PaymentMethod paypal = new Paypal("manu@hdfc-paypal");

        paymentProcessor.processPayment(upi, 199.0);
        paymentProcessor.processPayment(wallet, 499.0);
        paymentProcessor.processPayment(paypal, 799.0);
    }
}
