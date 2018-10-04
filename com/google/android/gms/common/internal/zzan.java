package com.google.android.gms.common.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.zzed;

public final class zzan extends zzed implements zzal {
    public zzan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        AnonymousClass0cQ.H(this, -917959363, AnonymousClass0cQ.I(this, 206300376));
    }

    public final Account EI() {
        int I = AnonymousClass0cQ.I(this, 1185878407);
        Parcel B = B(2, A());
        Account account = (Account) AnonymousClass1FC.B(B, Account.CREATOR);
        B.recycle();
        AnonymousClass0cQ.H(this, -63077543, I);
        return account;
    }
}
