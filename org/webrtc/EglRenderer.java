package org.webrtc;

import X.AnonymousClass0OR;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase.-CC;
import org.webrtc.EglBase.Context;
import org.webrtc.RendererCommon.GlDrawer;
import org.webrtc.VideoRenderer.Callbacks;
import org.webrtc.VideoRenderer.I420Frame;

public class EglRenderer implements Callbacks, VideoSink {
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private final GlTextureFrameBuffer bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
    private final Matrix drawMatrix = new Matrix();
    private GlDrawer drawer;
    public EglBase eglBase;
    private final EglSurfaceCreation eglSurfaceCreationRunnable = new EglSurfaceCreation();
    private final Object fpsReductionLock = new Object();
    private final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    private final ArrayList frameListeners = new ArrayList();
    private final Object frameLock = new Object();
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    public final Object handlerLock = new Object();
    private float layoutAspectRatio;
    private final Object layoutLock = new Object();
    public final Runnable logStatisticsRunnable = new C02151();
    private long minRenderPeriodNs;
    private boolean mirror;
    public final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private long renderSwapBufferTimeNs;
    public Handler renderThreadHandler;
    private long renderTimeNs;
    private final Object statisticsLock = new Object();
    private long statisticsStartTimeNs;

    /* renamed from: org.webrtc.EglRenderer$1 */
    public class C02151 implements Runnable {
        public void run() {
            EglRenderer.logStatistics(EglRenderer.this);
            synchronized (EglRenderer.this.handlerLock) {
                if (EglRenderer.this.renderThreadHandler != null) {
                    AnonymousClass0OR.G(EglRenderer.this.renderThreadHandler, EglRenderer.this.logStatisticsRunnable, -1306077089);
                    AnonymousClass0OR.F(EglRenderer.this.renderThreadHandler, EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(EglRenderer.LOG_INTERVAL_SEC), 1896131175);
                }
            }
        }
    }

    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        public synchronized void run() {
            if (!(this.surface == null || EglRenderer.this.eglBase == null || EglRenderer.this.eglBase.hasSurface())) {
                if (this.surface instanceof Surface) {
                    EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                } else if (this.surface instanceof SurfaceTexture) {
                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid surface: ");
                    stringBuilder.append(this.surface);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                EglRenderer.this.eglBase.makeCurrent();
                GLES20.glPixelStorei(3317, 1);
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    public class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f, GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    public EglRenderer(String str) {
        this.name = str;
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, null, false);
    }

    public void addFrameListener(FrameListener frameListener, float f, GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    public void addFrameListener(FrameListener frameListener, float f, GlDrawer glDrawer, boolean z) {
        postToRenderThread(new -$$Lambda$EglRenderer$RQnwmlnL5c18V7FwaqbMl6FsQRo(this, glDrawer, frameListener, f, z));
    }

    private String averageTimeAsString(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TimeUnit.NANOSECONDS.toMicros(j / ((long) i)));
        stringBuilder.append(" μs");
        return stringBuilder.toString();
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void clearImage(float f, float f2, float f3, float f4) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                this.renderThreadHandler.postAtFrontOfQueue(new -$$Lambda$EglRenderer$rAPTAEHKQxRxBFU3vvHmF68TV5E(this, f, f2, f3, f4));
            }
        }
    }

    public static void clearSurfaceOnRenderThread(EglRenderer eglRenderer, float f, float f2, float f3, float f4) {
        EglBase eglBase = eglRenderer.eglBase;
        if (eglBase != null && eglBase.hasSurface()) {
            eglRenderer.logD("clearSurface");
            GLES20.glClearColor(f, f2, f3, f4);
            GLES20.glClear(16384);
            eglRenderer.eglBase.swapBuffers();
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void init(Context context, int[] iArr, GlDrawer glDrawer) {
        synchronized (this.handlerLock) {
            StringBuilder stringBuilder;
            if (this.renderThreadHandler == null) {
                logD("Initializing EglRenderer");
                this.drawer = glDrawer;
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.name);
                stringBuilder.append(TAG);
                HandlerThread handlerThread = new HandlerThread(stringBuilder.toString());
                handlerThread.start();
                this.renderThreadHandler = new Handler(handlerThread.getLooper());
                ThreadUtils.invokeAtFrontUninterruptibly(this.renderThreadHandler, new -$$Lambda$EglRenderer$A5MPsBufyTiKpmjvPS46Dr9iaHs(this, context, iArr));
                this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                resetStatistics(System.nanoTime());
                this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(LOG_INTERVAL_SEC));
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.name);
                stringBuilder.append("Already initialized");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    public static /* synthetic */ void lambda$addFrameListener$3(EglRenderer eglRenderer, GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        if (glDrawer == null) {
            glDrawer = eglRenderer.drawer;
        }
        eglRenderer.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
    }

    public static /* synthetic */ void lambda$init$0(EglRenderer eglRenderer, Context context, int[] iArr) {
        if (context == null) {
            eglRenderer.logD("EglBase10.create context");
            eglRenderer.eglBase = -CC.createEgl10(iArr);
            return;
        }
        eglRenderer.logD("EglBase.create shared context");
        eglRenderer.eglBase = -CC.create(context, iArr);
    }

    public static /* synthetic */ void lambda$release$1(EglRenderer eglRenderer, CountDownLatch countDownLatch) {
        GlDrawer glDrawer = eglRenderer.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            eglRenderer.drawer = null;
        }
        eglRenderer.frameDrawer.release();
        eglRenderer.bitmapTextureFramebuffer.release();
        if (eglRenderer.eglBase != null) {
            eglRenderer.logD("eglBase detach and release.");
            eglRenderer.eglBase.detachCurrent();
            eglRenderer.eglBase.release();
            eglRenderer.eglBase = null;
        }
        eglRenderer.frameListeners.clear();
        countDownLatch.countDown();
    }

    public static /* synthetic */ void lambda$release$2(EglRenderer eglRenderer, Looper looper) {
        eglRenderer.logD("Quitting render thread.");
        looper.quit();
    }

    public static /* synthetic */ void lambda$releaseEglSurface$5(EglRenderer eglRenderer, Runnable runnable) {
        EglBase eglBase = eglRenderer.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            eglRenderer.eglBase.releaseSurface();
        }
        runnable.run();
    }

    public static /* synthetic */ void lambda$removeFrameListener$4(EglRenderer eglRenderer, CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        countDownLatch = eglRenderer.frameListeners.iterator();
        while (countDownLatch.hasNext() != null) {
            if (((FrameListenerAndParams) countDownLatch.next()).listener == frameListener) {
                countDownLatch.remove();
            }
        }
    }

    private void logD(String str) {
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name);
        stringBuilder.append(str);
        Logging.m29383d(str2, stringBuilder.toString());
    }

    public static void logStatistics(EglRenderer eglRenderer) {
        long nanoTime = System.nanoTime();
        synchronized (eglRenderer.statisticsLock) {
            long j = nanoTime - eglRenderer.statisticsStartTimeNs;
            if (j > 0) {
                float toNanos = ((float) (((long) eglRenderer.framesRendered) * TimeUnit.SECONDS.toNanos(1))) / ((float) j);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Duration: ");
                stringBuilder.append(TimeUnit.NANOSECONDS.toMillis(j));
                stringBuilder.append(" ms. Frames received: ");
                stringBuilder.append(eglRenderer.framesReceived);
                stringBuilder.append(". Dropped: ");
                stringBuilder.append(eglRenderer.framesDropped);
                stringBuilder.append(". Rendered: ");
                stringBuilder.append(eglRenderer.framesRendered);
                stringBuilder.append(". Render fps: ");
                stringBuilder.append(String.format(Locale.US, "%.1f", new Object[]{Float.valueOf(toNanos)}));
                stringBuilder.append(". Average render time: ");
                stringBuilder.append(eglRenderer.averageTimeAsString(eglRenderer.renderTimeNs, eglRenderer.framesRendered));
                stringBuilder.append(". Average swapBuffer time: ");
                stringBuilder.append(eglRenderer.averageTimeAsString(eglRenderer.renderSwapBufferTimeNs, eglRenderer.framesRendered));
                stringBuilder.append(".");
                eglRenderer.logD(stringBuilder.toString());
                eglRenderer.resetStatistics(nanoTime);
            }
        }
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        if (!this.frameListeners.isEmpty()) {
            r2.drawMatrix.reset();
            r2.drawMatrix.preTranslate(0.5f, 0.5f);
            if (r2.mirror) {
                r2.drawMatrix.preScale(-1.0f, 1.0f);
            }
            r2.drawMatrix.preScale(1.0f, -1.0f);
            r2.drawMatrix.preTranslate(-0.5f, -0.5f);
            Iterator it = r2.frameListeners.iterator();
            while (it.hasNext()) {
                FrameListenerAndParams frameListenerAndParams = (FrameListenerAndParams) it.next();
                if (z || !frameListenerAndParams.applyFpsReduction) {
                    it.remove();
                    VideoFrame videoFrame2 = videoFrame;
                    int rotatedWidth = (int) (frameListenerAndParams.scale * ((float) videoFrame2.getRotatedWidth()));
                    int rotatedHeight = (int) (frameListenerAndParams.scale * ((float) videoFrame2.getRotatedHeight()));
                    if (rotatedWidth != 0) {
                        if (rotatedHeight != 0) {
                            r2.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                            GLES20.glBindFramebuffer(36160, r2.bitmapTextureFramebuffer.getFrameBufferId());
                            GLES20.glFramebufferTexture2D(36160, 36064, 3553, r2.bitmapTextureFramebuffer.getTextureId(), 0);
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                            GLES20.glClear(16384);
                            r2.frameDrawer.drawFrame(videoFrame2, frameListenerAndParams.drawer, r2.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                            Buffer allocateDirect = ByteBuffer.allocateDirect((rotatedWidth * rotatedHeight) * 4);
                            GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                            GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
                            GLES20.glBindFramebuffer(36160, 0);
                            GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                            Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Config.ARGB_8888);
                            createBitmap.copyPixelsFromBuffer(allocateDirect);
                            frameListenerAndParams.listener.onFrame(createBitmap);
                        }
                    }
                    frameListenerAndParams.listener.onFrame(null);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrame(org.webrtc.VideoFrame r7) {
        /*
        r6 = this;
        r1 = r6.statisticsLock;
        monitor-enter(r1);
        r0 = r6.framesReceived;	 Catch:{ all -> 0x0051 }
        r5 = 1;
        r0 = r0 + r5;
        r6.framesReceived = r0;	 Catch:{ all -> 0x0051 }
        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
        r4 = r6.handlerLock;
        monitor-enter(r4);
        r0 = r6.renderThreadHandler;	 Catch:{ all -> 0x004e }
        if (r0 != 0) goto L_0x0018;
    L_0x0011:
        r0 = "Dropping frame - Not initialized or already released.";
        r6.logD(r0);	 Catch:{ all -> 0x004e }
        monitor-exit(r4);	 Catch:{ all -> 0x004e }
    L_0x0017:
        return;
    L_0x0018:
        r3 = r6.frameLock;	 Catch:{ all -> 0x004e }
        monitor-enter(r3);	 Catch:{ all -> 0x004e }
        r0 = r6.pendingFrame;	 Catch:{ all -> 0x004b }
        if (r0 == 0) goto L_0x0021;
    L_0x001f:
        r2 = 1;
        goto L_0x0022;
    L_0x0021:
        r2 = 0;
    L_0x0022:
        if (r2 == 0) goto L_0x0029;
    L_0x0024:
        r0 = r6.pendingFrame;	 Catch:{ all -> 0x004b }
        r0.release();	 Catch:{ all -> 0x004b }
    L_0x0029:
        r6.pendingFrame = r7;	 Catch:{ all -> 0x004b }
        r0 = r6.pendingFrame;	 Catch:{ all -> 0x004b }
        r0.retain();	 Catch:{ all -> 0x004b }
        r1 = r6.renderThreadHandler;	 Catch:{ all -> 0x004b }
        r0 = new org.webrtc.-$$Lambda$EglRenderer$vWDJEj1GWjHSjwoQQjEEK_IVOJE;	 Catch:{ all -> 0x004b }
        r0.<init>(r6);	 Catch:{ all -> 0x004b }
        r1.post(r0);	 Catch:{ all -> 0x004b }
        monitor-exit(r3);	 Catch:{ all -> 0x004b }
        monitor-exit(r4);	 Catch:{ all -> 0x004e }
        if (r2 == 0) goto L_0x0017;
    L_0x003e:
        r1 = r6.statisticsLock;
        monitor-enter(r1);
        r0 = r6.framesDropped;	 Catch:{ all -> 0x0048 }
        r0 = r0 + r5;
        r6.framesDropped = r0;	 Catch:{ all -> 0x0048 }
        monitor-exit(r1);	 Catch:{ all -> 0x0048 }
        goto L_0x0017;
    L_0x0048:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0048 }
    L_0x004a:
        throw r0;
    L_0x004b:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x004b }
        throw r0;	 Catch:{ all -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x004e }
        goto L_0x004a;
    L_0x0051:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.onFrame(org.webrtc.VideoFrame):void");
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                this.renderThreadHandler.post(runnable);
            }
        }
    }

    public void printStackTrace() {
        synchronized (this.handlerLock) {
            Thread thread = this.renderThreadHandler == null ? null : this.renderThreadHandler.getLooper().getThread();
            if (thread != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace.length > 0) {
                    logD("EglRenderer stack trace:");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        logD(stackTraceElement.toString());
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
        r5 = this;
        r0 = "Releasing.";
        r5.logD(r0);
        r4 = new java.util.concurrent.CountDownLatch;
        r0 = 1;
        r4.<init>(r0);
        r3 = r5.handlerLock;
        monitor-enter(r3);
        r0 = r5.renderThreadHandler;	 Catch:{ all -> 0x0059 }
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = "Already released";
        r5.logD(r0);	 Catch:{ all -> 0x0059 }
        monitor-exit(r3);	 Catch:{ all -> 0x0059 }
        return;
    L_0x0019:
        r1 = r5.renderThreadHandler;	 Catch:{ all -> 0x0059 }
        r0 = r5.logStatisticsRunnable;	 Catch:{ all -> 0x0059 }
        r1.removeCallbacks(r0);	 Catch:{ all -> 0x0059 }
        r1 = r5.renderThreadHandler;	 Catch:{ all -> 0x0059 }
        r0 = new org.webrtc.-$$Lambda$EglRenderer$MFF8Cl7oJsgEmXm7UI2GkKtNTYY;	 Catch:{ all -> 0x0059 }
        r0.<init>(r5, r4);	 Catch:{ all -> 0x0059 }
        r1.postAtFrontOfQueue(r0);	 Catch:{ all -> 0x0059 }
        r0 = r5.renderThreadHandler;	 Catch:{ all -> 0x0059 }
        r2 = r0.getLooper();	 Catch:{ all -> 0x0059 }
        r1 = r5.renderThreadHandler;	 Catch:{ all -> 0x0059 }
        r0 = new org.webrtc.-$$Lambda$EglRenderer$0TOf6TQvvPy5g4d42QjmzelnDZI;	 Catch:{ all -> 0x0059 }
        r0.<init>(r5, r2);	 Catch:{ all -> 0x0059 }
        r1.post(r0);	 Catch:{ all -> 0x0059 }
        r2 = 0;
        r5.renderThreadHandler = r2;	 Catch:{ all -> 0x0059 }
        monitor-exit(r3);	 Catch:{ all -> 0x0059 }
        org.webrtc.ThreadUtils.awaitUninterruptibly(r4);
        r1 = r5.frameLock;
        monitor-enter(r1);
        r0 = r5.pendingFrame;	 Catch:{ all -> 0x0056 }
        if (r0 == 0) goto L_0x004f;
    L_0x0048:
        r0 = r5.pendingFrame;	 Catch:{ all -> 0x0056 }
        r0.release();	 Catch:{ all -> 0x0056 }
        r5.pendingFrame = r2;	 Catch:{ all -> 0x0056 }
    L_0x004f:
        monitor-exit(r1);	 Catch:{ all -> 0x0056 }
        r0 = "Releasing done.";
        r5.logD(r0);
        return;
    L_0x0056:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0056 }
    L_0x0058:
        throw r0;
    L_0x0059:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0059 }
        goto L_0x0058;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.release():void");
    }

    public void releaseEglSurface(Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                this.renderThreadHandler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new -$$Lambda$EglRenderer$ZLNzG80KHUk0Ad58984FOsNt9s8(this, runnable));
                return;
            }
            runnable.run();
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
            } else if (Thread.currentThread() != this.renderThreadHandler.getLooper().getThread()) {
                postToRenderThread(new -$$Lambda$EglRenderer$6uTxCXz4FQA7p26IUV3iP2Ty5gk(this, countDownLatch, frameListener));
                ThreadUtils.awaitUninterruptibly(countDownLatch);
            } else {
                throw new RuntimeException("removeFrameListener must not be called on the render thread.");
            }
        }
    }

    public void renderFrame(I420Frame i420Frame) {
        VideoFrame toVideoFrame = i420Frame.toVideoFrame();
        onFrame(toVideoFrame);
        toVideoFrame.release();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void renderFrameOnRenderThread(org.webrtc.EglRenderer r21) {
        /*
        r5 = r21;
        r1 = r5.frameLock;
        monitor-enter(r1);
        r0 = r5.pendingFrame;	 Catch:{ all -> 0x010b }
        if (r0 != 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x010b }
        return;
    L_0x000b:
        r15 = r5.pendingFrame;	 Catch:{ all -> 0x010b }
        r0 = 0;
        r5.pendingFrame = r0;	 Catch:{ all -> 0x010b }
        monitor-exit(r1);	 Catch:{ all -> 0x010b }
        r0 = r5.eglBase;
        if (r0 == 0) goto L_0x0102;
    L_0x0015:
        r0 = r0.hasSurface();
        if (r0 != 0) goto L_0x001d;
    L_0x001b:
        goto L_0x0102;
    L_0x001d:
        r4 = r5.fpsReductionLock;
        monitor-enter(r4);
        r2 = r5.minRenderPeriodNs;	 Catch:{ all -> 0x00ff }
        r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        r13 = 1;
        if (r0 != 0) goto L_0x002e;
    L_0x002c:
        r6 = 0;
        goto L_0x0058;
    L_0x002e:
        r2 = r5.minRenderPeriodNs;	 Catch:{ all -> 0x00ff }
        r0 = 0;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x0038;
    L_0x0036:
        r6 = 1;
        goto L_0x0058;
    L_0x0038:
        r2 = java.lang.System.nanoTime();	 Catch:{ all -> 0x00ff }
        r0 = r5.nextFrameTimeNs;	 Catch:{ all -> 0x00ff }
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x0048;
    L_0x0042:
        r0 = "Skipping frame rendering - fps reduction is active.";
        r5.logD(r0);	 Catch:{ all -> 0x00ff }
        goto L_0x002c;
    L_0x0048:
        r6 = r5.nextFrameTimeNs;	 Catch:{ all -> 0x00ff }
        r0 = r5.minRenderPeriodNs;	 Catch:{ all -> 0x00ff }
        r6 = r6 + r0;
        r5.nextFrameTimeNs = r6;	 Catch:{ all -> 0x00ff }
        r0 = r5.nextFrameTimeNs;	 Catch:{ all -> 0x00ff }
        r0 = java.lang.Math.max(r0, r2);	 Catch:{ all -> 0x00ff }
        r5.nextFrameTimeNs = r0;	 Catch:{ all -> 0x00ff }
        goto L_0x0036;
    L_0x0058:
        monitor-exit(r4);	 Catch:{ all -> 0x00ff }
        r11 = java.lang.System.nanoTime();
        r0 = r15.getRotatedWidth();
        r7 = (float) r0;
        r0 = r15.getRotatedHeight();
        r0 = (float) r0;
        r7 = r7 / r0;
        r1 = r5.layoutLock;
        monitor-enter(r1);
        r0 = r5.layoutAspectRatio;	 Catch:{ all -> 0x00fc }
        r4 = 0;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x0075;
    L_0x0072:
        r3 = r5.layoutAspectRatio;	 Catch:{ all -> 0x00fc }
        goto L_0x0076;
    L_0x0075:
        r3 = r7;
    L_0x0076:
        monitor-exit(r1);	 Catch:{ all -> 0x00fc }
        r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r0 <= 0) goto L_0x0081;
    L_0x007d:
        r3 = r3 / r7;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x0084;
    L_0x0081:
        r7 = r7 / r3;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x0084:
        r0 = r5.drawMatrix;
        r0.reset();
        r1 = r5.drawMatrix;
        r0 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1.preTranslate(r0, r0);
        r0 = r5.mirror;
        if (r0 == 0) goto L_0x009b;
    L_0x0094:
        r1 = r5.drawMatrix;
        r0 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r1.preScale(r0, r2);
    L_0x009b:
        r0 = r5.drawMatrix;
        r0.preScale(r3, r7);
        r1 = r5.drawMatrix;
        r0 = -1090519040; // 0xffffffffbf000000 float:-0.5 double:NaN;
        r1.preTranslate(r0, r0);
        if (r6 == 0) goto L_0x00f5;
    L_0x00a9:
        android.opengl.GLES20.glClearColor(r4, r4, r4, r4);
        r0 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        android.opengl.GLES20.glClear(r0);
        r14 = r5.frameDrawer;
        r2 = r5.drawer;
        r1 = r5.drawMatrix;
        r18 = 0;
        r19 = 0;
        r0 = r5.eglBase;
        r20 = r0.surfaceWidth();
        r0 = r5.eglBase;
        r21 = r0.surfaceHeight();
        r17 = r1;
        r16 = r2;
        r14.drawFrame(r15, r16, r17, r18, r19, r20, r21);
        r9 = java.lang.System.nanoTime();
        r0 = r5.eglBase;
        r0.swapBuffers();
        r7 = java.lang.System.nanoTime();
        r4 = r5.statisticsLock;
        monitor-enter(r4);
        r0 = r5.framesRendered;	 Catch:{ all -> 0x00f2 }
        r0 = r0 + r13;
        r5.framesRendered = r0;	 Catch:{ all -> 0x00f2 }
        r2 = r5.renderTimeNs;	 Catch:{ all -> 0x00f2 }
        r0 = r7 - r11;
        r2 = r2 + r0;
        r5.renderTimeNs = r2;	 Catch:{ all -> 0x00f2 }
        r0 = r5.renderSwapBufferTimeNs;	 Catch:{ all -> 0x00f2 }
        r7 = r7 - r9;
        r0 = r0 + r7;
        r5.renderSwapBufferTimeNs = r0;	 Catch:{ all -> 0x00f2 }
        monitor-exit(r4);	 Catch:{ all -> 0x00f2 }
        goto L_0x00f5;
    L_0x00f2:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00f2 }
    L_0x00f4:
        throw r0;
    L_0x00f5:
        r5.notifyCallbacks(r15, r6);
        r15.release();
        return;
    L_0x00fc:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00fc }
        goto L_0x00f4;
    L_0x00ff:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00ff }
        goto L_0x00f4;
    L_0x0102:
        r0 = "Dropping frame - No surface";
        r5.logD(r0);
        r15.release();
        return;
    L_0x010b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x010b }
        goto L_0x00f4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.renderFrameOnRenderThread(org.webrtc.EglRenderer):void");
    }

    private void resetStatistics(long j) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0;
            this.renderSwapBufferTimeNs = 0;
        }
    }

    public void setFpsReduction(float f) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setFpsReduction: ");
        stringBuilder.append(f);
        logD(stringBuilder.toString());
        synchronized (this.fpsReductionLock) {
            long j = this.minRenderPeriodNs;
            if (f <= 0.0f) {
                this.minRenderPeriodNs = Long.MAX_VALUE;
            } else {
                this.minRenderPeriodNs = (long) (((float) TimeUnit.SECONDS.toNanos(1)) / f);
            }
            if (this.minRenderPeriodNs != j) {
                this.nextFrameTimeNs = System.nanoTime();
            }
        }
    }

    public void setLayoutAspectRatio(float f) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setLayoutAspectRatio: ");
        stringBuilder.append(f);
        logD(stringBuilder.toString());
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f;
        }
    }

    public void setMirror(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setMirror: ");
        stringBuilder.append(z);
        logD(stringBuilder.toString());
        synchronized (this.layoutLock) {
            this.mirror = z;
        }
    }
}
