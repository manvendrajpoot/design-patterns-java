package main.java.org.manvendra.Basics.OOPs;

public class CreditCard extends Card {

    /*  Since Base class has no Base const
        so any class inheriting it should have this constructor calling with super()
    */
    public CreditCard(String cardNum, String cardHolderName) {
        super(cardNum, cardHolderName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Credit card!");
    }
}
