package main.java.org.manvendra.StructuralDP.AdapterPattern.E_CommerceCheckoutSystemExample;

public class Client {
    public static void main(String[] args) {
        CheckoutSystem checkoutSystem = new CheckoutSystem();

        // Scenario 1: User explicitly chooses FedEx
        Order order1 = new Order("Alice Smith", "123 Apple St, NY", "10002", 2.0f);
        checkoutSystem.processCheckout(order1, ShippingType.FEDEX);

        // Scenario 2: User explicitly chooses UPS
        Order order2 = new Order("Bob Jones", "456 Orange Ave, CA", "90210", 2.0f);
        checkoutSystem.processCheckout(order2, ShippingType.UPS);
    }
}
