package org.webrtc;

import java.util.Arrays;
import java.util.LinkedHashSet;
import org.webrtc.EglBase.Context;

public class DefaultVideoEncoderFactory implements VideoEncoderFactory {
    private final VideoEncoderFactory hardwareVideoEncoderFactory;
    private final VideoEncoderFactory softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();

    public DefaultVideoEncoderFactory(Context context, boolean z, boolean z2) {
        this.hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z, z2, false);
    }

    public DefaultVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory) {
        this.hardwareVideoEncoderFactory = videoEncoderFactory;
    }

    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        VideoEncoder createEncoder = this.hardwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        if (createEncoder != null) {
            return createEncoder;
        }
        return this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
    }

    public VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(this.softwareVideoEncoderFactory.getSupportedCodecs()));
        linkedHashSet.addAll(Arrays.asList(this.hardwareVideoEncoderFactory.getSupportedCodecs()));
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[linkedHashSet.size()]);
    }
}
