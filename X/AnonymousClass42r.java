package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.instagram.filterkit.filter.OESCopyFilter;

/* renamed from: X.42r */
public final class AnonymousClass42r implements AnonymousClass3oX {
    /* renamed from: B */
    public volatile boolean f48875B;
    /* renamed from: C */
    public SurfaceTexture f48876C;
    /* renamed from: D */
    public AnonymousClass1uu f48877D;
    /* renamed from: E */
    public final AnonymousClass3Oy f48878E;
    /* renamed from: F */
    public boolean f48879F = true;
    /* renamed from: G */
    private AnonymousClass28b f48880G;
    /* renamed from: H */
    private AnonymousClass2Vh f48881H;
    /* renamed from: I */
    private final OESCopyFilter f48882I;
    /* renamed from: J */
    private final float[] f48883J;

    public final void QLA(int i, int i2) {
    }

    public AnonymousClass42r(AnonymousClass28b anonymousClass28b) {
        this.f48880G = anonymousClass28b;
        this.f48875B = false;
        this.f48882I = new OESCopyFilter();
        this.f48883J = new float[16];
        this.f48878E = new AnonymousClass3Oy();
    }

    public AnonymousClass42r(AnonymousClass28b anonymousClass28b, boolean z) {
        this.f48880G = anonymousClass28b;
        this.f48875B = z;
        this.f48882I = new OESCopyFilter();
        this.f48883J = new float[16];
        this.f48878E = new AnonymousClass3Oy();
    }

    public final void iH() {
        this.f48881H.cleanup();
        this.f48876C.release();
    }

    public final void tV(int i, int i2) {
        AnonymousClass1ut anonymousClass1ut = new AnonymousClass1ut();
        anonymousClass1ut.f24084I = 36197;
        AnonymousClass1uu A = anonymousClass1ut.m13709A();
        this.f48877D = A;
        this.f48881H = AnonymousClass28m.m14599B(A.f24087C, i, i2);
        this.f48876C = new SurfaceTexture(this.f48877D.f24087C);
        this.f48882I.m22723A();
    }

    public final void zJA(AnonymousClass2Vi anonymousClass2Vi) {
        GLES20.glClear(16640);
        this.f48876C.updateTexImage();
        this.f48876C.getTransformMatrix(this.f48883J);
        if (this.f48879F) {
            GLES20.glBindFramebuffer(36160, anonymousClass2Vi.QM());
            if (!this.f48875B) {
                this.f48882I.f49568I = this.f48878E.f40800B;
            }
            this.f48882I.f50118B = this.f48883J;
            this.f48882I.yJA(this.f48880G.f26570D, this.f48881H, anonymousClass2Vi);
        }
    }
}
