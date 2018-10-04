package org.webrtc;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build.VERSION;
import android.view.Surface;

public class EglBase14 implements EglBase {
    public static final int CURRENT_SDK_VERSION = VERSION.SDK_INT;
    private static final int EGLExt_SDK_VERSION = 18;
    private static final String TAG = "EglBase14";
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;

    public class Context implements org.webrtc.EglBase.Context {
        public final EGLContext egl14Context;

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }

        public long getNativeEglContext() {
            if (EglBase14.CURRENT_SDK_VERSION >= 21) {
                return this.egl14Context.getNativeHandle();
            }
            return (long) this.egl14Context.getHandle();
        }

        public static boolean isEgl14Context(org.webrtc.EglBase.Context context) {
            return context instanceof Context;
        }
    }

    public EglBase14(Context context, int[] iArr) {
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        this.eglConfig = getEglConfig(eglDisplay, iArr);
        this.eglContext = createEglContext(context, this.eglDisplay, this.eglConfig);
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL14.EGL_NO_DISPLAY || this.eglContext == EGL14.EGL_NO_CONTEXT || this.eglConfig == null) {
            throw new RuntimeException("This object has been released");
        }
    }

    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    private static EGLContext createEglContext(Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        if (context != null) {
            if (context.egl14Context == EGL14.EGL_NO_CONTEXT) {
                throw new RuntimeException("Invalid sharedContext");
            }
        }
        int[] iArr = new int[]{12440, 2, 12344};
        EGLContext eGLContext = context == null ? EGL14.EGL_NO_CONTEXT : context.egl14Context;
        synchronized (EglBase.lock) {
            eGLContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        }
        if (eGLContext != EGL14.EGL_NO_CONTEXT) {
            return eGLContext;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to create EGL context: 0x");
        stringBuilder.append(Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException(stringBuilder.toString());
    }

    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to create pixel buffer surface with size ");
                stringBuilder.append(i);
                stringBuilder.append("x");
                stringBuilder.append(i2);
                stringBuilder.append(": 0x");
                stringBuilder.append(Integer.toHexString(EGL14.eglGetError()));
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
        createSurfaceInternal(surface);
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof Surface)) {
            if (!(obj instanceof SurfaceTexture)) {
                throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
            }
        }
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344}, 0);
            this.eglSurface = eglCreateWindowSurface;
            if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to create window surface: 0x");
                stringBuilder.append(Integer.toHexString(EGL14.eglGetError()));
                throw new RuntimeException(stringBuilder.toString());
            }
            return;
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    public void detachCurrent() {
        synchronized (EglBase.lock) {
            if (EGL14.eglMakeCurrent(this.eglDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("eglDetachCurrent failed: 0x");
                stringBuilder.append(Integer.toHexString(EGL14.eglGetError()));
                throw new RuntimeException(stringBuilder.toString());
            }
        }
    }

    public Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, eGLConfigArr.length, iArr2, 0)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eglChooseConfig failed: 0x");
            stringBuilder.append(Integer.toHexString(EGL14.eglGetError()));
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

    private static EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to initialize EGL14: 0x");
            stringBuilder.append(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to get EGL14 display: 0x");
        stringBuilder.append(Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException(stringBuilder.toString());
    }

    public boolean hasSurface() {
        return this.eglSurface != EGL14.EGL_NO_SURFACE;
    }

    public static boolean isEGL14Supported() {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SDK version: ");
        stringBuilder.append(CURRENT_SDK_VERSION);
        stringBuilder.append(". isEGL14Supported: ");
        stringBuilder.append(CURRENT_SDK_VERSION >= 18);
        Logging.m29383d(str, stringBuilder.toString());
        if (CURRENT_SDK_VERSION >= 18) {
            return true;
        }
        return false;
    }

    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                if (EGL14.eglMakeCurrent(this.eglDisplay, this.eglSurface, this.eglSurface, this.eglContext)) {
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("eglMakeCurrent failed: 0x");
                    stringBuilder.append(Integer.toHexString(EGL14.eglGetError()));
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
        EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(this.eglDisplay);
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    public void releaseSurface() {
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglDisplay, this.eglSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    public void swapBuffers(long j) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j);
                EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }
}
