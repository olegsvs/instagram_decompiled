package com.facebook.common.dextricks;

public final class DexManifest {
    public final Dex[] dexes;
    public final String id;
    public final int locator_id;
    public final boolean locators;
    public final String[] requires;
    public final boolean rootRelative;

    public final class Dex {
        public final String assetName;
        public final String canaryClass;
        public final String hash;

        public Dex(String str, String str2, String str3) {
            this.assetName = str;
            this.hash = str2;
            this.canaryClass = str3;
        }

        public String toString() {
            return String.format("<Dex assetName:[%s]>", new Object[]{this.assetName});
        }
    }

    public DexManifest(java.io.InputStream r16) {
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
        r15 = this;
        r15.<init>();
        r8 = new java.util.ArrayList;
        r8.<init>();
        r13 = "dex";
        r11 = new java.util.ArrayList;
        r11.<init>();
        r12 = new java.io.BufferedReader;
        r1 = new java.io.InputStreamReader;
        r0 = "UTF-8";
        r2 = r16;
        r1.<init>(r2, r0);
        r12.<init>(r1);
        r14 = 0;
        r10 = 1;
        r9 = 0;
        r7 = 0;
        r6 = 0;
    L_0x0022:
        r0 = 0;
        r3 = r12.readLine();	 Catch:{ Throwable -> 0x00dc }
        if (r3 == 0) goto L_0x00b0;	 Catch:{ Throwable -> 0x00dc }
    L_0x0029:
        r1 = r3.length();	 Catch:{ Throwable -> 0x00dc }
        if (r1 != 0) goto L_0x0030;	 Catch:{ Throwable -> 0x00dc }
    L_0x002f:
        goto L_0x0022;	 Catch:{ Throwable -> 0x00dc }
    L_0x0030:
        r2 = "Secondary program dex metadata: [%s]";	 Catch:{ Throwable -> 0x00dc }
        r1 = new java.lang.Object[r10];	 Catch:{ Throwable -> 0x00dc }
        r1[r14] = r3;	 Catch:{ Throwable -> 0x00dc }
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);	 Catch:{ Throwable -> 0x00dc }
        r1 = ".root_relative";	 Catch:{ Throwable -> 0x00dc }
        r1 = r3.equals(r1);	 Catch:{ Throwable -> 0x00dc }
        if (r1 == 0) goto L_0x0043;	 Catch:{ Throwable -> 0x00dc }
    L_0x0041:
        r9 = 1;	 Catch:{ Throwable -> 0x00dc }
        goto L_0x0022;	 Catch:{ Throwable -> 0x00dc }
    L_0x0043:
        r1 = ".locators";	 Catch:{ Throwable -> 0x00dc }
        r1 = r3.equals(r1);	 Catch:{ Throwable -> 0x00dc }
        if (r1 == 0) goto L_0x004d;	 Catch:{ Throwable -> 0x00dc }
    L_0x004b:
        r7 = 1;	 Catch:{ Throwable -> 0x00dc }
        goto L_0x0022;	 Catch:{ Throwable -> 0x00dc }
    L_0x004d:
        r1 = ".locator_id";	 Catch:{ Throwable -> 0x00dc }
        r1 = r3.startsWith(r1);	 Catch:{ Throwable -> 0x00dc }
        if (r1 == 0) goto L_0x0062;	 Catch:{ Throwable -> 0x00dc }
    L_0x0055:
        r1 = " ";	 Catch:{ Throwable -> 0x00dc }
        r1 = r3.split(r1);	 Catch:{ Throwable -> 0x00dc }
        r1 = r1[r10];	 Catch:{ Throwable -> 0x00dc }
        r6 = java.lang.Integer.parseInt(r1);	 Catch:{ Throwable -> 0x00dc }
        goto L_0x0022;	 Catch:{ Throwable -> 0x00dc }
    L_0x0062:
        r1 = ".id";	 Catch:{ Throwable -> 0x00dc }
        r1 = r3.startsWith(r1);	 Catch:{ Throwable -> 0x00dc }
        if (r1 == 0) goto L_0x0073;	 Catch:{ Throwable -> 0x00dc }
    L_0x006a:
        r1 = " ";	 Catch:{ Throwable -> 0x00dc }
        r1 = r3.split(r1);	 Catch:{ Throwable -> 0x00dc }
        r13 = r1[r10];	 Catch:{ Throwable -> 0x00dc }
        goto L_0x0022;	 Catch:{ Throwable -> 0x00dc }
    L_0x0073:
        r1 = ".requires";	 Catch:{ Throwable -> 0x00dc }
        r1 = r3.startsWith(r1);	 Catch:{ Throwable -> 0x00dc }
        if (r1 == 0) goto L_0x0087;	 Catch:{ Throwable -> 0x00dc }
    L_0x007b:
        r1 = " ";	 Catch:{ Throwable -> 0x00dc }
        r1 = r3.split(r1);	 Catch:{ Throwable -> 0x00dc }
        r1 = r1[r10];	 Catch:{ Throwable -> 0x00dc }
        r11.add(r1);	 Catch:{ Throwable -> 0x00dc }
        goto L_0x0022;	 Catch:{ Throwable -> 0x00dc }
    L_0x0087:
        r1 = ".";	 Catch:{ Throwable -> 0x00dc }
        r1 = r3.startsWith(r1);	 Catch:{ Throwable -> 0x00dc }
        if (r1 == 0) goto L_0x0099;	 Catch:{ Throwable -> 0x00dc }
    L_0x008f:
        r2 = "ignoring dex metadata pragma [%s]";	 Catch:{ Throwable -> 0x00dc }
        r1 = new java.lang.Object[r10];	 Catch:{ Throwable -> 0x00dc }
        r1[r14] = r3;	 Catch:{ Throwable -> 0x00dc }
        com.facebook.common.dextricks.Mlog.m58w(r2, r1);	 Catch:{ Throwable -> 0x00dc }
        goto L_0x0022;	 Catch:{ Throwable -> 0x00dc }
    L_0x0099:
        r1 = " ";	 Catch:{ Throwable -> 0x00dc }
        r5 = r3.split(r1);	 Catch:{ Throwable -> 0x00dc }
        r4 = new com.facebook.common.dextricks.DexManifest$Dex;	 Catch:{ Throwable -> 0x00dc }
        r3 = r5[r14];	 Catch:{ Throwable -> 0x00dc }
        r2 = r5[r10];	 Catch:{ Throwable -> 0x00dc }
        r1 = 2;	 Catch:{ Throwable -> 0x00dc }
        r1 = r5[r1];	 Catch:{ Throwable -> 0x00dc }
        r4.<init>(r3, r2, r1);	 Catch:{ Throwable -> 0x00dc }
        r8.add(r4);	 Catch:{ Throwable -> 0x00dc }
        goto L_0x0022;	 Catch:{ Throwable -> 0x00dc }
    L_0x00b0:
        r12.close();
        r15.rootRelative = r9;
        r15.locators = r7;
        r15.locator_id = r6;
        r15.id = r13;
        r0 = r11.size();
        r0 = new java.lang.String[r0];
        r0 = r11.toArray(r0);
        r0 = (java.lang.String[]) r0;
        r15.requires = r0;
        r0 = r8.size();
        r0 = new com.facebook.common.dextricks.DexManifest.Dex[r0];
        r0 = r8.toArray(r0);
        r0 = (com.facebook.common.dextricks.DexManifest.Dex[]) r0;
        r15.dexes = r0;
        return;
    L_0x00d8:
        r1 = move-exception;
        if (r0 == 0) goto L_0x00e2;
    L_0x00db:
        goto L_0x00de;
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00d8 }
    L_0x00de:
        r12.close();	 Catch:{ Throwable -> 0x00e5 }
        goto L_0x00e5;	 Catch:{ Throwable -> 0x00e5 }
    L_0x00e2:
        r12.close();
    L_0x00e5:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexManifest.<init>(java.io.InputStream):void");
    }
}
