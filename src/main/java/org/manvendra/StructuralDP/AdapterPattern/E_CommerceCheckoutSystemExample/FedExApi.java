package main.java.org.manvendra.StructuralDP.AdapterPattern.E_CommerceCheckoutSystemExample;

/// 3rd-Party FedEx API
public class FedExApi {
    public float getQuote(String originZip, String destZip, float weightInLbs) {
        return 15.50f; // Mock implementation
    }
    public String dispatchParcel(String customerName, String destAddress) {
        return "FEDEX-TRACK-98765";
    }
}
