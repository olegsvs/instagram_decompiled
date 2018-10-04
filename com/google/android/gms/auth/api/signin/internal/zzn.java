package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass1yb;
import X.AnonymousClass1zC;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzn extends zza {
    public static final Creator CREATOR = new AnonymousClass1yb();
    /* renamed from: B */
    public int f24946B;
    /* renamed from: C */
    private Bundle f24947C;
    /* renamed from: D */
    private int f24948D;

    public zzn(int i, int i2, Bundle bundle) {
        this.f24948D = i;
        this.f24946B = i2;
        this.f24947C = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f24948D);
        AnonymousClass1zC.m14071S(parcel, 2, this.f24946B);
        AnonymousClass1zC.m14056D(parcel, 3, this.f24947C, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
