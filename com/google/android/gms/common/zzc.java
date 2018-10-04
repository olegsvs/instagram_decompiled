package com.google.android.gms.common;

import X.AnonymousClass1hf;
import X.AnonymousClass1zC;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzc extends zza {
    public static final Creator CREATOR = new AnonymousClass1hf();
    /* renamed from: B */
    private String f25104B;
    /* renamed from: C */
    private int f25105C;

    public zzc(String str, int i) {
        this.f25104B = str;
        this.f25105C = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14061I(parcel, 1, this.f25104B, false);
        AnonymousClass1zC.m14071S(parcel, 2, this.f25105C);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
