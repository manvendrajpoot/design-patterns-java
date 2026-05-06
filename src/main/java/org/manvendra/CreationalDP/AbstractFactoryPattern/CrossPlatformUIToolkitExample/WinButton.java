package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.CrossPlatformUIToolkitExample;

/** ---  Concrete Products (Windows family)--- **/
public class WinButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering the Windows style button!");
    }
}
