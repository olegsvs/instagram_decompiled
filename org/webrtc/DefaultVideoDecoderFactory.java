package org.webrtc;

import java.util.Arrays;
import java.util.LinkedHashSet;
import org.webrtc.EglBase.Context;

public class DefaultVideoDecoderFactory implements VideoDecoderFactory {
    private final HardwareVideoDecoderFactory hardwareVideoDecoderFactory;
    private final SoftwareVideoDecoderFactory softwareVideoDecoderFactory = new SoftwareVideoDecoderFactory();

    public DefaultVideoDecoderFactory(Context context) {
        this.hardwareVideoDecoderFactory = new HardwareVideoDecoderFactory(context, false);
    }

    public VideoDecoder createDecoder(String str) {
        VideoDecoder createDecoder = this.hardwareVideoDecoderFactory.createDecoder(str);
        if (createDecoder != null) {
            return createDecoder;
        }
        return this.softwareVideoDecoderFactory.createDecoder(str);
    }

    public VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(this.softwareVideoDecoderFactory.getSupportedCodecs()));
        linkedHashSet.addAll(Arrays.asList(this.hardwareVideoDecoderFactory.getSupportedCodecs()));
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[linkedHashSet.size()]);
    }
}
