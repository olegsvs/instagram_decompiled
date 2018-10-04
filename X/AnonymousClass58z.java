package X;

import android.os.Bundle;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.58z */
public final class AnonymousClass58z extends AnonymousClass0Ie implements AnonymousClass0IT {
    /* renamed from: B */
    private AnonymousClass0P7 f60541B;

    public final String getModuleName() {
        return "pbia_proxy_profile";
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        AnonymousClass0P7 anonymousClass0P7 = this.f60541B;
        anonymousClass0eT.a(anonymousClass0P7 != null ? anonymousClass0P7.LA() : JsonProperty.USE_DEFAULT_NAME);
        anonymousClass0eT.n(true);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1109002706);
        super.onCreate(bundle);
        this.f60541B = AnonymousClass107.f13182C.A(getArguments().getString("PBIAProxyProfileFragment.MEDIA_ID"));
        AnonymousClass0cQ.G(this, -1629118300, F);
    }
}
