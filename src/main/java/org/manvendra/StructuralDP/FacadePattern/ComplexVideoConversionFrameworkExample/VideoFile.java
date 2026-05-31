package main.java.org.manvendra.StructuralDP.FacadePattern.ComplexVideoConversionFrameworkExample;

/***
 * 1. COMPLEX SUBSYSTEMS (The messy internals)
 */
public class VideoFile {
    private String name;
    private String codecType;

    VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }
    public String getCodecType() { return codecType; }
    public String getName() { return name; }
}
