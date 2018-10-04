package X;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: X.2IH */
public final class AnonymousClass2IH implements OnScrollListener {
    /* renamed from: B */
    private final AnonymousClass2IG f28651B;

    public AnonymousClass2IH(AnonymousClass2IG anonymousClass2IG) {
        this.f28651B = anonymousClass2IG;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, 1104793984);
        for (int i4 = i; i4 < i + i2; i4++) {
            this.f28651B.SKA(i4);
        }
        AnonymousClass0cQ.H(this, -1398148205, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AnonymousClass0cQ.H(this, -1782159601, AnonymousClass0cQ.I(this, 2056270163));
    }
}
