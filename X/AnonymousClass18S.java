package X;

import android.content.Context;

/* renamed from: X.18S */
public final class AnonymousClass18S implements AnonymousClass0G2 {
    /* renamed from: B */
    private final Context f14973B = AnonymousClass0EV.f1977B;
    /* renamed from: C */
    private final AnonymousClass0Tw f14974C;
    /* renamed from: D */
    private final AnonymousClass0Ks f14975D;
    /* renamed from: E */
    private final AnonymousClass0Cm f14976E;

    public final void onUserSessionWillEnd(boolean z) {
    }

    private AnonymousClass18S(AnonymousClass0Cm anonymousClass0Cm) {
        this.f14976E = anonymousClass0Cm;
        this.f14974C = AnonymousClass0Tw.m4598C(anonymousClass0Cm);
        AnonymousClass0Kq B = AnonymousClass0Kq.m2860B();
        B.f3132F = "DirectStoryPreloader";
        this.f14975D = B.m2861A();
    }

    /* renamed from: A */
    public final void m9610A() {
        int i = 0;
        for (AnonymousClass0Vw anonymousClass0Vw : this.f14974C.m4629a(false)) {
            AnonymousClass0W7 L = anonymousClass0Vw.m4940L();
            if (L != null && L.m5037m()) {
                if (L.f5921y != null && L.f5921y.m5209B() && (((Boolean) AnonymousClass0CC.SG.m846H(this.f14976E)).booleanValue() || ((Boolean) AnonymousClass0E6.m1318D(AnonymousClass0CC.ea, this.f14976E)).booleanValue())) {
                    AnonymousClass1iG.m12655B(this.f14976E, new AnonymousClass1b9(this), anonymousClass0Vw.m4943O(), L.f5885O);
                } else {
                    AnonymousClass18S.m9609C(this, L);
                }
                i++;
                if (i >= 4) {
                    return;
                }
            }
        }
    }

    /* renamed from: B */
    public static AnonymousClass18S m9608B(AnonymousClass0Cm anonymousClass0Cm) {
        Class cls = AnonymousClass18S.class;
        AnonymousClass18S anonymousClass18S = (AnonymousClass18S) anonymousClass0Cm.m1036A(cls);
        if (anonymousClass18S != null) {
            return anonymousClass18S;
        }
        Object anonymousClass18S2 = new AnonymousClass18S(anonymousClass0Cm);
        anonymousClass0Cm.m1039D(cls, anonymousClass18S2);
        return anonymousClass18S2;
    }

    /* renamed from: B */
    public final void m9611B(AnonymousClass0Vw anonymousClass0Vw, AnonymousClass0Iw anonymousClass0Iw, Integer num) {
        String W;
        int i;
        if (((Boolean) AnonymousClass0E6.m1318D(AnonymousClass0CC.eI, this.f14976E)).booleanValue()) {
            W = anonymousClass0Vw.m4951W();
        } else {
            W = anonymousClass0Vw.m4950V();
        }
        AnonymousClass0Cn anonymousClass0Cn = this.f14976E;
        String O = anonymousClass0Vw.m4943O();
        if (num == null) {
            i = 100;
        } else {
            i = num.intValue();
        }
        Integer.valueOf(i);
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        AnonymousClass0Pt M = anonymousClass0Pt.m3943L("direct_v2/visual_threads/%s/", O).m3944M(AnonymousClass1FU.class);
        if (W != null) {
            M.m3935D("cursor", W);
        }
        AnonymousClass0GA H = AnonymousClass1EX.m10205B(M, true, false).m3939H();
        H.f2849B = new AnonymousClass1b1(this.f14976E, anonymousClass0Vw.m4934F(), anonymousClass0Iw, W, true, null);
        AnonymousClass0Ix.m2384D(H);
    }

    /* renamed from: C */
    public final void m9612C(AnonymousClass0i5 anonymousClass0i5, String str) {
        if (anonymousClass0i5 != null && AnonymousClass0MN.m3162F(this.f14973B)) {
            AnonymousClass0vB.m8301C(new AnonymousClass0vA(anonymousClass0i5).m8299C(5120), this.f14976E);
        } else if (str != null) {
            AnonymousClass0GG.m1763B(this.f14975D, new AnonymousClass1bF(this, str), 163952849);
        }
    }

    /* renamed from: C */
    public static void m9609C(AnonymousClass18S anonymousClass18S, AnonymousClass0W7 anonymousClass0W7) {
        if (anonymousClass0W7.m5037m()) {
            AnonymousClass0X1 anonymousClass0X1 = anonymousClass0W7.f5921y;
            if (anonymousClass0X1 != null) {
                AnonymousClass0P7 anonymousClass0P7 = anonymousClass0X1.f6085E;
                if (anonymousClass0P7 != null) {
                    anonymousClass18S.m9612C(anonymousClass0P7.wY() ? anonymousClass0P7.OA() : null, anonymousClass0P7.m3794x(anonymousClass18S.f14973B));
                }
            }
        }
    }
}
