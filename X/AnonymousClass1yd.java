package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.1yd */
public final class AnonymousClass1yd {
    /* renamed from: D */
    private static final Lock f24951D = new ReentrantLock();
    /* renamed from: E */
    private static AnonymousClass1yd f24952E;
    /* renamed from: B */
    private final Lock f24953B = new ReentrantLock();
    /* renamed from: C */
    private final SharedPreferences f24954C;

    private AnonymousClass1yd(Context context) {
        this.f24954C = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: B */
    public static AnonymousClass1yd m13977B(Context context) {
        AnonymousClass1Ew.I(context);
        f24951D.lock();
        try {
            if (f24952E == null) {
                f24952E = new AnonymousClass1yd(context.getApplicationContext());
            }
            AnonymousClass1yd anonymousClass1yd = f24952E;
            return anonymousClass1yd;
        } finally {
            f24951D.unlock();
        }
    }

    /* renamed from: C */
    public static final void m13978C(AnonymousClass1yd anonymousClass1yd, String str, String str2) {
        anonymousClass1yd.f24953B.lock();
        try {
            anonymousClass1yd.f24954C.edit().putString(str, str2).apply();
        } finally {
            anonymousClass1yd.f24953B.unlock();
        }
    }

    /* renamed from: D */
    public static String m13979D(String str, String str2) {
        String valueOf = String.valueOf(":");
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + String.valueOf(valueOf).length()) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(valueOf);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    /* renamed from: E */
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount m13980E(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = android.text.TextUtils.isEmpty(r3);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = "googleSignInAccount";
        r0 = X.AnonymousClass1yd.m13979D(r0, r3);
        r0 = X.AnonymousClass1yd.m13982G(r2, r0);
        if (r0 == 0) goto L_0x0019;
    L_0x0014:
        r0 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.m13972B(r0);	 Catch:{ JSONException -> 0x0019 }
        return r0;	 Catch:{ JSONException -> 0x0019 }
    L_0x0019:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1yd.E(java.lang.String):com.google.android.gms.auth.api.signin.GoogleSignInAccount");
    }

    /* renamed from: F */
    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions m13981F(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = android.text.TextUtils.isEmpty(r3);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = "googleSignInOptions";
        r0 = X.AnonymousClass1yd.m13979D(r0, r3);
        r0 = X.AnonymousClass1yd.m13982G(r2, r0);
        if (r0 == 0) goto L_0x0019;
    L_0x0014:
        r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.m16780B(r0);	 Catch:{ JSONException -> 0x0019 }
        return r0;	 Catch:{ JSONException -> 0x0019 }
    L_0x0019:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1yd.F(java.lang.String):com.google.android.gms.auth.api.signin.GoogleSignInOptions");
    }

    /* renamed from: G */
    private static final String m13982G(AnonymousClass1yd anonymousClass1yd, String str) {
        anonymousClass1yd.f24953B.lock();
        try {
            String string = anonymousClass1yd.f24954C.getString(str, null);
            return string;
        } finally {
            anonymousClass1yd.f24953B.unlock();
        }
    }

    /* renamed from: H */
    private final void m13983H(String str) {
        this.f24953B.lock();
        try {
            this.f24954C.edit().remove(str).apply();
        } finally {
            this.f24953B.unlock();
        }
    }

    /* renamed from: A */
    public final GoogleSignInAccount m13984A() {
        return m13980E(AnonymousClass1yd.m13982G(this, "defaultGoogleSignInAccount"));
    }

    /* renamed from: B */
    public final GoogleSignInOptions m13985B() {
        return m13981F(AnonymousClass1yd.m13982G(this, "defaultGoogleSignInAccount"));
    }

    /* renamed from: C */
    public final void m13986C() {
        String str = "defaultGoogleSignInAccount";
        String G = AnonymousClass1yd.m13982G(this, str);
        m13983H(str);
        if (!TextUtils.isEmpty(G)) {
            m13983H(AnonymousClass1yd.m13979D("googleSignInAccount", G));
            m13983H(AnonymousClass1yd.m13979D("googleSignInOptions", G));
        }
    }
}
