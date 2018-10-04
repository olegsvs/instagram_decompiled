package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.2Ri */
public final class AnonymousClass2Ri implements AnonymousClass1vj {
    /* renamed from: B */
    private AnonymousClass2Rj f30494B;
    /* renamed from: C */
    private AnonymousClass2Rj f30495C;

    public AnonymousClass2Ri(AnonymousClass2Rj anonymousClass2Rj) {
        this.f30495C = anonymousClass2Rj;
        this.f30494B = anonymousClass2Rj;
    }

    /* renamed from: A */
    public final void m15749A(android.content.Intent r2, int r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        if (r2 != 0) goto L_0x0008;
    L_0x0002:
        r0 = r1.f30494B;
        r0.m15752D();
        return;
    L_0x0008:
        r0 = r1.f30495C;	 Catch:{ ActivityNotFoundException -> 0x0011 }
        r0 = r0.f30496B;	 Catch:{ ActivityNotFoundException -> 0x0011 }
        r0 = X.AnonymousClass0IW.H(r2, r3, r0);	 Catch:{ ActivityNotFoundException -> 0x0011 }
        goto L_0x0017;	 Catch:{ ActivityNotFoundException -> 0x0011 }
    L_0x0011:
        r0 = r1.f30494B;
        r0.m15752D();
        r0 = 1;
    L_0x0017:
        if (r0 != 0) goto L_0x001e;
    L_0x0019:
        r0 = r1.f30494B;
        r0.m15752D();
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2Ri.A(android.content.Intent, int):void");
    }

    /* renamed from: B */
    private static LoginClient$Result m15748B(LoginClient$Request loginClient$Request, Intent intent) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("error");
        if (string == null) {
            string = extras.getString("error_type");
        }
        String string2 = extras.getString(TraceFieldType.ErrorCode);
        String string3 = extras.getString("error_message");
        if (string3 == null) {
            string3 = extras.getString(TraceFieldType.Error);
        }
        if (string == null && string2 == null && string3 == null) {
            try {
                return LoginClient$Result.m13796E(loginClient$Request, AnonymousClass2Rj.m15750B(loginClient$Request.f24262E, extras, AnonymousClass19W.FACEBOOK_APPLICATION_WEB, loginClient$Request.f24259B));
            } catch (AnonymousClass1ol e) {
                return LoginClient$Result.m13794C(loginClient$Request, null, e.getMessage());
            }
        } else if (AnonymousClass1v2.f24103B.contains(string)) {
            return null;
        } else {
            if (AnonymousClass1v2.f24104C.contains(string)) {
                return LoginClient$Result.m13793B(loginClient$Request, null);
            }
            return LoginClient$Result.m13795D(loginClient$Request, string, string3, string2);
        }
    }

    public final void jVA(LoginClient$Request loginClient$Request) {
        m15749A(AnonymousClass17q.D(this.f30495C.m15755B(), loginClient$Request.f24259B, loginClient$Request.f24262E, AnonymousClass2Rj.m15752D(), loginClient$Request.f24261D), 64206);
    }

    public final boolean onActivityResult(int i, int i2, Intent intent) {
        LoginClient$Result B;
        LoginClient$Request loginClient$Request = this.f30495C.f30499E;
        if (intent == null) {
            B = LoginClient$Result.m13793B(loginClient$Request, "Operation canceled");
        } else if (i2 == 0) {
            B = LoginClient$Result.m13793B(loginClient$Request, intent.getStringExtra("error"));
        } else if (i2 != -1) {
            B = LoginClient$Result.m13794C(loginClient$Request, "Unexpected resultCode from authorization.", null);
        } else {
            B = AnonymousClass2Ri.m15748B(loginClient$Request, intent);
        }
        if (B != null) {
            this.f30494B.m15756C(B);
        } else {
            this.f30494B.m15752D();
        }
        return true;
    }
}
