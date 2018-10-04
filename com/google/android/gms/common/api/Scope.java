package com.google.android.gms.common.api;

import X.AnonymousClass1Ew;
import X.AnonymousClass1z4;
import X.AnonymousClass1zC;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class Scope extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass1z4();
    /* renamed from: B */
    public final String f24991B;
    /* renamed from: C */
    private int f24992C;

    public Scope(int i, String str) {
        AnonymousClass1Ew.H(str, "scopeUri must not be null or empty");
        this.f24992C = i;
        this.f24991B = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        return this == obj ? true : !(obj instanceof Scope) ? false : this.f24991B.equals(((Scope) obj).f24991B);
    }

    public final int hashCode() {
        return this.f24991B.hashCode();
    }

    public final String toString() {
        return this.f24991B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f24992C);
        AnonymousClass1zC.m14061I(parcel, 2, this.f24991B, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
