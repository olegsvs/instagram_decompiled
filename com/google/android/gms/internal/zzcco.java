package com.google.android.gms.internal;

import X.AnonymousClass1yy;
import X.AnonymousClass1zC;
import X.AnonymousClass5fk;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzcco extends zza implements AnonymousClass1yy {
    public static final Creator CREATOR = new AnonymousClass5fk();
    /* renamed from: B */
    private final Status f68002B;

    static {
        zzcco zzcco = new zzcco(Status.f30573F);
    }

    public zzcco(Status status) {
        this.f68002B = status;
    }

    public final Status HS() {
        return this.f68002B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.G(parcel, 1, HS(), i, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
