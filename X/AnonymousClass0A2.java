package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0A2 */
public class AnonymousClass0A2 extends AnonymousClass00o {
    public AnonymousClass0A2(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: A */
    public final void mo39A(android.content.Context r5) {
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
        r4 = this;
        r0 = r4.f86B;
        r5 = X.AnonymousClass0LR.m2961D(r0);
        r5 = (java.io.File) r5;
        r1 = "AppUnpacker.fsync";
        r2 = 2147483648; // 0x80000000 float:-0.0 double:1.0609978955E-314;
        r0 = -283075799; // 0xffffffffef209b29 float:-4.970518E28 double:NaN;
        X.AnonymousClass09H.m584B(r2, r1, r0);
        r4 = new java.io.RandomAccessFile;	 Catch:{ all -> 0x003c }
        r0 = "r";	 Catch:{ all -> 0x003c }
        r4.<init>(r5, r0);	 Catch:{ all -> 0x003c }
        r1 = 0;	 Catch:{ all -> 0x003c }
        r0 = r4.getFD();	 Catch:{ Throwable -> 0x0032 }
        r0.sync();	 Catch:{ Throwable -> 0x0032 }
        r4.close();	 Catch:{ all -> 0x003c }
        r0 = -1677413782; // 0xffffffff9c04b26a float:-4.390573E-22 double:NaN;
        X.AnonymousClass09H.m585C(r2, r0);
        return;
    L_0x002e:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0038;
    L_0x0031:
        goto L_0x0034;
    L_0x0032:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x002e }
    L_0x0034:
        r4.close();	 Catch:{ Throwable -> 0x003b }
        goto L_0x003b;	 Catch:{ Throwable -> 0x003b }
    L_0x0038:
        r4.close();	 Catch:{ all -> 0x003c }
    L_0x003b:
        throw r0;	 Catch:{ all -> 0x003c }
    L_0x003c:
        r1 = move-exception;
        r0 = -1948416264; // 0xffffffff8bdd86f8 float:-8.532918E-32 double:NaN;
        X.AnonymousClass09H.m585C(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0A2.A(android.content.Context):void");
    }

    /* renamed from: C */
    public final boolean mo38C(Context context, byte[] bArr) {
        return ((File) AnonymousClass0LR.m2961D(this.f86B)).exists() ^ 1;
    }
}
