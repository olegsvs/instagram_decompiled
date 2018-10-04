package X;

import com.facebook.forker.Process;
import java.util.LinkedList;

/* renamed from: X.3vD */
public abstract class AnonymousClass3vD implements AnonymousClass2vA {
    /* renamed from: B */
    public int f46803B;
    /* renamed from: C */
    public final AnonymousClass3vB[] f46804C;
    /* renamed from: D */
    public AnonymousClass3vB f46805D;
    /* renamed from: E */
    public Exception f46806E;
    /* renamed from: F */
    public final Object f46807F = new Object();
    /* renamed from: G */
    public final LinkedList f46808G = new LinkedList();
    /* renamed from: H */
    private int f46809H;
    /* renamed from: I */
    private final AnonymousClass3vC[] f46810I;
    /* renamed from: J */
    private final Thread f46811J;
    /* renamed from: K */
    private boolean f46812K;
    /* renamed from: L */
    private final LinkedList f46813L = new LinkedList();
    /* renamed from: M */
    private boolean f46814M;
    /* renamed from: N */
    private int f46815N;

    /* renamed from: A */
    public abstract AnonymousClass3vB mo5276A();

    /* renamed from: B */
    public abstract AnonymousClass3vC mo5277B();

    /* renamed from: C */
    public abstract Exception mo5278C(Throwable th);

    /* renamed from: D */
    public abstract Exception mo5279D(AnonymousClass3vB anonymousClass3vB, AnonymousClass3vC anonymousClass3vC, boolean z);

    public AnonymousClass3vD(AnonymousClass3vB[] anonymousClass3vBArr, AnonymousClass3vC[] anonymousClass3vCArr) {
        this.f46804C = anonymousClass3vBArr;
        this.f46803B = anonymousClass3vBArr.length;
        for (int i = 0; i < this.f46803B; i++) {
            this.f46804C[i] = mo5276A();
        }
        this.f46810I = anonymousClass3vCArr;
        this.f46809H = anonymousClass3vCArr.length;
        for (int i2 = 0; i2 < this.f46809H; i2++) {
            this.f46810I[i2] = mo5277B();
        }
        Thread anonymousClass2vC = new AnonymousClass2vC(this);
        this.f46811J = anonymousClass2vC;
        anonymousClass2vC.start();
    }

    /* renamed from: B */
    public static boolean m21472B(AnonymousClass3vD anonymousClass3vD) {
        return !anonymousClass3vD.f46808G.isEmpty() && anonymousClass3vD.f46809H > 0;
    }

    /* renamed from: C */
    public static boolean m21473C(AnonymousClass3vD anonymousClass3vD) {
        synchronized (anonymousClass3vD.f46807F) {
            while (!anonymousClass3vD.f46814M && !AnonymousClass3vD.m21472B(anonymousClass3vD)) {
                try {
                    anonymousClass3vD.f46807F.wait();
                } catch (Throwable th) {
                    while (true) {
                        Throwable th2 = th;
                        break;
                    }
                }
            }
            if (anonymousClass3vD.f46814M) {
            } else {
                AnonymousClass3vB anonymousClass3vB = (AnonymousClass3vB) anonymousClass3vD.f46808G.removeFirst();
                AnonymousClass3vC[] anonymousClass3vCArr = anonymousClass3vD.f46810I;
                int i = anonymousClass3vD.f46809H - 1;
                anonymousClass3vD.f46809H = i;
                AnonymousClass2v7 anonymousClass2v7 = anonymousClass3vCArr[i];
                boolean z = anonymousClass3vD.f46812K;
                anonymousClass3vD.f46812K = false;
                if (anonymousClass3vB.m17767E()) {
                    anonymousClass2v7.m17763A(4);
                } else {
                    if (anonymousClass3vB.m17766D()) {
                        anonymousClass2v7.m17763A(Process.WAIT_RESULT_TIMEOUT);
                    }
                    try {
                        anonymousClass3vD.f46806E = anonymousClass3vD.mo5279D(anonymousClass3vB, anonymousClass2v7, z);
                    } catch (Throwable th22) {
                        anonymousClass3vD.f46806E = anonymousClass3vD.mo5278C(th22);
                    } catch (Throwable th222) {
                        anonymousClass3vD.f46806E = anonymousClass3vD.mo5278C(th222);
                    }
                    if (anonymousClass3vD.f46806E != null) {
                        synchronized (anonymousClass3vD.f46807F) {
                            try {
                            } catch (Throwable th3) {
                                th222 = th3;
                                throw th222;
                            }
                        }
                    }
                }
                synchronized (anonymousClass3vD.f46807F) {
                    try {
                        if (!anonymousClass3vD.f46812K) {
                            if (anonymousClass2v7.m17766D()) {
                                anonymousClass3vD.f46815N++;
                            } else {
                                anonymousClass3vD.f46815N = 0;
                                anonymousClass3vD.f46813L.addLast(anonymousClass2v7);
                                AnonymousClass3vD.m21474D(anonymousClass3vD, anonymousClass3vB);
                            }
                        }
                        AnonymousClass3vD.m21475E(anonymousClass3vD, anonymousClass2v7);
                        AnonymousClass3vD.m21474D(anonymousClass3vD, anonymousClass3vB);
                    } catch (Throwable th4) {
                        th222 = th4;
                        throw th222;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    private static void m21474D(AnonymousClass3vD anonymousClass3vD, AnonymousClass3vB anonymousClass3vB) {
        anonymousClass3vB.mo4533B();
        AnonymousClass3vB[] anonymousClass3vBArr = anonymousClass3vD.f46804C;
        int i = anonymousClass3vD.f46803B;
        anonymousClass3vD.f46803B = i + 1;
        anonymousClass3vBArr[i] = anonymousClass3vB;
    }

    /* renamed from: E */
    public final AnonymousClass3vC m21480E() {
        AnonymousClass3vC anonymousClass3vC;
        synchronized (this.f46807F) {
            Exception exception = this.f46806E;
            if (exception != null) {
                throw exception;
            } else if (this.f46813L.isEmpty()) {
                anonymousClass3vC = null;
            } else {
                anonymousClass3vC = (AnonymousClass3vC) this.f46813L.removeFirst();
            }
        }
        return anonymousClass3vC;
    }

    /* renamed from: E */
    private static void m21475E(AnonymousClass3vD anonymousClass3vD, AnonymousClass3vC anonymousClass3vC) {
        anonymousClass3vC.mo4533B();
        AnonymousClass3vC[] anonymousClass3vCArr = anonymousClass3vD.f46810I;
        int i = anonymousClass3vD.f46809H;
        anonymousClass3vD.f46809H = i + 1;
        anonymousClass3vCArr[i] = anonymousClass3vC;
    }

    /* renamed from: F */
    public void mo5280F(AnonymousClass3vC anonymousClass3vC) {
        synchronized (this.f46807F) {
            AnonymousClass3vD.m21475E(this, anonymousClass3vC);
            if (AnonymousClass3vD.m21472B(this)) {
                this.f46807F.notify();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object NG() {
        AnonymousClass3vB anonymousClass3vB;
        synchronized (this.f46807F) {
            Exception exception = this.f46806E;
            if (exception == null) {
                AnonymousClass2yO.m18017F(this.f46805D == null);
                if (this.f46803B == 0) {
                    anonymousClass3vB = null;
                } else {
                    AnonymousClass3vB[] anonymousClass3vBArr = this.f46804C;
                    int i = this.f46803B - 1;
                    this.f46803B = i;
                    anonymousClass3vB = anonymousClass3vBArr[i];
                }
                this.f46805D = anonymousClass3vB;
                anonymousClass3vB = this.f46805D;
            } else {
                throw exception;
            }
        }
        return anonymousClass3vB;
    }

    public final /* bridge */ /* synthetic */ Object OG() {
        return m21480E();
    }

    public final /* bridge */ /* synthetic */ void aIA(Object obj) {
        AnonymousClass3vB anonymousClass3vB = (AnonymousClass3vB) obj;
        synchronized (this.f46807F) {
            Exception exception = this.f46806E;
            if (exception == null) {
                AnonymousClass2yO.m18013B(anonymousClass3vB == this.f46805D);
                this.f46808G.addLast(anonymousClass3vB);
                if (AnonymousClass3vD.m21472B(this)) {
                    this.f46807F.notify();
                }
                this.f46805D = null;
            } else {
                throw exception;
            }
        }
    }

    public final void flush() {
        synchronized (this.f46807F) {
            this.f46812K = true;
            this.f46815N = 0;
            if (this.f46805D != null) {
                AnonymousClass3vD.m21474D(this, this.f46805D);
                this.f46805D = null;
            }
            while (!this.f46808G.isEmpty()) {
                AnonymousClass3vD.m21474D(this, (AnonymousClass3vB) this.f46808G.removeFirst());
            }
            while (!this.f46813L.isEmpty()) {
                AnonymousClass3vD.m21475E(this, (AnonymousClass3vC) this.f46813L.removeFirst());
            }
        }
    }

    public final void release() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r1 = r2.f46807F;
        monitor-enter(r1);
        r0 = 1;
        r2.f46814M = r0;	 Catch:{ all -> 0x001a }
        r0 = r2.f46807F;	 Catch:{ all -> 0x001a }
        r0.notify();	 Catch:{ all -> 0x001a }
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        r0 = r2.f46811J;	 Catch:{ InterruptedException -> 0x0012 }
        r0.join();	 Catch:{ InterruptedException -> 0x0012 }
        goto L_0x0019;	 Catch:{ InterruptedException -> 0x0012 }
    L_0x0012:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0019:
        return;
    L_0x001a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3vD.release():void");
    }
}
