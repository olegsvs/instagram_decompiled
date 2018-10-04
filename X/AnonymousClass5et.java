package X;

import android.content.Context;
import android.util.Base64;

/* renamed from: X.5et */
public final class AnonymousClass5et {
    /* renamed from: B */
    public static void m28201B(Context context, String str, String str2, AnonymousClass6EC anonymousClass6EC) {
        String str3;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (str == null) {
            str = "unknown";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        String str4 = "|";
        stringBuilder.append(str4);
        stringBuilder.append(currentTimeMillis);
        stringBuilder.append(str4);
        byte[] C = AnonymousClass5et.m28202C(stringBuilder.toString());
        if (C == null) {
            str3 = "unknown";
        } else {
            str3 = Base64.encodeToString(C, 2);
        }
        AnonymousClass1Eo anonymousClass1Eo = AnonymousClass1En.f15943B;
        int B = anonymousClass1Eo.B(context);
        if (B != 0) {
            str4 = anonymousClass1Eo.A(B);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("GOOGLE_PLAY_UNAVAILABLE: ");
            stringBuilder2.append(str4);
            anonymousClass6EC.m29562A(stringBuilder2.toString(), str3);
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("VERIFICATION_PENDING: request time is ");
        stringBuilder.append(currentTimeMillis);
        anonymousClass6EC.m29562A(stringBuilder.toString(), str3);
        AnonymousClass1yt anonymousClass1yt = new AnonymousClass5gG(context).f24964E;
        AnonymousClass1yv P = anonymousClass1yt.P(new AnonymousClass6HG(anonymousClass1yt, C, str2));
        AnonymousClass1zN anonymousClass2Se = new AnonymousClass2Se(new AnonymousClass5gD());
        AnonymousClass1zO anonymousClass1zO = AnonymousClass1hk.f21554B;
        AnonymousClass21G anonymousClass21G = new AnonymousClass21G();
        P.D(new AnonymousClass2Sd(P, anonymousClass21G, anonymousClass2Se, anonymousClass1zO));
        anonymousClass21G.f25283B.D(new AnonymousClass5es(anonymousClass6EC, str3)).C(new AnonymousClass5er(anonymousClass6EC, str3));
    }

    /* renamed from: C */
    private static byte[] m28202C(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 24;
        r2 = new byte[r0];
        r0 = new java.security.SecureRandom;
        r0.<init>();
        r0.nextBytes(r2);
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r0 = r3.getBytes();	 Catch:{ IOException -> 0x0020 }
        r1.write(r0);	 Catch:{ IOException -> 0x0020 }
        r1.write(r2);	 Catch:{ IOException -> 0x0020 }
        r0 = r1.toByteArray();
        return r0;
    L_0x0020:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5et.C(java.lang.String):byte[]");
    }
}
