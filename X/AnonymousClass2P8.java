package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import java.util.Map;

/* renamed from: X.2P8 */
public final class AnonymousClass2P8 extends AnonymousClass1qJ {
    /* renamed from: B */
    public final /* synthetic */ Map f30160B;
    /* renamed from: C */
    public final /* synthetic */ Bundle f30161C;

    public AnonymousClass2P8(AnonymousClass1qK anonymousClass1qK, Map map, Bundle bundle) {
        this.f30160B = map;
        this.f30161C = bundle;
        super(anonymousClass1qK);
    }

    /* renamed from: B */
    public final void mo2868B(BrowserLiteCallback browserLiteCallback) {
        browserLiteCallback.xEA(this.f30160B, this.f30161C);
    }
}
