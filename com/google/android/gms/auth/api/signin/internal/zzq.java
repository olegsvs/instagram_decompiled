package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass0cQ;
import android.os.Parcel;
import com.google.android.gms.internal.zzee;

public abstract class zzq extends zzee implements zzp {
    public zzq() {
        int I = AnonymousClass0cQ.I(this, 5189950);
        attachInterface(this, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
        AnonymousClass0cQ.H(this, -1830362640, I);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int I = AnonymousClass0cQ.I(this, -357549050);
        if (A(i, parcel, parcel2, i2)) {
            i3 = -2090043643;
        } else if (i == 1) {
            RYA();
            i3 = 1232481560;
        } else {
            AnonymousClass0cQ.H(this, 1177432842, I);
            return false;
        }
        AnonymousClass0cQ.H(this, i3, I);
        return true;
    }
}
