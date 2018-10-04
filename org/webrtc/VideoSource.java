package org.webrtc;

import org.webrtc.VideoCapturer.CapturerObserver;

public class VideoSource extends MediaSource {
    private final NativeCapturerObserver capturerObserver;

    private static native void nativeAdaptOutputFormat(long j, int i, int i2, int i3);

    private static native long nativeGetInternalSource(long j);

    public VideoSource(long j) {
        super(j);
        this.capturerObserver = new NativeCapturerObserver(nativeGetInternalSource(j));
    }

    public VideoSource(long j, SurfaceTextureHelper surfaceTextureHelper) {
        super(j);
        this.capturerObserver = new NativeCapturerObserver(nativeGetInternalSource(j), surfaceTextureHelper);
    }

    public void adaptOutputFormat(int i, int i2, int i3) {
        nativeAdaptOutputFormat(this.nativeSource, i, i2, i3);
    }

    public void dispose() {
        this.capturerObserver.dispose();
        super.dispose();
    }

    public CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }
}
