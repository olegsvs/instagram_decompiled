package X;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

/* renamed from: X.1mi */
public final class AnonymousClass1mi implements OnApplyWindowInsetsListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1mh f22621B;

    public AnonymousClass1mi(AnonymousClass1mj anonymousClass1mj, AnonymousClass1mh anonymousClass1mh) {
        this.f22621B = anonymousClass1mh;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Object obj;
        AnonymousClass1mx ad = this.f22621B.ad(view, AnonymousClass1mx.m13047B(windowInsets));
        if (ad == null) {
            obj = null;
        } else {
            obj = ad.f22640B;
        }
        return (WindowInsets) obj;
    }
}
