package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.os.IBinder;
import android.os.Parcel;

public final class zzbga extends zzed implements zzbfz {
    public zzbga(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
        AnonymousClass0cQ.H(this, -1333999515, AnonymousClass0cQ.I(this, 229270850));
    }

    public final void fXA(zzbfx zzbfx) {
        int I = AnonymousClass0cQ.I(this, -162588622);
        Parcel A = A();
        AnonymousClass1FC.C(A, zzbfx);
        D(1, A);
        AnonymousClass0cQ.H(this, 122667346, I);
    }
}
