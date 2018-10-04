package X;

import android.app.Activity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.5sJ */
public final class AnonymousClass5sJ implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ IgReactNavigatorModule f69504B;
    /* renamed from: C */
    public final /* synthetic */ double f69505C;
    /* renamed from: D */
    public final /* synthetic */ String f69506D;

    public AnonymousClass5sJ(IgReactNavigatorModule igReactNavigatorModule, double d, String str) {
        this.f69504B = igReactNavigatorModule;
        this.f69505C = d;
        this.f69506D = str;
    }

    public final void run() {
        Activity B = AnonymousClass0In.B(this.f69504B.getCurrentActivity());
        if (B != null && AnonymousClass0In.F((int) this.f69505C, B)) {
            AnonymousClass0eT.E(B).a(this.f69506D);
        }
    }
}
