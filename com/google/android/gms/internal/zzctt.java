package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzal;

public final class zzctt extends zzed implements zzcts {
    public zzctt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
        AnonymousClass0cQ.H(this, -2070251052, AnonymousClass0cQ.I(this, 1128470100));
    }

    public final void XXA(zzal zzal, int i, boolean z) {
        int I = AnonymousClass0cQ.I(this, 1471478813);
        Parcel A = A();
        AnonymousClass1FC.C(A, zzal);
        A.writeInt(i);
        A.writeInt(z);
        C(9, A);
        AnonymousClass0cQ.H(this, 665492236, I);
    }

    public final void jXA(zzctv zzctv, zzctq zzctq) {
        int I = AnonymousClass0cQ.I(this, -1719957081);
        Parcel A = A();
        AnonymousClass1FC.D(A, zzctv);
        AnonymousClass1FC.C(A, zzctq);
        C(12, A);
        AnonymousClass0cQ.H(this, 364937246, I);
    }

    public final void vXA(int i) {
        int I = AnonymousClass0cQ.I(this, -1914200862);
        Parcel A = A();
        A.writeInt(i);
        C(7, A);
        AnonymousClass0cQ.H(this, 937827373, I);
    }
}
