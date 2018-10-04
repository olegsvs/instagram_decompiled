package com.instagram.direct.send;

import X.AnonymousClass1EL;
import X.AnonymousClass1FJ;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;

public class DirectMutationManagerJobService extends JobServiceCompat {
    /* renamed from: B */
    private AnonymousClass1FJ f56402B;

    public final AnonymousClass1FJ getRunJobLogic() {
        if (this.f56402B == null) {
            this.f56402B = new AnonymousClass1EL();
        }
        return this.f56402B;
    }
}
