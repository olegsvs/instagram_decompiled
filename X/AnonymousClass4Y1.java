package X;

import android.graphics.Matrix;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.4Y1 */
public final class AnonymousClass4Y1 implements AnonymousClass1wk {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Y2 f55047B;
    /* renamed from: C */
    private final AnonymousClass4Y7 f55048C;
    /* renamed from: D */
    private final Matrix f55049D;

    public AnonymousClass4Y1(AnonymousClass4Y2 anonymousClass4Y2, Matrix matrix, AnonymousClass4Y7 anonymousClass4Y7, float f, float f2) {
        this.f55047B = anonymousClass4Y2;
        this.f55049D = new Matrix(matrix);
        AnonymousClass4Y7 anonymousClass4Y72 = new AnonymousClass4Y7();
        this.f55048C = anonymousClass4Y72;
        anonymousClass4Y72.m24468C(anonymousClass4Y7);
        anonymousClass4Y2.f55061M.B(this);
        m24447B(anonymousClass4Y2.f55054F, f, this.f55048C.f55082B);
        m24447B(anonymousClass4Y2.f55055G, f2, this.f55048C.f55083C);
        anonymousClass4Y2.f55060L.L(1.0d);
        if (this.f55048C.f55084D != 1.0f) {
            anonymousClass4Y2.f55060L.P(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
            anonymousClass4Y2.f55060L.N((double) this.f55048C.f55084D);
        }
    }

    /* renamed from: B */
    private void m24447B(AnonymousClass0cN anonymousClass0cN, float f, float f2) {
        anonymousClass0cN.P(Math.abs(f) > 100.0f ? (double) f : StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        anonymousClass0cN.O(f2 != 0.0f ? this.f55047B.f55053E : this.f55047B.f55056H).M(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, false).N((double) f2);
    }

    /* renamed from: C */
    private void m24448C(AnonymousClass0cN anonymousClass0cN, float f) {
        if (f != 0.0f) {
            anonymousClass0cN.O(this.f55047B.f55053E);
            double E = anonymousClass0cN.E();
            double d = (double) f;
            Double.isNaN(d);
            E += d;
            if (E != anonymousClass0cN.f7106D) {
                anonymousClass0cN.N(E);
            }
        } else if (f == 0.0f && anonymousClass0cN.f7111I != this.f55047B.f55056H) {
            anonymousClass0cN.O(this.f55047B.f55056H);
        }
    }

    public final void Jd(AnonymousClass0e7 anonymousClass0e7) {
        this.f55047B.f55052D.set(this.f55049D);
        this.f55047B.f55062N.m24468C(this.f55048C);
        this.f55047B.f55062N.f55082B = (float) this.f55047B.f55054F.E();
        this.f55047B.f55062N.f55083C = (float) this.f55047B.f55055G.E();
        this.f55047B.f55062N.f55084D = (float) this.f55047B.f55060L.E();
        this.f55047B.f55062N.m24466A(this.f55047B.f55052D);
        AnonymousClass4Y2 anonymousClass4Y2 = this.f55047B;
        anonymousClass4Y2.setImageMatrix(anonymousClass4Y2.f55052D);
        if (anonymousClass0e7.f7581C) {
            this.f55047B.m24456C(true);
            this.f55047B.f55061M.G(this);
        }
    }

    public final void Oe(AnonymousClass0e7 anonymousClass0e7) {
        AnonymousClass4Y2 anonymousClass4Y2 = this.f55047B;
        anonymousClass4Y2.m24455B(anonymousClass4Y2.f55052D, this.f55047B.f55062N);
        m24448C(this.f55047B.f55054F, this.f55047B.f55062N.f55082B);
        m24448C(this.f55047B.f55055G, this.f55047B.f55062N.f55083C);
    }
}
