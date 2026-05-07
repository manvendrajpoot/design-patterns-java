package main.java.org.manvendra.CreationalDP.PrototypePattern.DocumentCopyPasteExample;

public class Clipboard {
    private DocumentElement copiedElement;

    public void copy(DocumentElement element) {
        /**
         * We store a clone in the clipboard so subsequent changes
         * to the original don't affect what is in the clipboard.
         * */
        this.copiedElement = element.clone();
        System.out.println("Item copied to clipboard.");
    }

    public DocumentElement paste() {
        if (copiedElement == null) {
            throw  new IllegalStateException("Clipboard is empty!");
        }

        // When pasting, we clone the clipboard's item so we can paste it multiple times
        System.out.println("Pasting item...");
        return copiedElement.clone();
    }
}
