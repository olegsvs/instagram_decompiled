package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.facebook.C0164R;

/* renamed from: X.2dc */
public final class AnonymousClass2dc extends AnonymousClass2S9 implements AnonymousClass2S8 {
    /* renamed from: B */
    public AnonymousClass1xp f31855B = AnonymousClass1xp.DEFAULT;
    /* renamed from: C */
    public boolean f31856C = true;
    /* renamed from: D */
    public AnonymousClass1ur f31857D;
    /* renamed from: E */
    public boolean f31858E;
    /* renamed from: F */
    private final float f31859F;
    /* renamed from: G */
    private final float[] f31860G;
    /* renamed from: H */
    private final float f31861H;
    /* renamed from: I */
    private final float f31862I;
    /* renamed from: J */
    private final int[] f31863J = new int[1];
    /* renamed from: K */
    private AnonymousClass1y4 f31864K;
    /* renamed from: L */
    private final AnonymousClass1ux f31865L = new AnonymousClass1ux(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}, 2);
    /* renamed from: M */
    private AnonymousClass2R4 f31866M;
    /* renamed from: N */
    private int f31867N = 0;
    /* renamed from: O */
    private int f31868O = 0;
    /* renamed from: P */
    private AnonymousClass1un f31869P;
    /* renamed from: Q */
    private final int[] f31870Q = new int[4];

    public final boolean JX() {
        return true;
    }

    public AnonymousClass2dc(float f, float f2, float f3) {
        float[] fArr = new float[16];
        this.f31860G = fArr;
        Matrix.setIdentityM(fArr, 0);
        this.f31858E = true;
        this.f31862I = f;
        this.f31861H = f2;
        this.f31859F = f3;
        AnonymousClass1um anonymousClass1um = new AnonymousClass1um(4);
        anonymousClass1um.f24051C = 5;
        this.f31869P = anonymousClass1um.m13691B("aPosition", this.f31865L).m13691B("aTextureCoord", new AnonymousClass1ux(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}, 2)).m13690A();
    }

    /* renamed from: B */
    private AnonymousClass1uq m16620B() {
        if (this.f31866M == null) {
            return null;
        }
        if (this.f31857D == null || this.f31858E) {
            AnonymousClass1ur anonymousClass1ur = this.f31857D;
            if (anonymousClass1ur != null) {
                anonymousClass1ur.m13705A();
                this.f31857D = null;
            }
            this.f31857D = this.f31866M.m15720A(C0164R.raw.copy_vs, C0164R.raw.smooth_mp_fs, this.f31856C);
            this.f31864K = new AnonymousClass1y4((int) (((float) this.f31868O) * 0.25f), (int) (((float) this.f31867N) * 0.25f));
            this.f31858E = false;
        }
        return this.f31857D.m13706B();
    }

    public final void NCA(int i, int i2) {
        if (this.f31868O != i || this.f31867N != i2) {
            this.f31868O = i;
            this.f31867N = i2;
            this.f31858E = true;
        }
    }

    public final void OCA(AnonymousClass2R4 anonymousClass2R4) {
        this.f31866M = anonymousClass2R4;
    }

    public final void RCA() {
        AnonymousClass1ur anonymousClass1ur = this.f31857D;
        if (anonymousClass1ur != null) {
            anonymousClass1ur.m13705A();
            this.f31857D = null;
        }
        this.f31866M = null;
    }

    public final boolean sj(AnonymousClass2SA anonymousClass2SA, long j) {
        if (this.f31856C != anonymousClass2SA.m15768B()) {
            this.f31856C = anonymousClass2SA.m15768B();
            this.f31858E = true;
        }
        AnonymousClass1uq B = m16620B();
        if (B == null) {
            return false;
        }
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        GLES20.glGetIntegerv(36006, this.f31863J, 0);
        GLES20.glGetIntegerv(2978, this.f31870Q, 0);
        B.m13696C("uSurfaceTransformMatrix", this.f31860G).m13696C("uVideoTransformMatrix", this.f31860G).m13696C("uSceneTransformMatrix", this.f31860G);
        GLES20.glUniform2f(AnonymousClass1uq.m13692B(B, "duv"), 1.5f / ((float) this.f31868O), 1.5f / ((float) this.f31867N));
        AnonymousClass1uq D = B.m13697D("sTexture", anonymousClass2SA.m15767A());
        GLES20.glUniform1i(AnonymousClass1uq.m13692B(D, "passIndex"), 0);
        GLES20.glUniform1i(AnonymousClass1uq.m13692B(D, "swizzleBGRA"), this.f31855B == AnonymousClass1xp.BGRA ? 1 : 0);
        D.m13695B("minDetail", this.f31862I).m13695B("maxDetail", this.f31861H).m13695B("detailWeight", this.f31859F);
        AnonymousClass1y4 anonymousClass1y4 = this.f31864K;
        GLES20.glBindFramebuffer(36160, anonymousClass1y4.f24840C[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, (anonymousClass1y4.f24839B ? anonymousClass1y4.f24842E[0] : anonymousClass1y4.f24842E[1]).f24087C, 0);
        GLES20.glViewport(0, 0, anonymousClass1y4.f24843F, anonymousClass1y4.f24841D);
        B.m13694A(this.f31869P);
        AnonymousClass1y4 anonymousClass1y42 = this.f31864K;
        anonymousClass1y42.f24839B ^= 1;
        GLES20.glUniform1i(AnonymousClass1uq.m13692B(B, "passIndex"), 2);
        String str = "pass1";
        anonymousClass1y42 = this.f31864K;
        B.m13697D(str, anonymousClass1y42.f24839B ? anonymousClass1y42.f24842E[1] : anonymousClass1y42.f24842E[0]);
        B.m13696C("uSurfaceTransformMatrix", anonymousClass2SA.f30532D).m13696C("uVideoTransformMatrix", anonymousClass2SA.f30534F).m13696C("uSceneTransformMatrix", anonymousClass2SA.f30531C);
        GLES20.glBindFramebuffer(36160, this.f31863J[0]);
        int[] iArr = this.f31870Q;
        GLES20.glViewport(0, 0, iArr[2], iArr[3]);
        B.m13694A(this.f31869P);
        AnonymousClass1ul.m13687C("SmoothingRenderer::onDrawFrame");
        return true;
    }
}
