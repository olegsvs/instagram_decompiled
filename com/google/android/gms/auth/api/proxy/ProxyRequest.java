package com.google.android.gms.auth.api.proxy;

import X.AnonymousClass1zC;
import X.AnonymousClass5fF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.common.internal.safeparcel.zza;

public class ProxyRequest extends zza {
    public static final Creator CREATOR = new AnonymousClass5fF();
    /* renamed from: B */
    public final byte[] f67945B;
    /* renamed from: C */
    public final int f67946C;
    /* renamed from: D */
    public final long f67947D;
    /* renamed from: E */
    public final String f67948E;
    /* renamed from: F */
    private int f67949F;
    /* renamed from: G */
    private Bundle f67950G;

    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.f67949F = i;
        this.f67948E = str;
        this.f67946C = i2;
        this.f67947D = j;
        this.f67945B = bArr;
        this.f67950G = bundle;
    }

    public final String toString() {
        String str = this.f67948E;
        int i = this.f67946C;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 42);
        stringBuilder.append("ProxyRequest[ url: ");
        stringBuilder.append(str);
        stringBuilder.append(", method: ");
        stringBuilder.append(i);
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.I(parcel, 1, this.f67948E, false);
        AnonymousClass1zC.S(parcel, 2, this.f67946C);
        AnonymousClass1zC.C(parcel, 3, this.f67947D);
        AnonymousClass1zC.L(parcel, 4, this.f67945B, false);
        AnonymousClass1zC.D(parcel, 5, this.f67950G, false);
        AnonymousClass1zC.S(parcel, JsonMappingException.MAX_REFS_TO_LIST, this.f67949F);
        AnonymousClass1zC.B(parcel, U);
    }
}
