package main.java.org.manvendra.SOLIDPrinciples.LSP.BadCode;

public class Client {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();

        file.read(); //works fine
        file.write("ram"); //throws exception becoz not supported in readOnlyFile
    }
}
