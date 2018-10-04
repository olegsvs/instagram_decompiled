package X;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: X.4XK */
public final class AnonymousClass4XK implements OnScrollListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Uc f54964B;

    public AnonymousClass4XK(AnonymousClass5Uc anonymousClass5Uc) {
        this.f54964B = anonymousClass5Uc;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0cQ.H(this, 1446639497, AnonymousClass0cQ.I(this, -741081372));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, -575119584);
        if (i == 1) {
            this.f54964B.f64988Q.clearFocus();
            this.f54964B.f64988Q.B();
        }
        AnonymousClass0cQ.H(this, 1878369011, I);
    }
}
