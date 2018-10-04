package com.google.android.gms.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass20n;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzbgc extends zza {
    public static final Creator CREATOR = new AnonymousClass20n();
    /* renamed from: B */
    public final zzbge f25231B;
    /* renamed from: C */
    private int f25232C;

    public zzbgc(int i, zzbge zzbge) {
        this.f25232C = i;
        this.f25231B = zzbge;
    }

    public zzbgc(zzbge zzbge) {
        this.f25232C = 1;
        this.f25231B = zzbge;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f25232C);
        AnonymousClass1zC.m14059G(parcel, 2, this.f25231B, i, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
