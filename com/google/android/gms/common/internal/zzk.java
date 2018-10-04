package com.google.android.gms.common.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1Ew;
import X.AnonymousClass1zS;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class zzk extends zzav {
    /* renamed from: B */
    private AnonymousClass1zS f31879B;
    /* renamed from: C */
    private final int f31880C;

    public zzk(AnonymousClass1zS anonymousClass1zS, int i) {
        int I = AnonymousClass0cQ.I(this, -66522936);
        this.f31879B = anonymousClass1zS;
        this.f31880C = i;
        AnonymousClass0cQ.H(this, -186137462, I);
    }

    public final void MXA(int i, Bundle bundle) {
        int I = AnonymousClass0cQ.I(this, 417162225);
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        AnonymousClass0cQ.H(this, 1395475984, I);
    }

    public final void NXA(int i, IBinder iBinder, Bundle bundle) {
        int I = AnonymousClass0cQ.I(this, 219646588);
        AnonymousClass1Ew.E(this.f31879B, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f31879B.m14097D(i, iBinder, bundle, this.f31880C);
        this.f31879B = null;
        AnonymousClass0cQ.H(this, -548097180, I);
    }
}
