package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build.VERSION;

/* renamed from: X.2R2 */
public abstract class AnonymousClass2R2 implements AnonymousClass1uo {
    /* renamed from: B */
    public AnonymousClass2R0 f30405B;
    /* renamed from: C */
    public EGLSurface f30406C;
    /* renamed from: D */
    private boolean f30407D;

    public AnonymousClass2R2(AnonymousClass2R0 anonymousClass2R0) {
        this(anonymousClass2R0, 0);
    }

    public AnonymousClass2R2(AnonymousClass2R0 anonymousClass2R0, int i) {
        this.f30406C = EGL14.EGL_NO_SURFACE;
        this.f30405B = anonymousClass2R0;
        this.f30407D = anonymousClass2R0 == null;
        if (anonymousClass2R0 == null) {
            AnonymousClass2R0 anonymousClass2R02 = new AnonymousClass2R0();
            this.f30405B = anonymousClass2R02;
            anonymousClass2R02.m15717A(i, EGL14.EGL_NO_CONTEXT);
        }
    }

    public final void cQA(long j) {
        if (VERSION.SDK_INT > 18) {
            AnonymousClass2R0 anonymousClass2R0 = this.f30405B;
            EGLExt.eglPresentationTimeANDROID(anonymousClass2R0.f30398D, this.f30406C, j);
        }
    }

    public final void makeCurrent() {
        EGLDisplay eGLDisplay = this.f30405B.f30398D;
        EGLSurface eGLSurface = this.f30406C;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f30405B.f30397C)) {
            AnonymousClass1ul.m13686B("eglMakeCurrent");
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void release() {
        if (this.f30406C != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.f30405B.f30398D, this.f30406C);
        }
        this.f30406C = EGL14.EGL_NO_SURFACE;
        if (this.f30407D) {
            this.f30405B.release();
        }
    }

    public final void swapBuffers() {
        EGL14.eglSwapBuffers(this.f30405B.f30398D, this.f30406C);
    }
}
