package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.os.Parcel;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzee;

public abstract class zzs extends zzee implements zzr {
    public zzs() {
        int I = AnonymousClass0cQ.I(this, 808084867);
        attachInterface(this, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        AnonymousClass0cQ.H(this, 1442827469, I);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int I = AnonymousClass0cQ.I(this, 894960427);
        if (A(i, parcel, parcel2, i2)) {
            i3 = 620420740;
        } else {
            switch (i) {
                case 101:
                    OXA((GoogleSignInAccount) AnonymousClass1FC.B(parcel, GoogleSignInAccount.CREATOR), (Status) AnonymousClass1FC.B(parcel, Status.CREATOR));
                    break;
                case ParserMinimalBase.INT_f /*102*/:
                    LYA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR));
                    break;
                case 103:
                    MYA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR));
                    break;
                default:
                    AnonymousClass0cQ.H(this, -567445947, I);
                    return false;
            }
            parcel2.writeNoException();
            i3 = -1078301682;
        }
        AnonymousClass0cQ.H(this, i3, I);
        return true;
    }
}
