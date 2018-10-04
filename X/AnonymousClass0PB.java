package X;

import android.graphics.Rect;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0PB */
public final class AnonymousClass0PB {
    /* renamed from: B */
    public String f4052B;
    /* renamed from: C */
    public List f4053C;
    /* renamed from: D */
    public String f4054D;
    /* renamed from: E */
    public String f4055E;

    /* renamed from: B */
    public static AnonymousClass0PB m3797B(String str, String str2, int i, int i2) {
        AnonymousClass0PB anonymousClass0PB = new AnonymousClass0PB();
        anonymousClass0PB.f4054D = str;
        anonymousClass0PB.f4055E = str2;
        str = AnonymousClass2Mh.F(AnonymousClass2Mh.B(new Rect(0, 0, i, i2)), i, i2, 1, 1);
        anonymousClass0PB.f4053C = Arrays.asList(new Float[]{Float.valueOf(str.left), Float.valueOf(str.top), Float.valueOf(str.right), Float.valueOf(str.bottom)});
        return anonymousClass0PB;
    }

    /* renamed from: C */
    public static java.lang.String m3798C(X.AnonymousClass0PB r3) {
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
        r2 = new java.io.StringWriter;	 Catch:{ IOException -> 0x0017 }
        r2.<init>();	 Catch:{ IOException -> 0x0017 }
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ IOException -> 0x0017 }
        r1 = r0.createGenerator(r2);	 Catch:{ IOException -> 0x0017 }
        r0 = 1;	 Catch:{ IOException -> 0x0017 }
        X.AnonymousClass2bD.C(r1, r3, r0);	 Catch:{ IOException -> 0x0017 }
        r1.close();	 Catch:{ IOException -> 0x0017 }
        r0 = r2.toString();	 Catch:{ IOException -> 0x0017 }
        return r0;	 Catch:{ IOException -> 0x0017 }
    L_0x0017:
        r1 = "PendingHighlightsInfo_Error";
        r0 = "Error writing pending highlights info to string.";
        X.AnonymousClass0Dc.m1243F(r1, r0);
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0PB.C(X.0PB):java.lang.String");
    }
}
