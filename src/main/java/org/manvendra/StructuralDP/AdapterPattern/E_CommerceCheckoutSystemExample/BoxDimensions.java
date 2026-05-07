package main.java.org.manvendra.StructuralDP.AdapterPattern.E_CommerceCheckoutSystemExample;

public class BoxDimensions {
    private int width;
    private int height;
    private int depth;

    BoxDimensions(float weight) {
        this.width = (int) (weight / 5);
        this.height = (int) (weight / 5);
        this.depth = (int) (weight % 5);
    }
}
