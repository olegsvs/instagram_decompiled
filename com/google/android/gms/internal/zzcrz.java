package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.os.IBinder;
import android.os.Parcel;

public final class zzcrz extends zzed implements zzcry {
    public zzcrz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
        AnonymousClass0cQ.H(this, 739392540, AnonymousClass0cQ.I(this, 739549239));
    }

    public final void hXA(zzcrw zzcrw, byte[] bArr, String str) {
        int I = AnonymousClass0cQ.I(this, 2124634347);
        Parcel A = A();
        AnonymousClass1FC.C(A, zzcrw);
        A.writeByteArray(bArr);
        A.writeString(str);
        C(7, A);
        AnonymousClass0cQ.H(this, 541442837, I);
    }
}
