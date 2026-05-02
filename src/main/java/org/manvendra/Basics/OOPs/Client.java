package main.java.org.manvendra.Basics.OOPs;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.addPaymentMethod("ManuDebitCard", new DebitCard("47480999", "Manu"));
        paymentService.addPaymentMethod("ManuCreditCard", new CreditCard("1099944", "Manu"));
        paymentService.addPaymentMethod("ManuUPI", new UPI("rmanu@hdfc-upi", "Manu"));
        paymentService.addPaymentMethod("ManuWallet", new Wallet("rmanu@paytm-wallet", "Manu"));

        paymentService.makePayment("ManuWallet", 499);
        paymentService.makePayment("ManuUPI", 799);
        paymentService.makePayment("ManuCreditCard", 199);
        paymentService.makePayment("ManuDebitCard", 899);
    }
}
