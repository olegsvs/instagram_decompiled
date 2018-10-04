package X;

import java.util.Arrays;

/* renamed from: X.017 */
public final class AnonymousClass017 {
    /* renamed from: C */
    private static final String[] f141C = new String[]{"-d", "-v", "threadtime"};
    /* renamed from: D */
    private static final Class f142D = AnonymousClass017.class;
    /* renamed from: B */
    private AnonymousClass016 f143B = new AnonymousClass016(Arrays.asList(f141C));

    /* renamed from: A */
    public final java.util.List m69A() {
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
        r6 = this;
        r3 = r6.f143B;
        monitor-enter(r3);
        r1 = r3.f140D;	 Catch:{ all -> 0x00a8 }
        r0 = X.AnonymousClass015.BORN;	 Catch:{ all -> 0x00a8 }
        if (r1 != r0) goto L_0x00a0;	 Catch:{ all -> 0x00a8 }
    L_0x0009:
        r0 = X.AnonymousClass015.RUNNING;	 Catch:{ all -> 0x00a8 }
        r3.f140D = r0;	 Catch:{ all -> 0x00a8 }
        monitor-exit(r3);	 Catch:{ all -> 0x00a8 }
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = "logcat";
        r2.add(r0);
        r0 = r3.f138B;
        r2.addAll(r0);
        r1 = new java.lang.ProcessBuilder;	 Catch:{ IOException -> 0x0097 }
        r0 = 0;	 Catch:{ IOException -> 0x0097 }
        r0 = new java.lang.String[r0];	 Catch:{ IOException -> 0x0097 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x0097 }
        r0 = r1.command(r2);	 Catch:{ IOException -> 0x0097 }
        r0 = r0.start();	 Catch:{ IOException -> 0x0097 }
        r3.f139C = r0;	 Catch:{ IOException -> 0x0097 }
        r1 = new java.lang.Thread;
        r0 = new X.014;
        r0.<init>(r3);
        r1.<init>(r0);
        r1.start();
        r3 = new java.util.ArrayList;
        r3.<init>();
        r5 = 0;
        r4 = new java.io.BufferedReader;	 Catch:{ UnsupportedEncodingException -> 0x007a }
        r2 = new java.io.InputStreamReader;	 Catch:{ UnsupportedEncodingException -> 0x007a }
        r0 = r6.f143B;	 Catch:{ UnsupportedEncodingException -> 0x007a }
        r0 = r0.f139C;	 Catch:{ UnsupportedEncodingException -> 0x007a }
        r1 = r0.getInputStream();	 Catch:{ UnsupportedEncodingException -> 0x007a }
        r0 = "US-ASCII";	 Catch:{ UnsupportedEncodingException -> 0x007a }
        r2.<init>(r1, r0);	 Catch:{ UnsupportedEncodingException -> 0x007a }
        r4.<init>(r2);	 Catch:{ UnsupportedEncodingException -> 0x007a }
    L_0x0056:
        r0 = r4.readLine();	 Catch:{ IOException -> 0x0063 }
        if (r0 == 0) goto L_0x006f;	 Catch:{ IOException -> 0x0063 }
    L_0x005c:
        r3.add(r0);	 Catch:{ IOException -> 0x0063 }
        goto L_0x0056;	 Catch:{ IOException -> 0x0063 }
    L_0x0060:
        r1 = move-exception;
        r5 = r4;
        goto L_0x008c;
    L_0x0063:
        r2 = move-exception;
        r0 = f142D;	 Catch:{ all -> 0x0060 }
        r1 = r0.getSimpleName();	 Catch:{ all -> 0x0060 }
        r0 = "unexpected error";	 Catch:{ all -> 0x0060 }
        android.util.Log.e(r1, r0, r2);	 Catch:{ all -> 0x0060 }
    L_0x006f:
        r4.close();	 Catch:{ IOException -> 0x0072 }
    L_0x0072:
        r0 = r6.f143B;
        r0.m68A();
        return r3;
    L_0x0078:
        r1 = move-exception;
        goto L_0x008c;
    L_0x007a:
        r2 = move-exception;
        r0 = f142D;	 Catch:{ all -> 0x0078 }
        r1 = r0.getSimpleName();	 Catch:{ all -> 0x0078 }
        r0 = "unexpected error";	 Catch:{ all -> 0x0078 }
        android.util.Log.e(r1, r0, r2);	 Catch:{ all -> 0x0078 }
        r0 = r6.f143B;
        r0.m68A();
        return r3;
    L_0x008c:
        if (r5 == 0) goto L_0x0091;
    L_0x008e:
        r5.close();	 Catch:{ IOException -> 0x0091 }
    L_0x0091:
        r0 = r6.f143B;
        r0.m68A();
        throw r1;
    L_0x0097:
        r2 = move-exception;
        r1 = new java.lang.RuntimeException;
        r0 = "unable to start logcat process";
        r1.<init>(r0, r2);
        throw r1;
    L_0x00a0:
        r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00a8 }
        r0 = "Cannot start logcat process twice";	 Catch:{ all -> 0x00a8 }
        r1.<init>(r0);	 Catch:{ all -> 0x00a8 }
        throw r1;	 Catch:{ all -> 0x00a8 }
    L_0x00a8:
        r0 = move-exception;	 Catch:{ all -> 0x00a8 }
        monitor-exit(r3);	 Catch:{ all -> 0x00a8 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.017.A():java.util.List");
    }
}
