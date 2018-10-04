package X;

import com.instagram.ui.widget.wheelview.WheelView;

/* renamed from: X.1Pd */
public final class AnonymousClass1Pd implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ WheelView f18188B;
    /* renamed from: C */
    public final /* synthetic */ int f18189C;

    public AnonymousClass1Pd(WheelView wheelView, int i) {
        this.f18188B = wheelView;
        this.f18189C = i;
    }

    public final void run() {
        WheelView wheelView = this.f18188B;
        wheelView.smoothScrollTo(0, this.f18189C * wheelView.f44036E);
    }
}
