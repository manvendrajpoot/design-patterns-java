package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.CrossPlatformUIToolkitExample;

/** --- The Client Code ---
*  Notice how this class has NO dependencies on "Windows" or "Mac".
 * It only knows about the abstract interfaces.
 * */

public class Application {
    private Button button;
    private CheckBox checkBox;

    Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void render() {
        button.render();
        checkBox.render();
    }
}
