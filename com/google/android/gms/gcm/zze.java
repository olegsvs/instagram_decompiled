package com.google.android.gms.gcm;

import X.AnonymousClass0cQ;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.zzed;

public final class zze extends zzed implements zzd {
    public zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.INetworkTaskCallback");
        AnonymousClass0cQ.H(this, -297306437, AnonymousClass0cQ.I(this, -1203555119));
    }

    public final void uXA(int i) {
        int I = AnonymousClass0cQ.I(this, -121318175);
        Parcel A = A();
        A.writeInt(i);
        C(2, A);
        AnonymousClass0cQ.H(this, 821841096, I);
    }
}
