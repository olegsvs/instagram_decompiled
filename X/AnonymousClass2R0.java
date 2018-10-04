package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.view.Surface;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2R0 */
public final class AnonymousClass2R0 implements AnonymousClass1ui {
    /* renamed from: B */
    public EGLConfig f30396B;
    /* renamed from: C */
    public EGLContext f30397C = EGL14.EGL_NO_CONTEXT;
    /* renamed from: D */
    public EGLDisplay f30398D = EGL14.EGL_NO_DISPLAY;
    /* renamed from: E */
    private final Map f30399E = new HashMap();
    /* renamed from: F */
    private AnonymousClass1uw f30400F = new AnonymousClass1uw(this);

    /* renamed from: A */
    public final AnonymousClass2R0 m15717A(int i, EGLContext eGLContext) {
        this.f30398D = EGL14.eglGetDisplay(0);
        AnonymousClass1ul.m13686B("eglGetDisplay");
        AnonymousClass0LH.H(this.f30398D != EGL14.EGL_NO_DISPLAY);
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(this.f30398D, iArr, 0, iArr, 1)) {
            this.f30396B = m15716B(i);
            this.f30397C = EGL14.eglCreateContext(this.f30398D, this.f30396B, eGLContext, new int[]{12440, 2, 12344}, 0);
            AnonymousClass1ul.m13686B("eglCreateContext");
            AnonymousClass0LH.E(this.f30397C);
            return this;
        }
        AnonymousClass1ul.m13686B("eglInitialize");
        throw new RuntimeException("unable to initialize EGL14");
    }

    /* renamed from: B */
    public final AnonymousClass2R0 m15718B(int i, AnonymousClass1ui anonymousClass1ui) {
        this.f30400F = anonymousClass1ui.qS();
        AnonymousClass2R0 A = m15717A(i, ((AnonymousClass2R0) anonymousClass1ui).f30397C);
        AnonymousClass1uw anonymousClass1uw = this.f30400F;
        if (anonymousClass1uw != null) {
            anonymousClass1uw.f24092C.add(A);
        } else {
            this.f30400F = new AnonymousClass1uw(this);
        }
        AnonymousClass1us.f24075C.m13707A(this);
        return A;
    }

    /* renamed from: B */
    private EGLConfig m15716B(int i) {
        int i2 = i;
        if (this.f30399E.containsKey(Integer.valueOf(i2))) {
            return (EGLConfig) r2.f30399E.get(Integer.valueOf(i2));
        }
        int i3 = (i & 2) != 0 ? 68 : 4;
        int i4 = (i & 4) != 0 ? 16 : 0;
        int i5 = (i & 8) != 0 ? 0 : 8;
        int[] iArr = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i5, 12325, i4, 12352, i3, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[iArr.length - 3] = AnonymousClass1ul.f24049B;
            iArr[iArr.length - 2] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(r2.f30398D, iArr, 0, eGLConfigArr, 0, eGLConfigArr.length, new int[1], 0) || eGLConfigArr[0] == null) {
            AnonymousClass1ul.m13686B("eglChooseConfig");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unable to find EGL config with flags = ");
            stringBuilder.append(i2);
            throw new RuntimeException(stringBuilder.toString());
        }
        r2.f30399E.put(Integer.valueOf(i2), eGLConfigArr[0]);
        return eGLConfigArr[0];
    }

    public final boolean BX() {
        if (cY()) {
            return this.f30397C.equals(EGL14.eglGetCurrentContext());
        }
        return false;
    }

    public final boolean cY() {
        return this.f30397C != EGL14.EGL_NO_CONTEXT;
    }

    public final AnonymousClass1uo mF(int i, int i2) {
        return new AnonymousClass2dR(this, i, i2);
    }

    public final AnonymousClass1uo nF(Surface surface) {
        return new AnonymousClass2dP(this, surface);
    }

    public final AnonymousClass1uw qS() {
        return this.f30400F;
    }

    public final void release() {
        if (this.f30398D != EGL14.EGL_NO_DISPLAY) {
            if (this.f30398D != EGL14.EGL_NO_DISPLAY) {
                EGL14.eglMakeCurrent(this.f30398D, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            EGL14.eglDestroyContext(this.f30398D, this.f30397C);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f30398D);
        }
        this.f30398D = EGL14.EGL_NO_DISPLAY;
        this.f30397C = EGL14.EGL_NO_CONTEXT;
        this.f30396B = null;
        this.f30399E.clear();
        AnonymousClass1us.f24075C.m13708B(this);
        this.f30400F = null;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1ui sSA(int i) {
        return m15717A(i, EGL14.EGL_NO_CONTEXT);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1ui tSA(int i, AnonymousClass1ui anonymousClass1ui) {
        return m15718B(i, anonymousClass1ui);
    }
}
