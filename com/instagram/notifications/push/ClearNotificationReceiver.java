package com.instagram.notifications.push;

import X.AnonymousClass0EA;
import X.AnonymousClass0GG;
import X.AnonymousClass0LH;
import X.AnonymousClass0cQ;
import X.AnonymousClass55N;
import X.AnonymousClass55Q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;

public class ClearNotificationReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, -8440095);
        AnonymousClass0EA B = AnonymousClass0EA.m1322B();
        Uri data = intent.getData();
        AnonymousClass0LH.m2924B("ig".equals(data.getScheme()));
        AnonymousClass0LH.m2924B("notif".equals(data.getAuthority()));
        List pathSegments = data.getPathSegments();
        boolean z = pathSegments.size() >= 1 && pathSegments.size() <= 2;
        AnonymousClass0LH.m2924B(z);
        String str = (String) pathSegments.get(0);
        if (pathSegments.size() == 2) {
            B.f1949B.B(str, (String) pathSegments.get(1));
        } else {
            AnonymousClass55Q anonymousClass55Q = B.f1949B;
            AnonymousClass0GG.m1763B(anonymousClass55Q.f59993C, new AnonymousClass55N(anonymousClass55Q, AnonymousClass55Q.B(anonymousClass55Q, str)), -1552543101);
        }
        AnonymousClass0cQ.m5855E(this, context, intent, -1844261422, D);
    }
}
