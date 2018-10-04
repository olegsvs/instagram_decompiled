package com.google.android.gms.auth.api.credentials;

import X.AnonymousClass1Ew;
import X.AnonymousClass1zC;
import X.AnonymousClass5fA;
import X.AnonymousClass5fb;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class IdToken extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass5fA();
    /* renamed from: B */
    public final String f67930B;
    /* renamed from: C */
    public final String f67931C;
    /* renamed from: D */
    private int f67932D;

    public IdToken(int i, String str, String str2) {
        AnonymousClass5fb.m28226B(str);
        AnonymousClass1Ew.F(TextUtils.isEmpty(str2) ^ 1, "id token string cannot be null or empty");
        this.f67932D = i;
        this.f67930B = str;
        this.f67931C = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.I(parcel, 1, this.f67930B, false);
        AnonymousClass1zC.I(parcel, 2, this.f67931C, false);
        AnonymousClass1zC.S(parcel, JsonMappingException.MAX_REFS_TO_LIST, this.f67932D);
        AnonymousClass1zC.B(parcel, U);
    }
}
