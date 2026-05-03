package main.java.org.manvendra.SOLIDPrinciples.LSP.BadCode;

public class ReadOnlyFile extends File {

    public void write(String content) {
        throw new UnsupportedOperationException("Not Supported for this kind of file");

    }
}
