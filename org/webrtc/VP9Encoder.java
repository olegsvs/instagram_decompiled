package org.webrtc;

public class VP9Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreateEncoder();

    public static native boolean nativeIsSupported();

    public boolean isSoftwareEncoder() {
        return true;
    }

    public long createNativeEncoder() {
        return nativeCreateEncoder();
    }
}
