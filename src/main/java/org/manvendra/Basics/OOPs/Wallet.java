package main.java.org.manvendra.Basics.OOPs;

public class Wallet implements PaymentMethod{
    private String walledId;
    private String userName;

    Wallet(String walledId, String userName) {
        this.userName = userName;
        this.walledId = walledId;
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Wallet having id: " + walledId);

    }

    public String getWalledId() {
        return walledId;
    }

    public String getUserName() {
        return userName;
    }
}
