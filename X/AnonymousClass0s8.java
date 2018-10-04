package X;

import android.support.v7.widget.RecyclerView;

/* renamed from: X.0s8 */
public final class AnonymousClass0s8 extends AnonymousClass0Gv {
    /* renamed from: B */
    public final AnonymousClass0s9 f11339B;
    /* renamed from: C */
    public final RecyclerView f11340C;
    /* renamed from: D */
    public final AnonymousClass0we f11341D;
    /* renamed from: E */
    public final AnonymousClass0Cm f11342E;
    /* renamed from: F */
    private final AnonymousClass0F8 f11343F = new AnonymousClass3N9(this);

    public AnonymousClass0s8(AnonymousClass0Cm anonymousClass0Cm, RecyclerView recyclerView, AnonymousClass0nJ anonymousClass0nJ, AnonymousClass0s9 anonymousClass0s9) {
        this.f11342E = anonymousClass0Cm;
        this.f11340C = recyclerView;
        this.f11339B = anonymousClass0s9;
        AnonymousClass1Vn anonymousClass1Vn = new AnonymousClass1Vn(recyclerView, anonymousClass0nJ, this.f11339B);
        this.f11341D = new AnonymousClass0we(new AnonymousClass3NA(this, anonymousClass0nJ), this.f11340C, anonymousClass1Vn);
        AnonymousClass0F4.f2058E.m1504A(AnonymousClass0l1.class, this.f11343F);
    }

    /* renamed from: B */
    public final void mo1902B(RecyclerView recyclerView, int i, int i2) {
        this.f11341D.m8433A();
    }

    /* renamed from: C */
    public final void m8060C() {
        this.f11339B.ei();
        AnonymousClass0F4.f2058E.m1507D(AnonymousClass0l1.class, this.f11343F);
    }
}
