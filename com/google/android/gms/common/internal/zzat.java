package com.google.android.gms.common.internal;

import X.AnonymousClass0cQ;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.zza;
import com.google.android.gms.internal.zzed;

public final class zzat extends zzed implements zzar {
    public zzat(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
        AnonymousClass0cQ.m5858H(this, -1429850975, AnonymousClass0cQ.m5859I(this, -61352094));
    }

    public final IObjectWrapper VYA() {
        int I = AnonymousClass0cQ.m5859I(this, 1422501644);
        Parcel B = m10309B(1, m10308A());
        IObjectWrapper C = zza.m10307C(B.readStrongBinder());
        B.recycle();
        AnonymousClass0cQ.m5858H(this, 1780633623, I);
        return C;
    }

    public final int WYA() {
        int I = AnonymousClass0cQ.m5859I(this, -1773995660);
        Parcel B = m10309B(2, m10308A());
        int readInt = B.readInt();
        B.recycle();
        AnonymousClass0cQ.m5858H(this, 206746918, I);
        return readInt;
    }
}
