package X;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: X.4t2 */
public final class AnonymousClass4t2 implements OnScrollListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4tE f58139B;

    public AnonymousClass4t2(AnonymousClass4tE anonymousClass4tE) {
        this.f58139B = anonymousClass4tE;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, 2095253921);
        if (!this.f58139B.f58159C.FX()) {
            AnonymousClass4tE.m25283C(this.f58139B, absListView, i, i2, i3);
        } else if (AnonymousClass0iI.E(absListView)) {
            this.f58139B.f58159C.Tc();
            AnonymousClass4tE.m25283C(this.f58139B, absListView, i, i2, i3);
            if (this.f58139B.f58159C.f19172B.f58078D == AnonymousClass0nS.GRID) {
                AnonymousClass4nC anonymousClass4nC = this.f58139B.f58161E;
                if (anonymousClass4nC != null) {
                    anonymousClass4nC.m25078D();
                }
            }
        }
        AnonymousClass0cQ.H(this, -953467479, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, -886016211);
        if (!this.f58139B.f58159C.FX()) {
            this.f58139B.f58170N.onScrollStateChanged(absListView, i);
            if (this.f58139B.f58159C.f19172B.f58078D == AnonymousClass0nS.FEED) {
                this.f58139B.f58167K.onScrollStateChanged(absListView, i);
            }
            if (i == 0) {
                this.f58139B.f58161E.f57292B.sendEmptyMessageDelayed(0, 200);
            }
        }
        AnonymousClass0cQ.H(this, -1510872180, I);
    }
}
