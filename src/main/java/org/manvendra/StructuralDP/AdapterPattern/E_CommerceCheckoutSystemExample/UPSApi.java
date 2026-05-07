package main.java.org.manvendra.StructuralDP.AdapterPattern.E_CommerceCheckoutSystemExample;

/// 3rd-Party UPS API
public class UPSApi {
    public double calculateTariff(BoxDimensions dimensions, String destination) {
        return 12.00; // Mock implementation
    }
    public String createShipment(ShippingDetails details) {
        return "UPS-TRACK-12345";
    }
}
