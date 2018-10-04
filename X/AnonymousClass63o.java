package X;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: X.63o */
public final class AnonymousClass63o implements OnScrollListener {
    /* renamed from: B */
    public final AnonymousClass1bW f71376B;
    /* renamed from: C */
    public final AnonymousClass0Ie f71377C;
    /* renamed from: D */
    private final AnonymousClass0we f71378D;

    public AnonymousClass63o(AnonymousClass0Ie anonymousClass0Ie, AnonymousClass1bW anonymousClass1bW, AnonymousClass0SW anonymousClass0SW) {
        this.f71377C = anonymousClass0Ie;
        this.f71376B = anonymousClass1bW;
        AnonymousClass63p anonymousClass63p = new AnonymousClass63p(anonymousClass1bW, anonymousClass0SW);
        this.f71378D = new AnonymousClass0we(this.f71377C, this.f71376B, new AnonymousClass0js[]{anonymousClass63p});
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -959765139);
        if (this.f71377C.isResumed()) {
            this.f71378D.A();
            AnonymousClass0cQ.H(this, -1211463605, I);
            return;
        }
        AnonymousClass0cQ.H(this, 536090993, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AnonymousClass0cQ.H(this, 584342288, AnonymousClass0cQ.I(this, -1151535636));
    }
}
