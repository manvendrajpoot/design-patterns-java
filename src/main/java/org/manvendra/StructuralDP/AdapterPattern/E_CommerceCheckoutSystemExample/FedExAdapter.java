package main.java.org.manvendra.StructuralDP.AdapterPattern.E_CommerceCheckoutSystemExample;

// Adapter for FedEx
public class FedExAdapter implements ShippingProvider{
    private FedExApi fedExApi;
    private String wareHouseZip = "201304";

    FedExAdapter() {
        this.fedExApi = new FedExApi();
    }

    @Override
    public double calculateShippingCost(Order order) {
        /// Translate our Order object into what FedEx expects
        return fedExApi.getQuote(
                wareHouseZip,
                order.getZipCode(),
                order.getWeight()
        );
    }

    @Override
    public String generateTrackingNumber(Order order) {
        return fedExApi.dispatchParcel(
                order.getCustomerName(),
                order.getAddress()
        );
    }

    @Override
    public String getProviderName() {
        return "FedEx";
    }
}
