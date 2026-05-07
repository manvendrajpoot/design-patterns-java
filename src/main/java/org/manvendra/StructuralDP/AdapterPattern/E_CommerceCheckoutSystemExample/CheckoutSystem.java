package main.java.org.manvendra.StructuralDP.AdapterPattern.E_CommerceCheckoutSystemExample;

public class CheckoutSystem {

    // The checkout system delegates provider creation to the Factory
    public void processCheckout(Order order, ShippingType shippingType) {

        // 1. Get the right provider via Factory
        ShippingProvider shippingProvider = ShippingProviderFactory.getProvider(shippingType);

        System.out.println("Processing the order for: " + order.getCustomerName()
                + " via " + shippingProvider.getProviderName());

        // 2. Calculate Cost
        double cost = shippingProvider.calculateShippingCost(order);
        System.out.println("Shipping cost added: $" + cost);

        // 3. Dispatch and Track
        String tracking = shippingProvider.generateTrackingNumber(order);
        System.out.println("Order dispatched. Tracking ID: " + tracking);
    }
}
