package org.webrtc;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

public class EncodedImage {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final boolean completeFrame;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;
    public final Integer qp;
    public final int rotation;

    public class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private boolean completeFrame;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;
        private Integer qp;
        private int rotation;

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.completeFrame, this.qp);
        }

        public Builder setBuffer(ByteBuffer byteBuffer) {
            this.buffer = byteBuffer;
            return this;
        }

        public Builder setCaptureTimeMs(long j) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j);
            return this;
        }

        public Builder setCaptureTimeNs(long j) {
            this.captureTimeNs = j;
            return this;
        }

        public Builder setCompleteFrame(boolean z) {
            this.completeFrame = z;
            return this;
        }

        public Builder setEncodedHeight(int i) {
            this.encodedHeight = i;
            return this;
        }

        public Builder setEncodedWidth(int i) {
            this.encodedWidth = i;
            return this;
        }

        public Builder setFrameType(FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public Builder setQp(Integer num) {
            this.qp = num;
            return this;
        }

        public Builder setRotation(int i) {
            this.rotation = i;
            return this;
        }
    }

    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);
        
        private final int nativeIndex;

        private FrameType(int i) {
            this.nativeIndex = i;
        }

        public static FrameType fromNativeIndex(int i) {
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i) {
                    return frameType;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown native frame type: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public EncodedImage(ByteBuffer byteBuffer, int i, int i2, long j, FrameType frameType, int i3, boolean z, Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i;
        this.encodedHeight = i2;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j);
        this.captureTimeNs = j;
        this.frameType = frameType;
        this.rotation = i3;
        this.completeFrame = z;
        this.qp = num;
    }

    public static Builder builder() {
        return new Builder();
    }
}
