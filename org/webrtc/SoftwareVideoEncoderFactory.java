package org.webrtc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        if (videoCodecInfo.name.equalsIgnoreCase("VP8")) {
            return new VP8Encoder();
        }
        return (videoCodecInfo.name.equalsIgnoreCase("VP9") && VP9Encoder.nativeIsSupported()) ? new VP9Encoder() : null;
    }

    public VideoCodecInfo[] getSupportedCodecs() {
        return supportedCodecs();
    }

    public static VideoCodecInfo[] supportedCodecs() {
        List arrayList = new ArrayList();
        arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
        if (VP9Encoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }
}
