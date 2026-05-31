package main.java.org.manvendra.StructuralDP.FacadePattern.ComplexVideoConversionFrameworkExample;

/***
 * Low-level processing utilities
 */
public class CodecFactory {
    public static Codec extract(VideoFile videoFile) {
        String type = videoFile.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: Extracting mpeg audio/video...");
            return new MPEG4CompressionCodec();
        } else if (type.equals("ogg")) {
            System.out.println("CodecFactory: Extracting ogg audio/video...");
            return new OggCompressionCodec();
        } else {
            System.out.println("CodecFactory: Invalid audio/video so returning .mp4 as default...");
            return new OggCompressionCodec();
        }
    }
}
