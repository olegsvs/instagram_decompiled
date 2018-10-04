package org.webrtc;

public class VideoEncoderFallback extends WrappedNativeVideoEncoder {
    private final VideoEncoder fallback;
    private final VideoEncoder primary;

    private static native long nativeCreateEncoder(VideoEncoder videoEncoder, VideoEncoder videoEncoder2);

    public VideoEncoderFallback(VideoEncoder videoEncoder, VideoEncoder videoEncoder2) {
        this.fallback = videoEncoder;
        this.primary = videoEncoder2;
    }

    public long createNativeEncoder() {
        return nativeCreateEncoder(this.fallback, this.primary);
    }

    public boolean isSoftwareEncoder() {
        return WrappedNativeVideoEncoder.isWrappedSoftwareEncoder(this.primary);
    }
}
