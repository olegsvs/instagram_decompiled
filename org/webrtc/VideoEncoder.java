package org.webrtc;

import org.webrtc.EncodedImage.FrameType;

public interface VideoEncoder {

    public class BitrateAllocation {
        public final int[][] bitratesBbs;

        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }

        public int getSum() {
            int i = 0;
            for (int[] iArr : this.bitratesBbs) {
                for (int i2 : r7[r5]) {
                    i += i2;
                }
            }
            return i;
        }
    }

    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    public class CodecSpecificInfo {
    }

    public class EncodeInfo {
        public final FrameType[] frameTypes;

        public EncodeInfo(FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    public class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;
        public final boolean on;

        private ScalingSettings() {
            this.on = false;
            this.low = null;
            this.high = null;
        }

        public ScalingSettings(int i, int i2) {
            this.on = true;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        public ScalingSettings(boolean z) {
            this.on = z;
            this.low = null;
            this.high = null;
        }

        public ScalingSettings(boolean z, int i, int i2) {
            this.on = z;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        public String toString() {
            if (!this.on) {
                return "OFF";
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[ ");
            stringBuilder.append(this.low);
            stringBuilder.append(", ");
            stringBuilder.append(this.high);
            stringBuilder.append(" ]");
            return stringBuilder.toString();
        }
    }

    public class Settings {
        public final boolean automaticResizeOn;
        public final int height;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int startBitrate;
        public final int width;

        public Settings(int i, int i2, int i3, int i4, int i5, boolean z) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
            this.startBitrate = i4;
            this.maxFramerate = i5;
            this.automaticResizeOn = z;
        }
    }

    public class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    public class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    public class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    String getImplementationName();

    ScalingSettings getScalingSettings();

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    VideoCodecStatus release();

    VideoCodecStatus setChannelParameters(short s, long j);

    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i);
}
