package com.google.android.gms.location;

import X.AnonymousClass1zC;
import X.AnonymousClass5g5;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends zza implements ReflectedParcelable {
    /* renamed from: C */
    public static final List f68045C = Collections.emptyList();
    public static final Creator CREATOR = new AnonymousClass5g5();
    /* renamed from: B */
    public final List f68046B;

    public LocationResult(List list) {
        this.f68046B = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            LocationResult locationResult = (LocationResult) obj;
            if (locationResult.f68046B.size() == this.f68046B.size()) {
                Iterator it = this.f68046B.iterator();
                for (Location time : locationResult.f68046B) {
                    if (((Location) it.next()).getTime() != time.getTime()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.f68046B) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f68046B);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder.append("LocationResult[locations: ");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.T(parcel, 1, this.f68046B, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
