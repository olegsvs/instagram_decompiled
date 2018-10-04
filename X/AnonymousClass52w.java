package X;

import android.support.v7.widget.RecyclerView;

/* renamed from: X.52w */
public final class AnonymousClass52w extends AnonymousClass0Gv {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5ZC f59534B;

    public AnonymousClass52w(AnonymousClass5ZC anonymousClass5ZC) {
        this.f59534B = anonymousClass5ZC;
    }

    /* renamed from: A */
    public final void m25627A(RecyclerView recyclerView, int i) {
        super.A(recyclerView, i);
        for (int size = this.f59534B.f66333C.size() - 1; size >= 0; size--) {
            ((AnonymousClass52z) this.f59534B.f66333C.get(size)).vy(this.f59534B, i);
        }
    }

    /* renamed from: B */
    public final void m25628B(RecyclerView recyclerView, int i, int i2) {
        super.B(recyclerView, i, i2);
        AnonymousClass0la layoutManager = this.f59534B.f66332B.getLayoutManager();
        if (layoutManager instanceof AnonymousClass0rr) {
            AnonymousClass0rr anonymousClass0rr = (AnonymousClass0rr) layoutManager;
            int aA = anonymousClass0rr.aA();
            int cA = (anonymousClass0rr.cA() - aA) + 1;
            int count = this.f59534B.getCount();
            for (int size = this.f59534B.f66333C.size() - 1; size >= 0; size--) {
                ((AnonymousClass52z) this.f59534B.f66333C.get(size)).py(this.f59534B, aA, cA, count);
            }
        }
    }
}
