package main.java.org.manvendra.SOLIDPrinciples.LSP.GoodCode;

public class ReadableFile implements Readable{
    @Override
    public void read() {
        System.out.println("Reading from the file..");
    }
}
