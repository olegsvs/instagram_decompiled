package com.instagram.contacts.ccu.intf;

import X.AnonymousClass0hV;
import X.AnonymousClass4Ge;
import X.AnonymousClass5SL;

public class CCUWorkerService extends AnonymousClass0hV {
    /* renamed from: A */
    public final void m23714A() {
        AnonymousClass4Ge instance = AnonymousClass4Ge.getInstance(getApplicationContext());
        if (instance != null) {
            instance.onStart(this, new AnonymousClass5SL(this));
        }
    }
}
