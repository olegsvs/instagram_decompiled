package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass1Ew;
import X.AnonymousClass1yc;
import X.AnonymousClass1zC;
import X.AnonymousClass5fN;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class SignInConfiguration extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass5fN();
    /* renamed from: B */
    public GoogleSignInOptions f67961B;
    /* renamed from: C */
    private int f67962C;
    /* renamed from: D */
    private final String f67963D;

    public SignInConfiguration(int i, String str, GoogleSignInOptions googleSignInOptions) {
        this.f67962C = i;
        this.f67963D = AnonymousClass1Ew.G(str);
        this.f67961B = googleSignInOptions;
    }

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this(3, str, googleSignInOptions);
    }

    public final boolean equals(java.lang.Object r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r2;
    L_0x0004:
        r4 = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) r4;	 Catch:{ ClassCastException -> 0x0025 }
        r1 = r3.f67963D;	 Catch:{ ClassCastException -> 0x0025 }
        r0 = r4.f67963D;	 Catch:{ ClassCastException -> 0x0025 }
        r0 = r1.equals(r0);	 Catch:{ ClassCastException -> 0x0025 }
        if (r0 == 0) goto L_0x0025;	 Catch:{ ClassCastException -> 0x0025 }
    L_0x0010:
        r0 = r3.f67961B;	 Catch:{ ClassCastException -> 0x0025 }
        if (r0 != 0) goto L_0x0019;	 Catch:{ ClassCastException -> 0x0025 }
    L_0x0014:
        r0 = r4.f67961B;	 Catch:{ ClassCastException -> 0x0025 }
        if (r0 != 0) goto L_0x0025;	 Catch:{ ClassCastException -> 0x0025 }
    L_0x0018:
        goto L_0x0023;	 Catch:{ ClassCastException -> 0x0025 }
    L_0x0019:
        r1 = r3.f67961B;	 Catch:{ ClassCastException -> 0x0025 }
        r0 = r4.f67961B;	 Catch:{ ClassCastException -> 0x0025 }
        r0 = r1.equals(r0);	 Catch:{ ClassCastException -> 0x0025 }
        if (r0 == 0) goto L_0x0025;	 Catch:{ ClassCastException -> 0x0025 }
    L_0x0023:
        r0 = 1;	 Catch:{ ClassCastException -> 0x0025 }
        return r0;	 Catch:{ ClassCastException -> 0x0025 }
    L_0x0025:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInConfiguration.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return new AnonymousClass1yc().B(this.f67963D).B(this.f67961B).f24950B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.S(parcel, 1, this.f67962C);
        AnonymousClass1zC.I(parcel, 2, this.f67963D, false);
        AnonymousClass1zC.G(parcel, 5, this.f67961B, i, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
