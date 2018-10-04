package com.instagram.dogfood.selfupdate;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cn;
import X.AnonymousClass0FL;
import X.AnonymousClass1FJ;
import X.AnonymousClass3K9;
import X.AnonymousClass3KB;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class SelfUpdateJobService extends JobServiceCompat {
    /* renamed from: B */
    private AnonymousClass3K9 f40156B;

    public final AnonymousClass1FJ getRunJobLogic() {
        AnonymousClass0Cn F = AnonymousClass0Ce.F(this);
        if (!F.xX()) {
            return new AnonymousClass3KB(this);
        }
        if (this.f40156B == null) {
            this.f40156B = new AnonymousClass3K9(getApplicationContext(), AnonymousClass0FL.B(F));
        }
        return this.f40156B;
    }
}
