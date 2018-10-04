package X;

import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import java.util.HashSet;

/* renamed from: X.2P3 */
public final class AnonymousClass2P3 {
    /* renamed from: E */
    private static AnonymousClass2P3 f30132E;
    /* renamed from: B */
    public PrefetchCacheEntry f30133B;
    /* renamed from: C */
    private AnonymousClass1qK f30134C = AnonymousClass1qK.m13396B();
    /* renamed from: D */
    private HashSet f30135D;

    /* renamed from: A */
    public final String m15570A() {
        PrefetchCacheEntry prefetchCacheEntry = this.f30133B;
        if (prefetchCacheEntry != null) {
            return prefetchCacheEntry.f23356E;
        }
        return null;
    }

    /* renamed from: B */
    public static AnonymousClass2P3 m15569B() {
        if (f30132E == null) {
            f30132E = new AnonymousClass2P3();
        }
        return f30132E;
    }

    /* renamed from: B */
    public final android.webkit.WebResourceResponse m15571B(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r1 = r3.f30133B;
        r2 = 0;
        if (r1 == 0) goto L_0x0010;
    L_0x0005:
        r0 = r1.f23356E;
        r0 = android.text.TextUtils.equals(r0, r4);
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        r3.f30133B = r2;
        goto L_0x0034;
    L_0x0010:
        r0 = r3.f30135D;
        if (r0 != 0) goto L_0x0015;
    L_0x0014:
        return r2;
    L_0x0015:
        r1 = X.AnonymousClass1r5.m13447E(r4);
        monitor-enter(r3);
        r0 = r3.f30135D;	 Catch:{ all -> 0x0046 }
        if (r0 == 0) goto L_0x0044;	 Catch:{ all -> 0x0046 }
    L_0x001e:
        r0 = r3.f30135D;	 Catch:{ all -> 0x0046 }
        r0 = r0.contains(r1);	 Catch:{ all -> 0x0046 }
        if (r0 != 0) goto L_0x0027;	 Catch:{ all -> 0x0046 }
    L_0x0026:
        goto L_0x0044;	 Catch:{ all -> 0x0046 }
    L_0x0027:
        monitor-exit(r3);	 Catch:{ all -> 0x0046 }
        r0 = r3.f30134C;
        r0 = r0.f23263C;
        if (r0 == 0) goto L_0x0033;
    L_0x002e:
        r1 = r0.nP(r4);	 Catch:{ RemoteException -> 0x0033 }
        goto L_0x0034;	 Catch:{ RemoteException -> 0x0033 }
    L_0x0033:
        r1 = 0;
    L_0x0034:
        if (r1 == 0) goto L_0x0014;
    L_0x0036:
        r0 = r1.f23354C;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0014;
    L_0x003f:
        r0 = X.AnonymousClass1qB.m13390B(r1);
        return r0;
    L_0x0044:
        monitor-exit(r3);	 Catch:{ all -> 0x0046 }
        goto L_0x0014;	 Catch:{ all -> 0x0046 }
    L_0x0046:
        r0 = move-exception;	 Catch:{ all -> 0x0046 }
        monitor-exit(r3);	 Catch:{ all -> 0x0046 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2P3.B(java.lang.String):android.webkit.WebResourceResponse");
    }

    /* renamed from: C */
    public final synchronized void m15572C(HashSet hashSet) {
        if (hashSet != null) {
            if (!hashSet.isEmpty()) {
                this.f30135D = hashSet;
            }
        }
        this.f30135D = null;
    }
}
