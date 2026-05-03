package main.java.org.manvendra.SOLIDPrinciples.OCP.GoodCode;

public class Wallet implements PaymentMethod {
    private String walletId;

    Wallet(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment done via " + walletId + " of amount: " + amount);
    }
}
