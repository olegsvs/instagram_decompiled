package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoEncoder.Callback;
import org.webrtc.VideoEncoder.ScalingSettings;

public class VideoEncoderWrapper {
    private static native void nativeOnEncodedFrame(long j, ByteBuffer byteBuffer, int i, int i2, long j2, int i3, int i4, boolean z, Integer num);

    public static Callback createEncoderCallback(long j) {
        return new -$$Lambda$VideoEncoderWrapper$dRHADZXMoanHTOdEf2Act96Dzi0(j);
    }

    public static Integer getScalingSettingsHigh(ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    public static Integer getScalingSettingsLow(ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    public static boolean getScalingSettingsOn(ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }
}
