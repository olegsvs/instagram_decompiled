package com.google.android.gms.location;

import X.AnonymousClass1zC;
import X.AnonymousClass5g3;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public final class LocationAvailability extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass5g3();
    /* renamed from: B */
    private int f68032B;
    /* renamed from: C */
    private int f68033C;
    /* renamed from: D */
    private long f68034D;
    /* renamed from: E */
    private int f68035E;
    /* renamed from: F */
    private zzy[] f68036F;

    public LocationAvailability(int i, int i2, int i3, long j, zzy[] zzyArr) {
        this.f68035E = i;
        this.f68032B = i2;
        this.f68033C = i3;
        this.f68034D = j;
        this.f68036F = zzyArr;
    }

    /* renamed from: A */
    public final boolean m28248A() {
        return this.f68035E < JsonMappingException.MAX_REFS_TO_LIST;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    LocationAvailability locationAvailability = (LocationAvailability) obj;
                    if (this.f68032B == locationAvailability.f68032B && this.f68033C == locationAvailability.f68033C && this.f68034D == locationAvailability.f68034D && this.f68035E == locationAvailability.f68035E && Arrays.equals(this.f68036F, locationAvailability.f68036F)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f68035E), Integer.valueOf(this.f68032B), Integer.valueOf(this.f68033C), Long.valueOf(this.f68034D), this.f68036F});
    }

    public final String toString() {
        boolean A = m28248A();
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append("LocationAvailability[isLocationAvailable: ");
        stringBuilder.append(A);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.S(parcel, 1, this.f68032B);
        AnonymousClass1zC.S(parcel, 2, this.f68033C);
        AnonymousClass1zC.C(parcel, 3, this.f68034D);
        AnonymousClass1zC.S(parcel, 4, this.f68035E);
        AnonymousClass1zC.N(parcel, 5, this.f68036F, i, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
