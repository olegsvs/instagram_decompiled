package com.google.android.gms.location;

import X.AnonymousClass1zC;
import X.AnonymousClass5gB;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public final class zzy extends zza {
    public static final Creator CREATOR = new AnonymousClass5gB();
    /* renamed from: B */
    private int f68070B;
    /* renamed from: C */
    private int f68071C;
    /* renamed from: D */
    private long f68072D;
    /* renamed from: E */
    private long f68073E;

    public zzy(int i, int i2, long j, long j2) {
        this.f68070B = i;
        this.f68071C = i2;
        this.f68072D = j;
        this.f68073E = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    zzy zzy = (zzy) obj;
                    if (this.f68070B == zzy.f68070B && this.f68071C == zzy.f68071C && this.f68072D == zzy.f68072D && this.f68073E == zzy.f68073E) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f68071C), Integer.valueOf(this.f68070B), Long.valueOf(this.f68073E), Long.valueOf(this.f68072D)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkLocationStatus:");
        stringBuilder.append(" Wifi status: ");
        stringBuilder.append(this.f68070B);
        stringBuilder.append(" Cell status: ");
        stringBuilder.append(this.f68071C);
        stringBuilder.append(" elapsed time NS: ");
        stringBuilder.append(this.f68073E);
        stringBuilder.append(" system time ms: ");
        stringBuilder.append(this.f68072D);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.S(parcel, 1, this.f68070B);
        AnonymousClass1zC.S(parcel, 2, this.f68071C);
        AnonymousClass1zC.C(parcel, 3, this.f68072D);
        AnonymousClass1zC.C(parcel, 4, this.f68073E);
        AnonymousClass1zC.B(parcel, U);
    }
}
