package X;

import android.content.Intent;
import com.facebook.react.bridge.Callback;
import com.instagram.react.modules.product.IgReactBoostPostModule;

/* renamed from: X.5sa */
public final class AnonymousClass5sa extends AnonymousClass0VA {
    /* renamed from: B */
    public final /* synthetic */ IgReactBoostPostModule f69551B;
    /* renamed from: C */
    public final /* synthetic */ Callback f69552C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0IJ f69553D;
    /* renamed from: E */
    public final /* synthetic */ Callback f69554E;

    public AnonymousClass5sa(IgReactBoostPostModule igReactBoostPostModule, Callback callback, Callback callback2, AnonymousClass0IJ anonymousClass0IJ) {
        this.f69551B = igReactBoostPostModule;
        this.f69554E = callback;
        this.f69552C = callback2;
        this.f69553D = anonymousClass0IJ;
    }

    public final void gi() {
        this.f69553D.unregisterLifecycleListener(this);
    }

    public final void xc(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 64206) {
            AnonymousClass0FO.E(i, i2, intent, new AnonymousClass5sZ(this));
        }
    }
}
