package X;

/* renamed from: X.0BQ */
public final class AnonymousClass0BQ extends AnonymousClass1NW {
    /* renamed from: B */
    public final AnonymousClass0BR[] f1372B;

    public AnonymousClass0BQ(X.AnonymousClass0C2 r16, X.AnonymousClass0Cx r17) {
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
        r15 = this;
        r15.<init>();
        r0 = r16;
        r2 = r0.f1786B;
        r13 = new java.io.File;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "/data/local/tmp/exopackage/";
        r1.append(r0);
        r0 = r2.getPackageName();
        r1.append(r0);
        r0 = "/native-libs/";
        r1.append(r0);
        r0 = r1.toString();
        r13.<init>(r0);
        r8 = new java.util.ArrayList;
        r8.<init>();
        r11 = new java.util.LinkedHashSet;
        r11.<init>();
        r12 = X.AnonymousClass0Cz.m1084F();
        r10 = r12.length;
        r14 = 0;
        r9 = 0;
    L_0x0037:
        if (r9 >= r10) goto L_0x0108;
    L_0x0039:
        r1 = r12[r9];
        r7 = new java.io.File;
        r7.<init>(r13, r1);
        r0 = r7.isDirectory();
        if (r0 != 0) goto L_0x0048;
    L_0x0046:
        goto L_0x00e3;
    L_0x0048:
        r11.add(r1);
        r1 = new java.io.File;
        r0 = "metadata.txt";
        r1.<init>(r7, r0);
        r0 = r1.isFile();
        if (r0 != 0) goto L_0x005a;
    L_0x0058:
        goto L_0x00e3;
    L_0x005a:
        r4 = new java.io.FileReader;
        r4.<init>(r1);
        r6 = new java.io.BufferedReader;	 Catch:{ Throwable -> 0x00fb, all -> 0x00f8 }
        r6.<init>(r4);	 Catch:{ Throwable -> 0x00fb, all -> 0x00f8 }
    L_0x0064:
        r5 = r6.readLine();	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        if (r5 == 0) goto L_0x00dd;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
    L_0x006a:
        r0 = r5.length();	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        if (r0 != 0) goto L_0x0071;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
    L_0x0070:
        goto L_0x0064;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
    L_0x0071:
        r0 = 32;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r2 = r5.indexOf(r0);	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r0 = -1;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        if (r2 == r0) goto L_0x00c1;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
    L_0x007a:
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r1.<init>();	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r0 = r5.substring(r14, r2);	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r1.append(r0);	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r0 = ".so";	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r1.append(r0);	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r3 = r1.toString();	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r1 = r8.size();	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
    L_0x0093:
        if (r14 >= r1) goto L_0x00a8;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
    L_0x0095:
        r0 = r8.get(r14);	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r0 = (X.AnonymousClass0BR) r0;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r0 = r0.f17804C;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r0 = r0.equals(r3);	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        if (r0 == 0) goto L_0x00a5;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
    L_0x00a3:
        r0 = 1;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        goto L_0x00a9;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
    L_0x00a5:
        r14 = r14 + 1;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        goto L_0x0093;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
    L_0x00a8:
        r0 = 0;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
    L_0x00a9:
        if (r0 == 0) goto L_0x00ad;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
    L_0x00ab:
        r14 = 0;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        goto L_0x0064;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
    L_0x00ad:
        r0 = r2 + 1;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r2 = r5.substring(r0);	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r1 = new X.0BR;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r0 = new java.io.File;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r0.<init>(r7, r2);	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r1.<init>(r3, r2, r0);	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r8.add(r1);	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        goto L_0x00ab;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
    L_0x00c1:
        r2 = new java.lang.RuntimeException;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r1.<init>();	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r0 = "illegal line in exopackage metadata: [";	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r1.append(r0);	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r1.append(r5);	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r0 = "]";	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r1.append(r0);	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r0 = r1.toString();	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        r2.<init>(r0);	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
        throw r2;	 Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
    L_0x00dd:
        r6.close();	 Catch:{ Throwable -> 0x00fb, all -> 0x00f8 }
        r4.close();
    L_0x00e3:
        r9 = r9 + 1;
        r14 = 0;
        goto L_0x0037;
    L_0x00e8:
        r1 = move-exception;
        r0 = 0;
        goto L_0x00ee;
    L_0x00eb:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ed }
    L_0x00ed:
        r1 = move-exception;
    L_0x00ee:
        if (r0 == 0) goto L_0x00f4;
    L_0x00f0:
        r6.close();	 Catch:{ Throwable -> 0x00f7, all -> 0x00f8 }
        goto L_0x00f7;	 Catch:{ Throwable -> 0x00f7, all -> 0x00f8 }
    L_0x00f4:
        r6.close();	 Catch:{ Throwable -> 0x00fb, all -> 0x00f8 }
    L_0x00f7:
        throw r1;	 Catch:{ Throwable -> 0x00fb, all -> 0x00f8 }
    L_0x00f8:
        r1 = move-exception;
        r0 = 0;
        goto L_0x00fe;
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00fd }
    L_0x00fd:
        r1 = move-exception;
    L_0x00fe:
        if (r0 == 0) goto L_0x0104;
    L_0x0100:
        r4.close();	 Catch:{ Throwable -> 0x0107 }
        goto L_0x0107;	 Catch:{ Throwable -> 0x0107 }
    L_0x0104:
        r4.close();
    L_0x0107:
        throw r1;
    L_0x0108:
        r0 = r11.size();
        r0 = new java.lang.String[r0];
        r0 = r11.toArray(r0);
        r0 = (java.lang.String[]) r0;
        r0 = r8.size();
        r0 = new X.AnonymousClass0BR[r0];
        r0 = r8.toArray(r0);
        r0 = (X.AnonymousClass0BR[]) r0;
        r15.f1372B = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0BQ.<init>(X.0C2, X.0Cx):void");
    }

    /* renamed from: A */
    public final AnonymousClass1NX mo157A() {
        return new AnonymousClass1NX(this.f1372B);
    }

    /* renamed from: B */
    public final AnonymousClass1Nb mo158B() {
        return new AnonymousClass0BP(this);
    }
}
