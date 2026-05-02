package main.java.org.manvendra.Basics.OOPs;

public class Card implements PaymentMethod{
    private String cardNum;

    private String cardHolderName;

    /* Parameterized const */
    Card(String cardNum, String cardHolderName) {
        this.cardNum = cardNum;
        this.cardHolderName = cardHolderName;
    }

    public String getCardNum() {
        return cardNum;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    @Override
    public void pay() {

    }
}
