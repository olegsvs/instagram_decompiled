package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;

/* renamed from: X.2PI */
public final class AnonymousClass2PI extends AnonymousClass1qJ {
    /* renamed from: B */
    public final /* synthetic */ Bundle f30171B;
    /* renamed from: C */
    public final /* synthetic */ String f30172C;

    public AnonymousClass2PI(AnonymousClass1qK anonymousClass1qK, String str, Bundle bundle) {
        this.f30172C = str;
        this.f30171B = bundle;
        super(anonymousClass1qK);
    }

    /* renamed from: B */
    public final void mo2868B(BrowserLiteCallback browserLiteCallback) {
        browserLiteCallback.hx(this.f30172C, this.f30171B);
    }
}
