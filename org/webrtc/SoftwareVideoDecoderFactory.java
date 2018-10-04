package org.webrtc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    public VideoDecoder createDecoder(String str) {
        if (str.equalsIgnoreCase("VP8")) {
            return new VP8Decoder();
        }
        return (str.equalsIgnoreCase("VP9") && VP9Decoder.nativeIsSupported()) ? new VP9Decoder() : null;
    }

    public VideoCodecInfo[] getSupportedCodecs() {
        return supportedCodecs();
    }

    public static VideoCodecInfo[] supportedCodecs() {
        List arrayList = new ArrayList();
        arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
        if (VP9Decoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }
}
