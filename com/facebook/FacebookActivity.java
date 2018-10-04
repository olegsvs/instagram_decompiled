package com.facebook;

import X.AnonymousClass0IL;
import X.AnonymousClass0IU;
import X.AnonymousClass0cQ;
import X.AnonymousClass2Rk;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class FacebookActivity extends FragmentActivity {
    /* renamed from: B */
    private AnonymousClass0IL f23000B;

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass0IL anonymousClass0IL = this.f23000B;
        if (anonymousClass0IL != null) {
            anonymousClass0IL.onConfigurationChanged(configuration);
        }
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, -1526783036);
        super.onCreate(bundle);
        setContentView(C0164R.layout.com_facebook_activity_layout);
        AnonymousClass0IU D = D();
        AnonymousClass0IL F = D.F("SingleFragment");
        if (F == null) {
            F = new AnonymousClass2Rk();
            F.setRetainInstance(true);
            D.B().B(C0164R.id.com_facebook_fragment_container, F, "SingleFragment").F();
        }
        this.f23000B = F;
        AnonymousClass0cQ.C(this, -309335048, B);
    }
}
