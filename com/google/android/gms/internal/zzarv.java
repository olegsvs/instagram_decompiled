package com.google.android.gms.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass5ff;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzarv extends zza {
    public static final Creator CREATOR = new AnonymousClass5ff();
    /* renamed from: B */
    private int f67995B;
    /* renamed from: C */
    private final Credential f67996C;

    public zzarv(int i, Credential credential) {
        this.f67995B = i;
        this.f67996C = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.G(parcel, 1, this.f67996C, i, false);
        AnonymousClass1zC.S(parcel, JsonMappingException.MAX_REFS_TO_LIST, this.f67995B);
        AnonymousClass1zC.B(parcel, U);
    }
}
