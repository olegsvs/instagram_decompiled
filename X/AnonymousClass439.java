package X;

import java.io.IOException;

/* renamed from: X.439 */
public final class AnonymousClass439 extends AnonymousClass3sE {
    /* renamed from: B */
    public final int f48955B;
    /* renamed from: C */
    public final AnonymousClass2kb f48956C;
    /* renamed from: D */
    public IOException f48957D = null;
    /* renamed from: E */
    public final AnonymousClass2kt f48958E;
    /* renamed from: F */
    public AnonymousClass3sO f48959F;
    /* renamed from: G */
    public boolean f48960G = false;
    /* renamed from: H */
    public int f48961H = -1;
    /* renamed from: I */
    public AnonymousClass3sO f48962I;
    /* renamed from: J */
    public final int f48963J;
    /* renamed from: K */
    public final String f48964K;

    public final void cancel() {
    }

    public AnonymousClass439(AnonymousClass2kt anonymousClass2kt, String str, int i, int i2, AnonymousClass2kb anonymousClass2kb, AnonymousClass3sO anonymousClass3sO, String str2) {
        this.f48958E = anonymousClass2kt;
        this.f48964K = str;
        this.f48955B = i;
        this.f48963J = i2;
        this.f48956C = anonymousClass2kb;
        this.f48959F = anonymousClass3sO;
        this.f45623B = str2;
    }

    /* renamed from: B */
    private int m22319B(byte[] bArr, int i, int i2) {
        if (this.f48961H < 0) {
            this.f48961H = 0;
        }
        int i3 = this.f45624C - this.f48961H;
        if (i3 == 0) {
            return 0;
        }
        if (i3 <= i2) {
            i2 = i3;
        }
        System.arraycopy(this.f45625D, this.f48961H, bArr, i, i2);
        this.f48961H += i2;
        return i2;
    }

    public final void close() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f48962I;
        r1 = 0;
        if (r0 == 0) goto L_0x000a;
    L_0x0005:
        r0.LEA();
        r2.f48962I = r1;
    L_0x000a:
        monitor-enter(r2);
        r0 = 0;
        r2.f48960G = r0;	 Catch:{ all -> 0x001b }
        r0 = r2.f45626E;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0019;	 Catch:{ all -> 0x001b }
    L_0x0012:
        r0 = r2.f45626E;	 Catch:{ all -> 0x001b }
        r0.close();	 Catch:{ IOException -> 0x0017 }
    L_0x0017:
        r2.f45626E = r1;	 Catch:{ all -> 0x001b }
    L_0x0019:
        monitor-exit(r2);	 Catch:{ all -> 0x001b }
        return;	 Catch:{ all -> 0x001b }
    L_0x001b:
        r0 = move-exception;	 Catch:{ all -> 0x001b }
        monitor-exit(r2);	 Catch:{ all -> 0x001b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.439.close():void");
    }

    public final int read(byte[] r4, int r5, int r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
    L_0x0000:
        r0 = r3.f48960G;
        if (r0 == 0) goto L_0x0033;
    L_0x0004:
        monitor-enter(r3);
        r1 = r3.m22319B(r4, r5, r6);	 Catch:{ all -> 0x0030 }
        if (r1 <= 0) goto L_0x0016;	 Catch:{ all -> 0x0030 }
    L_0x000b:
        r0 = r3.f48962I;	 Catch:{ all -> 0x0030 }
        if (r0 == 0) goto L_0x0014;	 Catch:{ all -> 0x0030 }
    L_0x000f:
        r0 = r3.f48962I;	 Catch:{ all -> 0x0030 }
        r0.oe(r1);	 Catch:{ all -> 0x0030 }
    L_0x0014:
        monitor-exit(r3);	 Catch:{ all -> 0x0030 }
    L_0x0015:
        return r1;	 Catch:{ all -> 0x0030 }
    L_0x0016:
        r0 = r3.f48963J;	 Catch:{ all -> 0x0030 }
        r0 = (long) r0;	 Catch:{ all -> 0x0030 }
        r3.wait(r0);	 Catch:{ InterruptedException -> 0x001c }
    L_0x001c:
        r1 = r3.f45624C;	 Catch:{ all -> 0x0030 }
        r0 = r3.f48961H;	 Catch:{ all -> 0x0030 }
        if (r1 > r0) goto L_0x002e;	 Catch:{ all -> 0x0030 }
    L_0x0022:
        r0 = 0;	 Catch:{ all -> 0x0030 }
        r3.f48960G = r0;	 Catch:{ all -> 0x0030 }
        r1 = new java.io.IOException;	 Catch:{ all -> 0x0030 }
        r0 = "Read timed out";	 Catch:{ all -> 0x0030 }
        r1.<init>(r0);	 Catch:{ all -> 0x0030 }
        r3.f48957D = r1;	 Catch:{ all -> 0x0030 }
    L_0x002e:
        monitor-exit(r3);	 Catch:{ all -> 0x0030 }
        goto L_0x0000;	 Catch:{ all -> 0x0030 }
    L_0x0030:
        r0 = move-exception;	 Catch:{ all -> 0x0030 }
        monitor-exit(r3);	 Catch:{ all -> 0x0030 }
    L_0x0032:
        throw r0;
    L_0x0033:
        r1 = r3.f48957D;
        if (r1 == 0) goto L_0x0041;
    L_0x0037:
        r0 = r3.f48962I;
        if (r0 == 0) goto L_0x003e;
    L_0x003b:
        r0.MEA(r1);
    L_0x003e:
        r0 = r3.f48957D;
        throw r0;
    L_0x0041:
        r1 = r3.m22319B(r4, r5, r6);
        if (r1 <= 0) goto L_0x004f;
    L_0x0047:
        r0 = r3.f48962I;
        if (r0 == 0) goto L_0x0015;
    L_0x004b:
        r0.oe(r1);
        goto L_0x0015;
    L_0x004f:
        monitor-enter(r3);
        r2 = r3.f45626E;	 Catch:{ all -> 0x0076 }
        monitor-exit(r3);	 Catch:{ all -> 0x0076 }
        if (r2 != 0) goto L_0x0057;	 Catch:{ all -> 0x0076 }
    L_0x0055:
        r0 = -1;	 Catch:{ all -> 0x0076 }
        return r0;	 Catch:{ all -> 0x0076 }
    L_0x0057:
        r1 = r2.read(r4, r5, r6);	 Catch:{ IOException -> 0x0067 }
        if (r1 <= 0) goto L_0x0015;	 Catch:{ IOException -> 0x0067 }
    L_0x005d:
        r0 = r3.f48962I;	 Catch:{ IOException -> 0x0067 }
        if (r0 == 0) goto L_0x0015;	 Catch:{ IOException -> 0x0067 }
    L_0x0061:
        r0 = r3.f48962I;	 Catch:{ IOException -> 0x0067 }
        r0.oe(r1);	 Catch:{ IOException -> 0x0067 }
        goto L_0x0015;	 Catch:{ IOException -> 0x0067 }
    L_0x0067:
        r1 = move-exception;
        r0 = r3.f48962I;
        if (r0 == 0) goto L_0x006f;
    L_0x006c:
        r0.MEA(r1);
    L_0x006f:
        r2.close();	 Catch:{ IOException -> 0x0072 }
    L_0x0072:
        r0 = 0;
        r3.f45626E = r0;
        throw r1;
    L_0x0076:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0076 }
        goto L_0x0032;	 Catch:{ all -> 0x0076 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.439.read(byte[], int, int):int");
    }

    public final long tGA(X.AnonymousClass2tB r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.mo5121A();	 Catch:{ all -> 0x004c }
        if (r0 == 0) goto L_0x000a;	 Catch:{ all -> 0x004c }
    L_0x0007:
        r1 = X.AnonymousClass1e6.f20922E;	 Catch:{ all -> 0x004c }
        goto L_0x000c;	 Catch:{ all -> 0x004c }
    L_0x000a:
        r1 = X.AnonymousClass1e6.f20925H;	 Catch:{ all -> 0x004c }
    L_0x000c:
        monitor-exit(r2);	 Catch:{ all -> 0x004c }
        r0 = r2.f48962I;
        if (r0 == 0) goto L_0x0014;
    L_0x0011:
        r0.OEA(r3, r1);
    L_0x0014:
        monitor-enter(r2);
        r0 = r2.f45627F;	 Catch:{ all -> 0x0049 }
        if (r0 >= 0) goto L_0x003d;	 Catch:{ all -> 0x0049 }
    L_0x0019:
        r0 = r2.f48955B;	 Catch:{ all -> 0x0049 }
        r0 = (long) r0;	 Catch:{ all -> 0x0049 }
        r2.wait(r0);	 Catch:{ InterruptedException -> 0x001f }
    L_0x001f:
        r0 = r2.f45627F;	 Catch:{ all -> 0x0049 }
        if (r0 >= 0) goto L_0x003d;	 Catch:{ all -> 0x0049 }
    L_0x0023:
        r0 = 0;	 Catch:{ all -> 0x0049 }
        r2.f48960G = r0;	 Catch:{ all -> 0x0049 }
        r1 = new java.io.IOException;	 Catch:{ all -> 0x0049 }
        r0 = "Connection timed out";	 Catch:{ all -> 0x0049 }
        r1.<init>(r0);	 Catch:{ all -> 0x0049 }
        r2.f48957D = r1;	 Catch:{ all -> 0x0049 }
        r0 = r2.f48962I;	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x003a;	 Catch:{ all -> 0x0049 }
    L_0x0033:
        r1 = r2.f48962I;	 Catch:{ all -> 0x0049 }
        r0 = r2.f48957D;	 Catch:{ all -> 0x0049 }
        r1.MEA(r0);	 Catch:{ all -> 0x0049 }
    L_0x003a:
        r0 = r2.f48957D;	 Catch:{ all -> 0x0049 }
        throw r0;	 Catch:{ all -> 0x0049 }
    L_0x003d:
        monitor-exit(r2);	 Catch:{ all -> 0x0049 }
        r0 = r2.f48962I;
        if (r0 == 0) goto L_0x0045;
    L_0x0042:
        r0.PEA();
    L_0x0045:
        r0 = r2.f45627F;
        r0 = (long) r0;
        return r0;
    L_0x0049:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0049 }
    L_0x004b:
        throw r0;
    L_0x004c:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x004c }
        goto L_0x004b;	 Catch:{ all -> 0x004c }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.439.tGA(X.2tB):long");
    }
}
