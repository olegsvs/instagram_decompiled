package X;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: X.4ld */
public final class AnonymousClass4ld implements OnFocusChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4lj f56962B;

    public AnonymousClass4ld(AnonymousClass4lj anonymousClass4lj) {
        this.f56962B = anonymousClass4lj;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f56962B.f56969C.removeMessages(2);
        } else {
            this.f56962B.f56969C.sendEmptyMessageDelayed(2, 50);
        }
    }
}
