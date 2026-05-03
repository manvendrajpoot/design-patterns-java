package main.java.org.manvendra.SOLIDPrinciples.LSP.GoodCode;

public class Client {
    public static void main(String[] args) {
        File file = new File();
        file.read();
        file.write("ram");

        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();
        //readableFile.write("ram"); <------ can't call write method
    }
}
