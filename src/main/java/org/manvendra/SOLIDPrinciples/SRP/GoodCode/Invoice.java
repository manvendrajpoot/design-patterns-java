package main.java.org.manvendra.SOLIDPrinciples.SRP.GoodCode;

/*
* Only Invoice related attributes and methods
* */
public class Invoice {
    private String invoiceId;
    private double amount;
    private String customerId;

    public Invoice(String invoiceId, String custId, double amount) {
        this.invoiceId = invoiceId;
        this.customerId = custId;
        this.amount = amount;
    }

    public void generateInvoice() {
        System.out.println("Invoice generated & printed for amount " + amount);
    }
}
