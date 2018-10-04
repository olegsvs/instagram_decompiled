package com.google.android.gms.location;

import X.AnonymousClass1zC;
import X.AnonymousClass5g2;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

public class GeofencingRequest extends zza {
    public static final Creator CREATOR = new AnonymousClass5g2();
    /* renamed from: B */
    public final int f68029B;
    /* renamed from: C */
    private final String f68030C;
    /* renamed from: D */
    private final List f68031D;

    public GeofencingRequest(List list, int i, String str) {
        this.f68031D = list;
        this.f68029B = i;
        this.f68030C = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.T(parcel, 1, this.f68031D, false);
        AnonymousClass1zC.S(parcel, 2, this.f68029B);
        AnonymousClass1zC.I(parcel, 3, this.f68030C, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
