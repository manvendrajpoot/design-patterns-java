package main.java.org.manvendra.CreationalDP.FactoryMethodPattern.PaymentGatewaySystemExample;

/**
 * The Factory Method (The Core Creational Pattern)
 * */
public class PaymentProcessorFactory {

    /**
     *  This method encapsulates the creation logic.
     *  If initialization requires DB lookups or config loading,
     *  it happens here, keeping the client code clean.
     * */
    public static PaymentProcessor createProcessor(PaymentType type) {
        switch (type) {
            case CREDIT_CARD:
                return new CreditCard();
            case SUPER_MONEY:
                return new SuperMoney();
            case UPI:
                return new UPI();
            default:
                throw new UnsupportedOperationException(
                        "Unsupported payment type: " + type);
        }
    }
}
