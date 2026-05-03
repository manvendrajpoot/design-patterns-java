package main.java.org.manvendra.SOLIDPrinciples.ISP.GoodCode;

public class SimplePrinter implements Printer{
    @Override
    public void print(Document Doc) {
        System.out.println("Printing doc: " + Doc.getDoc());
    }
}
