package X;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.File;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;

/* renamed from: X.0Ts */
public final class AnonymousClass0Ts {
    /* renamed from: K */
    public static final Charset f5259K = Charset.forName("US-ASCII");
    /* renamed from: B */
    public final Executor f5260B;
    /* renamed from: C */
    public Writer f5261C;
    /* renamed from: D */
    public int f5262D = 0;
    /* renamed from: E */
    public final int f5263E;
    /* renamed from: F */
    private final AnonymousClass0To f5264F;
    /* renamed from: G */
    private final File f5265G;
    /* renamed from: H */
    private final File f5266H;
    /* renamed from: I */
    private final File f5267I;
    /* renamed from: J */
    private final File f5268J;

    public AnonymousClass0Ts(File file, AnonymousClass0To anonymousClass0To, Executor executor, int i) {
        this.f5266H = new File(file, "journal");
        this.f5268J = new File(file, "journal.tmp");
        this.f5267I = new File(file, "journal.bkp");
        this.f5265G = file;
        this.f5264F = anonymousClass0To;
        this.f5260B = executor;
        this.f5263E = Math.max(JsonMappingException.MAX_REFS_TO_LIST, i * 2);
    }

    /* renamed from: A */
    public final void m4576A() {
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
        r9 = this;
        r0 = r9.f5261C;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        X.AnonymousClass0Ts.m4573B(r0);
    L_0x0007:
        r4 = 0;
        r0 = r9.f5264F;	 Catch:{ IOException -> 0x00b7, all -> 0x00b1 }
        r1 = r0.f5241B;	 Catch:{ IOException -> 0x00b7, all -> 0x00b1 }
        monitor-enter(r1);	 Catch:{ IOException -> 0x00b7, all -> 0x00b1 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x00bc }
        r0 = r0.f5243D;	 Catch:{ all -> 0x00bc }
        r0 = r0.values();	 Catch:{ all -> 0x00bc }
        r5.<init>(r0);	 Catch:{ all -> 0x00bc }
        monitor-exit(r1);	 Catch:{ all -> 0x00bc }
        r0 = r5.size();	 Catch:{ IOException -> 0x00b7, all -> 0x00b1 }
        r9.f5262D = r0;	 Catch:{ IOException -> 0x00b7, all -> 0x00b1 }
        r2 = new java.io.BufferedWriter;	 Catch:{ IOException -> 0x00b7, all -> 0x00b1 }
        r3 = new java.io.OutputStreamWriter;	 Catch:{ IOException -> 0x00b7, all -> 0x00b1 }
        r1 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00b7, all -> 0x00b1 }
        r0 = r9.f5268J;	 Catch:{ IOException -> 0x00b7, all -> 0x00b1 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x00b7, all -> 0x00b1 }
        r0 = f5259K;	 Catch:{ IOException -> 0x00b7, all -> 0x00b1 }
        r3.<init>(r1, r0);	 Catch:{ IOException -> 0x00b7, all -> 0x00b1 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x00b7, all -> 0x00b1 }
        r4 = r5.size();	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r3 = 0;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
    L_0x0037:
        if (r3 >= r4) goto L_0x008d;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
    L_0x0039:
        r8 = r5.get(r3);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r8 = (X.AnonymousClass0Tx) r8;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = r8.m4661G();	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r7 = 10;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        if (r0 == 0) goto L_0x0071;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
    L_0x0047:
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r6.<init>();	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = "CLEAN ";	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r6.append(r0);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = r8.f5311D;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r6.append(r0);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = 32;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r6.append(r0);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = r8.m4658D();	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r6.append(r0);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r6.append(r7);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = r6.toString();	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r2.write(r0);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        goto L_0x008a;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
    L_0x0071:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r1.<init>();	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = "DIRTY ";	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r1.append(r0);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = r8.f5311D;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r1.append(r0);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r1.append(r7);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = r1.toString();	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r2.write(r0);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
    L_0x008a:
        r3 = r3 + 1;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        goto L_0x0037;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
    L_0x008d:
        r2.flush();	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = r9.f5266H;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = r0.exists();	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        if (r0 == 0) goto L_0x009f;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
    L_0x0098:
        r1 = r9.f5266H;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = r9.f5267I;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r1.renameTo(r0);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
    L_0x009f:
        r1 = r9.f5268J;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = r9.f5266H;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r1.renameTo(r0);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        X.AnonymousClass0Ts.m4574C(r9);	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0 = r9.f5267I;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        r0.delete();	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
        goto L_0x00b8;	 Catch:{ IOException -> 0x00b8, all -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        goto L_0x00b3;
    L_0x00b1:
        r0 = move-exception;
        r2 = r4;
    L_0x00b3:
        X.AnonymousClass0Ts.m4573B(r2);
        throw r0;
    L_0x00b7:
        r2 = r4;
    L_0x00b8:
        X.AnonymousClass0Ts.m4573B(r2);
        return;
    L_0x00bc:
        r0 = move-exception;	 Catch:{ all -> 0x00bc }
        monitor-exit(r1);	 Catch:{ all -> 0x00bc }
        throw r0;	 Catch:{ IOException -> 0x00b7, all -> 0x00b1 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Ts.A():void");
    }

    /* renamed from: B */
    public final java.util.LinkedHashMap m4577B() {
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
        r13 = this;
        r3 = r13.f5265G;
        r2 = new java.io.File;
        r0 = "journal.bkp";
        r2.<init>(r3, r0);
        r0 = r2.exists();
        if (r0 == 0) goto L_0x0023;
    L_0x000f:
        r1 = new java.io.File;
        r0 = "journal";
        r1.<init>(r3, r0);
        r0 = r1.exists();
        if (r0 == 0) goto L_0x0020;
    L_0x001c:
        r2.delete();
        goto L_0x0023;
    L_0x0020:
        r2.renameTo(r1);
    L_0x0023:
        r2 = new java.io.File;
        r1 = r13.f5265G;
        r0 = "journal";
        r2.<init>(r1, r0);
        r0 = r2.exists();
        r12 = 0;
        r6 = 1;
        if (r0 == 0) goto L_0x0102;
    L_0x0034:
        r7 = new java.util.LinkedHashMap;
        r7.<init>();
        r5 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x00fe, IOException -> 0x00fe, IOException -> 0x00fe, all -> 0x00f8 }
        r0 = new java.io.FileReader;	 Catch:{ IOException -> 0x00fe, IOException -> 0x00fe, IOException -> 0x00fe, all -> 0x00f8 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x00fe, IOException -> 0x00fe, IOException -> 0x00fe, all -> 0x00f8 }
        r5.<init>(r0);	 Catch:{ IOException -> 0x00fe, IOException -> 0x00fe, IOException -> 0x00fe, all -> 0x00f8 }
        r2 = new java.util.HashSet;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r2.<init>();	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x0048:
        r1 = r5.readLine();	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r3 = 0;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        if (r1 == 0) goto L_0x00ab;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x004f:
        r0 = " ";	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r9 = r1.split(r0);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r8 = r9[r3];	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r4 = r9[r6];	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r0 = "CLEAN";	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r0 = r0.equals(r8);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r1 = 2;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        if (r0 == 0) goto L_0x0095;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x0062:
        r0 = r9.length;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r11 = 3;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        if (r0 < r11) goto L_0x0095;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x0066:
        r0 = r9.length;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r10 = 4;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        if (r0 > r10) goto L_0x0095;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x006a:
        r8 = r7.get(r4);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r8 = (X.AnonymousClass0Tx) r8;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        if (r8 != 0) goto L_0x007c;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x0072:
        r8 = new X.0Tx;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r0 = r13.f5265G;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r8.<init>(r0, r4);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r7.put(r4, r8);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x007c:
        r0 = r9.length;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        if (r0 < r10) goto L_0x0088;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x007f:
        r0 = r9[r11];	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r0 = java.lang.Boolean.parseBoolean(r0);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        if (r0 == 0) goto L_0x0088;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x0087:
        r3 = 1;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x0088:
        r0 = r9[r1];	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r8.m4662H(r0, r3);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r2.remove(r4);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        goto L_0x00a3;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x0095:
        r0 = "DIRTY";	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r0 = r0.equals(r8);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        if (r0 == 0) goto L_0x00a9;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x009d:
        r0 = r9.length;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        if (r0 != r1) goto L_0x00a9;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00a0:
        r2.add(r4);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00a3:
        r0 = r13.f5262D;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r0 = r0 + r6;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r13.f5262D = r0;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        goto L_0x0048;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00a9:
        r0 = 1;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        goto L_0x00ac;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00ab:
        r0 = 0;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00ac:
        if (r0 != 0) goto L_0x00ff;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00ae:
        r0 = r13.f5265G;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        X.AnonymousClass0Ts.m4575D(r0, r3);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r0 = r13.f5264F;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r0 = r0.f5246G;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        if (r0 != 0) goto L_0x00ef;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00b9:
        r4 = r2.iterator();	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00bd:
        r0 = r4.hasNext();	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        if (r0 == 0) goto L_0x00ef;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00c3:
        r3 = r4.next();	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r3 = (java.lang.String) r3;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r2 = r7.get(r3);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r2 = (X.AnonymousClass0Tx) r2;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        if (r2 == 0) goto L_0x00eb;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00d1:
        r1 = r2.m4655A();	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r0 = r1.exists();	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        if (r0 == 0) goto L_0x00de;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00db:
        r1.delete();	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00de:
        r1 = r2.m4659E();	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        r0 = r1.exists();	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        if (r0 == 0) goto L_0x00eb;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00e8:
        r1.delete();	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00eb:
        r7.remove(r3);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        goto L_0x00bd;	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
    L_0x00ef:
        X.AnonymousClass0Ts.m4574C(r13);	 Catch:{ IOException -> 0x00ff, IOException -> 0x00ff, IOException -> 0x00ff, all -> 0x00f6 }
        X.AnonymousClass0Ts.m4573B(r5);
        return r7;
    L_0x00f6:
        r0 = move-exception;
        goto L_0x00fa;
    L_0x00f8:
        r0 = move-exception;
        r5 = r12;
    L_0x00fa:
        X.AnonymousClass0Ts.m4573B(r5);
        throw r0;
    L_0x00fe:
        r5 = r12;
    L_0x00ff:
        X.AnonymousClass0Ts.m4573B(r5);
    L_0x0102:
        r0 = r13.f5265G;
        X.AnonymousClass0Ts.m4575D(r0, r6);
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Ts.B():java.util.LinkedHashMap");
    }

    /* renamed from: B */
    private static void m4573B(java.io.Closeable r0) {
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
        if (r0 == 0) goto L_0x0005;
    L_0x0002:
        r0.close();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Ts.B(java.io.Closeable):void");
    }

    /* renamed from: C */
    private static void m4574C(X.AnonymousClass0Ts r5) {
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
        r4 = new java.io.BufferedWriter;	 Catch:{ IOException -> 0x0017 }
        r3 = new java.io.OutputStreamWriter;	 Catch:{ IOException -> 0x0017 }
        r2 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0017 }
        r1 = r5.f5266H;	 Catch:{ IOException -> 0x0017 }
        r0 = 1;	 Catch:{ IOException -> 0x0017 }
        r2.<init>(r1, r0);	 Catch:{ IOException -> 0x0017 }
        r0 = f5259K;	 Catch:{ IOException -> 0x0017 }
        r3.<init>(r2, r0);	 Catch:{ IOException -> 0x0017 }
        r4.<init>(r3);	 Catch:{ IOException -> 0x0017 }
        r5.f5261C = r4;	 Catch:{ IOException -> 0x0017 }
        goto L_0x001f;	 Catch:{ IOException -> 0x0017 }
    L_0x0017:
        r0 = r5.f5261C;
        X.AnonymousClass0Ts.m4573B(r0);
        r0 = 0;
        r5.f5261C = r0;
    L_0x001f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Ts.C(X.0Ts):void");
    }

    /* renamed from: D */
    private static void m4575D(File file, boolean z) {
        if (file != null && file.exists()) {
            file = file.listFiles();
            if (file != null) {
                for (File file2 : file) {
                    String name = file2.getName();
                    if ((name.endsWith(".tmp") || (z && (name.endsWith(".clean") || name.endsWith(".metadata")))) && file2.exists()) {
                        file2.delete();
                    }
                }
            }
        }
    }
}
