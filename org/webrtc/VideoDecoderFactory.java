package org.webrtc;

public interface VideoDecoderFactory {

    public final /* synthetic */ class -CC {
        public static VideoCodecInfo[] $default$getSupportedCodecs(VideoDecoderFactory -this) {
            return new VideoCodecInfo[null];
        }
    }

    VideoDecoder createDecoder(String str);

    VideoCodecInfo[] getSupportedCodecs();
}
