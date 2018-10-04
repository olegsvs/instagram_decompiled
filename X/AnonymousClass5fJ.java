package X;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Semaphore;

/* renamed from: X.5fJ */
public final class AnonymousClass5fJ extends AnonymousClass11O implements AnonymousClass20Z {
    /* renamed from: B */
    private Semaphore f67971B = new Semaphore(0);
    /* renamed from: C */
    private Set f67972C;

    public AnonymousClass5fJ(Context context, Set set) {
        super(context);
        this.f67972C = set;
    }

    /* renamed from: F */
    public final void m28214F() {
        this.f67971B.drainPermits();
        D();
    }

    /* renamed from: L */
    public final java.lang.Object m28215L() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = r5.f67972C;
        r1 = r0.iterator();
        r4 = 0;
    L_0x0007:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x001c;
    L_0x000d:
        r0 = r1.next();
        r0 = (X.AnonymousClass1yt) r0;
        r0 = r0.O(r5);
        if (r0 == 0) goto L_0x0007;
    L_0x0019:
        r4 = r4 + 1;
        goto L_0x0007;
    L_0x001c:
        r3 = r5.f67971B;	 Catch:{ InterruptedException -> 0x0026 }
        r1 = 5;	 Catch:{ InterruptedException -> 0x0026 }
        r0 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0026 }
        r3.tryAcquire(r4, r1, r0);	 Catch:{ InterruptedException -> 0x0026 }
        goto L_0x002d;	 Catch:{ InterruptedException -> 0x0026 }
    L_0x0026:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x002d:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5fJ.L():java.lang.Object");
    }

    public final void OYA() {
        this.f67971B.release();
    }
}
