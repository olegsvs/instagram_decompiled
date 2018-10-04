package com.google.android.gms.common.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass1zR;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzbt extends zza {
    public static final Creator CREATOR = new AnonymousClass1zR();
    /* renamed from: B */
    private final int f25049B;
    /* renamed from: C */
    private final int f25050C;
    /* renamed from: D */
    private final Scope[] f25051D;
    /* renamed from: E */
    private int f25052E;

    public zzbt(int i, int i2, int i3, Scope[] scopeArr) {
        this.f25052E = i;
        this.f25049B = i2;
        this.f25050C = i3;
        this.f25051D = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f25052E);
        AnonymousClass1zC.m14071S(parcel, 2, this.f25049B);
        AnonymousClass1zC.m14071S(parcel, 3, this.f25050C);
        AnonymousClass1zC.m14066N(parcel, 4, this.f25051D, i, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
