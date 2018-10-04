package com.instagram.util.offline;

import X.AnonymousClass1FJ;
import X.AnonymousClass1aK;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;

public class BackgroundWifiPrefetcherJobServiceCompat extends JobServiceCompat {
    /* renamed from: B */
    private AnonymousClass1FJ f62409B;

    public final AnonymousClass1FJ getRunJobLogic() {
        if (this.f62409B == null) {
            this.f62409B = new AnonymousClass1aK();
        }
        return this.f62409B;
    }
}
