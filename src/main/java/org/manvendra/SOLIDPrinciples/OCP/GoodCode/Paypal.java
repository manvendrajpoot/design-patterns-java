package main.java.org.manvendra.SOLIDPrinciples.OCP.GoodCode;

public class Paypal implements PaymentMethod {
    private String paypalId;

    Paypal(String id) {
        this.paypalId = id;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment done via " + paypalId + " of amount: " + amount);
    }
}
