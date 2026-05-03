package main.java.org.manvendra.SOLIDPrinciples.ISP.BadCode;

public class MultipurposeMachine implements Machine{
    @Override
    public void print(Document doc) {
        System.out.println("Printing ");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning ");

    }

    @Override
    public void copy(Document doc) {
        System.out.println("Copying ");

    }
}
