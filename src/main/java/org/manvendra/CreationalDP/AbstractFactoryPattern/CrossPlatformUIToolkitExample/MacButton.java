package main.java.org.manvendra.CreationalDP.AbstractFactoryPattern.CrossPlatformUIToolkitExample;

/** ---  Concrete Products (MacOS family)--- **/
public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering the MacOs style button!");
    }
}
