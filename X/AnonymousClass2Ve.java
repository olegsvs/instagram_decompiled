package X;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.view.Surface;

/* renamed from: X.2Ve */
public final class AnonymousClass2Ve implements AnonymousClass1ui {
    /* renamed from: B */
    private final AnonymousClass2R0 f31068B = new AnonymousClass2R0();
    /* renamed from: C */
    private EGLContext f31069C;

    public AnonymousClass2Ve(EGLContext eGLContext) {
        this.f31069C = eGLContext;
    }

    public final boolean BX() {
        return this.f31068B.BX();
    }

    public final boolean cY() {
        return this.f31068B.cY();
    }

    public final AnonymousClass1uo mF(int i, int i2) {
        return this.f31068B.mF(i, i2);
    }

    public final AnonymousClass1uo nF(Surface surface) {
        return this.f31068B.nF(surface);
    }

    public final AnonymousClass1uw qS() {
        return this.f31068B.qS();
    }

    public final void release() {
        this.f31068B.release();
    }

    public final AnonymousClass1ui sSA(int i) {
        EGLContext eGLContext = this.f31069C;
        if (eGLContext != null) {
            return this.f31068B.m15717A(i, eGLContext);
        }
        return this.f31068B.m15717A(i, EGL14.EGL_NO_CONTEXT);
    }

    public final AnonymousClass1ui tSA(int i, AnonymousClass1ui anonymousClass1ui) {
        return this.f31068B.m15718B(i, anonymousClass1ui);
    }
}
