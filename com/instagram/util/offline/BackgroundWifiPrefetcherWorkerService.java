package com.instagram.util.offline;

import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0hV;
import X.AnonymousClass0hZ;
import X.AnonymousClass5LP;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class BackgroundWifiPrefetcherWorkerService extends AnonymousClass0hV {
    /* renamed from: A */
    public final void mo1609A() {
        AnonymousClass0hZ.m6765C(getApplicationContext());
        AnonymousClass0hZ B = AnonymousClass0hZ.m6764B();
        if (AnonymousClass0Cd.f1698B.m970N()) {
            B.m6768A(AnonymousClass0Ce.m951H(this), new AnonymousClass5LP(this));
            return;
        }
        AnonymousClass0hZ.m6766D(B);
        AnonymousClass0hZ.m6767E();
        stopSelf();
    }
}
