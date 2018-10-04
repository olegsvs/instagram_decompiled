package com.facebook.voltron.download;

import X.AnonymousClass1FJ;
import X.AnonymousClass1yQ;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;

public class AppModuleDownloadJobService extends JobServiceCompat {
    /* renamed from: B */
    private AnonymousClass1yQ f30562B;

    public final synchronized AnonymousClass1FJ getRunJobLogic() {
        if (this.f30562B == null) {
            this.f30562B = new AnonymousClass1yQ(this);
        }
        return this.f30562B;
    }
}
