package main.java.org.manvendra.StructuralDP.FacadePattern.ComplexVideoConversionFrameworkExample;

/***
 * Codec Interfaces and Implementations
 */
public class OggCompressionCodec implements Codec{
    @Override
    public String getType() {
        return "ogg";
    }
}
