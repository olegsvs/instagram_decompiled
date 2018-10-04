package com.google.android.gms.safetynet;

import X.AnonymousClass1zC;
import X.AnonymousClass5gH;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zza extends com.google.android.gms.common.internal.safeparcel.zza {
    public static final Creator CREATOR = new AnonymousClass5gH();
    /* renamed from: B */
    public final String f68082B;

    public zza(String str) {
        this.f68082B = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.I(parcel, 2, this.f68082B, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
