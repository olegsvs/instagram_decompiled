package X;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: X.26e */
public final class AnonymousClass26e implements OnLayoutChangeListener {
    /* renamed from: B */
    public final /* synthetic */ Runnable f26042B;

    public AnonymousClass26e(Runnable runnable) {
        this.f26042B = runnable;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.f26042B.run();
    }
}
