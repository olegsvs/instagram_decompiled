package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.07V */
public final class AnonymousClass07V {
    /* renamed from: B */
    public final AnonymousClass07u f546B;
    /* renamed from: C */
    public final ExecutorService f547C;

    public AnonymousClass07V(ExecutorService executorService, AnonymousClass07X anonymousClass07X, AnonymousClass0AH anonymousClass0AH) {
        this.f547C = executorService;
        this.f546B = new AnonymousClass07u(10, anonymousClass0AH.m685A(AnonymousClass061.ADDRESSES), "/settings_mqtt_address");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final synchronized java.util.concurrent.Future m444A(java.lang.String r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r2 = r4.f547C;	 Catch:{ all -> 0x0039 }
        r1 = new X.07U;	 Catch:{ all -> 0x0039 }
        r1.<init>(r4, r5);	 Catch:{ all -> 0x0039 }
        r0 = 391670844; // 0x17586c3c float:6.9929975E-25 double:1.935111085E-315;
        r3 = X.AnonymousClass0GG.m1765D(r2, r1, r0);	 Catch:{ all -> 0x0039 }
        r0 = r4.f546B;	 Catch:{ all -> 0x0039 }
        r1 = r0.m475C();	 Catch:{ all -> 0x0039 }
        r0 = r1.isEmpty();	 Catch:{ all -> 0x0039 }
        if (r0 == 0) goto L_0x001d;
    L_0x001b:
        monitor-exit(r4);
        return r3;
    L_0x001d:
        r2 = r1.first();	 Catch:{ all -> 0x0039 }
        r2 = (X.AnonymousClass07v) r2;	 Catch:{ all -> 0x0039 }
        r0 = r2.f716E;	 Catch:{ all -> 0x0039 }
        r0 = r0.equals(r5);	 Catch:{ all -> 0x0039 }
        if (r0 != 0) goto L_0x002c;
    L_0x002b:
        goto L_0x001b;
    L_0x002c:
        r1 = r2.f715D;	 Catch:{ all -> 0x0039 }
        r0 = 3;
        if (r1 <= r0) goto L_0x0032;
    L_0x0031:
        goto L_0x001b;
    L_0x0032:
        r0 = new X.06X;	 Catch:{ all -> 0x0039 }
        r0.<init>(r2);	 Catch:{ all -> 0x0039 }
        monitor-exit(r4);
        return r0;
    L_0x0039:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.07V.A(java.lang.String):java.util.concurrent.Future");
    }

    /* renamed from: B */
    public final synchronized void m445B(AnonymousClass07v anonymousClass07v) {
        AnonymousClass07v B = this.f546B.m474B(anonymousClass07v);
        if (B != null) {
            this.f546B.m476D(B, new AnonymousClass07v(B.f716E, B.m480B(), B.f717F - 10, B.f715D + 1));
            this.f546B.m477E();
        }
    }

    /* renamed from: C */
    public final synchronized void m446C(AnonymousClass07v anonymousClass07v) {
        AnonymousClass07v B = this.f546B.m474B(anonymousClass07v);
        if (B != null) {
            this.f546B.m476D(B, new AnonymousClass07v(B.f716E, B.m480B(), B.f717F, 0));
            this.f546B.m477E();
        }
    }
}
