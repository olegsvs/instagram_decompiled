package com.google.android.gms.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass20t;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzbgq extends zza {
    public static final Creator CREATOR = new AnonymousClass20t();
    /* renamed from: B */
    public final String f25253B;
    /* renamed from: C */
    public final zzbgj f25254C;
    /* renamed from: D */
    private int f25255D;

    public zzbgq(int i, String str, zzbgj zzbgj) {
        this.f25255D = i;
        this.f25253B = str;
        this.f25254C = zzbgj;
    }

    public zzbgq(String str, zzbgj zzbgj) {
        this.f25255D = 1;
        this.f25253B = str;
        this.f25254C = zzbgj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f25255D);
        AnonymousClass1zC.m14061I(parcel, 2, this.f25253B, false);
        AnonymousClass1zC.m14059G(parcel, 3, this.f25254C, i, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
