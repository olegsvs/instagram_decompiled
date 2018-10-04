package com.google.android.gms.location;

import X.AnonymousClass1zC;
import X.AnonymousClass5gA;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class LocationSettingsStates extends zza {
    public static final Creator CREATOR = new AnonymousClass5gA();
    /* renamed from: B */
    public final boolean f68057B;
    /* renamed from: C */
    public final boolean f68058C;
    /* renamed from: D */
    public final boolean f68059D;
    /* renamed from: E */
    public final boolean f68060E;
    /* renamed from: F */
    public final boolean f68061F;
    /* renamed from: G */
    public final boolean f68062G;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f68057B = z;
        this.f68058C = z2;
        this.f68059D = z3;
        this.f68060E = z4;
        this.f68061F = z5;
        this.f68062G = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.K(parcel, 1, this.f68057B);
        AnonymousClass1zC.K(parcel, 2, this.f68058C);
        AnonymousClass1zC.K(parcel, 3, this.f68059D);
        AnonymousClass1zC.K(parcel, 4, this.f68060E);
        AnonymousClass1zC.K(parcel, 5, this.f68061F);
        AnonymousClass1zC.K(parcel, 6, this.f68062G);
        AnonymousClass1zC.B(parcel, U);
    }
}
