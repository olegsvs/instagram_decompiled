package X;

import java.util.LinkedList;

/* renamed from: X.3uw */
public abstract class AnonymousClass3uw extends Thread implements AnonymousClass2u8 {
    /* renamed from: B */
    public int f46668B;
    /* renamed from: C */
    public final AnonymousClass3uu[] f46669C;
    /* renamed from: D */
    public int f46670D;
    /* renamed from: E */
    public final AnonymousClass3uv[] f46671E;
    /* renamed from: F */
    public AnonymousClass3uu f46672F;
    /* renamed from: G */
    public Exception f46673G;
    /* renamed from: H */
    public boolean f46674H;
    /* renamed from: I */
    public final Object f46675I = new Object();
    /* renamed from: J */
    public final LinkedList f46676J = new LinkedList();
    /* renamed from: K */
    public final LinkedList f46677K = new LinkedList();
    /* renamed from: L */
    private boolean f46678L;

    public abstract AnonymousClass3uu createInputBuffer();

    public abstract AnonymousClass3uv createOutputBuffer();

    public abstract Exception decode(AnonymousClass3uu anonymousClass3uu, AnonymousClass3uv anonymousClass3uv);

    public AnonymousClass3uw(AnonymousClass3uu[] anonymousClass3uuArr, AnonymousClass3uv[] anonymousClass3uvArr) {
        this.f46669C = anonymousClass3uuArr;
        this.f46668B = anonymousClass3uuArr.length;
        for (int i = 0; i < this.f46668B; i++) {
            this.f46669C[i] = createInputBuffer();
        }
        this.f46671E = anonymousClass3uvArr;
        this.f46670D = anonymousClass3uvArr.length;
        for (int i2 = 0; i2 < this.f46670D; i2++) {
            this.f46671E[i2] = createOutputBuffer();
        }
    }

    /* renamed from: A */
    public final AnonymousClass3uu m21437A() {
        AnonymousClass3uu anonymousClass3uu;
        synchronized (this.f46675I) {
            Exception exception = this.f46673G;
            if (exception == null) {
                AnonymousClass2td.m17606E(this.f46672F == null);
                if (this.f46668B == 0) {
                    anonymousClass3uu = null;
                } else {
                    AnonymousClass3uu[] anonymousClass3uuArr = this.f46669C;
                    int i = this.f46668B - 1;
                    this.f46668B = i;
                    anonymousClass3uu = anonymousClass3uuArr[i];
                    anonymousClass3uu.mo4483B();
                    this.f46672F = anonymousClass3uu;
                }
            } else {
                throw exception;
            }
        }
        return anonymousClass3uu;
    }

    /* renamed from: B */
    public final AnonymousClass3uv m21438B() {
        AnonymousClass3uv anonymousClass3uv;
        synchronized (this.f46675I) {
            Exception exception = this.f46673G;
            if (exception != null) {
                throw exception;
            } else if (this.f46677K.isEmpty()) {
                anonymousClass3uv = null;
            } else {
                anonymousClass3uv = (AnonymousClass3uv) this.f46677K.removeFirst();
            }
        }
        return anonymousClass3uv;
    }

    /* renamed from: B */
    public static boolean m21435B(AnonymousClass3uw anonymousClass3uw) {
        return !anonymousClass3uw.f46676J.isEmpty() && anonymousClass3uw.f46670D > 0;
    }

    /* renamed from: C */
    public final void m21439C(AnonymousClass3uu anonymousClass3uu) {
        synchronized (this.f46675I) {
            Exception exception = this.f46673G;
            if (exception == null) {
                AnonymousClass2td.m17603B(anonymousClass3uu == this.f46672F);
                this.f46676J.addLast(anonymousClass3uu);
                if (AnonymousClass3uw.m21435B(this)) {
                    this.f46675I.notify();
                }
                this.f46672F = null;
            } else {
                throw exception;
            }
        }
    }

    /* renamed from: C */
    private boolean m21436C() {
        synchronized (this.f46675I) {
            while (!this.f46678L && !AnonymousClass3uw.m21435B(this)) {
                try {
                    this.f46675I.wait();
                } catch (Throwable th) {
                    while (true) {
                        Throwable th2 = th;
                        break;
                    }
                }
            }
            if (this.f46678L) {
            } else {
                AnonymousClass3uu anonymousClass3uu = (AnonymousClass3uu) this.f46676J.removeFirst();
                AnonymousClass3uv[] anonymousClass3uvArr = this.f46671E;
                int i = this.f46670D - 1;
                this.f46670D = i;
                AnonymousClass2u7 anonymousClass2u7 = anonymousClass3uvArr[i];
                this.f46674H = false;
                anonymousClass2u7.mo4483B();
                if (anonymousClass3uu.m17663A(1)) {
                    anonymousClass2u7.m17665C(1);
                } else {
                    if (anonymousClass3uu.m17663A(134217728)) {
                        anonymousClass2u7.m17665C(134217728);
                    }
                    Exception decode = decode(anonymousClass3uu, anonymousClass2u7);
                    this.f46673G = decode;
                    if (decode != null) {
                        synchronized (this.f46675I) {
                            try {
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                    }
                }
                synchronized (this.f46675I) {
                    try {
                        AnonymousClass3uu[] anonymousClass3uuArr;
                        int i2;
                        if (!this.f46674H) {
                            if (!anonymousClass2u7.m17663A(4)) {
                                this.f46677K.addLast(anonymousClass2u7);
                                anonymousClass3uuArr = this.f46669C;
                                i2 = this.f46668B;
                                this.f46668B = i2 + 1;
                                anonymousClass3uuArr[i2] = anonymousClass3uu;
                            }
                        }
                        AnonymousClass3uv[] anonymousClass3uvArr2 = this.f46671E;
                        i2 = this.f46670D;
                        this.f46670D = i2 + 1;
                        anonymousClass3uvArr2[i2] = anonymousClass2u7;
                        anonymousClass3uuArr = this.f46669C;
                        i2 = this.f46668B;
                        this.f46668B = i2 + 1;
                        anonymousClass3uuArr[i2] = anonymousClass3uu;
                    } catch (Throwable th4) {
                        th2 = th4;
                        throw th2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void release() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r1 = r2.f46675I;
        monitor-enter(r1);
        r0 = 1;
        r2.f46678L = r0;	 Catch:{ all -> 0x0018 }
        r0 = r2.f46675I;	 Catch:{ all -> 0x0018 }
        r0.notify();	 Catch:{ all -> 0x0018 }
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        r2.join();	 Catch:{ InterruptedException -> 0x0010 }
        goto L_0x0017;	 Catch:{ InterruptedException -> 0x0010 }
    L_0x0010:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0017:
        return;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3uw.release():void");
    }

    public void releaseOutputBuffer(AnonymousClass3uv anonymousClass3uv) {
        synchronized (this.f46675I) {
            AnonymousClass3uv[] anonymousClass3uvArr = this.f46671E;
            int i = this.f46670D;
            this.f46670D = i + 1;
            anonymousClass3uvArr[i] = anonymousClass3uv;
            if (AnonymousClass3uw.m21435B(this)) {
                this.f46675I.notify();
            }
        }
    }

    public final void run() {
        while (m21436C()) {
            try {
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
