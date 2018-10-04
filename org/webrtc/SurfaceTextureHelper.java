package org.webrtc;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import org.webrtc.EglBase.-CC;
import org.webrtc.EglBase.Context;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;
import org.webrtc.VideoFrame.TextureBuffer.Type;

public class SurfaceTextureHelper {
    private static final String TAG = "SurfaceTextureHelper";
    private final EglBase eglBase;
    private final Handler handler;
    public boolean hasPendingTexture;
    public boolean isQuitting;
    public volatile boolean isTextureInUse;
    private OnTextureFrameAvailableListener listener;
    private final int oesTextureId;
    public OnTextureFrameAvailableListener pendingListener;
    public final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    private final YuvConverter yuvConverter;

    /* renamed from: org.webrtc.SurfaceTextureHelper$1 */
    public class C02321 implements Callable {
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ Context val$sharedContext;
        public final /* synthetic */ String val$threadName;

        public C02321(Context context, Handler handler, String str) {
            this.val$sharedContext = context;
            this.val$handler = handler;
            this.val$threadName = str;
        }

        public SurfaceTextureHelper call() {
            try {
                return new SurfaceTextureHelper(this.val$sharedContext, this.val$handler);
            } catch (Throwable e) {
                String str = SurfaceTextureHelper.TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.val$threadName);
                stringBuilder.append(" create failure");
                Logging.m29385e(str, stringBuilder.toString(), e);
                return null;
            }
        }
    }

    /* renamed from: org.webrtc.SurfaceTextureHelper$2 */
    public class C02332 implements Runnable {
        public void run() {
            String str = SurfaceTextureHelper.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Setting listener to ");
            stringBuilder.append(SurfaceTextureHelper.this.pendingListener);
            Logging.m29383d(str, stringBuilder.toString());
            SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
            surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
            SurfaceTextureHelper.this.pendingListener = null;
            if (SurfaceTextureHelper.this.hasPendingTexture) {
                SurfaceTextureHelper.updateTexImage(SurfaceTextureHelper.this);
                SurfaceTextureHelper.this.hasPendingTexture = false;
            }
        }
    }

    /* renamed from: org.webrtc.SurfaceTextureHelper$3 */
    public class C02343 implements Runnable {
        public void run() {
            SurfaceTextureHelper.this.listener = null;
            SurfaceTextureHelper.this.pendingListener = null;
        }
    }

    /* renamed from: org.webrtc.SurfaceTextureHelper$4 */
    public class C02354 implements Runnable {
        public void run() {
            SurfaceTextureHelper.this.isTextureInUse = false;
            if (SurfaceTextureHelper.this.isQuitting) {
                SurfaceTextureHelper.release(SurfaceTextureHelper.this);
            } else {
                SurfaceTextureHelper.tryDeliverTextureFrame(SurfaceTextureHelper.this);
            }
        }
    }

    /* renamed from: org.webrtc.SurfaceTextureHelper$5 */
    public class C02365 implements Runnable {
        public void run() {
            SurfaceTextureHelper.this.isQuitting = true;
            if (!SurfaceTextureHelper.this.isTextureInUse) {
                SurfaceTextureHelper.release(SurfaceTextureHelper.this);
            }
        }
    }

    public interface OnTextureFrameAvailableListener {
        void onTextureFrameAvailable(int i, float[] fArr, long j);
    }

    public SurfaceTextureHelper(Context context, Handler handler) {
        this.yuvConverter = new YuvConverter();
        this.hasPendingTexture = false;
        this.isTextureInUse = false;
        this.isQuitting = false;
        this.setListenerRunnable = new C02332();
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            this.handler = handler;
            this.eglBase = -CC.create(context, EglBase.CONFIG_PIXEL_BUFFER);
            try {
                this.eglBase.createDummyPbufferSurface();
                this.eglBase.makeCurrent();
                this.oesTextureId = GlUtil.generateTexture(36197);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.oesTextureId);
                this.surfaceTexture = surfaceTexture;
                setOnFrameAvailableListener(surfaceTexture, new -$$Lambda$SurfaceTextureHelper$7YTfC0byyd0o_zI7mNhfP12Gm0Q(), handler);
                return;
            } catch (RuntimeException e) {
                this.eglBase.release();
                handler.getLooper().quit();
                throw e;
            }
        }
        throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    public static SurfaceTextureHelper create(String str, Context context) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new C02321(context, handler, str));
    }

    public TextureBuffer createTextureBuffer(int i, int i2, Matrix matrix) {
        return new TextureBufferImpl(i, i2, Type.OES, this.oesTextureId, matrix, this.handler, this.yuvConverter, new -$$Lambda$wGlW6QRil_iYGGcXYzcYgRBDfD8());
    }

    public void dispose() {
        Logging.m29383d(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new C02365());
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public static /* synthetic */ void lambda$new$0(SurfaceTextureHelper surfaceTextureHelper, SurfaceTexture surfaceTexture) {
        surfaceTextureHelper.hasPendingTexture = true;
        tryDeliverTextureFrame(surfaceTextureHelper);
    }

    public static void release(SurfaceTextureHelper surfaceTextureHelper) {
        if (surfaceTextureHelper.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (surfaceTextureHelper.isTextureInUse || !surfaceTextureHelper.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        } else {
            surfaceTextureHelper.yuvConverter.release();
            GLES20.glDeleteTextures(1, new int[]{surfaceTextureHelper.oesTextureId}, 0);
            surfaceTextureHelper.surfaceTexture.release();
            surfaceTextureHelper.eglBase.release();
            surfaceTextureHelper.handler.getLooper().quit();
        }
    }

    public void returnTextureFrame() {
        this.handler.post(new C02354());
    }

    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        if (VERSION.SDK_INT >= 21) {
            surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
        } else {
            surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener);
        }
    }

    public void startListening(OnTextureFrameAvailableListener onTextureFrameAvailableListener) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = onTextureFrameAvailableListener;
            this.handler.post(this.setListenerRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public void stopListening() {
        Logging.m29383d(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new C02343());
    }

    public I420Buffer textureToYuv(TextureBuffer textureBuffer) {
        return (I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new -$$Lambda$SurfaceTextureHelper$QCHEWwLo2quFxn2HxtfyJ7yZoh0(this, textureBuffer));
    }

    public static void tryDeliverTextureFrame(SurfaceTextureHelper surfaceTextureHelper) {
        if (surfaceTextureHelper.handler.getLooper().getThread() == Thread.currentThread()) {
            if (!(surfaceTextureHelper.isQuitting || !surfaceTextureHelper.hasPendingTexture || surfaceTextureHelper.isTextureInUse)) {
                if (surfaceTextureHelper.listener != null) {
                    surfaceTextureHelper.isTextureInUse = true;
                    surfaceTextureHelper.hasPendingTexture = false;
                    updateTexImage(surfaceTextureHelper);
                    float[] fArr = new float[16];
                    surfaceTextureHelper.surfaceTexture.getTransformMatrix(fArr);
                    surfaceTextureHelper.listener.onTextureFrameAvailable(surfaceTextureHelper.oesTextureId, fArr, surfaceTextureHelper.surfaceTexture.getTimestamp());
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("Wrong thread.");
    }

    public static void updateTexImage(SurfaceTextureHelper surfaceTextureHelper) {
        synchronized (EglBase.lock) {
            surfaceTextureHelper.surfaceTexture.updateTexImage();
        }
    }
}
