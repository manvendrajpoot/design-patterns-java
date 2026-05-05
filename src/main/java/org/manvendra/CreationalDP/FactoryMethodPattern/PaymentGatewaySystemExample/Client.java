package main.java.org.manvendra.CreationalDP.FactoryMethodPattern.PaymentGatewaySystemExample;

public class Client {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGateway();

        paymentGateway.pay(PaymentType.SUPER_MONEY, 49.9);
        paymentGateway.pay(PaymentType.UPI, 15.0);
        paymentGateway.pay(PaymentType.CREDIT_CARD, 419.2);
    }
}
