package com.google.android.gms.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass1zL;
import X.AnonymousClass5fm;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public final class zzcdn extends zza {
    public static final Creator CREATOR = new AnonymousClass5fm();
    /* renamed from: I */
    public static final List f68007I = Collections.emptyList();
    /* renamed from: B */
    private String f68008B;
    /* renamed from: C */
    private LocationRequest f68009C;
    /* renamed from: D */
    private String f68010D;
    /* renamed from: E */
    private List f68011E;
    /* renamed from: F */
    private boolean f68012F;
    /* renamed from: G */
    private boolean f68013G;
    /* renamed from: H */
    private boolean f68014H;

    public zzcdn(LocationRequest locationRequest, List list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.f68009C = locationRequest;
        this.f68011E = list;
        this.f68008B = str;
        this.f68012F = z;
        this.f68013G = z2;
        this.f68014H = z3;
        this.f68010D = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcdn) {
            zzcdn zzcdn = (zzcdn) obj;
            if (AnonymousClass1zL.B(this.f68009C, zzcdn.f68009C) && AnonymousClass1zL.B(this.f68011E, zzcdn.f68011E) && AnonymousClass1zL.B(this.f68008B, zzcdn.f68008B) && this.f68012F == zzcdn.f68012F && this.f68013G == zzcdn.f68013G && this.f68014H == zzcdn.f68014H && AnonymousClass1zL.B(this.f68010D, zzcdn.f68010D)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f68009C.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f68009C.toString());
        if (this.f68008B != null) {
            stringBuilder.append(" tag=");
            stringBuilder.append(this.f68008B);
        }
        if (this.f68010D != null) {
            stringBuilder.append(" moduleId=");
            stringBuilder.append(this.f68010D);
        }
        stringBuilder.append(" hideAppOps=");
        stringBuilder.append(this.f68012F);
        stringBuilder.append(" clients=");
        stringBuilder.append(this.f68011E);
        stringBuilder.append(" forceCoarseLocation=");
        stringBuilder.append(this.f68013G);
        if (this.f68014H) {
            stringBuilder.append(" exemptFromBackgroundThrottle");
        }
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.G(parcel, 1, this.f68009C, i, false);
        AnonymousClass1zC.T(parcel, 5, this.f68011E, false);
        AnonymousClass1zC.I(parcel, 6, this.f68008B, false);
        AnonymousClass1zC.K(parcel, 7, this.f68012F);
        AnonymousClass1zC.K(parcel, 8, this.f68013G);
        AnonymousClass1zC.K(parcel, 9, this.f68014H);
        AnonymousClass1zC.I(parcel, 10, this.f68010D, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
