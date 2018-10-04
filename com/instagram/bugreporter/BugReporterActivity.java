package com.instagram.bugreporter;

import X.AnonymousClass0IL;
import X.AnonymousClass0IY;
import X.AnonymousClass0IZ;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;

public class BugReporterActivity extends BaseFragmentActivity {
    /* renamed from: T */
    public final void m18300T() {
        if (D().E(C0164R.id.layout_container_main) == null) {
            AnonymousClass0IL K = AnonymousClass0IY.B().K(getIntent().getExtras().getString("IgSessionManager.USER_ID"), (BugReport) getIntent().getParcelableExtra("BugReporterActivity.INTENT_EXTRA_BUGREPORT"));
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this);
            anonymousClass0IZ.f2754D = K;
            anonymousClass0IZ.C().B();
        }
    }
}
