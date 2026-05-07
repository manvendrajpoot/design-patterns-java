package main.java.org.manvendra.CreationalDP.PrototypePattern.DocumentCopyPasteExample;

/// 3. Concrete Prototypes
public class Image implements DocumentElement{
    private String url;
    private int width;
    private int height;

    Image(String url, int width, int height) {
        this.url = url;
        this.width = width;
        this.height = height;
    }

    @Override
    public DocumentElement clone() {
        return new Image(url, width, height);
    }

    @Override
    public void render() {
        System.out.println("Rendering Image: [URL: " + url
                + ", size: " + width + "X" + height + "]");
    }
}
