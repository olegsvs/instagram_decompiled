package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.140 */
public final class AnonymousClass140 {
    /* renamed from: B */
    public AnonymousClass145 f13794B;
    /* renamed from: C */
    public GZIPOutputStream f13795C;
    /* renamed from: D */
    public final String f13796D;
    /* renamed from: E */
    public GZIPInputStream f13797E;
    /* renamed from: F */
    public AnonymousClass145 f13798F;
    /* renamed from: G */
    public GZIPOutputStream f13799G;
    /* renamed from: H */
    public boolean f13800H;
    /* renamed from: I */
    public AnonymousClass0aA f13801I;
    /* renamed from: J */
    public final String f13802J;
    /* renamed from: K */
    public int f13803K;
    /* renamed from: L */
    public String f13804L;
    /* renamed from: M */
    public final String f13805M;
    /* renamed from: N */
    public AnonymousClass0fK f13806N;

    public AnonymousClass140(String str) {
        this.f13802J = str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("-resp_info_gzip");
        this.f13805M = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("-body_gzip");
        this.f13796D = stringBuilder.toString();
    }

    /* renamed from: A */
    public final void m9136A(AnonymousClass0To anonymousClass0To) {
        m9137B();
        if (anonymousClass0To.m4568G(this.f13805M)) {
            anonymousClass0To.m4569I(this.f13805M);
        }
        if (anonymousClass0To.m4568G(this.f13796D)) {
            anonymousClass0To.m4569I(this.f13796D);
        }
    }

    /* renamed from: B */
    public final void m9137B() {
        AnonymousClass145 anonymousClass145 = this.f13798F;
        if (anonymousClass145 != null) {
            anonymousClass145.m9149A();
        }
        anonymousClass145 = this.f13794B;
        if (anonymousClass145 != null) {
            anonymousClass145.m9149A();
        }
        AnonymousClass0Du.m1315C(this.f13799G);
        AnonymousClass0Du.m1315C(this.f13795C);
    }

    /* renamed from: B */
    public static boolean m9134B(java.lang.String r6, java.lang.String r7, X.AnonymousClass0To r8) {
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
        r2 = r8.m4565D(r6);
        r3 = 0;
        r0 = r2.m6528B();	 Catch:{ IOException -> 0x004b, all -> 0x0048 }
        if (r0 == 0) goto L_0x0044;	 Catch:{ IOException -> 0x004b, all -> 0x0048 }
    L_0x000b:
        r1 = r8.m4564C(r7);	 Catch:{ IOException -> 0x004b, all -> 0x0048 }
        r0 = r1.m6528B();	 Catch:{ IOException -> 0x004b, all -> 0x0048 }
        if (r0 == 0) goto L_0x0044;	 Catch:{ IOException -> 0x004b, all -> 0x0048 }
    L_0x0015:
        r2 = r2.m6530A();	 Catch:{ IOException -> 0x004b, all -> 0x0048 }
        r2 = (X.AnonymousClass0fK) r2;	 Catch:{ IOException -> 0x004b, all -> 0x0048 }
        r1 = r1.m6530A();	 Catch:{ IOException -> 0x004c, all -> 0x0056 }
        r1 = (X.AnonymousClass145) r1;	 Catch:{ IOException -> 0x004c, all -> 0x0056 }
        r3 = r2.getChannel();	 Catch:{ IOException -> 0x0042, all -> 0x003f }
        r8 = r1.getChannel();	 Catch:{ IOException -> 0x0042, all -> 0x003f }
        r4 = 0;	 Catch:{ IOException -> 0x0042, all -> 0x003f }
        r6 = r3.size();	 Catch:{ IOException -> 0x0042, all -> 0x003f }
        r3.transferTo(r4, r6, r8);	 Catch:{ IOException -> 0x0042, all -> 0x003f }
        r1.m9150B();	 Catch:{ IOException -> 0x0042, all -> 0x003f }
        r0 = 1;	 Catch:{ IOException -> 0x0042, all -> 0x003f }
        if (r1 == 0) goto L_0x003b;	 Catch:{ IOException -> 0x0042, all -> 0x003f }
    L_0x0038:
        r1.m9149A();
    L_0x003b:
        X.AnonymousClass0Du.m1315C(r2);
        return r0;
    L_0x003f:
        r0 = move-exception;
        r3 = r1;
        goto L_0x0057;
    L_0x0042:
        r3 = r1;
        goto L_0x004c;
    L_0x0044:
        X.AnonymousClass0Du.m1315C(r3);
        goto L_0x0054;
    L_0x0048:
        r0 = move-exception;
        r2 = r3;
        goto L_0x0057;
    L_0x004b:
        r2 = r3;
    L_0x004c:
        if (r3 == 0) goto L_0x0051;
    L_0x004e:
        r3.m9149A();
    L_0x0051:
        X.AnonymousClass0Du.m1315C(r2);
    L_0x0054:
        r0 = 0;
        return r0;
    L_0x0056:
        r0 = move-exception;
    L_0x0057:
        if (r3 == 0) goto L_0x005c;
    L_0x0059:
        r3.m9149A();
    L_0x005c:
        X.AnonymousClass0Du.m1315C(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.140.B(java.lang.String, java.lang.String, X.0To):boolean");
    }

    /* renamed from: C */
    public static int m9135C(AnonymousClass0aA anonymousClass0aA) {
        if (anonymousClass0aA.m5433A() == AnonymousClass0Qw.OffScreen) {
            return 0;
        }
        return anonymousClass0aA.m5433A() == AnonymousClass0Qw.OnScreen ? 1 : -1;
    }

    /* renamed from: C */
    public final boolean m9138C(AnonymousClass140 anonymousClass140, AnonymousClass0To anonymousClass0To) {
        if (AnonymousClass140.m9134B(this.f13805M, anonymousClass140.f13805M, anonymousClass0To)) {
            boolean B = AnonymousClass140.m9134B(this.f13796D, anonymousClass140.f13796D, anonymousClass0To);
            if (!B) {
                m9136A(anonymousClass0To);
                anonymousClass140.m9136A(anonymousClass0To);
            }
            return B;
        }
        m9136A(anonymousClass0To);
        anonymousClass140.m9136A(anonymousClass0To);
        return false;
    }

    /* renamed from: D */
    public final long m9139D(AnonymousClass0To anonymousClass0To) {
        return anonymousClass0To.m4566E(this.f13805M) + anonymousClass0To.m4566E(this.f13796D);
    }

    public final String toString() {
        return StringFormatUtil.formatStrLocaleSafe("{requestPath: %s, cacheKey: %s, requestId: %d}", this.f13804L, this.f13796D, Integer.valueOf(this.f13803K));
    }
}
