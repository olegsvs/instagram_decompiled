package com.instagram.dogfood.selfupdate;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cn;
import X.AnonymousClass0FL;
import X.AnonymousClass1FJ;
import X.AnonymousClass3K5;
import X.AnonymousClass3K9;
import com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class SelfUpdateGcmTaskService extends GcmTaskServiceCompat {
    /* renamed from: B */
    private AnonymousClass3K9 f40143B;

    public final AnonymousClass1FJ getRunJobLogic() {
        AnonymousClass0Cn F = AnonymousClass0Ce.F(this);
        if (!F.xX()) {
            return new AnonymousClass3K5(this);
        }
        if (this.f40143B == null) {
            this.f40143B = new AnonymousClass3K9(getApplicationContext(), AnonymousClass0FL.B(F));
        }
        return this.f40143B;
    }
}
