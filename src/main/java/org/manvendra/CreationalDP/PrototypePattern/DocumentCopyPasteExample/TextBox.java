package main.java.org.manvendra.CreationalDP.PrototypePattern.DocumentCopyPasteExample;

/// 3. Concrete Prototypes
public class TextBox implements DocumentElement{
    private String text;
    private String fontConfig;

    TextBox(String text, String fontConfig) {
        this.text = text;
        this.fontConfig = fontConfig;
    }

    @Override
    public DocumentElement clone() {
        return new TextBox(text, fontConfig);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.println("Rendering TextBox: [Text: " + text
                + ", Font: " + fontConfig + "]");
    }
}
