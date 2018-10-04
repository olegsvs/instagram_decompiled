package X;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: X.5Ea */
public final class AnonymousClass5Ea implements OnScrollListener {
    /* renamed from: B */
    private AnonymousClass5EZ f61489B;
    /* renamed from: C */
    private int f61490C = 0;

    public AnonymousClass5Ea(AnonymousClass5EZ anonymousClass5EZ) {
        this.f61489B = anonymousClass5EZ;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -2104528179);
        if (this.f61490C == i3) {
            if (((i3 - i2) - i <= 3 ? 1 : null) != null) {
                this.f61489B.PZ();
            }
        }
        this.f61490C = i3;
        this.f61489B.QFA();
        AnonymousClass0cQ.H(this, -289709865, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, 970454266);
        this.f61489B.hV();
        AnonymousClass0cQ.H(this, -242274397, I);
    }
}
