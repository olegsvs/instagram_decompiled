package org.webrtc;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class EglBase10 implements EglBase {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private final EGL10 egl = ((EGL10) EGLContext.getEGL());
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;

    /* renamed from: org.webrtc.EglBase10$1FakeSurfaceHolder */
    public class AnonymousClass1FakeSurfaceHolder implements SurfaceHolder {
        private final Surface surface;

        public void addCallback(Callback callback) {
        }

        public Rect getSurfaceFrame() {
            return null;
        }

        public boolean isCreating() {
            return false;
        }

        public Canvas lockCanvas() {
            return null;
        }

        public Canvas lockCanvas(Rect rect) {
            return null;
        }

        public void removeCallback(Callback callback) {
        }

        public void setFixedSize(int i, int i2) {
        }

        public void setFormat(int i) {
        }

        public void setKeepScreenOn(boolean z) {
        }

        public void setSizeFromLayout() {
        }

        public void setType(int i) {
        }

        public void unlockCanvasAndPost(Canvas canvas) {
        }

        public AnonymousClass1FakeSurfaceHolder(Surface surface) {
            this.surface = surface;
        }

        public Surface getSurface() {
            return this.surface;
        }
    }

    public class Context implements org.webrtc.EglBase.Context {
        public final EGLContext eglContext;

        public long getNativeEglContext() {
            return 0;
        }

        public Context(EGLContext eGLContext) {
            this.eglContext = eGLContext;
        }
    }

    public EglBase10(Context context, int[] iArr) {
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        this.eglConfig = getEglConfig(eglDisplay, iArr);
        this.eglContext = createEglContext(context, this.eglDisplay, this.eglConfig);
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL10.EGL_NO_DISPLAY || this.eglContext == EGL10.EGL_NO_CONTEXT || this.eglConfig == null) {
            throw new RuntimeException("This object has been released");
        }
    }

    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    private EGLContext createEglContext(Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        if (context != null) {
            if (context.eglContext == EGL10.EGL_NO_CONTEXT) {
                throw new RuntimeException("Invalid sharedContext");
            }
        }
        int[] iArr = new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344};
        EGLContext eGLContext = context == null ? EGL10.EGL_NO_CONTEXT : context.eglContext;
        synchronized (EglBase.lock) {
            eGLContext = this.egl.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
        if (eGLContext != EGL10.EGL_NO_CONTEXT) {
            return eGLContext;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to create EGL context: 0x");
        stringBuilder.append(Integer.toHexString(this.egl.eglGetError()));
        throw new RuntimeException(stringBuilder.toString());
    }

    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            EGLSurface eglCreatePbufferSurface = this.egl.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344});
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to create pixel buffer surface with size ");
                stringBuilder.append(i);
                stringBuilder.append("x");
                stringBuilder.append(i2);
                stringBuilder.append(": 0x");
                stringBuilder.append(Integer.toHexString(this.egl.eglGetError()));
                throw new RuntimeException(stringBuilder.toString());
            }
            return;
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    public void createSurface(Surface surface) {
        createSurfaceInternal(new AnonymousClass1FakeSurfaceHolder(surface));
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof SurfaceHolder)) {
            if (!(obj instanceof SurfaceTexture)) {
                throw new IllegalStateException("Input must be either a SurfaceHolder or SurfaceTexture");
            }
        }
        checkIsNotReleased();
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            EGLSurface eglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344});
            this.eglSurface = eglCreateWindowSurface;
            if (eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to create window surface: 0x");
                stringBuilder.append(Integer.toHexString(this.egl.eglGetError()));
                throw new RuntimeException(stringBuilder.toString());
            }
            return;
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    public void detachCurrent() {
        synchronized (EglBase.lock) {
            EGL10 egl10 = this.egl;
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("eglDetachCurrent failed: 0x");
                stringBuilder.append(Integer.toHexString(this.egl.eglGetError()));
                throw new RuntimeException(stringBuilder.toString());
            }
        }
    }

    public org.webrtc.EglBase.Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    private EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!this.egl.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, eGLConfigArr.length, iArr2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eglChooseConfig failed: 0x");
            stringBuilder.append(Integer.toHexString(this.egl.eglGetError()));
            throw new RuntimeException(stringBuilder.toString());
        } else if (iArr2[0] > 0) {
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (eGLConfig != null) {
                return eGLConfig;
            }
            throw new RuntimeException("eglChooseConfig returned null");
        } else {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
    }

    private EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.egl.eglInitialize(eglGetDisplay, new int[2])) {
                return eglGetDisplay;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to initialize EGL10: 0x");
            stringBuilder.append(Integer.toHexString(this.egl.eglGetError()));
            throw new RuntimeException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to get EGL10 display: 0x");
        stringBuilder.append(Integer.toHexString(this.egl.eglGetError()));
        throw new RuntimeException(stringBuilder.toString());
    }

    public boolean hasSurface() {
        return this.eglSurface != EGL10.EGL_NO_SURFACE;
    }

    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                if (this.egl.eglMakeCurrent(this.eglDisplay, this.eglSurface, this.eglSurface, this.eglContext)) {
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("eglMakeCurrent failed: 0x");
                    stringBuilder.append(Integer.toHexString(this.egl.eglGetError()));
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }

    public void release() {
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
        this.egl.eglTerminate(this.eglDisplay);
        this.eglContext = EGL10.EGL_NO_CONTEXT;
        this.eglDisplay = EGL10.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    public void releaseSurface() {
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            this.egl.eglDestroySurface(this.eglDisplay, this.eglSurface);
            this.eglSurface = EGL10.EGL_NO_SURFACE;
        }
    }

    public int surfaceHeight() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    public int surfaceWidth() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    public void swapBuffers(long j) {
        swapBuffers();
    }
}
