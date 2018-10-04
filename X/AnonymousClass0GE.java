package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0GE */
public final class AnonymousClass0GE {
    /* renamed from: B */
    public List f2325B = new ArrayList();
    /* renamed from: C */
    public String f2326C;

    /* renamed from: A */
    public final List m1761A() {
        return Collections.unmodifiableList(this.f2325B);
    }

    /* renamed from: B */
    public final java.lang.String m1762B() {
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
        r0 = this;
        r0 = X.AnonymousClass0fX.m6542C(r0);	 Catch:{ IOException -> 0x0005 }
        return r0;	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0GE.B():java.lang.String");
    }
}
