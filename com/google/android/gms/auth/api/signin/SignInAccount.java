package com.google.android.gms.auth.api.signin;

import X.AnonymousClass1Ew;
import X.AnonymousClass1zC;
import X.AnonymousClass5fO;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

public class SignInAccount extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass5fO();
    /* renamed from: B */
    public GoogleSignInAccount f67957B;
    /* renamed from: C */
    private int f67958C;
    /* renamed from: D */
    private String f67959D;
    /* renamed from: E */
    private String f67960E;

    public SignInAccount(int i, String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f67958C = i;
        this.f67957B = googleSignInAccount;
        this.f67960E = AnonymousClass1Ew.H(str, "8.3 and 8.4 SDKs require non-null email");
        this.f67959D = AnonymousClass1Ew.H(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.S(parcel, 1, this.f67958C);
        AnonymousClass1zC.I(parcel, 4, this.f67960E, false);
        AnonymousClass1zC.G(parcel, 7, this.f67957B, i, false);
        AnonymousClass1zC.I(parcel, 8, this.f67959D, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
