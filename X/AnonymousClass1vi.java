package X;

import com.facebook.login.LoginClient$Request;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;

/* renamed from: X.1vi */
public final class AnonymousClass1vi {
    /* renamed from: C */
    private static volatile AnonymousClass1vi f24273C;
    /* renamed from: B */
    public LoginClient$Request f24274B;

    /* renamed from: B */
    public static LoginClient$Request m13797B(Collection collection, String str) {
        return new LoginClient$Request(Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet()), AnonymousClass0FG.f2096C, UUID.randomUUID().toString(), AnonymousClass0Iq.B(str).B() != null, str);
    }

    /* renamed from: C */
    public static AnonymousClass1vi m13798C() {
        if (f24273C == null) {
            synchronized (AnonymousClass1vi.class) {
                if (f24273C == null) {
                    f24273C = new AnonymousClass1vi();
                }
            }
        }
        return f24273C;
    }

    /* renamed from: D */
    public static void m13799D(AnonymousClass1vi anonymousClass1vi, AnonymousClass1vl anonymousClass1vl, LoginClient$Request loginClient$Request) {
        anonymousClass1vi.f24274B = loginClient$Request;
        if (!anonymousClass1vi.m13800E(anonymousClass1vl, loginClient$Request)) {
            AnonymousClass1ol anonymousClass1ol = new AnonymousClass1ol("Log in attempt failed: LoginActivity could not be started");
            anonymousClass1vi.f24274B = null;
            throw anonymousClass1ol;
        }
    }

    /* renamed from: E */
    private boolean m13800E(X.AnonymousClass1vl r3, com.facebook.login.LoginClient$Request r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r2 = new android.content.Intent;
        r2.<init>();
        r1 = X.AnonymousClass0FG.f2095B;
        r0 = com.facebook.FacebookActivity.class;
        r2.setClass(r1, r0);
        r1 = new android.os.Bundle;
        r1.<init>();
        r0 = "Request";
        r1.putParcelable(r0, r4);
        r2.putExtras(r1);
        r0 = 64206; // 0xface float:8.9972E-41 double:3.1722E-319;
        r0 = r3.SUA(r2, r0);	 Catch:{ ActivityNotFoundException -> 0x0021 }
        return r0;	 Catch:{ ActivityNotFoundException -> 0x0021 }
    L_0x0021:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1vi.E(X.1vl, com.facebook.login.LoginClient$Request):boolean");
    }
}
