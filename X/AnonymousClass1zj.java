package X;

import android.content.Context;

/* renamed from: X.1zj */
public final class AnonymousClass1zj {
    /* renamed from: B */
    public static boolean m14120B(Context context, int i, String str) {
        return AnonymousClass1F5.B(context).A(i, str);
    }

    /* renamed from: C */
    public static boolean m14121C(android.content.Context r4, int r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "com.google.android.gms";
        r0 = X.AnonymousClass1zj.m14120B(r4, r5, r0);
        r3 = 0;
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        return r3;
    L_0x000a:
        r2 = r4.getPackageManager();
        r1 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x0023 }
        r0 = 64;	 Catch:{ NameNotFoundException -> 0x0023 }
        r2 = r2.getPackageInfo(r1, r0);	 Catch:{ NameNotFoundException -> 0x0023 }
        r1 = X.AnonymousClass1F8.C(r4);
        r0 = r4.getPackageManager();
        r0 = r1.A(r0, r2);
        return r0;
    L_0x0023:
        r1 = "UidVerifier";
        r0 = 3;
        r0 = android.util.Log.isLoggable(r1, r0);
        if (r0 == 0) goto L_0x0009;
    L_0x002c:
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1zj.C(android.content.Context, int):boolean");
    }
}
