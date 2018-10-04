package com.google.android.gms.identity.intents.model;

import X.AnonymousClass1zC;
import X.AnonymousClass5fW;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

public class CountrySpecification extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass5fW();
    /* renamed from: B */
    private String f67976B;

    public CountrySpecification(String str) {
        this.f67976B = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.I(parcel, 2, this.f67976B, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
