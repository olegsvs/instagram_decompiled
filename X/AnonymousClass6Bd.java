package X;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: X.6Bd */
public final class AnonymousClass6Bd implements OnAttachStateChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6Bh f72782B;
    /* renamed from: C */
    public final /* synthetic */ Runnable f72783C;

    public final void onViewAttachedToWindow(View view) {
    }

    public AnonymousClass6Bd(AnonymousClass6Bh anonymousClass6Bh, Runnable runnable) {
        this.f72782B = anonymousClass6Bh;
        this.f72783C = runnable;
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f72782B.f72803L.removeCallbacks(this.f72783C);
    }
}
