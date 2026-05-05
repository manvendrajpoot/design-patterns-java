package main.java.org.manvendra.CreationalDP.FactoryMethodPattern.PaymentGatewaySystemExample;

public class UPI implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        /// Complex logic: VPA validation, NPCI gateway routing

        System.out.println("Paid via UPI : $ " + amount);
    }
}
