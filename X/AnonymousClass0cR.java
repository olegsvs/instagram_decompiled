package X;

import android.util.Pair;
import com.fasterxml.jackson.core.JsonFactory;
import java.util.LinkedList;

/* renamed from: X.0cR */
public final class AnonymousClass0cR extends LinkedList {
    /* renamed from: D */
    public static final AnonymousClass0cR f7154D = new AnonymousClass0cR();
    /* renamed from: E */
    private static final Class f7155E = AnonymousClass0cR.class;
    /* renamed from: B */
    public String f7156B;
    /* renamed from: C */
    private final JsonFactory f7157C = AnonymousClass0Lm.f3274B;

    private AnonymousClass0cR() {
    }

    /* renamed from: A */
    public final void m5867A(AnonymousClass0EE anonymousClass0EE, String str, String str2) {
        super.addFirst(new Pair(str, str2));
        while (size() > 10) {
            super.removeLast();
        }
        this.f7156B = anonymousClass0EE.getModuleName();
    }

    /* renamed from: B */
    public final java.lang.String m5868B() {
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
        r5 = this;
        r4 = new java.io.StringWriter;
        r4.<init>();
        r0 = r5.f7157C;	 Catch:{ IOException -> 0x0044 }
        r3 = r0.createGenerator(r4);	 Catch:{ IOException -> 0x0044 }
        r3.writeStartArray();	 Catch:{ IOException -> 0x0044 }
        r2 = r5.iterator();	 Catch:{ IOException -> 0x0044 }
    L_0x0012:
        r0 = r2.hasNext();	 Catch:{ IOException -> 0x0044 }
        if (r0 == 0) goto L_0x003d;	 Catch:{ IOException -> 0x0044 }
    L_0x0018:
        r1 = r2.next();	 Catch:{ IOException -> 0x0044 }
        r1 = (android.util.Pair) r1;	 Catch:{ IOException -> 0x0044 }
        r3.writeStartObject();	 Catch:{ IOException -> 0x0044 }
        r0 = "module";	 Catch:{ IOException -> 0x0044 }
        r3.writeFieldName(r0);	 Catch:{ IOException -> 0x0044 }
        r0 = r1.first;	 Catch:{ IOException -> 0x0044 }
        r0 = (java.lang.String) r0;	 Catch:{ IOException -> 0x0044 }
        r3.writeString(r0);	 Catch:{ IOException -> 0x0044 }
        r0 = "click_point";	 Catch:{ IOException -> 0x0044 }
        r3.writeFieldName(r0);	 Catch:{ IOException -> 0x0044 }
        r0 = r1.second;	 Catch:{ IOException -> 0x0044 }
        r0 = (java.lang.String) r0;	 Catch:{ IOException -> 0x0044 }
        r3.writeString(r0);	 Catch:{ IOException -> 0x0044 }
        r3.writeEndObject();	 Catch:{ IOException -> 0x0044 }
        goto L_0x0012;	 Catch:{ IOException -> 0x0044 }
    L_0x003d:
        r3.writeEndArray();	 Catch:{ IOException -> 0x0044 }
        r3.close();	 Catch:{ IOException -> 0x0044 }
        goto L_0x004b;	 Catch:{ IOException -> 0x0044 }
    L_0x0044:
        r1 = f7155E;
        r0 = "Unable to serialize NavigationQueue";
        X.AnonymousClass0Dc.m1249L(r1, r0);
    L_0x004b:
        r0 = r4.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0cR.B():java.lang.String");
    }
}
