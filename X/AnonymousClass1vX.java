package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import org.webrtc.EglBase;

/* renamed from: X.1vX */
public final class AnonymousClass1vX {
    /* renamed from: E */
    private static final String f24226E = "com.facebook.live.livestreaming.opengl.EglCore";
    /* renamed from: B */
    public EGLConfig f24227B;
    /* renamed from: C */
    public EGLDisplay f24228C;
    /* renamed from: D */
    private EGLContext f24229D;

    public AnonymousClass1vX() {
        this(null, 0);
    }

    public AnonymousClass1vX(EGLContext eGLContext, int i) {
        this.f24228C = EGL14.EGL_NO_DISPLAY;
        this.f24229D = EGL14.EGL_NO_CONTEXT;
        this.f24227B = null;
        if (this.f24228C == EGL14.EGL_NO_DISPLAY) {
            if (eGLContext == null) {
                eGLContext = EGL14.EGL_NO_CONTEXT;
            }
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.f24228C = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(this.f24228C, iArr, 0, iArr, 1)) {
                    if ((i & 2) != 0) {
                        EGLConfig C = m13775C(i, 3);
                        if (C != null) {
                            EGLContext eglCreateContext = EGL14.eglCreateContext(this.f24228C, C, eGLContext, new int[]{12440, 3, 12344}, 0);
                            if (EGL14.eglGetError() == 12288) {
                                this.f24227B = C;
                                this.f24229D = eglCreateContext;
                            }
                        }
                    }
                    if (this.f24229D == EGL14.EGL_NO_CONTEXT) {
                        EGLConfig C2 = m13775C(i, 2);
                        if (C2 != null) {
                            EGLContext eglCreateContext2 = EGL14.eglCreateContext(this.f24228C, C2, eGLContext, new int[]{12440, 2, 12344}, 0);
                            AnonymousClass1vX.m13774B("eglCreateContext");
                            this.f24227B = C2;
                            this.f24229D = eglCreateContext2;
                        } else {
                            throw new RuntimeException("Unable to find a suitable EGLConfig");
                        }
                    }
                    int[] iArr2 = new int[1];
                    EGL14.eglQueryContext(this.f24228C, this.f24229D, 12440, iArr2, 0);
                    Integer.valueOf(iArr2[0]);
                    return;
                }
                this.f24228C = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
            throw new RuntimeException("unable to get EGL14 display");
        }
        throw new RuntimeException("EGL already set up");
    }

    /* renamed from: A */
    public final void m13776A(EGLSurface eGLSurface) {
        EGLDisplay eGLDisplay = this.f24228C;
        EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
        if (!EGL14.eglMakeCurrent(this.f24228C, eGLSurface, eGLSurface, this.f24229D)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: B */
    public final void m13777B() {
        if (this.f24228C != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglMakeCurrent(this.f24228C, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f24228C, this.f24229D);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f24228C);
        }
        this.f24228C = EGL14.EGL_NO_DISPLAY;
        this.f24229D = EGL14.EGL_NO_CONTEXT;
        this.f24227B = null;
    }

    /* renamed from: B */
    public static void m13774B(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(": EGL error: 0x");
            stringBuilder.append(Integer.toHexString(eglGetError));
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* renamed from: C */
    private EGLConfig m13775C(int i, int i2) {
        int i3 = i2;
        int i4 = i2 >= 3 ? 68 : 4;
        int[] iArr = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i4, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[iArr.length - 3] = EglBase.EGL_RECORDABLE_ANDROID;
            iArr[iArr.length - 2] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.f24228C, iArr, 0, eGLConfigArr, 0, eGLConfigArr.length, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        AnonymousClass0Dc.R(f24226E, "unable to find RGB8888 /%d EGLConfig", new Object[]{Integer.valueOf(i3)});
        return null;
    }

    /* renamed from: C */
    public final void m13778C(EGLSurface eGLSurface) {
        EGL14.eglMakeCurrent(this.f24228C, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, this.f24229D);
        EGL14.eglDestroySurface(this.f24228C, eGLSurface);
    }

    public final void finalize() {
        try {
            if (this.f24228C != EGL14.EGL_NO_DISPLAY) {
                AnonymousClass0Dc.P(f24226E, "WARNING: EglCore was not explicitly released -- state may be leaked");
                m13777B();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }
}
