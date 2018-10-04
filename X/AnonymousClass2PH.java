package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;

/* renamed from: X.2PH */
public final class AnonymousClass2PH extends AnonymousClass1qJ {
    /* renamed from: B */
    public final /* synthetic */ String f30169B;
    /* renamed from: C */
    public final /* synthetic */ Bundle f30170C;

    public AnonymousClass2PH(AnonymousClass1qK anonymousClass1qK, String str, Bundle bundle) {
        this.f30169B = str;
        this.f30170C = bundle;
        super(anonymousClass1qK);
    }

    /* renamed from: B */
    public final void mo2868B(BrowserLiteCallback browserLiteCallback) {
        browserLiteCallback.ph(this.f30169B, this.f30170C);
    }
}
