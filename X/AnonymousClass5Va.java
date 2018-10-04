package X;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: X.5Va */
public final class AnonymousClass5Va implements OnScrollListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4cn f65398B;

    public AnonymousClass5Va(AnonymousClass4cn anonymousClass4cn) {
        this.f65398B = anonymousClass4cn;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0cQ.H(this, 1354055052, AnonymousClass0cQ.I(this, 126424086));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, -2000981511);
        if (this.f65398B.f55750K.m25013B()) {
            absListView.requestFocus();
        }
        AnonymousClass0cQ.H(this, -1770038015, I);
    }
}
