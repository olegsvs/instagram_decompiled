package com.instagram.util.offline;

import X.AnonymousClass1FJ;
import X.AnonymousClass1aK;
import com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat;

public class BackgroundWifiPrefetcherGcmTaskService extends GcmTaskServiceCompat {
    /* renamed from: B */
    private AnonymousClass1FJ f20331B;

    public final AnonymousClass1FJ getRunJobLogic() {
        if (this.f20331B == null) {
            this.f20331B = new AnonymousClass1aK();
        }
        return this.f20331B;
    }
}
