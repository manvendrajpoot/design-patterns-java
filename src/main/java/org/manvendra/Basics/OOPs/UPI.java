package main.java.org.manvendra.Basics.OOPs;

public class UPI implements PaymentMethod{
    private String upiId;
    private String userName;

    UPI(String upiId, String userName) {
        this.upiId = upiId;
        this.userName = userName;
    }
    @Override
    public void pay() {
        System.out.println("Making payment via UPI having id: " + upiId);

    }

    public String getUserName() {
        return userName;
    }

    public String getUpiId() {
        return upiId;
    }
}
