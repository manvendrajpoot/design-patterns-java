package main.java.org.manvendra.StructuralDP.AdapterPattern.E_CommerceCheckoutSystemExample;

/// The standard interface our system expects
public interface ShippingProvider {
    double calculateShippingCost(Order order);
    String generateTrackingNumber(Order order);
    String getProviderName(); // Added for visibility in logs
}
