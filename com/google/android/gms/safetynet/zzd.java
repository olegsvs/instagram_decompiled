package com.google.android.gms.safetynet;

import X.AnonymousClass1zC;
import X.AnonymousClass5gJ;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzd extends zza {
    public static final Creator CREATOR = new AnonymousClass5gJ();
    /* renamed from: B */
    public final long f68083B;
    /* renamed from: C */
    public final HarmfulAppsData[] f68084C;

    public zzd(long j, HarmfulAppsData[] harmfulAppsDataArr) {
        this.f68083B = j;
        this.f68084C = harmfulAppsDataArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.C(parcel, 2, this.f68083B);
        AnonymousClass1zC.N(parcel, 3, this.f68084C, i, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
