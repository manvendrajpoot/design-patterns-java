package main.java.org.manvendra.StructuralDP.AdapterPattern.E_CommerceCheckoutSystemExample;

public class ShippingProviderFactory {

    // Returns the correct adapter based on the Enum
    public static ShippingProvider getProvider(ShippingType type) {
        switch (type) {
            case FEDEX:
                return new FedExAdapter();
            case UPS:
                return new UPSAdapter();
            default:
                throw new IllegalArgumentException("Unknown Shipping Type");
        }
    }
}
