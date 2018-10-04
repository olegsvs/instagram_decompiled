package X;

import android.graphics.Color;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4J8 */
public final class AnonymousClass4J8 implements AnonymousClass0QP {
    /* renamed from: H */
    private static final AnonymousClass0e5 f52616H = AnonymousClass0e5.C(70.0d, 5.0d);
    /* renamed from: B */
    public AnonymousClass27f f52617B;
    /* renamed from: C */
    public final AnonymousClass27f f52618C;
    /* renamed from: D */
    private final List f52619D = new ArrayList();
    /* renamed from: E */
    private final AnonymousClass5Se f52620E;
    /* renamed from: F */
    private AnonymousClass27f f52621F;
    /* renamed from: G */
    private final AnonymousClass0cN f52622G;

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public AnonymousClass4J8(AnonymousClass27f anonymousClass27f, List list, AnonymousClass5Se anonymousClass5Se) {
        this.f52618C = anonymousClass27f;
        this.f52620E = anonymousClass5Se;
        for (AnonymousClass27f anonymousClass27f2 : list) {
            if (anonymousClass27f2 != null) {
                this.f52619D.add(anonymousClass27f2);
            } else {
                throw new IllegalArgumentException("AssetPickerMode cannot be null");
            }
        }
        this.f52619D.add(this.f52618C);
        AnonymousClass27f anonymousClass27f3 = this.f52618C;
        this.f52617B = anonymousClass27f3;
        this.f52621F = anonymousClass27f3;
        AnonymousClass0cN A = AnonymousClass0e6.B().C().O(f52616H).A(this);
        A.f7108F = true;
        this.f52622G = A;
    }

    /* renamed from: A */
    public final boolean m23817A() {
        boolean mU = this.f52617B.mU();
        if (!mU) {
            AnonymousClass27f anonymousClass27f = this.f52617B;
            AnonymousClass27f anonymousClass27f2 = this.f52618C;
            if (anonymousClass27f != anonymousClass27f2) {
                m23818B(anonymousClass27f2, true);
                return true;
            }
        }
        return mU;
    }

    /* renamed from: B */
    public final void m23818B(AnonymousClass27f anonymousClass27f, boolean z) {
        AnonymousClass27f anonymousClass27f2 = this.f52617B;
        if (anonymousClass27f != anonymousClass27f2) {
            this.f52621F = anonymousClass27f2;
            this.f52617B = anonymousClass27f;
            this.f52621F.close();
            AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
            anonymousClass0Iz.K(this.f52621F, 0, null);
            this.f52617B.vGA();
            anonymousClass0Iz.H(this.f52617B);
            float f = 1.0f;
            if (((float) this.f52622G.f7106D) == 1.0f) {
                f = 0.0f;
            }
            if (z) {
                this.f52622G.N((double) f);
                return;
            }
            this.f52622G.L((double) f);
            DBA(this.f52622G);
        }
    }

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
        for (AnonymousClass27f anonymousClass27f : this.f52619D) {
            if (anonymousClass27f == this.f52621F || anonymousClass27f == this.f52617B) {
                for (View view : anonymousClass27f.bI()) {
                    view.setVisibility(0);
                    view.setLayerType(2, null);
                }
            }
        }
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        for (AnonymousClass27f bI : this.f52619D) {
            for (View layerType : bI.bI()) {
                layerType.setLayerType(0, null);
            }
        }
        for (AnonymousClass27f anonymousClass27f : this.f52619D) {
            if (anonymousClass27f == this.f52621F) {
                for (View layerType2 : anonymousClass27f.bI()) {
                    layerType2.setVisibility(4);
                }
                anonymousClass27f.hd();
            } else if (anonymousClass27f == this.f52617B) {
                for (View visibility : anonymousClass27f.bI()) {
                    visibility.setVisibility(0);
                }
                anonymousClass27f.id();
            }
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float f = (float) this.f52622G.f7106D;
        float E = AnonymousClass0nB.E((float) this.f52622G.E(), f == 1.0f ? 0.0f : 1.0f, f, 0.0f, 1.0f, true);
        float f2 = 1.0f - E;
        for (AnonymousClass27f anonymousClass27f : this.f52619D) {
            if (anonymousClass27f == this.f52621F) {
                for (View alpha : anonymousClass27f.bI()) {
                    alpha.setAlpha(f2);
                }
            } else if (anonymousClass27f == this.f52617B) {
                for (View alpha2 : anonymousClass27f.bI()) {
                    alpha2.setAlpha(E);
                }
                AnonymousClass5Se anonymousClass5Se = this.f52620E;
                AnonymousClass27f anonymousClass27f2 = this.f52617B;
                AnonymousClass27f anonymousClass27f3 = this.f52621F;
                if (!(anonymousClass5Se.f64055M == null || anonymousClass27f3.qI() == anonymousClass27f2.qI())) {
                    AnonymousClass3B0 anonymousClass3B0 = anonymousClass5Se.f64055M;
                    int qI = anonymousClass27f3.qI();
                    int qI2 = anonymousClass27f2.qI();
                    f = 1.0f - E;
                    anonymousClass3B0.f38622L = Color.argb((int) ((((float) Color.alpha(qI)) * f) + (((float) Color.alpha(qI2)) * E)), (int) ((((float) Color.red(qI)) * f) + (((float) Color.red(qI2)) * E)), (int) ((((float) Color.green(qI)) * f) + (((float) Color.green(qI2)) * E)), (int) ((((float) Color.blue(qI)) * f) + (((float) Color.blue(qI2)) * E)));
                    anonymousClass3B0.invalidateSelf();
                }
            }
        }
    }
}
