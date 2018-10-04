package com.google.android.gms.common.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass1zQ;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzbr extends zza {
    public static final Creator CREATOR = new AnonymousClass1zQ();
    /* renamed from: B */
    public ConnectionResult f25044B;
    /* renamed from: C */
    public boolean f25045C;
    /* renamed from: D */
    public boolean f25046D;
    /* renamed from: E */
    private IBinder f25047E;
    /* renamed from: F */
    private int f25048F;

    public zzbr(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f25048F = i;
        this.f25047E = iBinder;
        this.f25044B = connectionResult;
        this.f25045C = z;
        this.f25046D = z2;
    }

    /* renamed from: A */
    public final zzal m14088A() {
        IBinder iBinder = this.f25047E;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return queryLocalInterface instanceof zzal ? (zzal) queryLocalInterface : new zzan(iBinder);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzbr) {
                zzbr zzbr = (zzbr) obj;
                if (this.f25044B.equals(zzbr.f25044B) && m14088A().equals(zzbr.m14088A())) {
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f25048F);
        AnonymousClass1zC.m14057E(parcel, 2, this.f25047E, false);
        AnonymousClass1zC.m14059G(parcel, 3, this.f25044B, i, false);
        AnonymousClass1zC.m14063K(parcel, 4, this.f25045C);
        AnonymousClass1zC.m14063K(parcel, 5, this.f25046D);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
