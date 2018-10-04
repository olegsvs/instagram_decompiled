package X;

import android.content.Context;
import android.util.LruCache;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.295 */
public final class AnonymousClass295 {
    /* renamed from: H */
    public static final AnonymousClass294 f26656H = new AnonymousClass2Vj();
    /* renamed from: I */
    public static final AnonymousClass294 f26657I = new AnonymousClass2Vk();
    /* renamed from: J */
    public static final AnonymousClass0aA f26658J;
    /* renamed from: K */
    private static AnonymousClass295 f26659K;
    /* renamed from: B */
    public final Map f26660B = new HashMap();
    /* renamed from: C */
    public final Context f26661C;
    /* renamed from: D */
    public AnonymousClass0To f26662D;
    /* renamed from: E */
    public final Executor f26663E = Executors.newSingleThreadExecutor();
    /* renamed from: F */
    public final LruCache f26664F = new LruCache(100);
    /* renamed from: G */
    private final Executor f26665G = Executors.newSingleThreadExecutor();

    static {
        AnonymousClass0gN anonymousClass0gN = new AnonymousClass0gN();
        anonymousClass0gN.f8152H = AnonymousClass0Qv.Image;
        anonymousClass0gN.f8146B = AnonymousClass0Qw.OnScreen;
        f26658J = anonymousClass0gN.A();
    }

    private AnonymousClass295(Context context) {
        this.f26661C = context;
    }

    /* renamed from: A */
    public final void m14611A(String str, AnonymousClass294 anonymousClass294, AnonymousClass293 anonymousClass293) {
        AnonymousClass2Vl anonymousClass2Vl = new AnonymousClass2Vl(this, str, anonymousClass294, anonymousClass293);
        synchronized (this) {
            if (this.f26662D == null) {
                AnonymousClass0GG.B(this.f26663E, new AnonymousClass290(this, anonymousClass2Vl), -197921716);
            } else {
                AnonymousClass0Sy.F(new AnonymousClass291(this, anonymousClass2Vl));
            }
        }
    }

    /* renamed from: B */
    public static void m14605B(AnonymousClass295 anonymousClass295, AnonymousClass0To anonymousClass0To, String str, AnonymousClass294 anonymousClass294, Runnable runnable) {
        String str2 = str;
        String WJ = anonymousClass294.WJ(str);
        AnonymousClass0fL D = anonymousClass0To.D(WJ);
        Runnable runnable2 = runnable;
        if (D.B()) {
            AnonymousClass295 anonymousClass2952 = anonymousClass295;
            AnonymousClass0GG.B(anonymousClass295.f26665G, new AnonymousClass28y(anonymousClass2952, (AnonymousClass0fK) D.A(), WJ, str2, runnable2), -646894423);
            return;
        }
        runnable.run();
    }

    /* renamed from: C */
    public static Set m14606C(AnonymousClass295 anonymousClass295, String str) {
        Set set = (Set) anonymousClass295.f26660B.get(str);
        return set != null ? set : Collections.emptySet();
    }

    /* renamed from: D */
    public static AnonymousClass295 m14607D(Context context) {
        if (f26659K == null) {
            f26659K = new AnonymousClass295(context.getApplicationContext());
        }
        return f26659K;
    }

    /* renamed from: E */
    public static synchronized void m14608E(AnonymousClass295 anonymousClass295, AnonymousClass0To anonymousClass0To, String str, AnonymousClass294 anonymousClass294, AnonymousClass293 anonymousClass293) {
        AnonymousClass295 anonymousClass2952 = anonymousClass295;
        synchronized (anonymousClass2952) {
            String str2 = str;
            AnonymousClass294 anonymousClass2942 = anonymousClass294;
            anonymousClass295 = anonymousClass294.WJ(str2);
            AnonymousClass292 anonymousClass292 = (AnonymousClass292) anonymousClass2952.f26664F.get(anonymousClass295);
            if (anonymousClass292 != null) {
                anonymousClass293.Hq(str2, anonymousClass292.f26655C, anonymousClass292.f26654B);
            } else {
                Object obj = (!anonymousClass2952.f26660B.containsKey(anonymousClass295) || ((Set) anonymousClass2952.f26660B.get(anonymousClass295)).isEmpty()) ? null : 1;
                Set set = (Set) anonymousClass2952.f26660B.get(anonymousClass295);
                if (set == null) {
                    set = new HashSet();
                    anonymousClass2952.f26660B.put(anonymousClass295, set);
                }
                set.add(anonymousClass293);
                if (obj == null) {
                    AnonymousClass0GG.B(anonymousClass2952.f26663E, new AnonymousClass28t(anonymousClass2952, str2, anonymousClass295, anonymousClass0To, anonymousClass2942, new AnonymousClass28s(anonymousClass2952, anonymousClass295, str2)), -1818403804);
                }
            }
        }
    }

    /* renamed from: F */
    public static void m14609F(X.AnonymousClass295 r6, X.AnonymousClass0To r7, java.lang.String r8, X.AnonymousClass294 r9, java.lang.Runnable r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = android.net.Uri.parse(r8);
        r5 = r9.WJ(r8);
        r4 = new java.io.ByteArrayOutputStream;
        r4.<init>();
        r0 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r3 = new byte[r0];
        r0 = r6.f26661C;	 Catch:{ IOException -> 0x003f }
        r0 = r0.getContentResolver();	 Catch:{ IOException -> 0x003f }
        r2 = r0.openInputStream(r1);	 Catch:{ IOException -> 0x003f }
    L_0x001b:
        r1 = r2.read(r3);	 Catch:{ IOException -> 0x003f }
        r0 = -1;	 Catch:{ IOException -> 0x003f }
        if (r1 == r0) goto L_0x0027;	 Catch:{ IOException -> 0x003f }
    L_0x0022:
        r0 = 0;	 Catch:{ IOException -> 0x003f }
        r4.write(r3, r0, r1);	 Catch:{ IOException -> 0x003f }
        goto L_0x001b;	 Catch:{ IOException -> 0x003f }
    L_0x0027:
        r4.flush();	 Catch:{ IOException -> 0x003f }
        r2.close();	 Catch:{ IOException -> 0x003f }
        r0 = r4.toByteArray();
        r0 = X.AnonymousClass295.m14610G(r7, r5, r0);
        if (r0 == 0) goto L_0x003b;
    L_0x0037:
        X.AnonymousClass295.m14605B(r6, r7, r8, r9, r10);
        goto L_0x003e;
    L_0x003b:
        r10.run();
    L_0x003e:
        return;
    L_0x003f:
        r10.run();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.295.F(X.295, X.0To, java.lang.String, X.294, java.lang.Runnable):void");
    }

    /* renamed from: G */
    public static boolean m14610G(AnonymousClass0To anonymousClass0To, String str, byte[] bArr) {
        str = anonymousClass0To.C(str);
        if (str.B() == null) {
            return null;
        }
        AnonymousClass145 anonymousClass145 = (AnonymousClass145) str.A();
        anonymousClass145.write(bArr);
        anonymousClass145.B();
        return true;
    }
}
