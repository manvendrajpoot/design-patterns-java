package main.java.org.manvendra.SOLIDPrinciples.ISP.BadCode;

public class Printer implements Machine{
    @Override
    public void print(Document doc) {
        System.out.println("Printing the doc");
    }

    @Override
    public void scan(Document doc) {
        throw  new UnsupportedOperationException("Not supported scanning");
    }

    @Override
    public void copy(Document doc) {
        throw  new UnsupportedOperationException("Not Supported Printing..");

    }
}
