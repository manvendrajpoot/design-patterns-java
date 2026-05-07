package main.java.org.manvendra.CreationalDP.PrototypePattern.DocumentCopyPasteExample;

/// 2. The Base Element
public interface DocumentElement extends Prototype{
    void render();

    @Override
    DocumentElement clone();
}
