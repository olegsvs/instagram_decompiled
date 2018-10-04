package org.webrtc;

import org.webrtc.VideoDecoder.Callback;
import org.webrtc.VideoDecoder.DecodeInfo;
import org.webrtc.VideoDecoder.Settings;

public abstract class WrappedNativeVideoDecoder implements VideoDecoder {
    public abstract long createNativeDecoder();

    public VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public boolean getPrefersLateDecoding() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public VideoCodecStatus initDecode(Settings settings, Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public static boolean isInstanceOf(VideoDecoder videoDecoder) {
        return videoDecoder instanceof WrappedNativeVideoDecoder;
    }

    public VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
