package main.java.org.manvendra.CreationalDP.PrototypePattern.DocumentCopyPasteExample;

public class Client {
    public static void main(String[] args) {
        // Setup original document
        Document originalDoc = new Document("Annual Report");
        TextBox introText = new TextBox("Revenue is up 20%.", "Arial-12pt");
        originalDoc.addElement(introText);
        originalDoc.addElement(new Image("chart.png", 800, 600));

        originalDoc.render();

        // 1. User copies the TextBox
        Clipboard clipboard = new Clipboard();
        clipboard.copy(introText);

        // 2. User modifies the original text box
        introText.setText("Revenue is up 50%!!!");

        // 3. User pastes the old TextBox
        DocumentElement pastedText = clipboard.paste();
        pastedText.render(); // This will print "Revenue is up 20%."

        // 4. User copies the ENTIRE document
        clipboard.copy(originalDoc);
        Document pastedDoc = (Document) clipboard.paste();
        pastedDoc.render();
    }
}
