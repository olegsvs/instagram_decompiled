package X;

import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

/* renamed from: X.4cY */
public final class AnonymousClass4cY extends AnonymousClass0Gv {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5VY f55709B;

    public AnonymousClass4cY(AnonymousClass5VY anonymousClass5VY) {
        this.f55709B = anonymousClass5VY;
    }

    /* renamed from: A */
    public final void m24584A(RecyclerView recyclerView, int i) {
        super.A(recyclerView, i);
        if (i == 0) {
            this.f55709B.f65383p.m24686A();
        }
    }

    /* renamed from: B */
    public final void m24585B(RecyclerView recyclerView, int i, int i2) {
        super.B(recyclerView, i, i2);
        if (i2 < 0) {
            AnonymousClass5VY.F(this.f55709B);
        }
        AnonymousClass5VY.G(this.f55709B);
        this.f55709B.f65383p.f56062B = i2 >= 0 ? AnonymousClass4ex.UP : AnonymousClass4ex.DOWN;
        if (AnonymousClass0EF.I(this.f55709B.getContext())) {
            int i3 = 0;
            if (AnonymousClass0mE.I(recyclerView)) {
                if (recyclerView.canScrollVertically(-1)) {
                    i3 = Math.max(0, recyclerView.computeVerticalScrollRange() - (recyclerView.computeVerticalScrollOffset() + recyclerView.computeVerticalScrollExtent()));
                }
            }
            AnonymousClass4jN anonymousClass4jN = this.f55709B.f65359R.f65401B.f55745F;
            LinearLayout linearLayout = anonymousClass4jN.f56581M;
            if (linearLayout != null) {
                int i4;
                if (i3 != 0) {
                    if (!anonymousClass4jN.f56595a || !anonymousClass4jN.f56598d) {
                        i4 = 1;
                        linearLayout.setShowDividers(i4);
                    }
                }
                i4 = 0;
                linearLayout.setShowDividers(i4);
            }
        }
    }
}
