package com.google.android.gms.auth;

import X.AnonymousClass1zC;
import X.AnonymousClass5fT;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.zza;

public class AccountChangeEventsRequest extends zza {
    public static final Creator CREATOR = new AnonymousClass5fT();
    /* renamed from: B */
    private int f67858B;
    /* renamed from: C */
    private Account f67859C;
    /* renamed from: D */
    private String f67860D;
    /* renamed from: E */
    private int f67861E;

    public AccountChangeEventsRequest() {
        this.f67858B = 1;
    }

    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.f67858B = i;
        this.f67861E = i2;
        this.f67860D = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f67859C = account;
        } else {
            this.f67859C = new Account(str, "com.google");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.S(parcel, 1, this.f67858B);
        AnonymousClass1zC.S(parcel, 2, this.f67861E);
        AnonymousClass1zC.I(parcel, 3, this.f67860D, false);
        AnonymousClass1zC.G(parcel, 4, this.f67859C, i, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
