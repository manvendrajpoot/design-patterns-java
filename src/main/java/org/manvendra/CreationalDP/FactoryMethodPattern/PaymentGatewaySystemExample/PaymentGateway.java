package main.java.org.manvendra.CreationalDP.FactoryMethodPattern.PaymentGatewaySystemExample;

public class PaymentGateway {

    public void pay(PaymentType type, double amount) {
        /// Get the PaymentProcessor on runtime based on type

        PaymentProcessor paymentProcessor = PaymentProcessorFactory.createProcessor(type);

        paymentProcessor.processPayment(amount);
        System.out.println("Payment Successful!");
    }
}
