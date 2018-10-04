package com.facebook.profilo.provider.stacktrace;

import X.AnonymousClass0CF;
import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public class ArtCompatibility {
    private static final AtomicReference sIsCompatible = new AtomicReference(null);

    private static native boolean nativeCheck(int i);

    static {
        AnonymousClass0CF.m856E("profilo_stacktrace");
    }

    private static File getFileForRelease(Context context) {
        File filesDir = context.getFilesDir();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfiloArtUnwindcCompat_");
        stringBuilder.append(VERSION.RELEASE);
        return new File(filesDir, stringBuilder.toString());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isCompatible(android.content.Context r5) {
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
        r1 = android.os.Build.VERSION.SDK_INT;
        r4 = 0;
        r0 = 21;
        if (r1 >= r0) goto L_0x0008;
    L_0x0007:
        return r4;
    L_0x0008:
        r0 = sIsCompatible;
        r0 = r0.get();
        r0 = (java.lang.Boolean) r0;
        if (r0 == 0) goto L_0x0017;
    L_0x0012:
        r0 = r0.booleanValue();
        return r0;
    L_0x0017:
        r1 = getFileForRelease(r5);	 Catch:{ IOException -> 0x00c5 }
        r0 = r1.exists();	 Catch:{ IOException -> 0x00c5 }
        if (r0 == 0) goto L_0x0027;	 Catch:{ IOException -> 0x00c5 }
    L_0x0021:
        r3 = readCompatFile(r1);	 Catch:{ IOException -> 0x00c5 }
        goto L_0x00ac;	 Catch:{ IOException -> 0x00c5 }
    L_0x0027:
        r2 = android.os.Build.VERSION.RELEASE;	 Catch:{ IOException -> 0x00c5 }
        r0 = r2.hashCode();	 Catch:{ IOException -> 0x00c5 }
        switch(r0) {
            case 53368: goto L_0x0077;
            case 54329: goto L_0x006d;
            case 54330: goto L_0x0063;
            case 51288123: goto L_0x0059;
            case 52211643: goto L_0x004f;
            case 52212604: goto L_0x0045;
            case 52212605: goto L_0x003b;
            case 52212606: goto L_0x0031;
            default: goto L_0x0030;
        };	 Catch:{ IOException -> 0x00c5 }
    L_0x0030:
        goto L_0x0081;	 Catch:{ IOException -> 0x00c5 }
    L_0x0031:
        r0 = "7.1.2";	 Catch:{ IOException -> 0x00c5 }
        r0 = r2.equals(r0);	 Catch:{ IOException -> 0x00c5 }
        if (r0 == 0) goto L_0x0081;	 Catch:{ IOException -> 0x00c5 }
    L_0x0039:
        r0 = 0;	 Catch:{ IOException -> 0x00c5 }
        goto L_0x0082;	 Catch:{ IOException -> 0x00c5 }
    L_0x003b:
        r0 = "7.1.1";	 Catch:{ IOException -> 0x00c5 }
        r0 = r2.equals(r0);	 Catch:{ IOException -> 0x00c5 }
        if (r0 == 0) goto L_0x0081;	 Catch:{ IOException -> 0x00c5 }
    L_0x0043:
        r0 = 1;	 Catch:{ IOException -> 0x00c5 }
        goto L_0x0082;	 Catch:{ IOException -> 0x00c5 }
    L_0x0045:
        r0 = "7.1.0";	 Catch:{ IOException -> 0x00c5 }
        r0 = r2.equals(r0);	 Catch:{ IOException -> 0x00c5 }
        if (r0 == 0) goto L_0x0081;	 Catch:{ IOException -> 0x00c5 }
    L_0x004d:
        r0 = 3;	 Catch:{ IOException -> 0x00c5 }
        goto L_0x0082;	 Catch:{ IOException -> 0x00c5 }
    L_0x004f:
        r0 = "7.0.0";	 Catch:{ IOException -> 0x00c5 }
        r0 = r2.equals(r0);	 Catch:{ IOException -> 0x00c5 }
        if (r0 == 0) goto L_0x0081;	 Catch:{ IOException -> 0x00c5 }
    L_0x0057:
        r0 = 5;	 Catch:{ IOException -> 0x00c5 }
        goto L_0x0082;	 Catch:{ IOException -> 0x00c5 }
    L_0x0059:
        r0 = "6.0.1";	 Catch:{ IOException -> 0x00c5 }
        r0 = r2.equals(r0);	 Catch:{ IOException -> 0x00c5 }
        if (r0 == 0) goto L_0x0081;	 Catch:{ IOException -> 0x00c5 }
    L_0x0061:
        r0 = 7;	 Catch:{ IOException -> 0x00c5 }
        goto L_0x0082;	 Catch:{ IOException -> 0x00c5 }
    L_0x0063:
        r0 = "7.1";	 Catch:{ IOException -> 0x00c5 }
        r0 = r2.equals(r0);	 Catch:{ IOException -> 0x00c5 }
        if (r0 == 0) goto L_0x0081;	 Catch:{ IOException -> 0x00c5 }
    L_0x006b:
        r0 = 2;	 Catch:{ IOException -> 0x00c5 }
        goto L_0x0082;	 Catch:{ IOException -> 0x00c5 }
    L_0x006d:
        r0 = "7.0";	 Catch:{ IOException -> 0x00c5 }
        r0 = r2.equals(r0);	 Catch:{ IOException -> 0x00c5 }
        if (r0 == 0) goto L_0x0081;	 Catch:{ IOException -> 0x00c5 }
    L_0x0075:
        r0 = 4;	 Catch:{ IOException -> 0x00c5 }
        goto L_0x0082;	 Catch:{ IOException -> 0x00c5 }
    L_0x0077:
        r0 = "6.0";	 Catch:{ IOException -> 0x00c5 }
        r0 = r2.equals(r0);	 Catch:{ IOException -> 0x00c5 }
        if (r0 == 0) goto L_0x0081;	 Catch:{ IOException -> 0x00c5 }
    L_0x007f:
        r0 = 6;	 Catch:{ IOException -> 0x00c5 }
        goto L_0x0082;	 Catch:{ IOException -> 0x00c5 }
    L_0x0081:
        r0 = -1;	 Catch:{ IOException -> 0x00c5 }
    L_0x0082:
        switch(r0) {
            case 0: goto L_0x00a3;
            case 1: goto L_0x009c;
            case 2: goto L_0x0095;
            case 3: goto L_0x0095;
            case 4: goto L_0x008e;
            case 5: goto L_0x008e;
            case 6: goto L_0x0087;
            case 7: goto L_0x0087;
            default: goto L_0x0085;
        };	 Catch:{ IOException -> 0x00c5 }
    L_0x0085:
        r3 = 0;	 Catch:{ IOException -> 0x00c5 }
        goto L_0x00a9;	 Catch:{ IOException -> 0x00c5 }
    L_0x0087:
        r0 = 16;	 Catch:{ IOException -> 0x00c5 }
        r3 = nativeCheck(r0);	 Catch:{ IOException -> 0x00c5 }
        goto L_0x00a9;	 Catch:{ IOException -> 0x00c5 }
    L_0x008e:
        r0 = 32;	 Catch:{ IOException -> 0x00c5 }
        r3 = nativeCheck(r0);	 Catch:{ IOException -> 0x00c5 }
        goto L_0x00a9;	 Catch:{ IOException -> 0x00c5 }
    L_0x0095:
        r0 = 64;	 Catch:{ IOException -> 0x00c5 }
        r3 = nativeCheck(r0);	 Catch:{ IOException -> 0x00c5 }
        goto L_0x00a9;	 Catch:{ IOException -> 0x00c5 }
    L_0x009c:
        r0 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ IOException -> 0x00c5 }
        r3 = nativeCheck(r0);	 Catch:{ IOException -> 0x00c5 }
        goto L_0x00a9;	 Catch:{ IOException -> 0x00c5 }
    L_0x00a3:
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;	 Catch:{ IOException -> 0x00c5 }
        r3 = nativeCheck(r0);	 Catch:{ IOException -> 0x00c5 }
    L_0x00a9:
        writeCompatFile(r1, r3);	 Catch:{ IOException -> 0x00c5 }
    L_0x00ac:
        r2 = sIsCompatible;	 Catch:{ IOException -> 0x00c5 }
        r1 = 0;	 Catch:{ IOException -> 0x00c5 }
        r0 = java.lang.Boolean.valueOf(r3);	 Catch:{ IOException -> 0x00c5 }
        r0 = r2.compareAndSet(r1, r0);	 Catch:{ IOException -> 0x00c5 }
        if (r0 == 0) goto L_0x00ba;	 Catch:{ IOException -> 0x00c5 }
    L_0x00b9:
        return r3;	 Catch:{ IOException -> 0x00c5 }
    L_0x00ba:
        r0 = r2.get();	 Catch:{ IOException -> 0x00c5 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ IOException -> 0x00c5 }
        r0 = r0.booleanValue();	 Catch:{ IOException -> 0x00c5 }
        return r0;	 Catch:{ IOException -> 0x00c5 }
    L_0x00c5:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(android.content.Context):boolean");
    }

    private static boolean readCompatFile(java.io.File r3) {
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
        r2 = new java.io.FileInputStream;
        r2.<init>(r3);
        r1 = r2.read();	 Catch:{ Throwable -> 0x0017, all -> 0x0014 }
        r0 = 49;	 Catch:{ Throwable -> 0x0017, all -> 0x0014 }
        if (r1 != r0) goto L_0x000f;	 Catch:{ Throwable -> 0x0017, all -> 0x0014 }
    L_0x000d:
        r0 = 1;	 Catch:{ Throwable -> 0x0017, all -> 0x0014 }
        goto L_0x0010;	 Catch:{ Throwable -> 0x0017, all -> 0x0014 }
    L_0x000f:
        r0 = 0;	 Catch:{ Throwable -> 0x0017, all -> 0x0014 }
    L_0x0010:
        r2.close();
        return r0;
    L_0x0014:
        r1 = move-exception;
        r0 = 0;
        goto L_0x001a;
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0019 }
    L_0x0019:
        r1 = move-exception;
    L_0x001a:
        if (r0 == 0) goto L_0x0020;
    L_0x001c:
        r2.close();	 Catch:{ Throwable -> 0x0023 }
        goto L_0x0023;	 Catch:{ Throwable -> 0x0023 }
    L_0x0020:
        r2.close();
    L_0x0023:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.ArtCompatibility.readCompatFile(java.io.File):boolean");
    }

    private static void writeCompatFile(java.io.File r3, boolean r4) {
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
        r2 = new java.io.FileOutputStream;
        r2.<init>(r3);
        if (r4 == 0) goto L_0x000a;
    L_0x0007:
        r0 = 49;
        goto L_0x000c;
    L_0x000a:
        r0 = 48;
    L_0x000c:
        r2.write(r0);	 Catch:{ Throwable -> 0x0016, all -> 0x0013 }
        r2.close();
        return;
    L_0x0013:
        r1 = move-exception;
        r0 = 0;
        goto L_0x0019;
    L_0x0016:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0018 }
    L_0x0018:
        r1 = move-exception;
    L_0x0019:
        if (r0 == 0) goto L_0x001f;
    L_0x001b:
        r2.close();	 Catch:{ Throwable -> 0x0022 }
        goto L_0x0022;	 Catch:{ Throwable -> 0x0022 }
    L_0x001f:
        r2.close();
    L_0x0022:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.ArtCompatibility.writeCompatFile(java.io.File, boolean):void");
    }
}
