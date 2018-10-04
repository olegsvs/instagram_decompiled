package X;

import android.app.Activity;
import com.facebook.C0164R;

/* renamed from: X.3Tt */
public final class AnonymousClass3Tt implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0cG f41559B;

    public AnonymousClass3Tt(AnonymousClass0cG anonymousClass0cG) {
        this.f41559B = anonymousClass0cG;
    }

    public final void run() {
        AnonymousClass173 C = new AnonymousClass173((Activity) this.f41559B.f7076D, new AnonymousClass174(this.f41559B.f7076D.getString(C0164R.string.tab_direct_messages_nux))).C(this.f41559B.f7078F.f41553E);
        C.f14642H = AnonymousClass177.ABOVE_ANCHOR;
        C.f14636B = false;
        C.f14640F = new AnonymousClass3Ts(this);
        C.A().C();
    }
}
