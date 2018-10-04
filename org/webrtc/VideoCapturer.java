package org.webrtc;

import android.content.Context;

public interface VideoCapturer {

    public interface CapturerObserver {

        public final /* synthetic */ class -CC {
            public static void $default$onByteBufferFrameCaptured(CapturerObserver -this, byte[] bArr, int i, int i2, int i3, long j) {
                throw new UnsupportedOperationException("Deprecated and not implemented.");
            }

            public static void $default$onTextureFrameCaptured(CapturerObserver -this, int i, int i2, int i3, float[] fArr, int i4, long j) {
                throw new UnsupportedOperationException("Deprecated and not implemented.");
            }
        }

        void onByteBufferFrameCaptured(byte[] bArr, int i, int i2, int i3, long j);

        void onCapturerStarted(boolean z);

        void onCapturerStopped();

        void onFrameCaptured(VideoFrame videoFrame);

        void onTextureFrameCaptured(int i, int i2, int i3, float[] fArr, int i4, long j);
    }

    void changeCaptureFormat(int i, int i2, int i3);

    void dispose();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isScreencast();

    void startCapture(int i, int i2, int i3);

    void stopCapture();
}
