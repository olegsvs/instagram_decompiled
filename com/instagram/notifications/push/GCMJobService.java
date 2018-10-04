package com.instagram.notifications.push;

import X.AnonymousClass09p;
import X.AnonymousClass3Al;
import X.AnonymousClass55W;
import android.content.Intent;

public class GCMJobService extends AnonymousClass09p {
    /* renamed from: C */
    public final void m25704C(Intent intent) {
        if (intent != null) {
            AnonymousClass3Al.B(intent, getApplicationContext(), new AnonymousClass55W());
        }
    }
}
