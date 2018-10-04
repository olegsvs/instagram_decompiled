package org.webrtc;

public class VP8Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder();

    public long createNativeDecoder() {
        return nativeCreateDecoder();
    }
}
