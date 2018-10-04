package org.webrtc;

public class VP8Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreateEncoder();

    public boolean isSoftwareEncoder() {
        return true;
    }

    public long createNativeEncoder() {
        return nativeCreateEncoder();
    }
}
