package X;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: X.4P2 */
public final class AnonymousClass4P2 implements OnLayoutChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4P3 f53650B;

    public AnonymousClass4P2(AnonymousClass4P3 anonymousClass4P3) {
        this.f53650B = anonymousClass4P3;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f53650B.f53651B.f53671E.removeOnLayoutChangeListener(this);
        AnonymousClass4PD.m24119G(this.f53650B.f53651B);
    }
}
