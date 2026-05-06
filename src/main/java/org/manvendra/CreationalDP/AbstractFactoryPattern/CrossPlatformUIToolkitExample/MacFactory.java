package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.CrossPlatformUIToolkitExample;

/** ---  Concrete Factory (MacOS) --- */
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
