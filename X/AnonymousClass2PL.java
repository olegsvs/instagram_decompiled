package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;

/* renamed from: X.2PL */
public final class AnonymousClass2PL extends AnonymousClass1qJ {
    /* renamed from: B */
    public final /* synthetic */ int f30179B;
    /* renamed from: C */
    public final /* synthetic */ Bundle f30180C;
    /* renamed from: D */
    public final /* synthetic */ String f30181D;
    /* renamed from: E */
    public final /* synthetic */ long f30182E;

    public AnonymousClass2PL(AnonymousClass1qK anonymousClass1qK, String str, Bundle bundle, int i, long j) {
        this.f30181D = str;
        this.f30180C = bundle;
        this.f30179B = i;
        this.f30182E = j;
        super(anonymousClass1qK);
    }

    /* renamed from: B */
    public final void mo2868B(BrowserLiteCallback browserLiteCallback) {
        browserLiteCallback.Et(this.f30181D, this.f30180C, this.f30179B, this.f30182E);
    }
}
