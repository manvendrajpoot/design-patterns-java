package main.java.org.manvendra.StructuralDP.FacadePattern.ComplexVideoConversionFrameworkExample;

public class Client {
    public static void main(String[] args) {
        // The client code is beautiful and clean.
        // It has NO IDEA that BitrateReader or AudioMixer even exist!

        VideoConverter converter = new VideoConverter();

        // User clicks "Convert to OGG"
        File mp4Video = converter.convertVideo("funny_cats.mp4", "ogg");
    }
}
