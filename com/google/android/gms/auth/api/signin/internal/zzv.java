package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1Ew;
import X.AnonymousClass1yd;
import X.AnonymousClass1yl;
import X.AnonymousClass1yq;
import X.AnonymousClass1yt;
import X.AnonymousClass1zj;
import X.AnonymousClass5ey;
import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collection;

public final class zzv extends zzq {
    /* renamed from: B */
    private final Context f73960B;

    public zzv(Context context) {
        int I = AnonymousClass0cQ.I(this, 1544022288);
        this.f73960B = context;
        AnonymousClass0cQ.H(this, -1063941502, I);
    }

    public final void RYA() {
        int I = AnonymousClass0cQ.I(this, 221617446);
        if (AnonymousClass1zj.C(this.f73960B, Binder.getCallingUid())) {
            AnonymousClass1yd B = AnonymousClass1yd.B(this.f73960B);
            GoogleSignInAccount A = B.A();
            Object obj = GoogleSignInOptions.f32143K;
            if (A != null) {
                obj = B.B();
            }
            AnonymousClass1yq anonymousClass1yq = new AnonymousClass1yq(this.f73960B);
            AnonymousClass1yl anonymousClass1yl = AnonymousClass5ey.f67874D;
            AnonymousClass1Ew.E(anonymousClass1yl, "Api must not be null");
            AnonymousClass1Ew.E(obj, "Null options are not permitted for this Api");
            anonymousClass1yq.f24973D.put(anonymousClass1yl, obj);
            Collection A2 = anonymousClass1yl.f24956C.A(obj);
            anonymousClass1yq.f24972C.addAll(A2);
            anonymousClass1yq.f24971B.addAll(A2);
            AnonymousClass1yt B2 = anonymousClass1yq.B();
            try {
                if (B2.A().B()) {
                    if (A != null) {
                        AnonymousClass5ey.f67875E.ZLA(B2);
                    } else {
                        B2.B();
                    }
                }
                B2.D();
                AnonymousClass0cQ.H(this, -305040008, I);
            } catch (Throwable th) {
                B2.D();
                AnonymousClass0cQ.H(this, -1464076235, I);
            }
        } else {
            int callingUid = Binder.getCallingUid();
            StringBuilder stringBuilder = new StringBuilder(52);
            stringBuilder.append("Calling UID ");
            stringBuilder.append(callingUid);
            stringBuilder.append(" is not Google Play services.");
            SecurityException securityException = new SecurityException(stringBuilder.toString());
            AnonymousClass0cQ.H(this, 470727373, I);
            throw securityException;
        }
    }
}
