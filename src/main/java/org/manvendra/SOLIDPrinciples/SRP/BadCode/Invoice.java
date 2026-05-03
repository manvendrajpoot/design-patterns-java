package main.java.org.manvendra.SOLIDPrinciples.SRP.BadCode;

public class Invoice {
    private String invoiceId;
    private double amount;
    private String customerId;

    public Invoice(String invoiceId, String custId, double amount) {
        this.invoiceId = invoiceId;
        this.customerId = custId;
        this.amount = amount;
    }

    public void generateInvoice(){
        System.out.println("Invoice generated & printed for amount " + amount);
    }

    //Additional Functionality
    public void saveToDatabase(){
        System.out.println("Saving invoice to Database ");
    }

    public void sendEmailNotification(){
        System.out.println("Sending email notification for invoice having id '"
                + invoiceId + "' to customer " + customerId);
    }
}
