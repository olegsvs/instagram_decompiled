package X;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: X.0ll */
public final class AnonymousClass0ll implements OnGlobalLayoutListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0hj f9602B;

    public AnonymousClass0ll(AnonymousClass0hj anonymousClass0hj) {
        this.f9602B = anonymousClass0hj;
    }

    public final void onGlobalLayout() {
        if (this.f9602B.f8527G != null) {
            this.f9602B.f8527G.getLocationOnScreen(this.f9602B.f8525E);
            AnonymousClass0hj anonymousClass0hj = this.f9602B;
            int height = anonymousClass0hj.f8527G.getHeight();
            int i = this.f9602B.f8525E[1] + height;
            int i2 = anonymousClass0hj.f8524D;
            if (i2 == -1) {
                anonymousClass0hj.f8524D = i;
                anonymousClass0hj.f8522B = i;
                anonymousClass0hj.f8523C = height;
                if (!anonymousClass0hj.f8526F.isEmpty()) {
                    AnonymousClass0hj.m6812B(anonymousClass0hj, 0);
                    return;
                }
                return;
            }
            if (!(anonymousClass0hj.f8522B == i || anonymousClass0hj.f8523C == height)) {
                if (i2 < i) {
                    anonymousClass0hj.f8524D = i;
                }
                int max = Math.max(anonymousClass0hj.f8524D - i, 0);
                if (!anonymousClass0hj.f8526F.isEmpty()) {
                    AnonymousClass0hj.m6812B(anonymousClass0hj, max);
                }
            }
            anonymousClass0hj.f8522B = i;
            anonymousClass0hj.f8523C = height;
        }
    }
}
