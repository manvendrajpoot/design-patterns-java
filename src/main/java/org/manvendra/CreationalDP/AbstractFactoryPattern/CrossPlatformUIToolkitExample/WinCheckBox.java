package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.CrossPlatformUIToolkitExample;

/** ---  Concrete Products (Windows Family)--- **/
public class WinCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Rendering the Windows style checkbox!");
    }
}
