package X;

import android.util.Pair;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: X.3un */
public final class AnonymousClass3un {
    /* renamed from: B */
    public final AnonymousClass2tW f46624B;
    /* renamed from: C */
    public AnonymousClass2tB f46625C;
    /* renamed from: D */
    public long f46626D;
    /* renamed from: E */
    public Pair f46627E;
    /* renamed from: F */
    public final long f46628F;
    /* renamed from: G */
    public FileOutputStream f46629G;
    /* renamed from: H */
    public long f46630H;
    /* renamed from: I */
    private File f46631I;

    public AnonymousClass3un(AnonymousClass2tW anonymousClass2tW, long j) {
        this.f46624B = (AnonymousClass2tW) AnonymousClass2td.m17605D(anonymousClass2tW);
        this.f46628F = j;
    }

    /* renamed from: B */
    public static void m21417B(X.AnonymousClass3un r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r5.f46629G;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r4 = 0;
        r0 = "cacheDataSinkSync";	 Catch:{ all -> 0x0040 }
        X.AnonymousClass2u3.m17644B(r0);	 Catch:{ all -> 0x0040 }
        r0 = r5.f46629G;	 Catch:{ all -> 0x0040 }
        r0.flush();	 Catch:{ all -> 0x0040 }
        X.AnonymousClass2u3.m17645C();
        r0 = r5.f46629G;
        r0.close();	 Catch:{ IOException -> 0x0018 }
    L_0x0018:
        r0 = r5.f46624B;
        r0 = r0.fWA();
        if (r0 == 0) goto L_0x0034;
    L_0x0020:
        r0 = r5.f46627E;
        r2 = r0.first;
        r2 = (X.AnonymousClass2tY) r2;
        r0 = r5.f46627E;
        r1 = r0.second;
        r1 = (java.io.File) r1;
        r0 = r5.f46624B;
        r0.qE(r2, r1);
        r5.f46627E = r4;
        goto L_0x003b;
    L_0x0034:
        r1 = r5.f46624B;
        r0 = r5.f46631I;
        r1.pE(r0);
    L_0x003b:
        r5.f46629G = r4;
        r5.f46631I = r4;
        return;
    L_0x0040:
        r3 = move-exception;
        X.AnonymousClass2u3.m17645C();
        r0 = r5.f46629G;
        r0.close();	 Catch:{ IOException -> 0x0049 }
    L_0x0049:
        r0 = r5.f46624B;
        r0 = r0.fWA();
        if (r0 == 0) goto L_0x0065;
    L_0x0051:
        r0 = r5.f46627E;
        r2 = r0.first;
        r2 = (X.AnonymousClass2tY) r2;
        r0 = r5.f46627E;
        r1 = r0.second;
        r1 = (java.io.File) r1;
        r0 = r5.f46624B;
        r0.eJA(r2, r1);
        r5.f46627E = r4;
        goto L_0x006a;
    L_0x0065:
        r0 = r5.f46631I;
        r0.delete();
    L_0x006a:
        r5.f46629G = r4;
        r5.f46631I = r4;
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3un.B(X.3un):void");
    }

    /* renamed from: C */
    public static void m21418C(AnonymousClass3un anonymousClass3un) {
        if (anonymousClass3un.f46624B.fWA()) {
            anonymousClass3un.f46627E = anonymousClass3un.f46624B.dUA(anonymousClass3un.f46625C.f35407I, anonymousClass3un.f46626D + anonymousClass3un.f46625C.f35400B, Math.min(anonymousClass3un.f46625C.f35408J - anonymousClass3un.f46626D, anonymousClass3un.f46628F));
            anonymousClass3un.f46629G = new FileOutputStream((File) anonymousClass3un.f46627E.second);
            anonymousClass3un.f46630H = 0;
            return;
        }
        anonymousClass3un.f46631I = anonymousClass3un.f46624B.cUA(anonymousClass3un.f46625C.f35407I, anonymousClass3un.f46625C.f35400B + anonymousClass3un.f46626D, Math.min(anonymousClass3un.f46625C.f35408J - anonymousClass3un.f46626D, anonymousClass3un.f46628F));
        anonymousClass3un.f46629G = new FileOutputStream(anonymousClass3un.f46631I);
        anonymousClass3un.f46630H = 0;
    }
}
