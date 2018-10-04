package X;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: X.3Av */
public final class AnonymousClass3Av implements OnAttachStateChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3B0 f38601B;

    public AnonymousClass3Av(AnonymousClass3B0 anonymousClass3B0) {
        this.f38601B = anonymousClass3B0;
    }

    public final void onViewAttachedToWindow(View view) {
        AnonymousClass3B0.m18840E(this.f38601B, view);
    }

    public final void onViewDetachedFromWindow(View view) {
        AnonymousClass3B0.m18837B(this.f38601B, view);
    }
}
