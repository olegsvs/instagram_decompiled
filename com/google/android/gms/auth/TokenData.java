package com.google.android.gms.auth;

import X.AnonymousClass1Ew;
import X.AnonymousClass1zC;
import X.AnonymousClass1zL;
import X.AnonymousClass5fV;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import java.util.List;

public class TokenData extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass5fV();
    /* renamed from: B */
    private int f67864B;
    /* renamed from: C */
    private final String f67865C;
    /* renamed from: D */
    private final Long f67866D;
    /* renamed from: E */
    private final boolean f67867E;
    /* renamed from: F */
    private final boolean f67868F;
    /* renamed from: G */
    private final List f67869G;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list) {
        this.f67864B = i;
        this.f67865C = AnonymousClass1Ew.G(str);
        this.f67866D = l;
        this.f67867E = z;
        this.f67868F = z2;
        this.f67869G = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenData) {
            TokenData tokenData = (TokenData) obj;
            if (TextUtils.equals(this.f67865C, tokenData.f67865C) && AnonymousClass1zL.B(this.f67866D, tokenData.f67866D) && this.f67867E == tokenData.f67867E && this.f67868F == tokenData.f67868F && AnonymousClass1zL.B(this.f67869G, tokenData.f67869G)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f67865C, this.f67866D, Boolean.valueOf(this.f67867E), Boolean.valueOf(this.f67868F), this.f67869G});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.S(parcel, 1, this.f67864B);
        AnonymousClass1zC.I(parcel, 2, this.f67865C, false);
        AnonymousClass1zC.H(parcel, 3, this.f67866D, false);
        AnonymousClass1zC.K(parcel, 4, this.f67867E);
        AnonymousClass1zC.K(parcel, 5, this.f67868F);
        AnonymousClass1zC.R(parcel, 6, this.f67869G, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
