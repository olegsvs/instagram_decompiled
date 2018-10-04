package X;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: X.16P */
public final class AnonymousClass16P extends AnonymousClass16O {
    public AnonymousClass16P(AnonymousClass0la anonymousClass0la) {
        super(anonymousClass0la);
    }

    /* renamed from: A */
    public final int mo2145A(View view) {
        return this.f14534C.m7336X(view) + ((AnonymousClass12d) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: B */
    public final int mo2146B(View view) {
        AnonymousClass12d anonymousClass12d = (AnonymousClass12d) view.getLayoutParams();
        return (AnonymousClass0la.m7305F(view) + anonymousClass12d.leftMargin) + anonymousClass12d.rightMargin;
    }

    /* renamed from: C */
    public final int mo2147C(View view) {
        AnonymousClass12d anonymousClass12d = (AnonymousClass12d) view.getLayoutParams();
        return (AnonymousClass0la.m7304E(view) + anonymousClass12d.topMargin) + anonymousClass12d.bottomMargin;
    }

    /* renamed from: D */
    public final int mo2148D(View view) {
        return this.f14534C.m7335W(view) - ((AnonymousClass12d) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: E */
    public final int mo2149E() {
        return this.f14534C.f9556O;
    }

    /* renamed from: F */
    public final int mo2150F() {
        return this.f14534C.f9556O - this.f14534C.mo2564g();
    }

    /* renamed from: G */
    public final int mo2151G() {
        return this.f14534C.mo2564g();
    }

    /* renamed from: H */
    public final int mo2152H() {
        return this.f14534C.f9557P;
    }

    /* renamed from: I */
    public final int mo2153I() {
        return this.f14534C.f9546E;
    }

    /* renamed from: J */
    public final int mo2154J() {
        return this.f14534C.mo2563f();
    }

    /* renamed from: K */
    public final int mo2155K() {
        return (this.f14534C.f9556O - this.f14534C.mo2563f()) - this.f14534C.mo2564g();
    }

    /* renamed from: M */
    public final int mo2156M(View view) {
        this.f14534C.m7348j(view, true, this.f14535D);
        return this.f14535D.right;
    }

    /* renamed from: N */
    public final int mo2157N(View view) {
        this.f14534C.m7348j(view, true, this.f14535D);
        return this.f14535D.left;
    }

    /* renamed from: O */
    public final void mo2158O(int i) {
        RecyclerView recyclerView = this.f14534C.f9552K;
        if (recyclerView != null) {
            int E = recyclerView.f8809G.m8926E();
            for (int i2 = 0; i2 < E; i2++) {
                recyclerView.f8809G.m8925D(i2).offsetLeftAndRight(i);
            }
        }
    }
}
