package X;

import java.util.concurrent.Executor;

/* renamed from: X.1Gj */
public final class AnonymousClass1Gj implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Gg f16326B;
    /* renamed from: C */
    public final /* synthetic */ Executor f16327C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass1Gh f16328D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass42l f16329E;

    public AnonymousClass1Gj(AnonymousClass1Gg anonymousClass1Gg, Executor executor, AnonymousClass1Gh anonymousClass1Gh, AnonymousClass42l anonymousClass42l) {
        this.f16326B = anonymousClass1Gg;
        this.f16327C = executor;
        this.f16328D = anonymousClass1Gh;
        this.f16329E = anonymousClass42l;
    }

    public final void run() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r12 = this;
        r0 = r12.f16326B;
        r11 = X.AnonymousClass1Gg.m10515G(r0);
        r4 = 0;
        if (r11 != 0) goto L_0x000f;
    L_0x0009:
        r1 = r12.f16326B;
        r0 = 0;
        r1.f16310E = r0;
        return;
    L_0x000f:
        r10 = 0;
    L_0x0010:
        r5 = r10;
    L_0x0011:
        r5 = r11.accept();	 Catch:{ IOException -> 0x004f }
        r9 = r12.f16326B;	 Catch:{ IOException -> 0x004d }
        r8 = r9.f16308C;	 Catch:{ IOException -> 0x004d }
        monitor-enter(r8);	 Catch:{ IOException -> 0x004d }
    L_0x001a:
        r0 = r9.f16309D;	 Catch:{ all -> 0x0072 }
        r1 = r0.size();	 Catch:{ all -> 0x0072 }
        r0 = r9.f16312G;	 Catch:{ all -> 0x0072 }
        if (r1 <= r0) goto L_0x004b;	 Catch:{ all -> 0x0072 }
    L_0x0024:
        r0 = r9.f16309D;	 Catch:{ all -> 0x0072 }
        r1 = 0;	 Catch:{ all -> 0x0072 }
        r7 = r0.remove(r1);	 Catch:{ all -> 0x0072 }
        r7 = (android.net.LocalSocket) r7;	 Catch:{ all -> 0x0072 }
        r6 = "LocalSocketVideoProxy";	 Catch:{ all -> 0x0072 }
        r3 = "Closing client %s due to excess limit %d";	 Catch:{ all -> 0x0072 }
        r0 = 2;	 Catch:{ all -> 0x0072 }
        r2 = new java.lang.Object[r0];	 Catch:{ all -> 0x0072 }
        r2[r1] = r7;	 Catch:{ all -> 0x0072 }
        r0 = r9.f16309D;	 Catch:{ all -> 0x0072 }
        r0 = r0.size();	 Catch:{ all -> 0x0072 }
        r1 = 1;	 Catch:{ all -> 0x0072 }
        r0 = r0 + r1;	 Catch:{ all -> 0x0072 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x0072 }
        r2[r1] = r0;	 Catch:{ all -> 0x0072 }
        X.AnonymousClass1Gl.m10573C(r6, r3, r2);	 Catch:{ all -> 0x0072 }
        r7.close();	 Catch:{ IOException -> 0x001a }
        goto L_0x001a;	 Catch:{ IOException -> 0x001a }
    L_0x004b:
        monitor-exit(r8);	 Catch:{ all -> 0x0072 }
        goto L_0x0062;	 Catch:{ all -> 0x0072 }
    L_0x004d:
        r3 = move-exception;
        goto L_0x0050;
    L_0x004f:
        r3 = move-exception;
    L_0x0050:
        r2 = "LocalSocketVideoProxy";
        r1 = "Error connecting to client";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass1Gl.m10576F(r2, r3, r1, r0);
        if (r5 == 0) goto L_0x0061;
    L_0x005b:
        r5.close();	 Catch:{ IOException -> 0x0061, all -> 0x005f }
        goto L_0x0061;	 Catch:{ IOException -> 0x0061, all -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;
    L_0x0061:
        r5 = r10;
    L_0x0062:
        if (r5 == 0) goto L_0x0011;
    L_0x0064:
        r2 = r12.f16327C;
        r1 = new X.1f5;
        r1.<init>(r12, r5);
        r0 = -414027373; // 0xffffffffe7527193 float:-9.93792E23 double:NaN;
        X.AnonymousClass0GG.m1763B(r2, r1, r0);
        goto L_0x0010;
    L_0x0072:
        r0 = move-exception;	 Catch:{ all -> 0x0072 }
        monitor-exit(r8);	 Catch:{ all -> 0x0072 }
        throw r0;	 Catch:{ IOException -> 0x004d }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Gj.run():void");
    }
}
