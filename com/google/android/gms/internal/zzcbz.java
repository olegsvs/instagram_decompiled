package com.google.android.gms.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass1zL;
import X.AnonymousClass5fj;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzcbz extends zza {
    public static final Creator CREATOR = new AnonymousClass5fj();
    /* renamed from: B */
    private String f68000B;
    /* renamed from: C */
    private int f68001C;

    public zzcbz(int i, String str) {
        this.f68001C = i;
        this.f68000B = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null) {
                if (obj instanceof zzcbz) {
                    zzcbz zzcbz = (zzcbz) obj;
                    if (zzcbz.f68001C == this.f68001C && AnonymousClass1zL.B(zzcbz.f68000B, this.f68000B)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f68001C;
    }

    public final String toString() {
        return String.format("%d:%s", new Object[]{Integer.valueOf(this.f68001C), this.f68000B});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.S(parcel, 1, this.f68001C);
        AnonymousClass1zC.I(parcel, 2, this.f68000B, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
