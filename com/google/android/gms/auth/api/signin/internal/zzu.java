package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.zzed;

public final class zzu extends zzed implements zzt {
    public zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
        AnonymousClass0cQ.H(this, -241623104, AnonymousClass0cQ.I(this, 1186969474));
    }

    public final void wXA(zzr zzr, GoogleSignInOptions googleSignInOptions) {
        int I = AnonymousClass0cQ.I(this, 1350440257);
        Parcel A = A();
        AnonymousClass1FC.C(A, zzr);
        AnonymousClass1FC.D(A, googleSignInOptions);
        C(103, A);
        AnonymousClass0cQ.H(this, -1791536590, I);
    }
}
