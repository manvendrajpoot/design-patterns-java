package main.java.org.manvendra.CreationalDP.PrototypePattern.DocumentCopyPasteExample;

import java.util.ArrayList;
import java.util.List;

/// 4. The Complex Prototype (The Document)
public class Document implements DocumentElement{
    private String title;
    private List<DocumentElement> elements;

    Document(String title){
        this.title = title;
        this.elements = new ArrayList<>();
    }

    @Override
    public DocumentElement clone() {
        // Create the new shell
        Document clonedDoc = new Document(this.title + " - Copy");

        // CRITICAL: DEEP COPY
        // We must clone every single child element. If we just copied the list reference,
        // editing the cloned document would mutate the original document!
        for (DocumentElement element : this.elements) {
            clonedDoc.addElement(element.clone());
        }

        return clonedDoc;
    }

    public List<DocumentElement> getElements() {
        return elements;
    }

    public void addElement(DocumentElement element) {
        this.elements.add(element);
    }

    @Override
    public void render() {
        System.out.println("Rendering Document: Title: " + title);
        for (DocumentElement element: elements) {
            element.render();
        }
    }
}
