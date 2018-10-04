package com.google.android.gms.safetynet;

import X.AnonymousClass1zC;
import X.AnonymousClass5gI;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class HarmfulAppsData extends zza {
    public static final Creator CREATOR = new AnonymousClass5gI();
    /* renamed from: B */
    public final int f68074B;
    /* renamed from: C */
    public final String f68075C;
    /* renamed from: D */
    public final byte[] f68076D;

    public HarmfulAppsData(String str, byte[] bArr, int i) {
        this.f68075C = str;
        this.f68076D = bArr;
        this.f68074B = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.I(parcel, 2, this.f68075C, false);
        AnonymousClass1zC.L(parcel, 3, this.f68076D, false);
        AnonymousClass1zC.S(parcel, 4, this.f68074B);
        AnonymousClass1zC.B(parcel, U);
    }
}
