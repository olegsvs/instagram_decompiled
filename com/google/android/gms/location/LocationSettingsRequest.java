package com.google.android.gms.location;

import X.AnonymousClass1zC;
import X.AnonymousClass5g8;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest extends zza {
    public static final Creator CREATOR = new AnonymousClass5g8();
    /* renamed from: B */
    private final List f68051B;
    /* renamed from: C */
    private final boolean f68052C;
    /* renamed from: D */
    private final boolean f68053D;
    /* renamed from: E */
    private zzt f68054E;

    public LocationSettingsRequest(List list, boolean z, boolean z2, zzt zzt) {
        this.f68051B = list;
        this.f68052C = z;
        this.f68053D = z2;
        this.f68054E = zzt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.T(parcel, 1, Collections.unmodifiableList(this.f68051B), false);
        AnonymousClass1zC.K(parcel, 2, this.f68052C);
        AnonymousClass1zC.K(parcel, 3, this.f68053D);
        AnonymousClass1zC.G(parcel, 5, this.f68054E, i, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
