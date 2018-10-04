package com.google.android.gms.common.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass1zP;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzbp extends zza {
    public static final Creator CREATOR = new AnonymousClass1zP();
    /* renamed from: B */
    private final int f25040B;
    /* renamed from: C */
    private final GoogleSignInAccount f25041C;
    /* renamed from: D */
    private final Account f25042D;
    /* renamed from: E */
    private int f25043E;

    public zzbp(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f25043E = i;
        this.f25042D = account;
        this.f25040B = i2;
        this.f25041C = googleSignInAccount;
    }

    public zzbp(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f25043E);
        AnonymousClass1zC.m14059G(parcel, 2, this.f25042D, i, false);
        AnonymousClass1zC.m14071S(parcel, 3, this.f25040B);
        AnonymousClass1zC.m14059G(parcel, 4, this.f25041C, i, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
