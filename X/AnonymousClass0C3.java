package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0C3 */
public final class AnonymousClass0C3 extends AnonymousClass0Cx {
    /* renamed from: B */
    public final String f1424B;
    /* renamed from: C */
    public final String f1425C;
    /* renamed from: D */
    public final File f1426D;
    /* renamed from: E */
    private final File f1427E;

    public AnonymousClass0C3(Context context, File file, File file2, String str, String str2) {
        super(context, file);
        this.f1427E = new File(context.getApplicationInfo().sourceDir);
        this.f1426D = file2;
        this.f1425C = str;
        this.f1424B = str2;
    }

    public AnonymousClass0C3(Context context, File file, String str, String str2) {
        super(context, file);
        this.f1427E = new File(context.getApplicationInfo().sourceDir);
        this.f1426D = this.f1427E;
        this.f1425C = str;
        this.f1424B = str2;
    }

    public AnonymousClass0C3(Context context, String str) {
        super(context, str);
        File file = new File(this.f1786B.getApplicationInfo().sourceDir);
        this.f1427E = file;
        this.f1426D = file;
        this.f1425C = "assets/lib/libs.xzs";
        this.f1424B = "assets/lib/metadata.txt";
    }

    /* renamed from: F */
    public final byte[] mo201F() {
        return AnonymousClass0Cz.m1085G(this.f1427E, this.f1786B);
    }

    /* renamed from: G */
    public final AnonymousClass1NW mo200G() {
        return new AnonymousClass0BV(this, this);
    }

    public final java.lang.String toString() {
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
        r3 = this;
        r0 = r3.f1779C;	 Catch:{ IOException -> 0x000b }
        r0 = r0.getCanonicalPath();	 Catch:{ IOException -> 0x000b }
        r2 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x000b }
        goto L_0x0011;	 Catch:{ IOException -> 0x000b }
    L_0x000b:
        r0 = r3.f1779C;
        r2 = r0.getName();
    L_0x0011:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r3.getClass();
        r0 = r0.getName();
        r1.append(r0);
        r0 = "[root = ";
        r1.append(r0);
        r1.append(r2);
        r0 = " flags = ";
        r1.append(r0);
        r0 = r3.f1778B;
        r1.append(r0);
        r0 = " zipSource = ";
        r1.append(r0);
        r0 = r3.f1426D;
        r0 = r0.getPath();
        r1.append(r0);
        r0 = " xzsPath = ";
        r1.append(r0);
        r0 = r3.f1425C;
        r1.append(r0);
        r0 = 93;
        r1.append(r0);
        r0 = r1.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0C3.toString():java.lang.String");
    }
}
