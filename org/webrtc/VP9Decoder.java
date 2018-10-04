package org.webrtc;

public class VP9Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder();

    public static native boolean nativeIsSupported();

    public long createNativeDecoder() {
        return nativeCreateDecoder();
    }
}
