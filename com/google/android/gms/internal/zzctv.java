package com.google.android.gms.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass219;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzbp;

public final class zzctv extends zza {
    public static final Creator CREATOR = new AnonymousClass219();
    /* renamed from: B */
    private int f25274B;
    /* renamed from: C */
    private zzbp f25275C;

    public zzctv(int i, zzbp zzbp) {
        this.f25274B = i;
        this.f25275C = zzbp;
    }

    public zzctv(zzbp zzbp) {
        this(1, zzbp);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f25274B);
        AnonymousClass1zC.m14059G(parcel, 2, this.f25275C, i, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
