package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsRequest;

public final class zzcda extends zzed implements zzccz {
    public zzcda(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
        AnonymousClass0cQ.H(this, 1138903499, AnonymousClass0cQ.I(this, 423808851));
    }

    public final void gXA(zzcdp zzcdp) {
        int I = AnonymousClass0cQ.I(this, 296055164);
        Parcel A = A();
        AnonymousClass1FC.D(A, zzcdp);
        C(59, A);
        AnonymousClass0cQ.H(this, 366511196, I);
    }

    public final void kXA(LocationSettingsRequest locationSettingsRequest, zzcdb zzcdb, String str) {
        int I = AnonymousClass0cQ.I(this, 1186352228);
        Parcel A = A();
        AnonymousClass1FC.D(A, locationSettingsRequest);
        AnonymousClass1FC.C(A, zzcdb);
        A.writeString(str);
        C(63, A);
        AnonymousClass0cQ.H(this, 27076836, I);
    }

    public final void qXA(boolean z) {
        int I = AnonymousClass0cQ.I(this, -43953899);
        Parcel A = A();
        A.writeInt(z);
        C(12, A);
        AnonymousClass0cQ.H(this, -1387056133, I);
    }
}
