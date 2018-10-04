package X;

import android.util.Log;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: X.263 */
public final class AnonymousClass263 {
    /* renamed from: B */
    public EGL10 f25900B;
    /* renamed from: C */
    public EGLConfig f25901C;
    /* renamed from: D */
    public EGLContext f25902D;
    /* renamed from: E */
    public EGLDisplay f25903E;
    /* renamed from: F */
    public EGLSurface f25904F;
    /* renamed from: G */
    public final WeakReference f25905G;

    public AnonymousClass263(WeakReference weakReference) {
        this.f25905G = weakReference;
    }

    /* renamed from: A */
    public final boolean m14408A() {
        if (this.f25900B == null) {
            throw new RuntimeException("egl not initialized");
        } else if (this.f25903E == null) {
            throw new RuntimeException("eglDisplay not initialized");
        } else if (this.f25901C != null) {
            AnonymousClass263.m14405B(this);
            AnonymousClass2V0 anonymousClass2V0 = (AnonymousClass2V0) this.f25905G.get();
            if (anonymousClass2V0 != null) {
                EGLSurface eGLSurface = null;
                try {
                    eGLSurface = this.f25900B.eglCreateWindowSurface(this.f25903E, this.f25901C, anonymousClass2V0.getSurfaceTexture(), null);
                } catch (Throwable e) {
                    Log.e(AnonymousClass2V0.f30977M, "eglCreateWindowSurface", e);
                }
                this.f25904F = eGLSurface;
            } else {
                this.f25904F = null;
            }
            EGLSurface eGLSurface2 = this.f25904F;
            if (eGLSurface2 != null) {
                if (eGLSurface2 != EGL10.EGL_NO_SURFACE) {
                    EGL10 egl10 = this.f25900B;
                    EGLDisplay eGLDisplay = this.f25903E;
                    eGLSurface2 = this.f25904F;
                    if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.f25902D)) {
                        return true;
                    }
                    Log.w("EGLHelper", AnonymousClass263.m14406C("eglMakeCurrent", this.f25900B.eglGetError()));
                    return false;
                }
            }
            if (this.f25900B.eglGetError() == 12299) {
                Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
            }
            return false;
        } else {
            throw new RuntimeException("mEglConfig not initialized");
        }
    }

    /* renamed from: B */
    public final void m14409B() {
        if (this.f25902D != null) {
            if (((AnonymousClass2V0) this.f25905G.get()) != null) {
                EGL10 egl10 = this.f25900B;
                EGLDisplay eGLDisplay = this.f25903E;
                EGLContext eGLContext = this.f25902D;
                if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("display:");
                    stringBuilder.append(eGLDisplay);
                    stringBuilder.append(" context: ");
                    stringBuilder.append(eGLContext);
                    Log.e("DefaultContextFactory", stringBuilder.toString());
                    throw new RuntimeException(AnonymousClass263.m14406C("eglDestroyContex", egl10.eglGetError()));
                }
            }
            this.f25902D = null;
        }
        EGLDisplay eGLDisplay2 = this.f25903E;
        if (eGLDisplay2 != null) {
            this.f25900B.eglTerminate(eGLDisplay2);
            this.f25903E = null;
        }
    }

    /* renamed from: B */
    public static void m14405B(AnonymousClass263 anonymousClass263) {
        EGLSurface eGLSurface = anonymousClass263.f25904F;
        if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
            EGL10 egl10 = anonymousClass263.f25900B;
            EGLDisplay eGLDisplay = anonymousClass263.f25903E;
            eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            if (((AnonymousClass2V0) anonymousClass263.f25905G.get()) != null) {
                anonymousClass263.f25900B.eglDestroySurface(anonymousClass263.f25903E, anonymousClass263.f25904F);
            }
            anonymousClass263.f25904F = null;
        }
    }

    /* renamed from: C */
    public final int m14410C() {
        return !this.f25900B.eglSwapBuffers(this.f25903E, this.f25904F) ? this.f25900B.eglGetError() : 12288;
    }

    /* renamed from: C */
    public static String m14406C(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" failed: ");
        stringBuilder.append(AnonymousClass263.m14407D(i));
        return stringBuilder.toString();
    }

    /* renamed from: D */
    public static String m14407D(int i) {
        switch (i) {
            case 12288:
                return "EGL_SUCCESS";
            case 12289:
                return "EGL_NOT_INITIALIZED";
            case 12290:
                return "EGL_BAD_ACCESS";
            case 12291:
                return "EGL_BAD_ALLOC";
            case 12292:
                return "EGL_BAD_ATTRIBUTE";
            case 12293:
                return "EGL_BAD_CONFIG";
            case 12294:
                return "EGL_BAD_CONTEXT";
            case 12295:
                return "EGL_BAD_CURRENT_SURFACE";
            case 12296:
                return "EGL_BAD_DISPLAY";
            case 12297:
                return "EGL_BAD_MATCH";
            case 12298:
                return "EGL_BAD_NATIVE_PIXMAP";
            case 12299:
                return "EGL_BAD_NATIVE_WINDOW";
            case 12300:
                return "EGL_BAD_PARAMETER";
            case 12301:
                return "EGL_BAD_SURFACE";
            case 12302:
                return "EGL_CONTEXT_LOST";
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("0x");
                stringBuilder.append(Integer.toHexString(i));
                return stringBuilder.toString();
        }
    }
}
