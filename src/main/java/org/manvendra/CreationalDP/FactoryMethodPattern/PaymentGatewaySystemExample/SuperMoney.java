package main.java.org.manvendra.CreationalDP.FactoryMethodPattern.PaymentGatewaySystemExample;

public class SuperMoney implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        /// Complex logic: OAuth token validation, super.money REST API call, etc.

        System.out.println("Paid via super.money : $ " + amount);
    }
}
