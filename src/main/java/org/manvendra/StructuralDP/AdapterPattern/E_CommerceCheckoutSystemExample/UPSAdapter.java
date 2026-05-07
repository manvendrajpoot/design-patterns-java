package main.java.org.manvendra.StructuralDP.AdapterPattern.E_CommerceCheckoutSystemExample;

// Adapter for UPS
public class UPSAdapter implements ShippingProvider{
    private UPSApi upsApi;

    UPSAdapter() {
        this.upsApi = new UPSApi();
    }

    @Override
    public double calculateShippingCost(Order order) {
        /// Translate our Order object into what UPS expects
        BoxDimensions dims = new BoxDimensions(order.getWeight()); // Mock conversion

        return upsApi.calculateTariff(dims, order.getAddress());
    }

    @Override
    public String generateTrackingNumber(Order order) {
        ShippingDetails details = new ShippingDetails(order.getCustomerName(), order.getAddress());

        return upsApi.createShipment(details);
    }

    @Override
    public String getProviderName() {
        return "UPS";
    }
}
