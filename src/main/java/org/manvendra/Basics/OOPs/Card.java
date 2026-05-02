package main.java.org.manvendra.Basics.OOPs;

abstract  public class Card {
    private String cardNum;

    private String cardHolderName;

    /* Parameterized const */
    public Card(String cardNum, String cardHolderName) {
        this.cardNum = cardNum;
        this.cardHolderName = cardHolderName;
    }

    public String getCardNum() {
        return cardNum;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    abstract void pay() {}
}
