package main.java.org.manvendra.CreationalDP.FactoryMethodPattern.PaymentGatewaySystemExample;

public class CreditCard implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        /// Complex logic: Connect to Visa API, validate CVV, etc.

        System.out.println("Paid via credit card : $ " + amount);
    }
}
