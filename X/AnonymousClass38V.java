package X;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: X.38V */
public final class AnonymousClass38V implements OnGlobalLayoutListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass44c f38233B;

    public AnonymousClass38V(AnonymousClass44c anonymousClass44c) {
        this.f38233B = anonymousClass44c;
    }

    public final void onGlobalLayout() {
        this.f38233B.f49466R = true;
        AnonymousClass44c.m22691D(this.f38233B);
        this.f38233B.f49470V.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
