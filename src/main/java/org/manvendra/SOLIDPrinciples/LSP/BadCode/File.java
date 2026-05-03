package main.java.org.manvendra.SOLIDPrinciples.LSP.BadCode;

public class File {

    public void read() {
        System.out.println("Reading the content of the file: ");
    }

    public void write(String content) {
        System.out.println("Writing into the file: " + content);
    }

}
