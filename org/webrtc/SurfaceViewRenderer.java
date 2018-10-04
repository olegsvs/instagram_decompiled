package org.webrtc;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import org.webrtc.EglRenderer.FrameListener;
import org.webrtc.RendererCommon.GlDrawer;
import org.webrtc.RendererCommon.RendererEvents;
import org.webrtc.RendererCommon.ScalingType;
import org.webrtc.RendererCommon.VideoLayoutMeasure;

public class SurfaceViewRenderer extends SurfaceView implements RendererEvents, Callback, VideoSink {
    private static final String TAG = "SurfaceViewRenderer";
    private final SurfaceEglRenderer eglRenderer = new SurfaceEglRenderer(this.resourceName);
    private boolean enableFixedSize;
    private RendererEvents rendererEvents;
    private final String resourceName = getResourceName();
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;
    private final VideoLayoutMeasure videoLayoutMeasure = new VideoLayoutMeasure();

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public SurfaceViewRenderer(Context context) {
        super(context);
        getHolder().addCallback(this);
        getHolder().addCallback(this.eglRenderer);
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getHolder().addCallback(this);
        getHolder().addCallback(this.eglRenderer);
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        this.eglRenderer.addFrameListener(frameListener, f);
    }

    public void addFrameListener(FrameListener frameListener, float f, GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f, glDrawer);
    }

    public void clearImage() {
        this.eglRenderer.clearImage();
    }

    public void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    private java.lang.String getResourceName() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r1 = r2.getResources();	 Catch:{ NotFoundException -> 0x000d }
        r0 = r2.getId();	 Catch:{ NotFoundException -> 0x000d }
        r0 = r1.getResourceEntryName(r0);	 Catch:{ NotFoundException -> 0x000d }
        return r0;	 Catch:{ NotFoundException -> 0x000d }
    L_0x000d:
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.SurfaceViewRenderer.getResourceName():java.lang.String");
    }

    public void init(EglBase.Context context, RendererEvents rendererEvents) {
        init(context, rendererEvents, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    public void init(EglBase.Context context, RendererEvents rendererEvents, int[] iArr, GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer);
    }

    public static /* synthetic */ void lambda$onFrameResolutionChanged$0(SurfaceViewRenderer surfaceViewRenderer, int i, int i2) {
        surfaceViewRenderer.rotatedFrameWidth = i;
        surfaceViewRenderer.rotatedFrameHeight = i2;
        surfaceViewRenderer.updateSurfaceSize();
        surfaceViewRenderer.requestLayout();
    }

    private void logD(String str) {
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.resourceName);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        Logging.m29383d(str2, stringBuilder.toString());
    }

    public void onFirstFrameRendered() {
        RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFirstFrameRendered();
        }
    }

    public void onFrame(VideoFrame videoFrame) {
        this.eglRenderer.onFrame(videoFrame);
    }

    public void onFrameResolutionChanged(int i, int i2, int i3) {
        int i4;
        RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFrameResolutionChanged(i, i2, i3);
        }
        if (i3 != 0) {
            if (i3 != 180) {
                i4 = i2;
                if (i3 == 0 || i3 == 180) {
                    i = i2;
                }
                postOrRun(new -$$Lambda$SurfaceViewRenderer$NznHhISA8bkJ9U8moGf2KoEdee4(this, i4, i));
            }
        }
        i4 = i;
        i = i2;
        postOrRun(new -$$Lambda$SurfaceViewRenderer$NznHhISA8bkJ9U8moGf2KoEdee4(this, i4, i));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio(((float) (i3 - i)) / ((float) (i4 - i2)));
        updateSurfaceSize();
    }

    public void onMeasure(int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        Point measure = this.videoLayoutMeasure.measure(i, i2, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(measure.x, measure.y);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onMeasure(). New size: ");
        stringBuilder.append(measure.x);
        stringBuilder.append("x");
        stringBuilder.append(measure.y);
        logD(stringBuilder.toString());
    }

    public void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    public void release() {
        this.eglRenderer.release();
    }

    public void removeFrameListener(FrameListener frameListener) {
        this.eglRenderer.removeFrameListener(frameListener);
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        updateSurfaceSize();
    }

    public void setFpsReduction(float f) {
        this.eglRenderer.setFpsReduction(f);
    }

    public void setMirror(boolean z) {
        this.eglRenderer.setMirror(z);
    }

    public void setScalingType(ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
    }

    public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
        requestLayout();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || getWidth() == 0 || getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            getHolder().setSizeFromLayout();
            return;
        }
        float width = ((float) getWidth()) / ((float) getHeight());
        int i = this.rotatedFrameWidth;
        float f = (float) i;
        int i2 = this.rotatedFrameHeight;
        if (f / ((float) i2) > width) {
            i = (int) (((float) i2) * width);
        } else {
            i2 = (int) (((float) i) / width);
        }
        int min = Math.min(getWidth(), i);
        i2 = Math.min(getHeight(), i2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("updateSurfaceSize. Layout size: ");
        stringBuilder.append(getWidth());
        stringBuilder.append("x");
        stringBuilder.append(getHeight());
        stringBuilder.append(", frame size: ");
        stringBuilder.append(this.rotatedFrameWidth);
        stringBuilder.append("x");
        stringBuilder.append(this.rotatedFrameHeight);
        stringBuilder.append(", requested surface size: ");
        stringBuilder.append(min);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        stringBuilder.append(", old surface size: ");
        stringBuilder.append(this.surfaceWidth);
        stringBuilder.append("x");
        stringBuilder.append(this.surfaceHeight);
        logD(stringBuilder.toString());
        if (min != this.surfaceWidth || i2 != this.surfaceHeight) {
            this.surfaceWidth = min;
            this.surfaceHeight = i2;
            getHolder().setFixedSize(min, i2);
        }
    }
}
