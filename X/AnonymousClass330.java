package X;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: X.330 */
public final class AnonymousClass330 implements OnGlobalLayoutListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass338 f37295B;
    /* renamed from: C */
    public final /* synthetic */ View f37296C;

    public AnonymousClass330(AnonymousClass338 anonymousClass338, View view) {
        this.f37295B = anonymousClass338;
        this.f37296C = view;
    }

    public final void onGlobalLayout() {
        this.f37296C.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        AnonymousClass338.m18297E(this.f37295B);
    }
}
