package X;

import java.util.List;

/* renamed from: X.5L5 */
public final class AnonymousClass5L5 extends AnonymousClass1Pm {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Id f62359B;
    /* renamed from: C */
    private List f62360C;

    public AnonymousClass5L5(AnonymousClass0Id anonymousClass0Id, List list) {
        this.f62359B = anonymousClass0Id;
        super(anonymousClass0Id);
        this.f62360C = list;
    }

    /* renamed from: A */
    public final void m26265A(AnonymousClass0Pn anonymousClass0Pn) {
        int I = AnonymousClass0cQ.I(this, -122296401);
        for (AnonymousClass0Ci D : this.f62360C) {
            AnonymousClass0x5.C(this.f62359B.f2809P).D(D);
        }
        if (AnonymousClass0Id.F(this.f62359B)) {
            AnonymousClass0OR.D(this.f62359B.f2798E, new AnonymousClass5L4(this), -1244747516);
        }
        AnonymousClass0cQ.H(this, 1968218883, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1347409442);
        m26265A((AnonymousClass0Pn) obj);
        AnonymousClass0cQ.H(this, 979897658, I);
    }
}
