package X;

import android.os.Build.VERSION;

/* renamed from: X.0D4 */
public final class AnonymousClass0D4 {
    /* renamed from: B */
    public static boolean m1095B() {
        int i = VERSION.SDK_INT;
        if (i >= 18) {
            return AnonymousClass0D0.m1086B(AnonymousClass0D0.f1791B);
        }
        if (i < 16) {
            return false;
        }
        if (AnonymousClass1Ac.f15305B == null) {
            AnonymousClass1Ac.m9732B();
        }
        return AnonymousClass1Ac.f15305B.booleanValue();
    }

    /* renamed from: C */
    public static java.lang.String m1096C() {
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
        r5 = new java.io.FileReader;	 Catch:{ IOException -> 0x0041 }
        r0 = "/proc/self/cmdline";	 Catch:{ IOException -> 0x0041 }
        r5.<init>(r0);	 Catch:{ IOException -> 0x0041 }
        r4 = 0;	 Catch:{ IOException -> 0x0041 }
        r3 = new java.io.BufferedReader;	 Catch:{ Throwable -> 0x0037 }
        r3.<init>(r5);	 Catch:{ Throwable -> 0x0037 }
        r2 = r3.readLine();	 Catch:{ Throwable -> 0x0026, all -> 0x0023 }
        r1 = 0;	 Catch:{ Throwable -> 0x0026, all -> 0x0023 }
        r0 = r2.indexOf(r1);	 Catch:{ Throwable -> 0x0026, all -> 0x0023 }
        if (r0 < 0) goto L_0x001c;	 Catch:{ Throwable -> 0x0026, all -> 0x0023 }
    L_0x0018:
        r2 = r2.substring(r1, r0);	 Catch:{ Throwable -> 0x0026, all -> 0x0023 }
    L_0x001c:
        r3.close();	 Catch:{ Throwable -> 0x0037 }
        r5.close();	 Catch:{ IOException -> 0x0041 }
        return r2;	 Catch:{ IOException -> 0x0041 }
    L_0x0023:
        r0 = move-exception;
        r1 = r4;
        goto L_0x0029;
    L_0x0026:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
    L_0x0029:
        if (r1 == 0) goto L_0x002f;
    L_0x002b:
        r3.close();	 Catch:{ Throwable -> 0x0032 }
        goto L_0x0032;	 Catch:{ Throwable -> 0x0032 }
    L_0x002f:
        r3.close();	 Catch:{ Throwable -> 0x0037 }
    L_0x0032:
        throw r0;	 Catch:{ Throwable -> 0x0037 }
    L_0x0033:
        r0 = move-exception;
        if (r4 == 0) goto L_0x003d;
    L_0x0036:
        goto L_0x0039;
    L_0x0037:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0033 }
    L_0x0039:
        r5.close();	 Catch:{ Throwable -> 0x0040 }
        goto L_0x0040;	 Catch:{ Throwable -> 0x0040 }
    L_0x003d:
        r5.close();	 Catch:{ IOException -> 0x0041 }
    L_0x0040:
        throw r0;	 Catch:{ IOException -> 0x0041 }
    L_0x0041:
        r1 = move-exception;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0D4.C():java.lang.String");
    }
}
