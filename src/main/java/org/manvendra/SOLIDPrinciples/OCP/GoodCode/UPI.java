package main.java.org.manvendra.SOLIDPrinciples.OCP.GoodCode;

public class UPI implements PaymentMethod {
    private String upiId;

    UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment done via " + upiId + " of amount: " + amount);
    }
}
