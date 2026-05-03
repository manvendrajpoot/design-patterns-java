package main.java.org.manvendra.SOLIDPrinciples.ISP.GoodCode;

public class MultipurposeMachine implements Copier, Scanner, Printer{
    @Override
    public void copy(Document doc) {
        System.out.println("Copying");
    }

    @Override
    public void print(Document Doc) {
        System.out.println("Printing");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning");
    }
}
