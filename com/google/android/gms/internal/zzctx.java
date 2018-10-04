package com.google.android.gms.internal;

import X.AnonymousClass1hs;
import X.AnonymousClass1zC;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzbr;

public final class zzctx extends zza {
    public static final Creator CREATOR = new AnonymousClass1hs();
    /* renamed from: B */
    public final ConnectionResult f25276B;
    /* renamed from: C */
    public final zzbr f25277C;
    /* renamed from: D */
    private int f25278D;

    public zzctx(int i) {
        this(new ConnectionResult(8, null), null);
    }

    public zzctx(int i, ConnectionResult connectionResult, zzbr zzbr) {
        this.f25278D = i;
        this.f25276B = connectionResult;
        this.f25277C = zzbr;
    }

    private zzctx(ConnectionResult connectionResult, zzbr zzbr) {
        this(1, connectionResult, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f25278D);
        AnonymousClass1zC.m14059G(parcel, 2, this.f25276B, i, false);
        AnonymousClass1zC.m14059G(parcel, 3, this.f25277C, i, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
