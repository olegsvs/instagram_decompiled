package com.instagram.notifications.push;

import X.AnonymousClass09p;
import X.AnonymousClass0Ce;
import X.AnonymousClass0GA;
import X.AnonymousClass0Gn;
import X.AnonymousClass0Ix;
import X.AnonymousClass0N2;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Pv;
import X.AnonymousClass1RU;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.common.notifications.push.PushChannelType;

public class IgPushRegistrationService extends AnonymousClass09p {
    /* renamed from: B */
    public static final Class f4670B = IgPushRegistrationService.class;

    /* renamed from: C */
    public final void mo173C(Intent intent) {
        if (intent == null) {
            AnonymousClass0Gn.m1876C(f4670B.getSimpleName(), "onHandleWork - Null Intent");
        } else if (intent.getExtras() == null) {
            AnonymousClass0Gn.m1876C(f4670B.getSimpleName(), "onHandleWork - Empty extras");
        } else {
            Bundle extras = intent.getExtras();
            String string = extras.getString("PushRegistrationService.GUID");
            String string2 = extras.getString("PushRegistrationService.DEVICE_TOKEN");
            PushChannelType pushChannelType = (PushChannelType) extras.getSerializable("PushRegistrationService.PUSH_DEVICE_TYPE");
            boolean z = extras.getBoolean("PushRegistrationService.IS_MAIN_PUSH_CHANNEL");
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(AnonymousClass0Ce.m948E(extras));
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = "push/register/";
            AnonymousClass0Pt M = anonymousClass0Pt.m3935D("device_token", string2).m3935D("device_type", pushChannelType.m4154A()).m3935D("is_main_push_channel", String.valueOf(z)).m3935D("guid", string).m3935D("phone_id", AnonymousClass0N2.m3261B().m3261B()).m3944M(AnonymousClass0Pv.class);
            if (intent.hasExtra("PushRegistrationService.LOGGED_IN_USERS")) {
                M.m3935D("users", intent.getStringExtra("PushRegistrationService.LOGGED_IN_USERS"));
            }
            AnonymousClass0GA H = M.m3939H();
            H.f2849B = new AnonymousClass1RU(pushChannelType, z);
            AnonymousClass0Ix.m2383C(H);
        }
    }
}
