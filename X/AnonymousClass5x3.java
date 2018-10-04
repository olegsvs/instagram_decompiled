package X;

import android.view.View;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.5x3 */
public final class AnonymousClass5x3 extends AnonymousClass0VA implements AnonymousClass0QQ {
    /* renamed from: B */
    public final AnonymousClass5Cx f70247B;
    /* renamed from: C */
    public final AnonymousClass0IL f70248C;
    /* renamed from: D */
    public final int f70249D;
    /* renamed from: E */
    public boolean f70250E;
    /* renamed from: F */
    public final AnonymousClass3at f70251F;
    /* renamed from: G */
    public final ReelViewerFragment f70252G;
    /* renamed from: H */
    public final String f70253H;
    /* renamed from: I */
    public final AnonymousClass0Qf f70254I;
    /* renamed from: J */
    public final String f70255J = this.f70254I.A();
    /* renamed from: K */
    public final AnonymousClass0Cm f70256K;
    /* renamed from: L */
    private final AnonymousClass0we f70257L;

    public final void At(int i) {
    }

    public final void Bt(int i) {
    }

    public final void Kt(int i, int i2) {
    }

    public final void RGA(View view) {
    }

    public final void uy(AnonymousClass1Iw anonymousClass1Iw, AnonymousClass1Iw anonymousClass1Iw2) {
    }

    public AnonymousClass5x3(AnonymousClass0IL anonymousClass0IL, ReelViewerFragment reelViewerFragment, AnonymousClass5Cx anonymousClass5Cx, AnonymousClass3at anonymousClass3at, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Qf anonymousClass0Qf, String str, int i, String str2, String str3) {
        this.f70248C = anonymousClass0IL;
        this.f70252G = reelViewerFragment;
        this.f70247B = anonymousClass5Cx;
        this.f70251F = anonymousClass3at;
        this.f70256K = anonymousClass0Cm;
        this.f70254I = anonymousClass0Qf;
        this.f70253H = str;
        this.f70249D = i;
        this.f70257L = new AnonymousClass0we(new AnonymousClass5vI(anonymousClass5Cx), new AnonymousClass3Ng(anonymousClass0IL, reelViewerFragment, ((Double) AnonymousClass0CC.Jh.H(this.f70256K)).doubleValue()), new AnonymousClass0js[]{new AnonymousClass1RE(anonymousClass5Cx, this)});
    }

    /* renamed from: A */
    public final String m28657A(AnonymousClass14t anonymousClass14t) {
        String B = AnonymousClass3am.B(anonymousClass14t);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(B);
        stringBuilder.append(this.f70255J);
        return stringBuilder.toString();
    }

    /* renamed from: B */
    public final void m28658B() {
        this.f70257L.A();
    }

    public final void St() {
        this.f70257L.A();
    }

    public final void eCA(int i, int i2) {
        if (i2 > i && i >= 0 && i < this.f70247B.getCount()) {
            AnonymousClass0MI anonymousClass0MI = ((AnonymousClass14t) this.f70247B.getItem(i)).f14103H;
            if (!anonymousClass0MI.W()) {
                if (anonymousClass0MI.f3377J) {
                    this.f70251F.f42546M.f43311I.put(AnonymousClass3gb.REEL.f43289B, "1");
                } else {
                    for (int i3 = anonymousClass0MI.i(); i3 < anonymousClass0MI.F().size(); i3++) {
                        AnonymousClass0Pj E = anonymousClass0MI.E(i3);
                        if (E.l()) {
                            AnonymousClass3gf.B(anonymousClass0MI.getId(), E.f4134F, this.f70251F.f42546M.f43310H);
                        } else if (E.pW()) {
                            AnonymousClass3gf.C(E.f4131C, this.f70251F.f42546M.f43312J);
                        }
                    }
                }
                if (!((Boolean) AnonymousClass0CC.Kg.H(this.f70256K)).booleanValue()) {
                    anonymousClass0MI.h(anonymousClass0MI.f3380M);
                }
            }
        }
    }

    public final void gx() {
        this.f70257L.A();
    }

    public final void ly(float f, float f2, AnonymousClass1Iw anonymousClass1Iw) {
        this.f70257L.A();
    }

    public final void ys(int i, int i2) {
        AnonymousClass3Um anonymousClass3Um;
        if (i < i2) {
            anonymousClass3Um = AnonymousClass3Um.SWIPE_BACK;
        } else {
            anonymousClass3Um = AnonymousClass3Um.SWIPE_FORWARD;
        }
        AnonymousClass14t D = this.f70247B.m25974D(i2);
        if (D != null) {
            AnonymousClass0Pj C = D.C();
            if (this.f70247B.m25976F(C).f14083K == AnonymousClass3Um.TAP_EXIT) {
                this.f70247B.m25976F(C).f14083K = anonymousClass3Um;
            }
        }
    }
}
