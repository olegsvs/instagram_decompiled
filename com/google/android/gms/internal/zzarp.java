package com.google.android.gms.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass5fe;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzarp extends zza {
    public static final Creator CREATOR = new AnonymousClass5fe();
    /* renamed from: B */
    private int f67993B;
    /* renamed from: C */
    private final Credential f67994C;

    public zzarp(int i, Credential credential) {
        this.f67993B = i;
        this.f67994C = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.G(parcel, 1, this.f67994C, i, false);
        AnonymousClass1zC.S(parcel, JsonMappingException.MAX_REFS_TO_LIST, this.f67993B);
        AnonymousClass1zC.B(parcel, U);
    }
}
