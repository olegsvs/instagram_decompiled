package com.instagram.direct.send;

import X.AnonymousClass1EL;
import X.AnonymousClass1FJ;
import com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat;

public class DirectMutationManagerGcmTaskService extends GcmTaskServiceCompat {
    /* renamed from: B */
    private AnonymousClass1FJ f20351B;

    public final AnonymousClass1FJ getRunJobLogic() {
        if (this.f20351B == null) {
            this.f20351B = new AnonymousClass1EL();
        }
        return this.f20351B;
    }
}
