package X;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: X.3Nc */
public final class AnonymousClass3Nc implements OnGlobalLayoutListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3Nd f40653B;

    public AnonymousClass3Nc(AnonymousClass3Nd anonymousClass3Nd) {
        this.f40653B = anonymousClass3Nd;
    }

    public final void onGlobalLayout() {
        this.f40653B.f40659G.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f40653B.f40659G.getLocationOnScreen(this.f40653B.f40661I);
        AnonymousClass3Nd anonymousClass3Nd = this.f40653B;
        anonymousClass3Nd.f40660H = anonymousClass3Nd.f40661I[1];
    }
}
