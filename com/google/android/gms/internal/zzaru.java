package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public final class zzaru extends zzed implements zzart {
    public zzaru(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        AnonymousClass0cQ.H(this, 1063891061, AnonymousClass0cQ.I(this, -622710327));
    }

    public final void cXA(zzarr zzarr) {
        int I = AnonymousClass0cQ.I(this, -50917359);
        Parcel A = A();
        AnonymousClass1FC.C(A, zzarr);
        C(4, A);
        AnonymousClass0cQ.H(this, -1234914709, I);
    }

    public final void dXA(zzarr zzarr, CredentialRequest credentialRequest) {
        int I = AnonymousClass0cQ.I(this, -2139450884);
        Parcel A = A();
        AnonymousClass1FC.C(A, zzarr);
        AnonymousClass1FC.D(A, credentialRequest);
        C(1, A);
        AnonymousClass0cQ.H(this, 726326812, I);
    }
}
