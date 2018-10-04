package X;

import android.content.Context;

/* renamed from: X.0dt */
public final class AnonymousClass0dt {
    /* renamed from: C */
    public static final Class f7538C = AnonymousClass0dt.class;
    /* renamed from: B */
    public final Context f7539B;

    public AnonymousClass0dt(Context context) {
        this.f7539B = context;
    }

    /* renamed from: B */
    public static void m6133B(X.AnonymousClass0dt r11) {
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
        r10 = 0;
        r5 = r11.f7539B;	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        r4 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        r4.<init>();	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        r0 = r5.getApplicationInfo();	 Catch:{ Throwable -> 0x00a4 }
        r8 = r0.sourceDir;	 Catch:{ Throwable -> 0x00a4 }
        r9 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x00a4 }
        r9.<init>();	 Catch:{ Throwable -> 0x00a4 }
        r7 = 0;	 Catch:{ Throwable -> 0x00a4 }
        r0 = ".zip";	 Catch:{ Throwable -> 0x0049 }
        r0 = r8.endsWith(r0);	 Catch:{ Throwable -> 0x0049 }
        if (r0 == 0) goto L_0x0032;	 Catch:{ Throwable -> 0x0049 }
    L_0x001c:
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0049 }
        r1.<init>();	 Catch:{ Throwable -> 0x0049 }
        r1.append(r8);	 Catch:{ Throwable -> 0x0049 }
        r0 = ".tmp";	 Catch:{ Throwable -> 0x0049 }
        r1.append(r0);	 Catch:{ Throwable -> 0x0049 }
        r0 = r1.toString();	 Catch:{ Throwable -> 0x0049 }
        r0 = dalvik.system.DexFile.loadDex(r8, r0, r7);	 Catch:{ Throwable -> 0x0049 }
        goto L_0x0037;	 Catch:{ Throwable -> 0x0049 }
    L_0x0032:
        r0 = new dalvik.system.DexFile;	 Catch:{ Throwable -> 0x0049 }
        r0.<init>(r8);	 Catch:{ Throwable -> 0x0049 }
    L_0x0037:
        r1 = r0.entries();	 Catch:{ Throwable -> 0x0049 }
    L_0x003b:
        r0 = r1.hasMoreElements();	 Catch:{ Throwable -> 0x0049 }
        if (r0 == 0) goto L_0x0059;	 Catch:{ Throwable -> 0x0049 }
    L_0x0041:
        r0 = r1.nextElement();	 Catch:{ Throwable -> 0x0049 }
        r9.add(r0);	 Catch:{ Throwable -> 0x0049 }
        goto L_0x003b;	 Catch:{ Throwable -> 0x0049 }
    L_0x0049:
        r6 = move-exception;	 Catch:{ Throwable -> 0x00a4 }
        r3 = X.AnonymousClass0ej.f7831B;	 Catch:{ Throwable -> 0x00a4 }
        r2 = "Error at loading dex file %s";	 Catch:{ Throwable -> 0x00a4 }
        r0 = 2;	 Catch:{ Throwable -> 0x00a4 }
        r1 = new java.lang.Object[r0];	 Catch:{ Throwable -> 0x00a4 }
        r1[r7] = r8;	 Catch:{ Throwable -> 0x00a4 }
        r0 = 1;	 Catch:{ Throwable -> 0x00a4 }
        r1[r0] = r6;	 Catch:{ Throwable -> 0x00a4 }
        X.AnonymousClass0Dc.m1241D(r3, r2, r1);	 Catch:{ Throwable -> 0x00a4 }
    L_0x0059:
        r0 = r9.isEmpty();	 Catch:{ Throwable -> 0x00a4 }
        if (r0 != 0) goto L_0x00ac;	 Catch:{ Throwable -> 0x00a4 }
    L_0x005f:
        r3 = java.lang.ClassLoader.class;	 Catch:{ Throwable -> 0x00a4 }
        r2 = "findLoadedClass";	 Catch:{ Throwable -> 0x00a4 }
        r8 = 1;	 Catch:{ Throwable -> 0x00a4 }
        r1 = new java.lang.Class[r8];	 Catch:{ Throwable -> 0x00a4 }
        r0 = java.lang.String.class;	 Catch:{ Throwable -> 0x00a4 }
        r7 = 0;	 Catch:{ Throwable -> 0x00a4 }
        r1[r7] = r0;	 Catch:{ Throwable -> 0x00a4 }
        r6 = r3.getDeclaredMethod(r2, r1);	 Catch:{ Throwable -> 0x00a4 }
        r6.setAccessible(r8);	 Catch:{ Throwable -> 0x00a4 }
        r5 = r5.getClassLoader();	 Catch:{ Throwable -> 0x00a4 }
        r3 = r9.iterator();	 Catch:{ Throwable -> 0x00a4 }
    L_0x007a:
        r0 = r3.hasNext();	 Catch:{ Throwable -> 0x00a4 }
        if (r0 == 0) goto L_0x00ac;	 Catch:{ Throwable -> 0x00a4 }
    L_0x0080:
        r2 = r3.next();	 Catch:{ Throwable -> 0x00a4 }
        r2 = (java.lang.String) r2;	 Catch:{ Throwable -> 0x00a4 }
        r0 = new java.lang.Object[r8];	 Catch:{ Throwable -> 0x00a4 }
        r0[r7] = r2;	 Catch:{ Throwable -> 0x00a4 }
        r0 = r6.invoke(r5, r0);	 Catch:{ Throwable -> 0x00a4 }
        if (r0 == 0) goto L_0x007a;	 Catch:{ Throwable -> 0x00a4 }
    L_0x0090:
        r1 = "\\.";	 Catch:{ Throwable -> 0x00a4 }
        r0 = "/";	 Catch:{ Throwable -> 0x00a4 }
        r2 = r2.replaceAll(r1, r0);	 Catch:{ Throwable -> 0x00a4 }
        r1 = "$";	 Catch:{ Throwable -> 0x00a4 }
        r0 = ".class";	 Catch:{ Throwable -> 0x00a4 }
        r0 = r2.replaceAll(r1, r0);	 Catch:{ Throwable -> 0x00a4 }
        r4.add(r0);	 Catch:{ Throwable -> 0x00a4 }
        goto L_0x007a;	 Catch:{ Throwable -> 0x00a4 }
    L_0x00a4:
        r2 = move-exception;	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        r1 = X.AnonymousClass0ej.f7831B;	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        r0 = "Error getting loaded classes ";	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        X.AnonymousClass0Dc.m1240C(r1, r0, r2);	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
    L_0x00ac:
        r0 = r4.size();	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        java.lang.Integer.valueOf(r0);	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        r0 = android.os.Environment.DIRECTORY_DOWNLOADS;	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        r2 = android.os.Environment.getExternalStoragePublicDirectory(r0);	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        r1 = new java.io.File;	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        r0 = "classes.txt";	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        r1.<init>(r2, r0);	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        r3 = new java.io.FileOutputStream;	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        r0 = 0;	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        r3.<init>(r1, r0);	 Catch:{ Throwable -> 0x0100, all -> 0x00fd }
        r2 = r4.iterator();	 Catch:{ Throwable -> 0x00fb }
    L_0x00ca:
        r0 = r2.hasNext();	 Catch:{ Throwable -> 0x00fb }
        if (r0 == 0) goto L_0x00f7;	 Catch:{ Throwable -> 0x00fb }
    L_0x00d0:
        r0 = r2.next();	 Catch:{ Throwable -> 0x00fb }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00fb }
        r1.<init>();	 Catch:{ Throwable -> 0x00fb }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x00fb }
        r1.append(r0);	 Catch:{ Throwable -> 0x00fb }
        r0 = "\n";	 Catch:{ Throwable -> 0x00fb }
        r1.append(r0);	 Catch:{ Throwable -> 0x00fb }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x00fb }
        r0 = "UTF-8";	 Catch:{ Throwable -> 0x00fb }
        r0 = java.nio.charset.Charset.forName(r0);	 Catch:{ Throwable -> 0x00fb }
        r0 = r1.getBytes(r0);	 Catch:{ Throwable -> 0x00fb }
        r3.write(r0);	 Catch:{ Throwable -> 0x00fb }
        goto L_0x00ca;	 Catch:{ Throwable -> 0x00fb }
    L_0x00f7:
        r3.close();	 Catch:{ IOException -> 0x010c }
        goto L_0x010c;	 Catch:{ IOException -> 0x010c }
    L_0x00fb:
        r2 = move-exception;
        goto L_0x0102;
    L_0x00fd:
        r0 = move-exception;
        r3 = r10;
        goto L_0x010e;
    L_0x0100:
        r2 = move-exception;
        r3 = r10;
    L_0x0102:
        r1 = f7538C;	 Catch:{ all -> 0x010d }
        r0 = "Error saving file";	 Catch:{ all -> 0x010d }
        X.AnonymousClass0Dc.m1240C(r1, r0, r2);	 Catch:{ all -> 0x010d }
        if (r3 == 0) goto L_0x010c;	 Catch:{ all -> 0x010d }
    L_0x010b:
        goto L_0x00f7;	 Catch:{ all -> 0x010d }
    L_0x010c:
        return;
    L_0x010d:
        r0 = move-exception;
    L_0x010e:
        if (r3 == 0) goto L_0x0113;
    L_0x0110:
        r3.close();	 Catch:{ IOException -> 0x0113 }
    L_0x0113:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0dt.B(X.0dt):void");
    }
}
