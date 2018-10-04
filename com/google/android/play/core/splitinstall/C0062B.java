package com.google.android.play.core.splitinstall;

import X.AnonymousClass0cQ;
import X.AnonymousClass21g;
import X.AnonymousClass21n;
import X.AnonymousClass21y;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.B */
public final class C0062B extends C0061E {
    public C0062B(AnonymousClass21n anonymousClass21n, AnonymousClass21y anonymousClass21y) {
        super(anonymousClass21n, anonymousClass21y);
        AnonymousClass0cQ.H(this, 94251147, AnonymousClass0cQ.I(this, 883544966));
    }

    public final void PB(List list) {
        int I = AnonymousClass0cQ.I(this, 523041303);
        super.PB(list);
        List arrayList = new ArrayList(list.size());
        for (Bundle B : list) {
            arrayList.add(AnonymousClass21g.m14203B(B));
        }
        this.f31929B.m14216B(arrayList);
        AnonymousClass0cQ.H(this, 1991563798, I);
    }
}
