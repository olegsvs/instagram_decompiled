package com.google.android.gms.safetynet;

import X.AnonymousClass1zC;
import X.AnonymousClass5gK;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzf extends zza {
    public static final Creator CREATOR = new AnonymousClass5gK();
    /* renamed from: B */
    private final String f68085B;

    public zzf(String str) {
        this.f68085B = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.I(parcel, 2, this.f68085B, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
