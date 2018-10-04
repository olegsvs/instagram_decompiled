package X;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.21x */
public final class AnonymousClass21x {
    /* renamed from: B */
    private final Object f25345B = new Object();
    /* renamed from: C */
    private Queue f25346C;
    /* renamed from: D */
    private boolean f25347D;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final void m14213A(X.AnonymousClass21r r3) {
        /*
        r2 = this;
        r1 = r2.f25345B;
        monitor-enter(r1);
        r0 = r2.f25346C;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x002a;
    L_0x0007:
        r0 = r2.f25347D;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x002a;
    L_0x000c:
        r0 = 1;
        r2.f25347D = r0;	 Catch:{ all -> 0x002c }
        monitor-exit(r1);	 Catch:{ all -> 0x002c }
    L_0x0010:
        r1 = r2.f25345B;
        monitor-enter(r1);
        r0 = r2.f25346C;	 Catch:{ all -> 0x0027 }
        r0 = r0.poll();	 Catch:{ all -> 0x0027 }
        r0 = (X.AnonymousClass21w) r0;	 Catch:{ all -> 0x0027 }
        if (r0 != 0) goto L_0x0022;
    L_0x001d:
        r0 = 0;
        r2.f25347D = r0;	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
    L_0x0021:
        return;
    L_0x0022:
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        r0.LB(r3);
        goto L_0x0010;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
    L_0x0029:
        throw r0;
    L_0x002a:
        monitor-exit(r1);	 Catch:{ all -> 0x002c }
        goto L_0x0021;
    L_0x002c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002c }
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.21x.A(X.21r):void");
    }

    /* renamed from: B */
    public final void m14214B(AnonymousClass21w anonymousClass21w) {
        synchronized (this.f25345B) {
            if (this.f25346C == null) {
                this.f25346C = new ArrayDeque();
            }
            this.f25346C.add(anonymousClass21w);
        }
    }
}
