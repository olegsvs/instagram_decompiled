package com.google.android.gms.location.places;

import X.AnonymousClass1zC;
import X.AnonymousClass1zL;
import X.AnonymousClass1zM;
import X.AnonymousClass21A;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public class PlaceReport extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass21A();
    /* renamed from: B */
    public final String f25279B;
    /* renamed from: C */
    public final String f25280C;
    /* renamed from: D */
    private final String f25281D;
    /* renamed from: E */
    private int f25282E;

    public PlaceReport(int i, String str, String str2, String str3) {
        this.f25282E = i;
        this.f25280C = str;
        this.f25279B = str2;
        this.f25281D = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PlaceReport) {
            PlaceReport placeReport = (PlaceReport) obj;
            if (AnonymousClass1zL.m14085B(this.f25280C, placeReport.f25280C) && AnonymousClass1zL.m14085B(this.f25279B, placeReport.f25279B) && AnonymousClass1zL.m14085B(this.f25281D, placeReport.f25281D)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25280C, this.f25279B, this.f25281D});
    }

    public final String toString() {
        AnonymousClass1zM C = AnonymousClass1zL.m14086C(this);
        C.m14087A("placeId", this.f25280C);
        C.m14087A("tag", this.f25279B);
        if (!"unknown".equals(this.f25281D)) {
            C.m14087A("source", this.f25281D);
        }
        return C.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f25282E);
        AnonymousClass1zC.m14061I(parcel, 2, this.f25280C, false);
        AnonymousClass1zC.m14061I(parcel, 3, this.f25279B, false);
        AnonymousClass1zC.m14061I(parcel, 4, this.f25281D, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
