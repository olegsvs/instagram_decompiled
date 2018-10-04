package com.instagram.challenge.activity;

import X.AnonymousClass0Gn;
import X.AnonymousClass0IL;
import X.AnonymousClass0IZ;
import X.AnonymousClass0JY;
import X.AnonymousClass0Jr;
import X.AnonymousClass0S2;
import X.AnonymousClass1QC;
import X.AnonymousClass1Re;
import X.AnonymousClass3Q8;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;

public class ChallengeActivity extends BaseFragmentActivity {
    /* renamed from: B */
    private AnonymousClass0S2 f51746B;

    /* renamed from: T */
    public final void m23610T() {
        if (D().E(C0164R.id.layout_container_main) == null) {
            AnonymousClass0IL anonymousClass0IL = null;
            this.f51746B = AnonymousClass0S2.B(getIntent().getStringExtra("ChallengeFragment.challengeType"));
            Bundle bundleExtra = getIntent().getBundleExtra("ChallengeFragment.arguments");
            switch (this.f51746B.ordinal()) {
                case 0:
                    AnonymousClass0JY.f2926B.A();
                    anonymousClass0IL = new AnonymousClass1Re();
                    anonymousClass0IL.setArguments(bundleExtra);
                    break;
                case 1:
                    anonymousClass0IL = AnonymousClass0Jr.f2946B.A().A(AnonymousClass1QC.DIRECT_BLOCKING, AnonymousClass3Q8.EXISTING_USER, false).SSA(bundleExtra.getString("IgSessionManager.USER_ID")).DD();
                    break;
                default:
                    AnonymousClass0Gn.C("Challenge", "unknown challenge type found");
                    break;
            }
            if (anonymousClass0IL != null) {
                AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this);
                anonymousClass0IZ.f2754D = anonymousClass0IL;
                anonymousClass0IZ.B();
            }
        }
    }
}
