package main.java.org.manvendra.Basics.OOPs;

public class DebitCard extends Card {
    public DebitCard(String cardNum, String cardHolderName) {
        super(cardNum, cardHolderName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Debit card!");

    }
}
