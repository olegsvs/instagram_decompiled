package com.instagram.login.smartlock.impl;

import X.AnonymousClass0GM;
import X.AnonymousClass1En;
import X.AnonymousClass1Tl;
import X.AnonymousClass21F;
import X.AnonymousClass3Td;
import X.AnonymousClass5jt;
import X.AnonymousClass5ju;
import X.AnonymousClass5jv;
import X.AnonymousClass5jy;
import X.AnonymousClass5jz;
import X.AnonymousClass6HF;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class SmartLockPluginImpl extends AnonymousClass0GM {
    /* renamed from: B */
    public final Map f68642B = new WeakHashMap();
    /* renamed from: C */
    public final Map f68643C = new WeakHashMap();
    /* renamed from: D */
    private final Map f68644D = new WeakHashMap();
    /* renamed from: E */
    private boolean f68645E = true;

    public boolean getShouldShowSmartLockForLogin() {
        return this.f68645E;
    }

    public void getSmartLockBroker(FragmentActivity fragmentActivity, AnonymousClass3Td anonymousClass3Td) {
        if (this.f68643C.containsKey(fragmentActivity)) {
            anonymousClass3Td.Nh(this.f68643C.get(fragmentActivity));
            return;
        }
        Set set = (Set) this.f68642B.get(fragmentActivity);
        if (set != null) {
            set.add(anonymousClass3Td);
            return;
        }
        Set hashSet = new HashSet();
        hashSet.add(anonymousClass3Td);
        this.f68642B.put(fragmentActivity, hashSet);
        AnonymousClass3Td anonymousClass5ju = new AnonymousClass5ju(this, fragmentActivity);
        if (AnonymousClass1En.f15943B.B(fragmentActivity) == 0) {
            AnonymousClass5jt anonymousClass5jt = new AnonymousClass5jt(fragmentActivity, anonymousClass5ju, null);
        } else {
            anonymousClass5ju.Nh(null);
        }
    }

    public AnonymousClass1Tl listenForSmsResponse(Activity activity, boolean z) {
        AnonymousClass1Tl anonymousClass1Tl = (AnonymousClass1Tl) this.f68644D.get(activity);
        if (!z && anonymousClass1Tl != null && (anonymousClass1Tl.pX() || anonymousClass1Tl.oIA())) {
            return anonymousClass1Tl;
        }
        if (anonymousClass1Tl != null && anonymousClass1Tl.pX()) {
            anonymousClass1Tl.AVA();
        }
        AnonymousClass5jz anonymousClass5jz = new AnonymousClass5jz(activity);
        AnonymousClass21F C = new AnonymousClass6HF(anonymousClass5jz.f68655B).mo6792C();
        anonymousClass1Tl = new AnonymousClass5jy(anonymousClass5jz.f68655B);
        C.C(new AnonymousClass5jv(anonymousClass5jz, anonymousClass1Tl));
        this.f68644D.put(activity, anonymousClass1Tl);
        return anonymousClass1Tl;
    }

    public void setShouldShowSmartLockForLogin(boolean z) {
        this.f68645E = z;
    }
}
