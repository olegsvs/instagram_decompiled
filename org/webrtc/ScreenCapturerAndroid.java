package org.webrtc;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjection.Callback;
import android.media.projection.MediaProjectionManager;
import android.view.Surface;
import org.webrtc.SurfaceTextureHelper.OnTextureFrameAvailableListener;
import org.webrtc.VideoCapturer.CapturerObserver;

public class ScreenCapturerAndroid implements VideoCapturer, OnTextureFrameAvailableListener {
    private static final int DISPLAY_FLAGS = 3;
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    public CapturerObserver capturerObserver;
    private int height;
    private boolean isDisposed = false;
    public MediaProjection mediaProjection;
    public final Callback mediaProjectionCallback;
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames = 0;
    public SurfaceTextureHelper surfaceTextureHelper;
    public VirtualDisplay virtualDisplay;
    private int width;

    /* renamed from: org.webrtc.ScreenCapturerAndroid$1 */
    public class C02301 implements Runnable {
        public void run() {
            ScreenCapturerAndroid.this.surfaceTextureHelper.stopListening();
            ScreenCapturerAndroid.this.capturerObserver.onCapturerStopped();
            if (ScreenCapturerAndroid.this.virtualDisplay != null) {
                ScreenCapturerAndroid.this.virtualDisplay.release();
                ScreenCapturerAndroid.this.virtualDisplay = null;
            }
            if (ScreenCapturerAndroid.this.mediaProjection != null) {
                ScreenCapturerAndroid.this.mediaProjection.unregisterCallback(ScreenCapturerAndroid.this.mediaProjectionCallback);
                ScreenCapturerAndroid.this.mediaProjection.stop();
                ScreenCapturerAndroid.this.mediaProjection = null;
            }
        }
    }

    /* renamed from: org.webrtc.ScreenCapturerAndroid$2 */
    public class C02312 implements Runnable {
        public void run() {
            ScreenCapturerAndroid.this.virtualDisplay.release();
            ScreenCapturerAndroid.createVirtualDisplay(ScreenCapturerAndroid.this);
        }
    }

    public boolean isScreencast() {
        return true;
    }

    public ScreenCapturerAndroid(Intent intent, Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        if (this.virtualDisplay != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new C02312());
        }
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    public static void createVirtualDisplay(ScreenCapturerAndroid screenCapturerAndroid) {
        screenCapturerAndroid.surfaceTextureHelper.getSurfaceTexture().setDefaultBufferSize(screenCapturerAndroid.width, screenCapturerAndroid.height);
        screenCapturerAndroid.virtualDisplay = screenCapturerAndroid.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", screenCapturerAndroid.width, screenCapturerAndroid.height, VIRTUAL_DISPLAY_DPI, 3, new Surface(screenCapturerAndroid.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    public synchronized void dispose() {
        this.isDisposed = true;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        RuntimeException runtimeException;
        checkNotDisposed();
        if (capturerObserver != null) {
            this.capturerObserver = capturerObserver;
            if (surfaceTextureHelper != null) {
                this.surfaceTextureHelper = surfaceTextureHelper;
                this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
            } else {
                runtimeException = new RuntimeException("surfaceTextureHelper not set.");
            }
        } else {
            runtimeException = new RuntimeException("capturerObserver not set.");
        }
        throw runtimeException;
    }

    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        this.numCapturedFrames++;
        VideoFrame videoFrame = new VideoFrame(this.surfaceTextureHelper.createTextureBuffer(this.width, this.height, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr)), 0, j);
        this.capturerObserver.onFrameCaptured(videoFrame);
        videoFrame.release();
    }

    public synchronized void startCapture(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        this.mediaProjection = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
        this.mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
        createVirtualDisplay(this);
        this.capturerObserver.onCapturerStarted(true);
        this.surfaceTextureHelper.startListening(this);
    }

    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new C02301());
    }
}
