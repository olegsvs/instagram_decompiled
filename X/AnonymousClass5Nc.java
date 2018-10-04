package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import com.facebook.C0164R;

/* renamed from: X.5Nc */
public final class AnonymousClass5Nc {
    /* renamed from: B */
    public boolean f62788B;
    /* renamed from: C */
    public AnonymousClass1vZ f62789C;
    /* renamed from: D */
    public AnonymousClass5Nb f62790D;
    /* renamed from: E */
    public AnonymousClass5Ne f62791E;
    /* renamed from: F */
    public final AnonymousClass5Nh f62792F = new AnonymousClass5Nh();
    /* renamed from: G */
    public SurfaceTexture f62793G;
    /* renamed from: H */
    public int f62794H;
    /* renamed from: I */
    public final AnonymousClass5Ng f62795I;
    /* renamed from: J */
    public final float[] f62796J = new float[16];
    /* renamed from: K */
    private AnonymousClass5Ni f62797K;

    public AnonymousClass5Nc(AnonymousClass5Ng anonymousClass5Ng) {
        String B;
        this.f62795I = anonymousClass5Ng;
        if (this.f62792F.f62820B) {
            B = AnonymousClass26l.B(AnonymousClass0EV.f1977B.getResources(), C0164R.raw.iglive_skin_fragment);
        } else {
            B = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        }
        this.f62791E = new AnonymousClass5Ne(B);
        AnonymousClass5Ni anonymousClass5Ni = new AnonymousClass5Ni(36197);
        this.f62797K = anonymousClass5Ni;
        this.f62794H = anonymousClass5Ni.f62823B;
        this.f62793G = new SurfaceTexture(this.f62794H);
    }

    /* renamed from: A */
    public final void m26373A(AnonymousClass2Rg anonymousClass2Rg, int i, int i2, boolean z) {
        if (this.f62793G.getTimestamp() != 0) {
            anonymousClass2Rg.C();
            GLES20.glViewport((anonymousClass2Rg.B() - i) / 2, (anonymousClass2Rg.A() - i2) / 2, i, i2);
            if (this.f62788B) {
                GLES20.glClear(16640);
            } else {
                this.f62793G.getTransformMatrix(this.f62796J);
                AnonymousClass5Nb anonymousClass5Nb = this.f62790D;
                if (anonymousClass5Nb != null) {
                    this.f62789C.B(anonymousClass5Nb.f62786E, AnonymousClass1va.f24236B, z);
                } else {
                    this.f62791E.m26375A(this.f62794H, this.f62796J, z);
                }
            }
            long timestamp = this.f62793G.getTimestamp();
            if (timestamp < 0) {
                timestamp += 1152921504606846976L;
            }
            timestamp = this.f62795I.m26376A(timestamp);
            AnonymousClass1vX anonymousClass1vX = anonymousClass2Rg.f24231C;
            EGLExt.eglPresentationTimeANDROID(anonymousClass1vX.f24228C, anonymousClass2Rg.f24230B, timestamp);
            anonymousClass2Rg.D();
        }
    }

    /* renamed from: B */
    public final void m26374B() {
        AnonymousClass5Ni anonymousClass5Ni = this.f62797K;
        if (anonymousClass5Ni != null) {
            anonymousClass5Ni.m26377A();
            this.f62797K = null;
        }
        SurfaceTexture surfaceTexture = this.f62793G;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f62793G = null;
        }
        AnonymousClass5Ne anonymousClass5Ne = this.f62791E;
        if (anonymousClass5Ne != null) {
            if (anonymousClass5Ne.f62811B != null) {
                anonymousClass5Ne.f62811B = null;
            }
            this.f62791E = null;
        }
        AnonymousClass1vZ anonymousClass1vZ = this.f62789C;
        if (anonymousClass1vZ != null) {
            anonymousClass1vZ.C(false);
            this.f62789C = null;
        }
        AnonymousClass5Nb anonymousClass5Nb = this.f62790D;
        if (anonymousClass5Nb != null) {
            int[] iArr = new int[1];
            int i = anonymousClass5Nb.f62786E;
            if (i > 0) {
                iArr[0] = i;
                GLES20.glDeleteTextures(1, iArr, 0);
            }
            i = anonymousClass5Nb.f62784C;
            if (i > 0) {
                iArr[0] = i;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
            }
            i = anonymousClass5Nb.f62783B;
            if (i > 0) {
                iArr[0] = i;
                GLES20.glDeleteRenderbuffers(1, iArr, 0);
            }
            this.f62790D = null;
        }
    }
}
