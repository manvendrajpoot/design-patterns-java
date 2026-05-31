package main.java.org.manvendra.StructuralDP.FacadePattern.ComplexVideoConversionFrameworkExample;

/***
 *  Codec Interfaces and Implementations
 */
public class MPEG4CompressionCodec implements Codec{
    @Override
    public String getType() {
        return "mp4";
    }
}
