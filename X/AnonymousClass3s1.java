package X;

import java.io.File;

/* renamed from: X.3s1 */
public final class AnonymousClass3s1 {
    /* renamed from: A */
    public final boolean m21010A(com.facebook.native_bridge.NativeDataPromise r7, java.lang.String r8, java.lang.String r9) {
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
        r0 = X.AnonymousClass3s1.m21009B(r8);
        r6 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r6;
    L_0x0008:
        r5 = new java.io.File;
        r5.<init>(r0);
        r0 = r5.length();
        r0 = (int) r0;
        r2 = new byte[r0];
        r4 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x004d }
        r1 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x004d }
        r0 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x004d }
        r0.<init>(r5);	 Catch:{ IOException -> 0x004d }
        r1.<init>(r0);	 Catch:{ IOException -> 0x004d }
        r4.<init>(r1);	 Catch:{ IOException -> 0x004d }
        r0 = 0;	 Catch:{ IOException -> 0x004d }
        r4.readFully(r2);	 Catch:{ Throwable -> 0x0043 }
        r3 = new com.facebook.cameracore.mediapipeline.services.externalasset.interfaces.ExternalAssetResponse;	 Catch:{ Throwable -> 0x0043 }
        r3.<init>();	 Catch:{ Throwable -> 0x0043 }
        r3.buffer = r2;	 Catch:{ Throwable -> 0x0043 }
        r1 = r5.length();	 Catch:{ Throwable -> 0x0043 }
        r1 = (int) r1;	 Catch:{ Throwable -> 0x0043 }
        r3.length = r1;	 Catch:{ Throwable -> 0x0043 }
        r1 = 1;	 Catch:{ Throwable -> 0x0043 }
        r3.completed = r1;	 Catch:{ Throwable -> 0x0043 }
        r7.setValue(r3);	 Catch:{ Throwable -> 0x0043 }
        r4.close();	 Catch:{ IOException -> 0x004d }
        return r1;	 Catch:{ IOException -> 0x004d }
    L_0x003f:
        r1 = move-exception;
        if (r0 == 0) goto L_0x0049;
    L_0x0042:
        goto L_0x0045;
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003f }
    L_0x0045:
        r4.close();	 Catch:{ Throwable -> 0x004c }
        goto L_0x004c;	 Catch:{ Throwable -> 0x004c }
    L_0x0049:
        r4.close();	 Catch:{ IOException -> 0x004d }
    L_0x004c:
        throw r1;	 Catch:{ IOException -> 0x004d }
    L_0x004d:
        r0 = "ExampleExternalAssetLocalDataSource fails to load file.";
        r7.setException(r0);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3s1.A(com.facebook.native_bridge.NativeDataPromise, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: B */
    private static java.lang.String m21009B(java.lang.String r4) {
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
        r3 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r3;
    L_0x0004:
        r0 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0022, MalformedURLException -> 0x0021 }
        r0.<init>(r4);	 Catch:{ URISyntaxException -> 0x0022, MalformedURLException -> 0x0021 }
        r2 = r0.toURL();	 Catch:{ URISyntaxException -> 0x0022, MalformedURLException -> 0x0021 }
        r1 = r2.getProtocol();	 Catch:{ URISyntaxException -> 0x0022, MalformedURLException -> 0x0021 }
        if (r1 == 0) goto L_0x0003;	 Catch:{ URISyntaxException -> 0x0022, MalformedURLException -> 0x0021 }
    L_0x0013:
        r0 = "file";	 Catch:{ URISyntaxException -> 0x0022, MalformedURLException -> 0x0021 }
        r0 = r1.equals(r0);	 Catch:{ URISyntaxException -> 0x0022, MalformedURLException -> 0x0021 }
        if (r0 != 0) goto L_0x001c;	 Catch:{ URISyntaxException -> 0x0022, MalformedURLException -> 0x0021 }
    L_0x001b:
        goto L_0x0003;	 Catch:{ URISyntaxException -> 0x0022, MalformedURLException -> 0x0021 }
    L_0x001c:
        r0 = r2.getPath();	 Catch:{ URISyntaxException -> 0x0022, MalformedURLException -> 0x0021 }
        return r0;	 Catch:{ URISyntaxException -> 0x0022, MalformedURLException -> 0x0021 }
    L_0x0021:
        return r3;
    L_0x0022:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3s1.B(java.lang.String):java.lang.String");
    }

    /* renamed from: B */
    public final String m21011B(String str, String str2) {
        String B = AnonymousClass3s1.m21009B(str);
        if (B != null) {
            str = new File(B);
            if (str.isFile()) {
                return str.toURI().toString();
            }
        }
        return null;
    }
}
