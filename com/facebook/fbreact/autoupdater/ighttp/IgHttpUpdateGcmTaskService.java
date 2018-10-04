package com.facebook.fbreact.autoupdater.ighttp;

import X.AnonymousClass1FJ;
import X.AnonymousClass5eh;
import com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat;

public class IgHttpUpdateGcmTaskService extends GcmTaskServiceCompat {
    /* renamed from: B */
    private AnonymousClass1FJ f67814B;

    public final AnonymousClass1FJ getRunJobLogic() {
        if (this.f67814B == null) {
            this.f67814B = new AnonymousClass5eh(this);
        }
        return this.f67814B;
    }
}
