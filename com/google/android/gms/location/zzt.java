package com.google.android.gms.location;

import X.AnonymousClass1zC;
import X.AnonymousClass5g7;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzt extends zza {
    public static final Creator CREATOR = new AnonymousClass5g7();
    /* renamed from: B */
    private final String f68066B;
    /* renamed from: C */
    private final String f68067C;
    /* renamed from: D */
    private final int f68068D;
    /* renamed from: E */
    private final boolean f68069E;

    public zzt(String str, String str2, int i, boolean z) {
        this.f68066B = str;
        this.f68067C = str2;
        this.f68068D = i;
        this.f68069E = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.I(parcel, 1, this.f68066B, false);
        AnonymousClass1zC.I(parcel, 2, this.f68067C, false);
        AnonymousClass1zC.S(parcel, 3, this.f68068D);
        AnonymousClass1zC.K(parcel, 4, this.f68069E);
        AnonymousClass1zC.B(parcel, U);
    }
}
