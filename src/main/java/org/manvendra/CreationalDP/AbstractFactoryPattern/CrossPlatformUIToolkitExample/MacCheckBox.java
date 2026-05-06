package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.CrossPlatformUIToolkitExample;

/** ---  Concrete Products (MacOS family)--- **/
public class MacCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Rendering the MacOs style checkbox!");
    }
}
