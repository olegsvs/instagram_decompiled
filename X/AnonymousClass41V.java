package X;

import android.support.v7.widget.RecyclerView;

/* renamed from: X.41V */
public final class AnonymousClass41V extends AnonymousClass3bH {
    /* renamed from: B */
    public final AnonymousClass0rr f48477B = ((AnonymousClass0rr) this.f48478C.getLayoutManager());
    /* renamed from: C */
    public final RecyclerView f48478C;
    /* renamed from: D */
    private AnonymousClass0ou f48479D;

    /* renamed from: F */
    public final void mo4987F(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj) {
    }

    public AnonymousClass41V(RecyclerView recyclerView, AnonymousClass3bG anonymousClass3bG) {
        super(anonymousClass3bG);
        recyclerView.getContext();
        this.f48478C = recyclerView;
        this.f48479D = (AnonymousClass0ou) recyclerView.getAdapter();
    }

    /* renamed from: A */
    public final void mo4985A(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj) {
        AnonymousClass41U anonymousClass41U = new AnonymousClass41U(this);
        int cA = this.f48477B.cA();
        for (int aA = this.f48477B.aA(); aA <= cA; aA++) {
            AnonymousClass0oo a = this.f48478C.a(aA);
            if (a != null && (a instanceof AnonymousClass10H)) {
                ((AnonymousClass10H) a).xTA();
            }
        }
        AnonymousClass10I B = m22093B(anonymousClass0MI);
        if (B != null) {
            B.eV();
        }
    }

    /* renamed from: B */
    private AnonymousClass10H m22093B(AnonymousClass0MI anonymousClass0MI) {
        int qV = this.f48479D.qV(anonymousClass0MI);
        Object obj = (qV < this.f48477B.aA() || qV > this.f48477B.cA()) ? null : 1;
        if (obj != null) {
            AnonymousClass0oo a = this.f48478C.a(qV);
            if (a != null && (a instanceof AnonymousClass10H)) {
                return (AnonymousClass10H) a;
            }
        }
        return null;
    }

    /* renamed from: B */
    public final void mo4993B(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj) {
        super.mo4993B(anonymousClass0MI, anonymousClass0Pj);
        AnonymousClass10I B = m22093B(anonymousClass0MI);
        if (B != null) {
            B.xTA();
        }
    }

    /* renamed from: C */
    public final AnonymousClass3Uy mo4986C(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj) {
        if (AnonymousClass0LQ.B(this.f42592B, anonymousClass0MI)) {
            this.f42592B = null;
            return AnonymousClass3Uy.m19746C();
        }
        AnonymousClass0oo a = this.f48478C.a(this.f48479D.qV(anonymousClass0MI));
        if (a != null) {
            if (a instanceof AnonymousClass10H) {
                return AnonymousClass3Uy.m19747D(((AnonymousClass10H) a).iI());
            }
        }
        return AnonymousClass3Uy.m19746C();
    }

    /* renamed from: G */
    public final void mo4988G(AnonymousClass0MI anonymousClass0MI) {
        this.f48479D.notifyDataSetChanged();
        int qV = this.f48479D.qV(anonymousClass0MI);
        Object obj = (qV < this.f48477B.ZA() || qV > this.f48477B.bA()) ? null : 1;
        if (obj == null) {
            this.f48478C.FA(qV);
        }
    }
}
