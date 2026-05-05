package main.java.org.manvendra.BehaviouralDP.MementoPattern.TextEditorExample;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.write("Hello Sir");
        editor.write("Good morning!");

        System.out.println("Printing editor content: " + editor.getContent());
    }
}
