package com.facebook.fbreact.autoupdater.ighttp;

import X.AnonymousClass1FJ;
import X.AnonymousClass5eh;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;

public class IgHttpUpdateServiceCompat extends JobServiceCompat {
    /* renamed from: B */
    private AnonymousClass1FJ f67819B;

    public final AnonymousClass1FJ getRunJobLogic() {
        if (this.f67819B == null) {
            this.f67819B = new AnonymousClass5eh(this);
        }
        return this.f67819B;
    }
}
