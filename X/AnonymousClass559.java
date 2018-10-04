package X;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.559 */
public final class AnonymousClass559 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass55C f59953B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass55B f59954C;

    public AnonymousClass559(AnonymousClass55C anonymousClass55C, AnonymousClass55B anonymousClass55B) {
        this.f59953B = anonymousClass55C;
        this.f59954C = anonymousClass55B;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1030093138);
        AnonymousClass5ZG anonymousClass5ZG = this.f59953B.f59964C;
        AnonymousClass55B anonymousClass55B = this.f59954C;
        if (anonymousClass55B == AnonymousClass55B.ADS_MANAGER) {
            String str = "activity_feed";
            AnonymousClass0xr.D(str);
            AnonymousClass35o.B(anonymousClass5ZG.f66342C, anonymousClass5ZG.f66344E, str);
        } else if (anonymousClass55B == AnonymousClass55B.BRANDED_CONTENT) {
            Bundle bundle = new Bundle();
            AnonymousClass0FL.G(anonymousClass5ZG.f66344E, bundle);
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass5ZG.f66342C);
            anonymousClass0IZ.f2754D = AnonymousClass0IY.B().H(bundle);
            anonymousClass0IZ.B();
        }
        AnonymousClass0cQ.L(this, -2093970121, M);
    }
}
