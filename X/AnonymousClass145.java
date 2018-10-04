package X;

import java.io.FileOutputStream;

/* renamed from: X.145 */
public final class AnonymousClass145 extends FileOutputStream {
    /* renamed from: B */
    public AnonymousClass0To f13823B;
    /* renamed from: C */
    public AnonymousClass0Tx f13824C;
    /* renamed from: D */
    public boolean f13825D;
    /* renamed from: E */
    private boolean f13826E = false;

    public AnonymousClass145(AnonymousClass0Tx anonymousClass0Tx, AnonymousClass0To anonymousClass0To) {
        super(anonymousClass0Tx.m4657C());
        this.f13823B = anonymousClass0To;
        this.f13824C = anonymousClass0Tx;
    }

    /* renamed from: A */
    public final synchronized void m9149A() {
        if (!this.f13825D) {
            synchronized (this) {
                AnonymousClass145.m9148B(this);
                close();
                this.f13825D = true;
                this.f13823B.m4562A(this.f13824C);
            }
        }
    }

    /* renamed from: B */
    public static void m9148B(AnonymousClass145 anonymousClass145) {
        if (anonymousClass145.f13825D) {
            throw new IllegalStateException("Try to operate on an EditorOutputStream that is already closed");
        } else if (anonymousClass145.f13824C.m4656B() != anonymousClass145) {
            throw new IllegalStateException("Two editors trying to write to the same cached file");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public final synchronized boolean m9150B() {
        /*
        r9 = this;
        monitor-enter(r9);
        X.AnonymousClass145.m9148B(r9);	 Catch:{ all -> 0x00aa }
        r9.close();	 Catch:{ all -> 0x00aa }
        r8 = 1;
        r9.f13825D = r8;	 Catch:{ all -> 0x00aa }
        r0 = r9.f13826E;	 Catch:{ all -> 0x00aa }
        if (r0 == 0) goto L_0x0021;
    L_0x000e:
        r1 = r9.f13823B;	 Catch:{ all -> 0x00aa }
        r0 = r9.f13824C;	 Catch:{ all -> 0x00aa }
        r1.m4562A(r0);	 Catch:{ all -> 0x00aa }
        r1 = r9.f13823B;	 Catch:{ all -> 0x00aa }
        r0 = r9.f13824C;	 Catch:{ all -> 0x00aa }
        r0 = r0.f5311D;	 Catch:{ all -> 0x00aa }
        r1.m4569I(r0);	 Catch:{ all -> 0x00aa }
        r0 = 0;
        monitor-exit(r9);
        return r0;
    L_0x0021:
        r7 = r9.f13823B;	 Catch:{ all -> 0x00aa }
        r6 = r9.f13824C;	 Catch:{ all -> 0x00aa }
        r4 = r6.m4657C();	 Catch:{ all -> 0x00aa }
        r0 = r4.exists();	 Catch:{ all -> 0x00aa }
        r3 = 0;
        if (r0 != 0) goto L_0x003b;
    L_0x0030:
        r0 = 0;
        r6.m4663I(r0);	 Catch:{ all -> 0x00aa }
        r6.m4664J(r0, r3);	 Catch:{ all -> 0x00aa }
    L_0x0037:
        X.AnonymousClass0To.m4558E(r7, r6);	 Catch:{ all -> 0x00aa }
        goto L_0x00a8;
    L_0x003b:
        monitor-enter(r6);	 Catch:{ all -> 0x00aa }
        r1 = r6.f5309B;	 Catch:{ all -> 0x00ad }
        monitor-exit(r6);	 Catch:{ all -> 0x00aa }
        if (r1 == 0) goto L_0x0053;
    L_0x0041:
        r0 = r6.m4659E();	 Catch:{ all -> 0x00aa }
        r0 = r1.m10770B(r0);	 Catch:{ all -> 0x00aa }
        if (r0 != 0) goto L_0x0063;
    L_0x004b:
        monitor-enter(r6);	 Catch:{ all -> 0x00aa }
        r0 = r6.f5310C;	 Catch:{ all -> 0x00b0 }
        monitor-exit(r6);	 Catch:{ all -> 0x00aa }
        if (r0 == 0) goto L_0x0063;
    L_0x0051:
        r3 = 1;
        goto L_0x0063;
    L_0x0053:
        r1 = r6.m4659E();	 Catch:{ all -> 0x00aa }
        r0 = r1.exists();	 Catch:{ all -> 0x00aa }
        if (r0 == 0) goto L_0x0063;
    L_0x005d:
        r0 = r1.delete();	 Catch:{ all -> 0x00aa }
        r3 = r0 ^ 1;
    L_0x0063:
        r2 = r6.m4655A();	 Catch:{ all -> 0x00aa }
        r0 = r4.renameTo(r2);	 Catch:{ all -> 0x00aa }
        if (r0 == 0) goto L_0x0097;
    L_0x006d:
        if (r3 != 0) goto L_0x0097;
    L_0x006f:
        r1 = r6.m4659E();	 Catch:{ all -> 0x00aa }
        r4 = r6.m4658D();	 Catch:{ all -> 0x00aa }
        r2 = r2.length();	 Catch:{ all -> 0x00aa }
        r0 = r1.exists();	 Catch:{ all -> 0x00aa }
        if (r0 == 0) goto L_0x0086;
    L_0x0081:
        r0 = r1.length();	 Catch:{ all -> 0x00aa }
        goto L_0x0088;
    L_0x0086:
        r0 = 0;
    L_0x0088:
        r2 = r2 + r0;
        monitor-enter(r6);	 Catch:{ all -> 0x00aa }
        r0 = r6.f5310C;	 Catch:{ all -> 0x00b3 }
        monitor-exit(r6);	 Catch:{ all -> 0x00aa }
        r6.m4662H(r2, r0);	 Catch:{ all -> 0x00aa }
        r0 = r7.f5249J;	 Catch:{ all -> 0x00aa }
        r2 = r2 - r4;
        r0.getAndAdd(r2);	 Catch:{ all -> 0x00aa }
        goto L_0x0037;
    L_0x0097:
        if (r3 == 0) goto L_0x00a0;
    L_0x0099:
        r1 = "IgDiskCache";
        r0 = "Failed to commit because of metadata error";
        X.AnonymousClass0Gn.m1876C(r1, r0);	 Catch:{ all -> 0x00aa }
    L_0x00a0:
        r7.m4562A(r6);	 Catch:{ all -> 0x00aa }
        r0 = r6.f5311D;	 Catch:{ all -> 0x00aa }
        r7.m4569I(r0);	 Catch:{ all -> 0x00aa }
    L_0x00a8:
        monitor-exit(r9);
        return r8;
    L_0x00aa:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
    L_0x00ad:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x00aa }
    L_0x00af:
        throw r0;	 Catch:{ all -> 0x00aa }
    L_0x00b0:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x00aa }
        goto L_0x00af;
    L_0x00b3:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x00aa }
        goto L_0x00af;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.145.B():boolean");
    }

    public final void close() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r1 = this;
        super.close();	 Catch:{ IOException -> 0x0004 }
        goto L_0x0007;	 Catch:{ IOException -> 0x0004 }
    L_0x0004:
        r0 = 1;
        r1.f13826E = r0;
    L_0x0007:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.145.close():void");
    }

    public final void flush() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r1 = this;
        super.flush();	 Catch:{ IOException -> 0x0004 }
        goto L_0x0007;	 Catch:{ IOException -> 0x0004 }
    L_0x0004:
        r0 = 1;
        r1.f13826E = r0;
    L_0x0007:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.145.flush():void");
    }

    public final void write(byte[] r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r1 = this;
        super.write(r2);	 Catch:{ IOException -> 0x0004 }
        goto L_0x0007;	 Catch:{ IOException -> 0x0004 }
    L_0x0004:
        r0 = 1;
        r1.f13826E = r0;
    L_0x0007:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.145.write(byte[]):void");
    }

    public final void write(byte[] r2, int r3, int r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r1 = this;
        super.write(r2, r3, r4);	 Catch:{ IOException -> 0x0004 }
        goto L_0x0007;	 Catch:{ IOException -> 0x0004 }
    L_0x0004:
        r0 = 1;
        r1.f13826E = r0;
    L_0x0007:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.145.write(byte[], int, int):void");
    }
}
