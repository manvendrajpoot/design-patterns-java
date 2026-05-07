package main.java.org.manvendra.StructuralDP.AdapterPattern.E_CommerceCheckoutSystemExample;

/// Our internal domain model
public class Order {
    private String customerName;
    private String address;
    private String zipCode;
    private float weight;

    Order(String customerName, String address, String zipCode, float weight) {
        this.customerName = customerName;
        this.address = address;
        this.zipCode = zipCode;
        this.weight = weight;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
