package org.webrtc;

import org.webrtc.VideoEncoder.BitrateAllocation;
import org.webrtc.VideoEncoder.Callback;
import org.webrtc.VideoEncoder.EncodeInfo;
import org.webrtc.VideoEncoder.ScalingSettings;
import org.webrtc.VideoEncoder.Settings;

public abstract class WrappedNativeVideoEncoder implements VideoEncoder {
    public abstract long createNativeEncoder();

    public abstract boolean isSoftwareEncoder();

    public VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public ScalingSettings getScalingSettings() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public VideoCodecStatus initEncode(Settings settings, Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public static boolean isInstanceOf(VideoEncoder videoEncoder) {
        return videoEncoder instanceof WrappedNativeVideoEncoder;
    }

    public static boolean isWrappedSoftwareEncoder(VideoEncoder videoEncoder) {
        return (videoEncoder instanceof WrappedNativeVideoEncoder) && ((WrappedNativeVideoEncoder) videoEncoder).isSoftwareEncoder();
    }

    public VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public VideoCodecStatus setChannelParameters(short s, long j) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i) {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
