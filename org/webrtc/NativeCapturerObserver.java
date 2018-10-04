package org.webrtc;

import org.webrtc.VideoCapturer.CapturerObserver;
import org.webrtc.VideoFrame.Buffer;

public class NativeCapturerObserver implements CapturerObserver {
    private final long nativeSource;
    private final SurfaceTextureHelper surfaceTextureHelper;

    private static native void nativeCapturerStarted(long j, boolean z);

    private static native void nativeCapturerStopped(long j);

    private static native void nativeOnFrameCaptured(long j, int i, int i2, int i3, long j2, Buffer buffer);

    public NativeCapturerObserver(long j) {
        this.nativeSource = j;
        this.surfaceTextureHelper = null;
    }

    public NativeCapturerObserver(long j, SurfaceTextureHelper surfaceTextureHelper) {
        this.nativeSource = j;
        this.surfaceTextureHelper = surfaceTextureHelper;
    }

    public void dispose() {
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
    }

    public void onByteBufferFrameCaptured(byte[] bArr, int i, int i2, int i3, long j) {
        VideoFrame videoFrame = new VideoFrame(new NV21Buffer(bArr, i, i2, null), i3, j);
        onFrameCaptured(videoFrame);
        videoFrame.release();
    }

    public void onCapturerStarted(boolean z) {
        nativeCapturerStarted(this.nativeSource, z);
    }

    public void onCapturerStopped() {
        nativeCapturerStopped(this.nativeSource);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        nativeOnFrameCaptured(this.nativeSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer());
    }

    public void onTextureFrameCaptured(int i, int i2, int i3, float[] fArr, int i4, long j) {
        VideoFrame videoFrame = new VideoFrame(this.surfaceTextureHelper.createTextureBuffer(i, i2, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr)), i4, j);
        onFrameCaptured(videoFrame);
        videoFrame.release();
    }
}
