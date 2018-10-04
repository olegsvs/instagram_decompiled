package org.webrtc;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase.Context;
import org.webrtc.RendererCommon.GlDrawer;
import org.webrtc.RendererCommon.RendererEvents;

public class SurfaceEglRenderer extends EglRenderer implements Callback {
    private static final String TAG = "SurfaceEglRenderer";
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private boolean isRenderingPaused = false;
    private final Object layoutLock = new Object();
    private RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;

    public SurfaceEglRenderer(String str) {
        super(str);
    }

    public void disableFpsReduction() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = false;
        }
        super.disableFpsReduction();
    }

    public void init(Context context, RendererEvents rendererEvents, int[] iArr, GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        synchronized (this.layoutLock) {
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        super.init(context, iArr, glDrawer);
    }

    public void init(Context context, int[] iArr, GlDrawer glDrawer) {
        init(context, null, iArr, glDrawer);
    }

    private void logD(String str) {
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        Logging.m29383d(str2, stringBuilder.toString());
    }

    public void onFrame(VideoFrame videoFrame) {
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
    }

    public void pauseVideo() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = true;
        }
        super.pauseVideo();
    }

    public void setFpsReduction(float f) {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = f == 0.0f;
        }
        super.setFpsReduction(f);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ThreadUtils.checkIsOnMainThread();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("surfaceChanged: format: ");
        stringBuilder.append(i);
        stringBuilder.append(" size: ");
        stringBuilder.append(i2);
        stringBuilder.append("x");
        stringBuilder.append(i3);
        logD(stringBuilder.toString());
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        createEglSurface(surfaceHolder.getSurface());
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.getClass();
        releaseEglSurface(new -$$Lambda$5k6tNlswoNAjCdgttrkQIe8VHVs(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    private void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
        synchronized (this.layoutLock) {
            if (!this.isRenderingPaused) {
                if (!this.isFirstFrameRendered) {
                    this.isFirstFrameRendered = true;
                    logD("Reporting first rendered frame.");
                    if (this.rendererEvents != null) {
                        this.rendererEvents.onFirstFrameRendered();
                    }
                }
                if (!(this.rotatedFrameWidth == videoFrame.getRotatedWidth() && this.rotatedFrameHeight == videoFrame.getRotatedHeight() && this.frameRotation == videoFrame.getRotation())) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Reporting frame resolution changed to ");
                    stringBuilder.append(videoFrame.getBuffer().getWidth());
                    stringBuilder.append("x");
                    stringBuilder.append(videoFrame.getBuffer().getHeight());
                    stringBuilder.append(" with rotation ");
                    stringBuilder.append(videoFrame.getRotation());
                    logD(stringBuilder.toString());
                    if (this.rendererEvents != null) {
                        this.rendererEvents.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                    }
                    this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                    this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                    this.frameRotation = videoFrame.getRotation();
                }
            }
        }
    }
}
