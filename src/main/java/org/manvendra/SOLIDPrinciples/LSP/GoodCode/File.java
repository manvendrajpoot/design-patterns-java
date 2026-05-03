package main.java.org.manvendra.SOLIDPrinciples.LSP.GoodCode;

public class File extends ReadOnlyFile implements Writable{

    @Override
    public void write(String content) {
        System.out.println("Writing into the file");
    }
}
