package com.google.android.gms.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass20p;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzbgf extends zza {
    public static final Creator CREATOR = new AnonymousClass20p();
    /* renamed from: B */
    public final String f25233B;
    /* renamed from: C */
    public final int f25234C;
    /* renamed from: D */
    private int f25235D;

    public zzbgf(int i, String str, int i2) {
        this.f25235D = i;
        this.f25233B = str;
        this.f25234C = i2;
    }

    public zzbgf(String str, int i) {
        this.f25235D = 1;
        this.f25233B = str;
        this.f25234C = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f25235D);
        AnonymousClass1zC.m14061I(parcel, 2, this.f25233B, false);
        AnonymousClass1zC.m14071S(parcel, 3, this.f25234C);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
