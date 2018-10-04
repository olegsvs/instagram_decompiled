package com.google.android.gms.safetynet;

import X.AnonymousClass1zC;
import X.AnonymousClass5gL;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;

public class SafeBrowsingData extends zza {
    public static final Creator CREATOR = new AnonymousClass5gL();
    /* renamed from: B */
    public String f68077B;
    /* renamed from: C */
    public DataHolder f68078C;

    public SafeBrowsingData(String str, DataHolder dataHolder) {
        this.f68077B = str;
        this.f68078C = dataHolder;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.I(parcel, 2, this.f68077B, false);
        AnonymousClass1zC.G(parcel, 3, this.f68078C, i, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
